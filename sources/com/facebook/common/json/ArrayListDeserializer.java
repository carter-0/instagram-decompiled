package com.facebook.common.json;

import X.16F;
import X.16L;
import X.AnonymousClass4eE;
import X.AnonymousClass7TE;
import X.C12837T9j;
import X.C268554db;
import X.C268894eF;
import X.C269674fV;
import X.RV1;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ArrayListDeserializer extends JsonDeserializer {
    public JsonDeserializer A00;
    public final C268894eF A01;
    public final Class A02;

    public ArrayListDeserializer(C268894eF r3) {
        this.A02 = null;
        C268894eF A07 = r3.A07(0);
        this.A01 = A07 == null ? AnonymousClass4eE.A07 : A07;
        this.A00 = null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Throwable, X.1bF, java.io.IOException] */
    public final /* bridge */ /* synthetic */ Object A0D(16F r5, C269674fV r6) {
        16L A11;
        C268554db r2 = (C268554db) r5.A1K();
        if (!r5.A14() || (A11 = r5.A11()) == 16L.A0G) {
            r5.A0z();
            return AnonymousClass7TE.A1C();
        } else if (A11 == 16L.A0C) {
            if (this.A00 == null) {
                Type type = this.A02;
                if (type == null) {
                    type = this.A01;
                }
                this.A00 = r2.A0M(r6, type);
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            while (RV1.A00(r5) != 16L.A08) {
                Object A0D = this.A00.A0D(r5, r6);
                if (A0D != null) {
                    A1C.add(A0D);
                }
            }
            return A1C;
        } else {
            C12837T9j A1H = r5.A1H();
            ? iOException = new IOException("Failed to deserialize to a list - missing start_array token", (Throwable) null);
            iOException.A00 = A1H;
            throw iOException;
        }
    }

    public ArrayListDeserializer(JsonDeserializer jsonDeserializer) {
        this.A02 = null;
        this.A01 = null;
        this.A00 = jsonDeserializer;
    }

    public ArrayListDeserializer(Class cls) {
        this.A02 = cls;
        this.A01 = null;
        this.A00 = null;
    }
}
