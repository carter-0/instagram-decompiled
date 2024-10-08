package X;

import com.fasterxml.jackson.databind.JsonDeserializer;

/* renamed from: X.QkV  reason: case insensitive filesystem */
public class C8222QkV extends C8223QkW {
    public final REQ A00;
    public final String A01;

    public final Object A0B(C8146Qhf qhf, C269674fV r6, C267574bm r7, String str) {
        if (this.A03 == null) {
            Object A012 = C11287SJg.A01(qhf, this.A02);
            if (A012 != null) {
                return A012;
            }
            if (qhf.A16()) {
                return A09(qhf, r6);
            }
            if (qhf.A19(16L.A0J) && r6.A0j(C269464fA.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && Pxi.A1Z(qhf.A1P())) {
                return null;
            }
        }
        JsonDeserializer A07 = A07(r6);
        if (A07 == null) {
            C268894eF r3 = this.A02;
            if (r6.A02.A08 != null) {
                throw AnonymousClass7TE.A11("handleMissingTypeId");
            }
            String format = String.format("Could not resolve subtype of %s", new Object[]{r3});
            16F r1 = r6.A07;
            if (str != null) {
                format = 002.A0g(format, ": ", str);
            }
            throw new C8196Qk3(r1, r3, format);
        }
        if (r7 != null) {
            r7.A0Z();
            qhf = r7.A10(qhf);
            qhf.A1J();
        }
        return A07.A0D(qhf, r6);
    }

    public C8222QkV(C13901TjO tjO, C8222QkV qkV) {
        super(tjO, qkV);
        Object[] objArr;
        String str;
        C13901TjO tjO2 = this.A01;
        if (tjO2 == null) {
            objArr = new Object[]{this.A05};
            str = "missing type id property '%s'";
        } else {
            objArr = new Object[]{this.A05, tjO2.getName()};
            str = "missing type id property '%s' (for POJO property '%s')";
        }
        this.A01 = String.format(str, objArr);
        this.A00 = qkV.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r6 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(X.C8155Qho r4, X.C269674fV r5, X.C267574bm r6, java.lang.String r7) {
        /*
            r3 = this;
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r3.A08(r5, r7)
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0034
            if (r6 != 0) goto L_0x000f
            X.4bm r6 = new X.4bm
            r6.<init>(r4, r5)
        L_0x000f:
            java.lang.String r0 = r4.A0Y()
            r6.A0q(r0)
            r6.A0t(r7)
        L_0x0019:
            r4.A13()
            X.Qhf r0 = r6.A10(r4)
            X.Qho r4 = X.C8155Qho.A00(r0, r4)
        L_0x0024:
            X.16L r1 = r4.A10()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x002f
            r4.A1J()
        L_0x002f:
            java.lang.Object r0 = r2.A0D(r4, r5)
            return r0
        L_0x0034:
            if (r6 == 0) goto L_0x0024
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8222QkV.A0A(X.16F, X.4fV, X.4bm, java.lang.String):java.lang.Object");
    }

    public C8222QkV(REQ req, C268894eF r10, C268894eF r11, C13805ThU thU, String str, boolean z) {
        super(r10, r11, thU, str, z);
        Object[] objArr;
        String str2;
        C13901TjO tjO = this.A01;
        if (tjO == null) {
            objArr = new Object[]{this.A05};
            str2 = "missing type id property '%s'";
        } else {
            objArr = new Object[]{this.A05, tjO.getName()};
            str2 = "missing type id property '%s' (for POJO property '%s')";
        }
        this.A01 = String.format(str2, objArr);
        this.A00 = req;
    }
}
