/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.discoveryservices;

/**
 * The type Service Info.
*/
public class ServiceInfo extends ODataBaseEntity {

    public ServiceInfo(){
        setODataType("#Microsoft.DiscoveryServices.ServiceInfo");
    }
            
    private String capability;
     
    /**
    * Gets the capability.
    *
    * @return the String
    */
    public String getcapability() {
        return this.capability; 
    }

    /**
    * Sets the capability.
    *
    * @param value the String
    */
    public void setcapability(String value) { 
        this.capability = value; 
    }
            
    private String entityKey;
     
    /**
    * Gets the entity Key.
    *
    * @return the String
    */
    public String getentityKey() {
        return this.entityKey; 
    }

    /**
    * Sets the entity Key.
    *
    * @param value the String
    */
    public void setentityKey(String value) { 
        this.entityKey = value; 
    }
            
    private String providerId;
     
    /**
    * Gets the provider Id.
    *
    * @return the String
    */
    public String getproviderId() {
        return this.providerId; 
    }

    /**
    * Sets the provider Id.
    *
    * @param value the String
    */
    public void setproviderId(String value) { 
        this.providerId = value; 
    }
            
    private String providerName;
     
    /**
    * Gets the provider Name.
    *
    * @return the String
    */
    public String getproviderName() {
        return this.providerName; 
    }

    /**
    * Sets the provider Name.
    *
    * @param value the String
    */
    public void setproviderName(String value) { 
        this.providerName = value; 
    }
            
    private Integer serviceAccountType;
     
    /**
    * Gets the service Account Type.
    *
    * @return the Integer
    */
    public Integer getserviceAccountType() {
        return this.serviceAccountType; 
    }

    /**
    * Sets the service Account Type.
    *
    * @param value the Integer
    */
    public void setserviceAccountType(Integer value) { 
        this.serviceAccountType = value; 
    }
            
    private String serviceApiVersion;
     
    /**
    * Gets the service Api Version.
    *
    * @return the String
    */
    public String getserviceApiVersion() {
        return this.serviceApiVersion; 
    }

    /**
    * Sets the service Api Version.
    *
    * @param value the String
    */
    public void setserviceApiVersion(String value) { 
        this.serviceApiVersion = value; 
    }
            
    private String serviceEndpointUri;
     
    /**
    * Gets the service Endpoint Uri.
    *
    * @return the String
    */
    public String getserviceEndpointUri() {
        return this.serviceEndpointUri; 
    }

    /**
    * Sets the service Endpoint Uri.
    *
    * @param value the String
    */
    public void setserviceEndpointUri(String value) { 
        this.serviceEndpointUri = value; 
    }
            
    private String serviceId;
     
    /**
    * Gets the service Id.
    *
    * @return the String
    */
    public String getserviceId() {
        return this.serviceId; 
    }

    /**
    * Sets the service Id.
    *
    * @param value the String
    */
    public void setserviceId(String value) { 
        this.serviceId = value; 
    }
            
    private String serviceName;
     
    /**
    * Gets the service Name.
    *
    * @return the String
    */
    public String getserviceName() {
        return this.serviceName; 
    }

    /**
    * Sets the service Name.
    *
    * @param value the String
    */
    public void setserviceName(String value) { 
        this.serviceName = value; 
    }
            
    private String serviceResourceId;
     
    /**
    * Gets the service Resource Id.
    *
    * @return the String
    */
    public String getserviceResourceId() {
        return this.serviceResourceId; 
    }

    /**
    * Sets the service Resource Id.
    *
    * @param value the String
    */
    public void setserviceResourceId(String value) { 
        this.serviceResourceId = value; 
    }
}

