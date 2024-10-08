package com.instagram.graphql.rtgql.graphqllivequeries.sdk;

import X.0di;
import X.0qQ;
import X.C253333qc;
import X.C253363qf;
import com.facebook.graphql.rtgql.graphqllivequeriessdk.base.GraphQLLiveQueriesSDKProviderBase;
import com.facebook.graphql.rtgql.sdk.base.RealtimeGraphQLSDKProviderBase;
import com.facebook.graphql.rtgql.sdk.connection.RealtimeGraphQLDgwStreamGroupProvider;
import com.facebook.jni.HybridData;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;

public final class IGGraphQLLiveQuerySDKProvider extends GraphQLLiveQueriesSDKProviderBase {
    public static final C253363qf Companion = new Object();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGGraphQLLiveQuerySDKProvider(RealtimeGraphQLSDKProviderBase realtimeGraphQLSDKProviderBase, BaseRequestStreamClient baseRequestStreamClient, C253333qc r4, RealtimeGraphQLDgwStreamGroupProvider realtimeGraphQLDgwStreamGroupProvider) {
        super(initHybrid(realtimeGraphQLSDKProviderBase, baseRequestStreamClient, new RealtimeConfigSourceProxy(r4), realtimeGraphQLDgwStreamGroupProvider));
        0qQ.A0B(realtimeGraphQLSDKProviderBase, 1);
        0qQ.A0B(baseRequestStreamClient, 2);
        0qQ.A0B(r4, 3);
        0qQ.A0B(realtimeGraphQLDgwStreamGroupProvider, 4);
    }

    public static final native HybridData initHybrid(RealtimeGraphQLSDKProviderBase realtimeGraphQLSDKProviderBase, BaseRequestStreamClient baseRequestStreamClient, RealtimeConfigSourceProxy realtimeConfigSourceProxy, RealtimeGraphQLDgwStreamGroupProvider realtimeGraphQLDgwStreamGroupProvider);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.3qf] */
    static {
        0di.A01("graphqllivequeries-sdk-provider-jni-instagram");
    }
}
