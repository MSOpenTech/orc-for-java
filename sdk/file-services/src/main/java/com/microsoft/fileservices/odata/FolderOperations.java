/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.fileservices.odata;

import com.microsoft.fileservices.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.interfaces.*;
import static com.microsoft.services.odata.Helpers.*;

/**
 * The type FolderOperations.
 */
public class FolderOperations extends ItemOperations {

     /**
      * Instantiates a new FolderOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public FolderOperations(String urlComponent, ODataExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public FolderOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public FolderOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * copy listenable future.
     * @param destFolderId the destFolderId @param destFolderPath the destFolderPath @param newName the newName 
     * @return the listenable future
     */         
    public ListenableFuture<Folder> copy(String destFolderId, String destFolderPath, String newName) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializeddestFolderId = serializer.serialize(destFolderId);
		String serializeddestFolderPath = serializer.serialize(destFolderPath);
		String serializednewName = serializer.serialize(newName);
		  
        
        ListenableFuture<String> future = copyRaw(serializeddestFolderId, serializeddestFolderPath, serializednewName);
        return transformToEntityListenableFuture(future, Folder.class, getResolver());
        
    }

     /**
     * copyRaw listenable future.
     * @param destFolderId the destFolderId @param destFolderPath the destFolderPath @param newName the newName 
     * @return the listenable future
     */ 
    public ListenableFuture<String> copyRaw(String destFolderId, String destFolderPath, String newName){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("destFolderId", destFolderId);
		map.put("destFolderPath", destFolderPath);
		map.put("newName", newName);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
                .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));

        
        request.getUrl().appendPathComponent("copy");
        ListenableFuture<ODataResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


}
