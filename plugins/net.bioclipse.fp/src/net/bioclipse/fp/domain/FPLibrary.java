package net.bioclipse.fp.domain;

import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import net.bioclipse.core.domain.BioObject;

public class FPLibrary extends BioObject {

	/**
	 * Collection of fingerprints for a set of substances
	 */
	private Map<String, Map<String, BitSet>> fingerPrints 
		= Collections.synchronizedMap( new HashMap< String, 
				                                    Map<String, BitSet>>() );
	
	/**
	 * Fetches the map of inchikeys and fingerprints for the given 
	 * fingerprinttypes by if necessary creating a new.
	 * 
	 * @param fingerprintType
	 * @return the map for the corresponding fingerprint type
	 */
	private Map<String, BitSet> getDataMap( String fingerprintType ) {
		Map<String, BitSet> result = fingerPrints.get(fingerprintType);
		if (result == null ) {
			result = new HashMap<String, BitSet>();
			fingerPrints.put(fingerprintType, result);
		}
		return result;
	}
	
	/**
	 * Adds the given fingerprint of the given type for the molecule with the 
	 * given inchikey to the Library
	 * 
	 * @param inchiKey
	 * @param fingerprintType
	 * @param fingerprint
	 */
	public void addFingerprint( String inchiKey, 
			                    String fingerprintType, 
			                    BitSet fingerprint ) {
		getDataMap(fingerprintType).put(inchiKey, fingerprint);
	}

	public BitSet getFingerprint(String inchikey, String fingerprintType) {
		Map<String, BitSet> temp = fingerPrints.get(fingerprintType);
		return temp == null ? null 
				            : temp.get(inchikey);
	}
}
