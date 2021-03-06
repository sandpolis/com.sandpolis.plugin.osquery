//============================================================================//
//                                                                            //
//                         Copyright © 2015 Sandpolis                         //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation.                                   //
//                                                                            //
//============================================================================//
module com.sandpolis.plugin.osquery.server.vanilla {
	exports com.sandpolis.plugin.osquery.server.vanilla;

	requires com.sandpolis.core.instance;
	requires com.sandpolis.core.net;

	provides com.sandpolis.core.instance.plugin.SandpolisPlugin with com.sandpolis.plugin.osquery.server.vanilla.OsqueryPlugin;
}
