
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1BoxedType;
import org.bn.annotations.ASN1OctetString;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.annotations.ASN1SequenceOf;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "OctetStringArray" )
    public class OctetStringArray implements IASN1PreparedElement {
                
            @ASN1OctetString( name = "" )
    
            @ASN1SequenceOf( name = "OctetStringArray" , isSetOf = false)
	    private java.util.Collection<byte[]> value = null; 
    
            public OctetStringArray () {
            }
        
            public OctetStringArray ( java.util.Collection<byte[]> value ) {
                setValue(value);
            }
                        
            public void setValue(java.util.Collection<byte[]> value) {
                this.value = value;
            }
            
            public java.util.Collection<byte[]> getValue() {
                return this.value;
            }            
            
            public void initValue() {
                setValue(new java.util.LinkedList<byte[]>()); 
            }
            
            public void add(byte[] item) {
                value.add(item);
            }

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(OctetStringArray.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            