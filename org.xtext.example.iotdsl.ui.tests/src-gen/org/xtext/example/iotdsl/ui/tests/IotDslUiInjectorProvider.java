/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iotdsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.iotdsl.ui.internal.IotdslActivator;

public class IotDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return IotdslActivator.getInstance().getInjector("org.xtext.example.iotdsl.IotDsl");
	}

}
