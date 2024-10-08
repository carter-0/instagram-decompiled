package com.facebook.msys.cql.dataclasses;

import X.0fh;
import X.AnonymousClass7TE;
import X.C69711NqX;
import X.C70839ONq;
import com.facebook.messaging.dataclasses.threadmetadata.ThreadMetadata;
import com.facebook.messaging.dataclasses.threadmetadata.ThreadMetadataSerializer;

public final class ThreadMetadataAdapter extends C70839ONq {
    public static final C69711NqX Companion = new Object();
    public static final ThreadMetadataAdapter INSTANCE = new C70839ONq();

    public ThreadMetadata toAdaptedObject(String str) {
        if (str != null) {
            0fh.A01("ThreadMetadataAdapter.toAdaptedObject.Deserialize", 896616569);
            try {
                ThreadMetadata fromString = ThreadMetadataSerializer.fromString(str);
                if (fromString != null) {
                    return fromString;
                }
                throw AnonymousClass7TE.A11("ThreadMetadata deserialization failed");
            } finally {
                0fh.A00(1388633988);
            }
        } else {
            throw AnonymousClass7TE.A11("Trying to create ThreadMetadata from null string");
        }
    }

    public ThreadMetadata toNullableAdaptedObject(String str) {
        if (str == null) {
            return null;
        }
        0fh.A01("ThreadMetadataAdapter.toNullableAdaptedObject.Deserialize", -1651333892);
        try {
            return ThreadMetadataSerializer.fromString(str);
        } finally {
            0fh.A00(837029235);
        }
    }

    public /* bridge */ /* synthetic */ Object toNullableRawObject(Object obj) {
        ThreadMetadata threadMetadata = (ThreadMetadata) obj;
        if (threadMetadata != null) {
            return ThreadMetadataSerializer.toString(threadMetadata);
        }
        return null;
    }

    public String toRawObject(ThreadMetadata threadMetadata) {
        String threadMetadataSerializer;
        if (threadMetadata != null && (threadMetadataSerializer = ThreadMetadataSerializer.toString(threadMetadata)) != null) {
            return threadMetadataSerializer;
        }
        throw AnonymousClass7TE.A11("Trying to get string from null ThreadMetadata");
    }

    public String toNullableRawObject(ThreadMetadata threadMetadata) {
        if (threadMetadata != null) {
            return ThreadMetadataSerializer.toString(threadMetadata);
        }
        return null;
    }
}
