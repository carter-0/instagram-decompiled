package com.facebook.msys.cql.dataclasses;

import X.0fh;
import X.AnonymousClass3FZ;
import X.AnonymousClass7TE;
import X.C66580MXl;
import X.C69709NqV;
import X.C70839ONq;
import X.C74553Pwt;

public final class AIBotProfileMetadataDataclassAdapter extends C70839ONq {
    public static final C69709NqV Companion = new Object();
    public static final AIBotProfileMetadataDataclassAdapter INSTANCE = new C70839ONq();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Pwt, X.3FZ] */
    public C74553Pwt toAdaptedObject(String str) {
        if (str != null) {
            return new AnonymousClass3FZ(C66580MXl.A17(str));
        }
        throw AnonymousClass7TE.A11("Trying to create AIBotProfileMetadataDataclass from null string");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.Pwt, X.3FZ] */
    public C74553Pwt toNullableAdaptedObject(String str) {
        if (str == null) {
            return null;
        }
        0fh.A01("AIBotProfileMetadataDataclassImpl.toNullableAdaptedObject.Deserialize", -1988403300);
        try {
            return new AnonymousClass3FZ(C66580MXl.A17(str));
        } finally {
            0fh.A00(-1328794345);
        }
    }

    public String toNullableRawObject(C74553Pwt pwt) {
        if (pwt != null) {
            return toRawObject(pwt);
        }
        return null;
    }

    public String toRawObject(C74553Pwt pwt) {
        String obj;
        if (pwt != null && (obj = ((AnonymousClass3FZ) pwt).A00.toString()) != null) {
            return obj;
        }
        throw AnonymousClass7TE.A11("Trying to get string from null AIBotProfileMetadataDataclass");
    }
}
