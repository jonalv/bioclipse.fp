/*******************************************************************************
 * Copyright (c) 2011  Jonathan Alvarsson <jonathan.alvarsson@farmbio.uu.se>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contact: http://www.bioclipse.net/
 ******************************************************************************/
package net.bioclipse.fp.business;

import net.bioclipse.managers.business.IBioclipseManager;

import org.apache.log4j.Logger;

/**
 * @author jonalv
 *
 */
public class FpManager implements IBioclipseManager {

    private static final Logger logger = Logger.getLogger(FpManager.class);

    /**
     * Gives a short one word name of the manager used as variable name when
     * scripting.
     */
    public String getManagerName() {
        return "fp";
    }
}
