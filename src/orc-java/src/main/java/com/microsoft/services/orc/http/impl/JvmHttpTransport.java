package com.microsoft.services.orc.http.impl;


import com.google.common.util.concurrent.SettableFuture;
import com.microsoft.services.orc.http.BaseHttpTransport;
import com.microsoft.services.orc.http.NetworkRunnable;
import com.microsoft.services.orc.http.Request;
import com.microsoft.services.orc.http.Response;

public class JvmHttpTransport extends BaseHttpTransport {
    @Override
    protected NetworkRunnable createNetworkRunnable(Request request, SettableFuture<Response> future) {
        return new JvmNetworkRunnable(request, future);
    }
}
