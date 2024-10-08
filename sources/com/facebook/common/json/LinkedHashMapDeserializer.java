package com.facebook.common.json;

import X.002;
import X.16F;
import X.16L;
import X.17k;
import X.AnonymousClass7TE;
import X.C12837T9j;
import X.C268554db;
import X.C268894eF;
import X.C269674fV;
import X.RV1;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.util.LinkedHashMap;

public class LinkedHashMapDeserializer extends JsonDeserializer {
    public JsonDeserializer A00;
    public JsonDeserializer A01;
    public boolean A02 = false;
    public final C268894eF A03;
    public final Class A04;

    public LinkedHashMapDeserializer(C268894eF r5) {
        boolean z = false;
        Class<String> cls = r5.A07(0).A00;
        this.A04 = cls;
        17k.A0G((cls == String.class || Enum.class.isAssignableFrom(cls)) ? true : z, "Map keys must be a String or an enum.");
        this.A03 = r5.A07(1);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Throwable, X.1bF, java.io.IOException] */
    public final /* bridge */ /* synthetic */ Object A0D(16F r8, C269674fV r9) {
        16L A11;
        16L r4;
        Object A0D;
        C268554db r6 = (C268554db) r8.A1K();
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (!r8.A14() || (A11 = r8.A11()) == (r4 = 16L.A0G)) {
            r8.A0z();
        } else if (A11 == 16L.A0D) {
            if (!this.A02) {
                Class<String> cls = this.A04;
                if (cls != String.class) {
                    this.A00 = r6.A0L(r9, cls);
                }
                this.A02 = true;
            }
            if (this.A01 == null) {
                this.A01 = r6.A0K(r9, this.A03);
            }
            while (RV1.A00(r8) != 16L.A09) {
                if (r8.A11() == 16L.A0A) {
                    String A17 = AnonymousClass7TE.A17(r8);
                    16L A112 = r8.A11();
                    JsonDeserializer jsonDeserializer = this.A01;
                    if (A112 == r4) {
                        A0D = null;
                    } else {
                        A0D = jsonDeserializer.A0D(r8, r9);
                        if (A0D == null) {
                        }
                    }
                    Object obj = A17;
                    if (this.A00 != null) {
                        16F A032 = r6.A09.A03(002.A0g("\"", A17, "\""));
                        A032.A1J();
                        obj = this.A00.A0D(A032, r9);
                    }
                    A1H.put(obj, A0D);
                }
            }
        } else {
            C12837T9j A1H2 = r8.A1H();
            ? iOException = new IOException("Failed to deserialize to a map - missing start_object token", (Throwable) null);
            iOException.A00 = A1H2;
            throw iOException;
        }
        return A1H;
    }
}
