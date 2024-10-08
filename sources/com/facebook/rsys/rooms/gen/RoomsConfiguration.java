package com.facebook.rsys.rooms.gen;

import X.002;
import com.facebook.djinni.msys.infra.McfReference;

public class RoomsConfiguration {
    public final boolean disableRoomOwnerAutoJoin;

    public static native RoomsConfiguration createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RoomsConfiguration) && this.disableRoomOwnerAutoJoin == ((RoomsConfiguration) obj).disableRoomOwnerAutoJoin;
        }
        return true;
    }

    public final int hashCode() {
        return true + (this.disableRoomOwnerAutoJoin ? 1 : 0);
    }

    public final String toString() {
        return 002.A1B("RoomsConfiguration{disableRoomOwnerAutoJoin=", "}", this.disableRoomOwnerAutoJoin);
    }

    public RoomsConfiguration(boolean z) {
        this.disableRoomOwnerAutoJoin = z;
    }
}
