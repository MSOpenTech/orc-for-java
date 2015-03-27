/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.outlookservices.odata;

import com.microsoft.outlookservices.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.interfaces.*;
import static com.microsoft.services.odata.Helpers.*;

/**
 * The type MessageOperations.
 */
public class MessageOperations extends ItemOperations {

     /**
      * Instantiates a new MessageOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public MessageOperations(String urlComponent, ODataExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public MessageOperations addParameter(String name, Object value) {
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
    public MessageOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * Copy listenable future.
     * @param destinationId the destinationId 
     * @return the listenable future
     */         
    public ListenableFuture<Message> copy(String destinationId) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedDestinationId = serializer.serialize(destinationId);
		  
        
        ListenableFuture<String> future = copyRaw(serializedDestinationId);
        return transformToEntityListenableFuture(future, Message.class, getResolver());
        
    }

     /**
     * CopyRaw listenable future.
     * @param destinationId the destinationId 
     * @return the listenable future
     */ 
    public ListenableFuture<String> copyRaw(String destinationId){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("DestinationId", destinationId);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));

        
        request.getUrl().appendPathComponent("Copy");
        ListenableFuture<ODataResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * Move listenable future.
     * @param destinationId the destinationId 
     * @return the listenable future
     */         
    public ListenableFuture<Message> move(String destinationId) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedDestinationId = serializer.serialize(destinationId);
		  
        
        ListenableFuture<String> future = moveRaw(serializedDestinationId);
        return transformToEntityListenableFuture(future, Message.class, getResolver());
        
    }

     /**
     * MoveRaw listenable future.
     * @param destinationId the destinationId 
     * @return the listenable future
     */ 
    public ListenableFuture<String> moveRaw(String destinationId){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("DestinationId", destinationId);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));

        
        request.getUrl().appendPathComponent("Move");
        ListenableFuture<ODataResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * CreateReply listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Message> createReply() { 
              
          
        
        ListenableFuture<String> future = createReplyRaw();
        return transformToEntityListenableFuture(future, Message.class, getResolver());
        
    }

     /**
     * CreateReplyRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> createReplyRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.getUrl().appendPathComponent("CreateReply");
        ListenableFuture<ODataResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * CreateReplyAll listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Message> createReplyAll() { 
              
          
        
        ListenableFuture<String> future = createReplyAllRaw();
        return transformToEntityListenableFuture(future, Message.class, getResolver());
        
    }

     /**
     * CreateReplyAllRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> createReplyAllRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.getUrl().appendPathComponent("CreateReplyAll");
        ListenableFuture<ODataResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * CreateForward listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Message> createForward() { 
              
          
        
        ListenableFuture<String> future = createForwardRaw();
        return transformToEntityListenableFuture(future, Message.class, getResolver());
        
    }

     /**
     * CreateForwardRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> createForwardRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.getUrl().appendPathComponent("CreateForward");
        ListenableFuture<ODataResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * Reply listenable future.
     * @param comment the comment 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> reply(String comment) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedComment = serializer.serialize(comment);
		  
        
        ListenableFuture<String> future = replyRaw(serializedComment);
        return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * ReplyRaw listenable future.
     * @param comment the comment 
     * @return the listenable future
     */ 
    public ListenableFuture<String> replyRaw(String comment){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("Comment", comment);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));

        
        request.getUrl().appendPathComponent("Reply");
        ListenableFuture<ODataResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * ReplyAll listenable future.
     * @param comment the comment 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> replyAll(String comment) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedComment = serializer.serialize(comment);
		  
        
        ListenableFuture<String> future = replyAllRaw(serializedComment);
        return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * ReplyAllRaw listenable future.
     * @param comment the comment 
     * @return the listenable future
     */ 
    public ListenableFuture<String> replyAllRaw(String comment){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("Comment", comment);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));

        
        request.getUrl().appendPathComponent("ReplyAll");
        ListenableFuture<ODataResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * Forward listenable future.
     * @param comment the comment @param toRecipients the toRecipients 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> forward(String comment, java.util.List<Recipient> toRecipients) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedComment = serializer.serialize(comment);
		String serializedToRecipients = serializer.serialize(toRecipients);
		  
        
        ListenableFuture<String> future = forwardRaw(serializedComment, serializedToRecipients);
        return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * ForwardRaw listenable future.
     * @param comment the comment @param toRecipients the toRecipients 
     * @return the listenable future
     */ 
    public ListenableFuture<String> forwardRaw(String comment, String toRecipients){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("Comment", comment);
		map.put("ToRecipients", toRecipients);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));

        
        request.getUrl().appendPathComponent("Forward");
        ListenableFuture<ODataResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * Send listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> send() { 
              
          
        
        ListenableFuture<String> future = sendRaw();
        return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * SendRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> sendRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.getUrl().appendPathComponent("Send");
        ListenableFuture<ODataResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


}
