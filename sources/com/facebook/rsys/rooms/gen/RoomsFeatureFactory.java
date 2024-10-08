package com.facebook.rsys.rooms.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

public abstract class RoomsFeatureFactory {

    public final class CProxy extends RoomsFeatureFactory {
        public static native FeatureHolder create(RoomsOptions roomsOptions, RoomsProxy roomsProxy, RoomsLoggingProxy roomsLoggingProxy, RoomsStoreFactory roomsStoreFactory);

        public static native RoomsFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
