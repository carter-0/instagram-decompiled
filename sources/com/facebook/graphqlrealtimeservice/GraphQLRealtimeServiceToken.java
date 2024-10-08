package com.facebook.graphqlrealtimeservice;

import X.0di;
import X.RVP;
import com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService;
import com.facebook.jni.HybridData;

public final class GraphQLRealtimeServiceToken implements GraphQLRealtimeService.Token {
    public static final RVP Companion = new Object();
    public final HybridData mHybridData;

    public native void cancel();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RVP, java.lang.Object] */
    static {
        0di.A01("graphqlrealtimeservice-jni");
    }

    public GraphQLRealtimeServiceToken(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
