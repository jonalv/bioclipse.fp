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
package net.bioclipse.fp.tests;

import static org.junit.Assert.*;

import java.util.BitSet;

import net.bioclipse.fp.business.IFpManager;
import net.bioclipse.fp.domain.FPLibrary;

import org.junit.Test;

public abstract class AbstractFpManagerPluginTest {

    protected static IFpManager managerNamespace;
    
    @Test public void addAndretrieveFP() {

    	String inchikey = "inchikey";
    	String fingerprintType = "fingerprnttype";
    	BitSet bitSet = new BitSet() { { set(1); } };
    	
    	FPLibrary library = new FPLibrary();
    	
    	library.addFingerprint( inchikey, fingerprintType, bitSet );
    	
    	assertEquals( bitSet, 
    			      library.getFingerprint( inchikey, fingerprintType ) );
    }

}
