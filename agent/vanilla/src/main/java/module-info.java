//============================================================================//
//                                                                            //
//                         Copyright © 2015 Sandpolis                         //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation.                                   //
//                                                                            //
//============================================================================//
module com.sandpolis.plugin.osquery.agent.vanilla {
	exports com.sandpolis.plugin.osquery.agent.vanilla;

	requires com.sandpolis.core.foundation;
	requires com.sandpolis.core.instance;
	requires com.sandpolis.core.net;
	requires com.sandpolis.plugin.osquery;
	requires org.slf4j;
	requires java.net.http;

	provides com.sandpolis.core.instance.plugin.SandpolisPlugin with com.sandpolis.plugin.osquery.agent.vanilla.OsqueryPlugin;
}
