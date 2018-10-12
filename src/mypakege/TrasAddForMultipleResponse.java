/**
 * TrasAddForMultipleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypakege;

public class TrasAddForMultipleResponse  implements java.io.Serializable {
    private java.lang.String trasAddForMultipleResult;

    public TrasAddForMultipleResponse() {
    }

    public TrasAddForMultipleResponse(
           java.lang.String trasAddForMultipleResult) {
           this.trasAddForMultipleResult = trasAddForMultipleResult;
    }


    /**
     * Gets the trasAddForMultipleResult value for this TrasAddForMultipleResponse.
     * 
     * @return trasAddForMultipleResult
     */
    public java.lang.String getTrasAddForMultipleResult() {
        return trasAddForMultipleResult;
    }


    /**
     * Sets the trasAddForMultipleResult value for this TrasAddForMultipleResponse.
     * 
     * @param trasAddForMultipleResult
     */
    public void setTrasAddForMultipleResult(java.lang.String trasAddForMultipleResult) {
        this.trasAddForMultipleResult = trasAddForMultipleResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrasAddForMultipleResponse)) return false;
        TrasAddForMultipleResponse other = (TrasAddForMultipleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trasAddForMultipleResult==null && other.getTrasAddForMultipleResult()==null) || 
             (this.trasAddForMultipleResult!=null &&
              this.trasAddForMultipleResult.equals(other.getTrasAddForMultipleResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTrasAddForMultipleResult() != null) {
            _hashCode += getTrasAddForMultipleResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrasAddForMultipleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">TrasAddForMultipleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trasAddForMultipleResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TrasAddForMultipleResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
