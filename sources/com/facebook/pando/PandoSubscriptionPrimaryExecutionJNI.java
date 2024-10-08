package com.facebook.pando;

import X.0dV;
import X.0qQ;
import X.C2594341r;
import com.facebook.graphql.rtgql.graphqlsubscriptionssdk.base.GraphQLSubscriptionsSDKProviderBase;
import com.facebook.jni.HybridData;

public final class PandoSubscriptionPrimaryExecutionJNI extends PandoPrimaryExecution {
    public static final C2594341r Companion = new Object();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PandoSubscriptionPrimaryExecutionJNI(GraphQLSubscriptionsSDKProviderBase graphQLSubscriptionsSDKProviderBase, boolean z) {
        super(initHybridData(graphQLSubscriptionsSDKProviderBase, z));
        0qQ.A0B(graphQLSubscriptionsSDKProviderBase, 1);
    }

    public static final native HybridData initHybridData(GraphQLSubscriptionsSDKProviderBase graphQLSubscriptionsSDKProviderBase, boolean z);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.41r, java.lang.Object] */
    static {
        0dV.A0C("pando-graphql-subscriptions-jni");
    }
}
