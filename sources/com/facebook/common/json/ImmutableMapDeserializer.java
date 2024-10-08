package com.facebook.common.json;

import X.002;
import X.16F;
import X.16L;
import X.17k;
import X.AnonymousClass4iD;
import X.AnonymousClass7TE;
import X.C12837T9j;
import X.C268554db;
import X.C268894eF;
import X.C269674fV;
import X.Pxf;
import X.RV1;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.io.IOException;

public class ImmutableMapDeserializer extends JsonDeserializer {
    public JsonDeserializer A00;
    public JsonDeserializer A01;
    public boolean A02 = false;
    public final C268894eF A03;
    public final Class A04;

    public ImmutableMapDeserializer(C268894eF r5) {
        boolean z = false;
        Class<String> cls = r5.A07(0).A00;
        this.A04 = cls;
        17k.A0G((cls == String.class || Enum.class.isAssignableFrom(cls)) ? true : z, "Map keys must be a String or an enum.");
        this.A03 = r5.A07(1);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Throwable, X.1bF, java.io.IOException] */
    public final /* bridge */ /* synthetic */ Object A0D(16F r7, C269674fV r8) {
        16L A11;
        C268554db r5 = (C268554db) r7.A1K();
        if (!r7.A14() || (A11 = r7.A11()) == 16L.A0G) {
            r7.A0z();
            return RegularImmutableMap.A02;
        } else if (A11 == 16L.A0D) {
            if (!this.A02) {
                Class<String> cls = this.A04;
                if (cls != String.class) {
                    this.A00 = r5.A0L(r8, cls);
                }
                this.A02 = true;
            }
            if (this.A01 == null) {
                this.A01 = r5.A0K(r8, this.A03);
            }
            ImmutableMap.Builder A0Q = Pxf.A0Q();
            while (RV1.A00(r7) != 16L.A09) {
                if (r7.A11() == 16L.A0A) {
                    String A17 = AnonymousClass7TE.A17(r7);
                    Object A0D = this.A01.A0D(r7, r8);
                    if (A0D != null) {
                        Object obj = A17;
                        if (this.A00 != null) {
                            16F A032 = r5.A09.A03(002.A0g("\"", A17, "\""));
                            A032.A1J();
                            try {
                                obj = this.A00.A0D(A032, r8);
                            } catch (AnonymousClass4iD unused) {
                            }
                        }
                        A0Q.put(obj, A0D);
                    }
                }
            }
            return A0Q.build();
        } else {
            C12837T9j A1H = r7.A1H();
            ? iOException = new IOException("Failed to deserialize to a map - missing start_object token", (Throwable) null);
            iOException.A00 = A1H;
            throw iOException;
        }
    }
}
