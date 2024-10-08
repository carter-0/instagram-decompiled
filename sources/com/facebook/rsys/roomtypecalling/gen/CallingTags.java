package com.facebook.rsys.roomtypecalling.gen;

import com.facebook.djinni.msys.infra.McfReference;

public class CallingTags {
    public static native CallingTags createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final String toString() {
        return "CallingTags{}";
    }
}
