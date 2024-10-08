package com.facebook.msys.cql.dataclasses;

import X.0fh;
import X.AnonymousClass3FZ;
import X.AnonymousClass7TE;
import X.C66580MXl;
import X.C69713NqZ;
import X.C70839ONq;
import X.C74555Pww;

public final class XmaDataclassAdapter extends C70839ONq {
    public static final C69713NqZ Companion = new Object();
    public static final XmaDataclassAdapter INSTANCE = new C70839ONq();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Pww, X.3FZ] */
    public C74555Pww toAdaptedObject(String str) {
        if (str != null) {
            return new AnonymousClass3FZ(C66580MXl.A17(str));
        }
        throw AnonymousClass7TE.A11("Trying to create XmaDataclass from null string");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.Pww, X.3FZ] */
    public C74555Pww toNullableAdaptedObject(String str) {
        if (str == null) {
            return null;
        }
        0fh.A01("XmaDataclassImpl.toNullableAdaptedObject.Deserialize", 324103212);
        try {
            return new AnonymousClass3FZ(C66580MXl.A17(str));
        } finally {
            0fh.A00(-1418394067);
        }
    }

    public String toNullableRawObject(C74555Pww pww) {
        if (pww != null) {
            return toRawObject(pww);
        }
        return null;
    }

    public String toRawObject(C74555Pww pww) {
        String obj;
        if (pww != null && (obj = ((AnonymousClass3FZ) pww).A00.toString()) != null) {
            return obj;
        }
        throw AnonymousClass7TE.A11("Trying to get string from null XmaDataclass");
    }
}
