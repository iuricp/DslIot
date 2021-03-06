package org.xtext.example.iotdsl.formatting;

import static org.xtext.example.iotdsl.iotDsl.IotDslPackage.Literals.COMANDO__NAME;
import static org.xtext.example.iotdsl.iotDsl.IotDslPackage.Literals.EVENTO__NAME;
import static org.xtext.example.iotdsl.iotDsl.IotDslPackage.Literals.ESTADO__NAME;

import java.util.List;

import org.xtext.example.iotdsl.services.IotDslGrammarAccess;
import org.xtext.example.iotdsl.iotDsl.Comando;
import org.xtext.example.iotdsl.iotDsl.Evento;
import org.xtext.example.iotdsl.iotDsl.Estado;
import org.xtext.example.iotdsl.iotDsl.IotDsl;
import org.xtext.example.iotdsl.iotDsl.Transacao;
import org.eclipse.xtext.formatting2.AbstractJavaFormatter;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.common.base.Objects;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
public class IotDslFormatter extends AbstractJavaFormatter {

	@Inject
	private IotDslGrammarAccess ga;

	protected void format(IotDsl idsl, IFormattableDocument document) {
		formatEvents(idsl, document);
		formatResetEvents(idsl, document);
		formatCommands(idsl, document);
		formatStates(idsl, document);
	}

	protected void formatEvents(IotDsl idsl, IFormattableDocument doc) {
		// indent the event definitions between the 'events' keyword and the 'end'
		// keyword
		ISemanticRegion begin = regionFor(idsl).keyword("eventos");
		ISemanticRegion end = regionFor(idsl).keyword(ga.getIotDslAccess().getEndKeyword_1_2());

		doc.append(begin, it -> it.newLine());
		doc.interior(begin, end, it -> it.indent());

		for (Evento event : idsl.getEventos()) {
			format(event, doc);
		}

		if (hasResetEvents(idsl) || hasCommands(idsl) || hasStates(idsl)) {
			doc.append(end, it -> it.setNewLines(2));
		}
	}

	protected void formatResetEvents(IotDsl idsl, IFormattableDocument doc) {
		// indent the event references between the 'resetEvents' keyword and the 'end'
		// keyword
		ISemanticRegion begin = regionFor(idsl).keyword("resetEventos");
		ISemanticRegion end = regionFor(idsl).keyword(ga.getIotDslAccess().getEndKeyword_2_2());

		doc.append(begin, it -> it.newLine());
		doc.interior(begin, end, it -> it.indent());

		// format each event reference
		doc.append(regionFor(idsl).assignment(ga.getIotDslAccess().getResetEventosAssignment_2_1()),
				it -> it.newLine());

		doc.prepend(end, it -> it.newLine());

		if (hasCommands(idsl) || hasStates(idsl)) {
			doc.append(end, it -> it.setNewLines(2));
		}
	}

	protected void formatCommands(IotDsl idsl, IFormattableDocument doc) {
		// indent the command definitions between the 'commands' keyword and the 'end'
		// keyword
		ISemanticRegion begin = regionFor(idsl).keyword("comandos");
		ISemanticRegion end = regionFor(idsl).keyword(ga.getIotDslAccess().getEndKeyword_3_2());

		doc.append(begin, it -> it.newLine());
		doc.interior(begin, end, it -> it.indent());

		for (Comando command : idsl.getComandos()) {
			format(command, doc);
		}

		if (hasStates(idsl)) {
			doc.append(end, it -> it.setNewLines(2));
		}
	}

	protected void formatStates(IotDsl idsl, IFormattableDocument doc) {
		for (Estado state : idsl.getEstados()) {
			format(state, doc);
		}
	}

	protected void format(Evento event, IFormattableDocument doc) {
		// align the event name and the event code in columns based on the longest event
		// name
		doc.append(regionFor(event).feature(EVENTO__NAME), it -> it.setSpace(additionalSpaces(event)));
		// line break after each event definition
		doc.append(event, it -> it.newLine());
	}

	protected void format(Comando command, IFormattableDocument doc) {
		// align the command name and the command code in columns based on the longest
		// command name
		doc.append(regionFor(command).feature(COMANDO__NAME), it -> it.setSpace(additionalSpaces(command)));
		// line break after each command definition
		doc.append(command, it -> it.newLine());
	}

	protected void format(Estado s, IFormattableDocument doc) {
		// indent the state elements between the name of the state and the 'end' keyword
		ISemanticRegion begin = regionFor(s).feature(ESTADO__NAME);
		ISemanticRegion end = regionFor(s).keyword(ga.getEstadoAccess().getEndKeyword_4());

		doc.append(begin, it -> it.newLine());
		doc.interior(begin, end, it -> it.indent());

		formatActions(s, doc);

		for (Transacao transition : s.getTransacoes()) {
			format(transition, doc);
		}

		if (isLastState(s)) {
			doc.append(s, it -> it.newLine());
		} else {
			doc.append(s, it -> it.setNewLines(2));
		}
	}

	protected void formatActions(Estado s, IFormattableDocument doc) {
		// line break after the action definitions
		doc.append(regionFor(s).keyword("}"), it -> it.newLine());
	}

	protected void format(Transacao transition, IFormattableDocument doc) {
		// align the event name and the transition's state in columns based on the
		// longest event name
		doc.append(regionFor(transition).assignment(ga.getTransacaoAccess().getEventoAssignment_0()),
				it -> it.setSpace(additionalSpaces(transition)));
		// line break after each transition
		doc.append(transition, it -> it.newLine());
	}

	private String additionalSpaces(Evento event) {
		IotDsl iotdsl = (IotDsl) event.eContainer();
		return additionalSpaces(Lists.transform(iotdsl.getEventos(), Evento::getName), event.getName());
	}

	private String additionalSpaces(Comando command) {
		IotDsl statemachine = (IotDsl) command.eContainer();
		return additionalSpaces(Lists.transform(statemachine.getComandos(), Comando::getName), command.getName());
	}

	private String additionalSpaces(Transacao transition) {
		Estado estado = (Estado) transition.eContainer();
		return additionalSpaces(Lists.transform(estado.getTransacoes(), it -> it.getEvento().getName()),
				transition.getEvento().getName());
	}

	private String additionalSpaces(List<String> allNames, String name) {
		return Strings.repeat(" ", getLongestName(allNames).length() - name.length() + 1);
	}

	private String getLongestName(List<String> names) {
		return Iterables.getFirst(IterableExtensions.sortBy(names, n -> -n.length()), null);
	}

	private boolean hasResetEvents(IotDsl sm) {
		return !sm.getResetEventos().isEmpty();
	}

	private boolean hasCommands(IotDsl sm) {
		return !sm.getComandos().isEmpty();
	}

	private boolean hasStates(IotDsl sm) {
		return !sm.getEstados().isEmpty();
	}

	private boolean isLastState(Estado state) {
		IotDsl statemachine = (IotDsl) state.eContainer();
		return Objects.equal(state, Iterables.getLast(statemachine.getEstados()));
	}

}