package com.facebook.pando.primaryexecution.livequery;

import X.0dV;
import X.C253383qh;
import com.facebook.graphql.rtgql.graphqllivequeriessdk.base.GraphQLLiveQueriesSDKProviderBase;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;

public final class PandoLiveQueryService extends PandoPrimaryExecution {
    public static final C253383qh Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, GraphQLLiveQueriesSDKProviderBase graphQLLiveQueriesSDKProviderBase, RealtimeConfigSourceProxy realtimeConfigSourceProxy);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3qh, java.lang.Object] */
    static {
        0dV.A0C("pando-client-livequery-jni");
    }
}
