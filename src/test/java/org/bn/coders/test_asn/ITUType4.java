
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
    @ASN1BoxedType ( name = "ITUType4" )
    public class ITUType4 implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "ITUType4", isOptional =  false , hasTag =  true, tag = 7, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private ITUType3  value;        

        
        
        public ITUType4 () {
        }
        
        
        
        public void setValue(ITUType3 value) {
            this.value = value;
        }
        
        
        
        public ITUType3 getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ITUType4.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            