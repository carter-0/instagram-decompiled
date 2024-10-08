package com.facebook.graphservice.interfaces;

import X.C13421Ta6;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public interface GraphQLBaseConsistency {
    ListenableFuture lookup(Object obj);

    ListenableFuture publishBuilder(C13421Ta6 ta6);

    ListenableFuture publishBuilderWithFullConsistency(C13421Ta6 ta6);

    GraphQLService.Token subscribe(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor);

    GraphQLService.Token subscribeWithFullConsistency(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor);
}
