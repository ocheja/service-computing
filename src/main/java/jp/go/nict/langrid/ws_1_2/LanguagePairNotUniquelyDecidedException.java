/**
 * LanguagePairNotUniquelyDecidedException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jp.go.nict.langrid.ws_1_2;

public class LanguagePairNotUniquelyDecidedException  extends InvalidParameterException  implements java.io.Serializable {
    private String[] candidates;

    private String message1;

    private String parameterName1;

    private String parameterName2;

    public LanguagePairNotUniquelyDecidedException() {
    }

    public LanguagePairNotUniquelyDecidedException(
           String description,
           String parameterName,
           String[] candidates,
           String message1,
           String parameterName1,
           String parameterName2) {
        super(
            description,
            parameterName);
        this.candidates = candidates;
        this.message1 = message1;
        this.parameterName1 = parameterName1;
        this.parameterName2 = parameterName2;
    }


    /**
     * Gets the candidates value for this LanguagePairNotUniquelyDecidedException.
     * 
     * @return candidates
     */
    public String[] getCandidates() {
        return candidates;
    }


    /**
     * Sets the candidates value for this LanguagePairNotUniquelyDecidedException.
     * 
     * @param candidates
     */
    public void setCandidates(String[] candidates) {
        this.candidates = candidates;
    }


    /**
     * Gets the message1 value for this LanguagePairNotUniquelyDecidedException.
     * 
     * @return message1
     */
    public String getMessage1() {
        return message1;
    }


    /**
     * Sets the message1 value for this LanguagePairNotUniquelyDecidedException.
     * 
     * @param message1
     */
    public void setMessage1(String message1) {
        this.message1 = message1;
    }


    /**
     * Gets the parameterName1 value for this LanguagePairNotUniquelyDecidedException.
     * 
     * @return parameterName1
     */
    public String getParameterName1() {
        return parameterName1;
    }


    /**
     * Sets the parameterName1 value for this LanguagePairNotUniquelyDecidedException.
     * 
     * @param parameterName1
     */
    public void setParameterName1(String parameterName1) {
        this.parameterName1 = parameterName1;
    }


    /**
     * Gets the parameterName2 value for this LanguagePairNotUniquelyDecidedException.
     * 
     * @return parameterName2
     */
    public String getParameterName2() {
        return parameterName2;
    }


    /**
     * Sets the parameterName2 value for this LanguagePairNotUniquelyDecidedException.
     * 
     * @param parameterName2
     */
    public void setParameterName2(String parameterName2) {
        this.parameterName2 = parameterName2;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LanguagePairNotUniquelyDecidedException)) return false;
        LanguagePairNotUniquelyDecidedException other = (LanguagePairNotUniquelyDecidedException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.candidates==null && other.getCandidates()==null) || 
             (this.candidates!=null &&
              java.util.Arrays.equals(this.candidates, other.getCandidates()))) &&
            ((this.message1==null && other.getMessage1()==null) || 
             (this.message1!=null &&
              this.message1.equals(other.getMessage1()))) &&
            ((this.parameterName1==null && other.getParameterName1()==null) || 
             (this.parameterName1!=null &&
              this.parameterName1.equals(other.getParameterName1()))) &&
            ((this.parameterName2==null && other.getParameterName2()==null) || 
             (this.parameterName2!=null &&
              this.parameterName2.equals(other.getParameterName2())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCandidates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCandidates());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCandidates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage1() != null) {
            _hashCode += getMessage1().hashCode();
        }
        if (getParameterName1() != null) {
            _hashCode += getParameterName1().hashCode();
        }
        if (getParameterName2() != null) {
            _hashCode += getParameterName2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LanguagePairNotUniquelyDecidedException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://langrid.nict.go.jp/ws_1_2/", "LanguagePairNotUniquelyDecidedException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("candidates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "candidates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterName1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterName1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterName2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterName2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
