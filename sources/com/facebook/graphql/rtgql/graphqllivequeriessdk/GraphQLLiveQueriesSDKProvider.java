package com.facebook.graphql.rtgql.graphqllivequeriessdk;

import X.0dV;
import X.AnonymousClass7TG;
import X.C392959vf;
import com.facebook.graphql.rtgql.graphqllivequeriessdk.base.GraphQLLiveQueriesSDKProviderBase;
import com.facebook.graphql.rtgql.sdk.RealtimeGraphQLSDKProvider;
import com.facebook.jni.HybridData;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;

public final class GraphQLLiveQueriesSDKProvider extends GraphQLLiveQueriesSDKProviderBase {
    public static final C392959vf Companion = new Object();

    public static final native HybridData initHybrid(RealtimeGraphQLSDKProvider realtimeGraphQLSDKProvider, BaseRequestStreamClient baseRequestStreamClient, RealtimeConfigSourceProxy realtimeConfigSourceProxy);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9vf] */
    static {
        0dV.A0C("graphqllivequeriessdk");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphQLLiveQueriesSDKProvider(RealtimeGraphQLSDKProvider realtimeGraphQLSDKProvider, BaseRequestStreamClient baseRequestStreamClient, RealtimeConfigSourceProxy realtimeConfigSourceProxy) {
        super(initHybrid(realtimeGraphQLSDKProvider, baseRequestStreamClient, realtimeConfigSourceProxy));
        AnonymousClass7TG.A1U(realtimeGraphQLSDKProvider, baseRequestStreamClient, realtimeConfigSourceProxy);
    }
}
