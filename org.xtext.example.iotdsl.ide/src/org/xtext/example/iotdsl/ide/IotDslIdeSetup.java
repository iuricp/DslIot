/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iotdsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.iotdsl.IotDslRuntimeModule;
import org.xtext.example.iotdsl.IotDslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class IotDslIdeSetup extends IotDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new IotDslRuntimeModule(), new IotDslIdeModule()));
	}
	
}
