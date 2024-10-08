package com.facebook.msys.cql.dataclasses;

import X.0fh;
import X.AnonymousClass3FZ;
import X.AnonymousClass7TE;
import X.C66580MXl;
import X.C69710NqW;
import X.C70839ONq;
import X.C74554Pwu;

public final class ReadOnlyMessageMetadataDataclassAdapter extends C70839ONq {
    public static final C69710NqW Companion = new Object();
    public static final ReadOnlyMessageMetadataDataclassAdapter INSTANCE = new C70839ONq();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Pwu, X.3FZ] */
    public C74554Pwu toAdaptedObject(String str) {
        if (str != null) {
            return new AnonymousClass3FZ(C66580MXl.A17(str));
        }
        throw AnonymousClass7TE.A11("Trying to create ReadOnlyMessageMetadataDataclass from null string");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.Pwu, X.3FZ] */
    public C74554Pwu toNullableAdaptedObject(String str) {
        if (str == null) {
            return null;
        }
        0fh.A01("ReadOnlyMessageMetadataDataclassAdapter.toNullableAdaptedObject.Deserialize", 912460440);
        try {
            return new AnonymousClass3FZ(C66580MXl.A17(str));
        } finally {
            0fh.A00(-698625127);
        }
    }

    public String toNullableRawObject(C74554Pwu pwu) {
        if (pwu != null) {
            return toRawObject(pwu);
        }
        return null;
    }

    public String toRawObject(C74554Pwu pwu) {
        String obj;
        if (pwu != null && (obj = ((AnonymousClass3FZ) pwu).A00.toString()) != null) {
            return obj;
        }
        throw AnonymousClass7TE.A11("Trying to get string from null ReadOnlyMessageMetadataDataclass");
    }
}
