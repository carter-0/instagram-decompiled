package com.facebook.rsys.roomslobby.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.rooms.gen.RoomsProxy;

public abstract class RoomsLobbyFeatureFactory {

    public final class CProxy extends RoomsLobbyFeatureFactory {
        public static native FeatureHolder create(RoomsProxy roomsProxy, RoomsLobbyStoreFactory roomsLobbyStoreFactory);

        public static native RoomsLobbyFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
