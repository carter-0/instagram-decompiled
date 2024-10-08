package com.facebook.rsys.rooms.gen;

import X.002;
import X.C51968G9o;
import com.facebook.djinni.msys.infra.McfReference;

public class LogMetadata {
    public final long eventTime;

    public static native LogMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LogMetadata) && this.eventTime == ((LogMetadata) obj).eventTime;
        }
        return true;
    }

    public final int hashCode() {
        return 527 + C51968G9o.A03(this.eventTime);
    }

    public final String toString() {
        return 002.A0e("LogMetadata{eventTime=", "}", this.eventTime);
    }

    public LogMetadata(long j) {
        this.eventTime = j;
    }
}
