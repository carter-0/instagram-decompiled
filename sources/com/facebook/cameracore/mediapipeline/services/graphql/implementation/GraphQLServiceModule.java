package com.facebook.cameracore.mediapipeline.services.graphql.implementation;

import X.0dV;
import X.C371628yi;
import X.C371698yt;
import X.C372058zb;
import X.C392729vH;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

public final class GraphQLServiceModule extends ServiceModule {
    public static final C392729vH Companion = new Object();

    public static final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9vH, java.lang.Object] */
    static {
        0dV.A0C("graphqlservice");
    }

    public ServiceConfiguration createConfiguration(C371698yt r3) {
        if (r3 == null) {
            return null;
        }
        C371628yi r1 = C372058zb.A04;
        if (C371698yt.A01(r3, r1)) {
            return new GraphQLServiceConfigurationHybrid((C372058zb) r3.A02(r1));
        }
        return null;
    }

    public GraphQLServiceModule() {
        this.mHybridData = initHybrid();
    }
}
