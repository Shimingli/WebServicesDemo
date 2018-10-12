/**
 * TrasAddForSingleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypakege;

public class TrasAddForSingleResponse  implements java.io.Serializable {
    private java.lang.String trasAddForSingleResult;

    public TrasAddForSingleResponse() {
    }

    public TrasAddForSingleResponse(
           java.lang.String trasAddForSingleResult) {
           this.trasAddForSingleResult = trasAddForSingleResult;
    }


    /**
     * Gets the trasAddForSingleResult value for this TrasAddForSingleResponse.
     * 
     * @return trasAddForSingleResult
     */
    public java.lang.String getTrasAddForSingleResult() {
        return trasAddForSingleResult;
    }


    /**
     * Sets the trasAddForSingleResult value for this TrasAddForSingleResponse.
     * 
     * @param trasAddForSingleResult
     */
    public void setTrasAddForSingleResult(java.lang.String trasAddForSingleResult) {
        this.trasAddForSingleResult = trasAddForSingleResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrasAddForSingleResponse)) return false;
        TrasAddForSingleResponse other = (TrasAddForSingleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trasAddForSingleResult==null && other.getTrasAddForSingleResult()==null) || 
             (this.trasAddForSingleResult!=null &&
              this.trasAddForSingleResult.equals(other.getTrasAddForSingleResult())));
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
        if (getTrasAddForSingleResult() != null) {
            _hashCode += getTrasAddForSingleResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrasAddForSingleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">TrasAddForSingleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trasAddForSingleResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TrasAddForSingleResult"));
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
