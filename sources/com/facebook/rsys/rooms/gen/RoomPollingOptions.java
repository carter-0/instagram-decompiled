package com.facebook.rsys.rooms.gen;

import X.002;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class RoomPollingOptions {
    public final int incallPollingIntervalMs;
    public final int lobbyPollingIntervalMs;

    public static native RoomPollingOptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomPollingOptions)) {
            return false;
        }
        RoomPollingOptions roomPollingOptions = (RoomPollingOptions) obj;
        return this.lobbyPollingIntervalMs == roomPollingOptions.lobbyPollingIntervalMs && this.incallPollingIntervalMs == roomPollingOptions.incallPollingIntervalMs;
    }

    public final int hashCode() {
        return C66583MXo.A01(this.lobbyPollingIntervalMs) + this.incallPollingIntervalMs;
    }

    public final String toString() {
        return 002.A0n("RoomPollingOptions{lobbyPollingIntervalMs=", ",incallPollingIntervalMs=", "}", this.lobbyPollingIntervalMs, this.incallPollingIntervalMs);
    }

    public RoomPollingOptions(int i, int i2) {
        this.lobbyPollingIntervalMs = i;
        this.incallPollingIntervalMs = i2;
    }
}
