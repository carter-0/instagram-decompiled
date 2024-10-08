package com.facebook.graphqlrealtimeservice.subscription;

import X.0di;
import com.facebook.graphql.rtgql.graphqlsubscriptionssdk.base.GraphQLSubscriptionsSDKProviderBase;
import com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.jni.HybridData;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public class GraphQLRealtimeSubscriptionService implements GraphQLRealtimeService {
    public final HybridData mHybridData;

    private native GraphQLRealtimeService.Token handleQueryJNI(GraphQLQuery graphQLQuery, GraphQLRealtimeService.RealtimeDataCallbacks realtimeDataCallbacks, Executor executor);

    public static native HybridData initHybridData(String str, GraphQLSubscriptionsSDKProviderBase graphQLSubscriptionsSDKProviderBase, GraphServiceAsset graphServiceAsset, ScheduledExecutorService scheduledExecutorService, RealtimeConfigSourceProxy realtimeConfigSourceProxy);

    static {
        0di.A01("graphqlrt-subscription-jni");
    }

    public GraphQLRealtimeSubscriptionService(String str, GraphQLSubscriptionsSDKProviderBase graphQLSubscriptionsSDKProviderBase, GraphServiceAsset graphServiceAsset, ScheduledExecutorService scheduledExecutorService, RealtimeConfigSourceProxy realtimeConfigSourceProxy) {
        this.mHybridData = initHybridData(str, graphQLSubscriptionsSDKProviderBase, graphServiceAsset, scheduledExecutorService, realtimeConfigSourceProxy);
    }
}
