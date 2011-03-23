/*******************************************************************************
 * Copyright (c) 2011  Jonathan Alvarsson <jonathan.alvarsson@farmbio.uu.se>
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * www.eclipse.org—epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>
 * 
 * Contact: http://www.bioclipse.net/    
 ******************************************************************************/
package net.bioclipse.fp.tests;

import org.junit.BeforeClass;

public class JavaScriptFpManagerPluginTest
    extends AbstractFpManagerPluginTest {

    @BeforeClass public static void setup() {
        managerNamespace = net.bioclipse.fp.Activator.getDefault()
            .getJavaScriptFpManager();
    }

}
