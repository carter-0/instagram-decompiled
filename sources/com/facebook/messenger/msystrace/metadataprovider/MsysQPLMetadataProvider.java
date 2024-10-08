package com.facebook.messenger.msystrace.metadataprovider;

import X.C272804lR;
import java.util.Map;

public class MsysQPLMetadataProvider {
    public static native Map generateAnnotationMap(MsysQPLMetadataSnapshot msysQPLMetadataSnapshot, MsysQPLMetadataSnapshot msysQPLMetadataSnapshot2);

    public static native MsysQPLMetadataSnapshot snapshot(long j, int i, int i2);

    public static MsysQPLMetadataSnapshot snapshot(boolean z, int i, int i2) {
        return snapshot(0, i, i2);
    }

    static {
        C272804lR.A00();
    }
}
