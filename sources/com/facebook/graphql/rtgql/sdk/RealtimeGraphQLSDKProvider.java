package com.facebook.graphql.rtgql.sdk;

import X.0dV;
import X.0qQ;
import X.AnonymousClass3qZ;
import com.facebook.graphql.rtgql.sdk.base.RealtimeGraphQLSDKProviderBase;
import com.facebook.jni.HybridData;
import com.facebook.realtime.common.appstate.AppStateSyncer;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RealtimeGraphQLSDKProvider extends RealtimeGraphQLSDKProviderBase {
    public static final AnonymousClass3qZ Companion = new Object();

    public static final native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService, AppStateSyncer appStateSyncer);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.3qZ] */
    static {
        0dV.A0C("rtgqlsdk");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealtimeGraphQLSDKProvider(ScheduledExecutorService scheduledExecutorService, AppStateSyncer appStateSyncer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(scheduledExecutorService, (i & 2) != 0 ? null : appStateSyncer);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealtimeGraphQLSDKProvider(ScheduledExecutorService scheduledExecutorService, AppStateSyncer appStateSyncer) {
        super(initHybrid(scheduledExecutorService, appStateSyncer));
        0qQ.A0B(scheduledExecutorService, 1);
    }
}
