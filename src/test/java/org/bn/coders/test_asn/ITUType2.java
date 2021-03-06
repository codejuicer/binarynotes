
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1BoxedType;
import org.bn.annotations.ASN1Element;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;
import org.bn.coders.TagClass;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "ITUType2" )
    public class ITUType2 implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "ITUType2", isOptional =  false , hasTag =  true, tag = 3, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private ITUType1  value;        

        
        
        public ITUType2 () {
        }
        
        
        
        public void setValue(ITUType1 value) {
            this.value = value;
        }
        
        
        
        public ITUType1 getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ITUType2.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            