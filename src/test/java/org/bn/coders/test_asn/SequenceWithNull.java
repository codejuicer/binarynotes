
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1Element;
import org.bn.annotations.ASN1Null;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.annotations.ASN1Sequence;
import org.bn.annotations.ASN1String;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;
import org.bn.coders.UniversalTag;




    @ASN1PreparedElement
    @ASN1Sequence ( name = "SequenceWithNull", isSet = false )
    public class SequenceWithNull implements IASN1PreparedElement {
            
    @ASN1String( name = "", 
        stringType =  UniversalTag.PrintableString , isUCS = false )
    
        @ASN1Element ( name = "test", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private String test = null;
                
  
        @ASN1Null ( name = "nullVal" ) 
    
        @ASN1Element ( name = "nullVal", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private org.bn.types.NullObject nullVal = null;
                
  
    @ASN1String( name = "", 
        stringType =  UniversalTag.PrintableString , isUCS = false )
    
        @ASN1Element ( name = "test2", isOptional =  false , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private String test2 = null;
                
  
        
        public String getTest () {
            return this.test;
        }

        

        public void setTest (String value) {
            this.test = value;
        }
        
  
        
        public String getTest2 () {
            return this.test2;
        }

        

        public void setTest2 (String value) {
            this.test2 = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(SequenceWithNull.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            