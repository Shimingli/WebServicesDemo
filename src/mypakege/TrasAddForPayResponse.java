/**
 * TrasAddForPayResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypakege;

public class TrasAddForPayResponse  implements java.io.Serializable {
    private java.lang.String trasAddForPayResult;

    public TrasAddForPayResponse() {
    }

    public TrasAddForPayResponse(
           java.lang.String trasAddForPayResult) {
           this.trasAddForPayResult = trasAddForPayResult;
    }


    /**
     * Gets the trasAddForPayResult value for this TrasAddForPayResponse.
     * 
     * @return trasAddForPayResult
     */
    public java.lang.String getTrasAddForPayResult() {
        return trasAddForPayResult;
    }


    /**
     * Sets the trasAddForPayResult value for this TrasAddForPayResponse.
     * 
     * @param trasAddForPayResult
     */
    public void setTrasAddForPayResult(java.lang.String trasAddForPayResult) {
        this.trasAddForPayResult = trasAddForPayResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrasAddForPayResponse)) return false;
        TrasAddForPayResponse other = (TrasAddForPayResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trasAddForPayResult==null && other.getTrasAddForPayResult()==null) || 
             (this.trasAddForPayResult!=null &&
              this.trasAddForPayResult.equals(other.getTrasAddForPayResult())));
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
        if (getTrasAddForPayResult() != null) {
            _hashCode += getTrasAddForPayResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrasAddForPayResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">TrasAddForPayResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trasAddForPayResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TrasAddForPayResult"));
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
