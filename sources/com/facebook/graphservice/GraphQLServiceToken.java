package com.facebook.graphservice;

import X.0di;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.jni.HybridData;

public class GraphQLServiceToken implements GraphQLService.Token {
    public final HybridData mHybridData;

    public native void cancel();

    static {
        0di.A01("graphservice-jni");
    }

    public GraphQLServiceToken(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
