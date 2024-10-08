package com.facebook.msys.cql.dataclasses;

import X.0fh;
import X.AnonymousClass3FZ;
import X.AnonymousClass7TE;
import X.C66580MXl;
import X.C69712NqY;
import X.C70839ONq;
import X.C74556Pwx;

public final class XmaContentRefDataclassAdapter extends C70839ONq {
    public static final C69712NqY Companion = new Object();
    public static final XmaContentRefDataclassAdapter INSTANCE = new C70839ONq();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Pwx, X.3FZ] */
    public C74556Pwx toAdaptedObject(String str) {
        if (str != null) {
            return new AnonymousClass3FZ(C66580MXl.A17(str));
        }
        throw AnonymousClass7TE.A11("Trying to create XmaContentRefDataclass from null string");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.Pwx, X.3FZ] */
    public C74556Pwx toNullableAdaptedObject(String str) {
        if (str == null) {
            return null;
        }
        0fh.A01("XmaContentRefDataclassImpl.toNullableAdaptedObject.Deserialize", -1366890266);
        try {
            return new AnonymousClass3FZ(C66580MXl.A17(str));
        } finally {
            0fh.A00(1078972292);
        }
    }

    public String toNullableRawObject(C74556Pwx pwx) {
        if (pwx != null) {
            return toRawObject(pwx);
        }
        return null;
    }

    public String toRawObject(C74556Pwx pwx) {
        String obj;
        if (pwx != null && (obj = ((AnonymousClass3FZ) pwx).A00.toString()) != null) {
            return obj;
        }
        throw AnonymousClass7TE.A11("Trying to get string from null XmaContentRefDataclass");
    }
}
