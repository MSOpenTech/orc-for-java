/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.sharepointservices.http;


import com.microsoft.sharepointservices.Credentials;

public class OAuthCredentials implements Credentials {

	private String mToken;
	
	public OAuthCredentials(String oAuthToken) {
		mToken = oAuthToken;
	}
	
	/**
	 * Returns the OAuth Token
	 */
	public String getToken() {
		return mToken;
	}

	@Override
	public void prepareRequest(Request request) {
		request.addHeader("Authorization", "Bearer " + getToken());
	}
	
}
