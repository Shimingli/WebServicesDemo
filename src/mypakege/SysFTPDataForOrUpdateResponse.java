/**
 * SysFTPDataForOrUpdateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypakege;

public class SysFTPDataForOrUpdateResponse  implements java.io.Serializable {
    private mypakege.SysFTPDataForOrUpdateResponseSysFTPDataForOrUpdateResult sysFTPDataForOrUpdateResult;

    public SysFTPDataForOrUpdateResponse() {
    }

    public SysFTPDataForOrUpdateResponse(
           mypakege.SysFTPDataForOrUpdateResponseSysFTPDataForOrUpdateResult sysFTPDataForOrUpdateResult) {
           this.sysFTPDataForOrUpdateResult = sysFTPDataForOrUpdateResult;
    }


    /**
     * Gets the sysFTPDataForOrUpdateResult value for this SysFTPDataForOrUpdateResponse.
     * 
     * @return sysFTPDataForOrUpdateResult
     */
    public mypakege.SysFTPDataForOrUpdateResponseSysFTPDataForOrUpdateResult getSysFTPDataForOrUpdateResult() {
        return sysFTPDataForOrUpdateResult;
    }


    /**
     * Sets the sysFTPDataForOrUpdateResult value for this SysFTPDataForOrUpdateResponse.
     * 
     * @param sysFTPDataForOrUpdateResult
     */
    public void setSysFTPDataForOrUpdateResult(mypakege.SysFTPDataForOrUpdateResponseSysFTPDataForOrUpdateResult sysFTPDataForOrUpdateResult) {
        this.sysFTPDataForOrUpdateResult = sysFTPDataForOrUpdateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SysFTPDataForOrUpdateResponse)) return false;
        SysFTPDataForOrUpdateResponse other = (SysFTPDataForOrUpdateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sysFTPDataForOrUpdateResult==null && other.getSysFTPDataForOrUpdateResult()==null) || 
             (this.sysFTPDataForOrUpdateResult!=null &&
              this.sysFTPDataForOrUpdateResult.equals(other.getSysFTPDataForOrUpdateResult())));
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
        if (getSysFTPDataForOrUpdateResult() != null) {
            _hashCode += getSysFTPDataForOrUpdateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SysFTPDataForOrUpdateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SysFTPDataForOrUpdateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysFTPDataForOrUpdateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SysFTPDataForOrUpdateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SysFTPDataForOrUpdateResponse>SysFTPDataForOrUpdateResult"));
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
