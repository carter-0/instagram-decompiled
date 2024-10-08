package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.Serializable;

/* renamed from: X.Qkp  reason: case insensitive filesystem */
public final class C8242Qkp extends C8244Qkx implements Serializable {
    public final String A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8242Qkp(X.C268894eF r13, X.SK8 r14, X.C269114eb r15, java.lang.String r16) {
        /*
            r12 = this;
            r6 = r14
            X.4ej r0 = r14.A08()
            r3 = 0
            X.QkH r5 = r14.A0F()
            r11 = 0
            if (r0 != 0) goto L_0x001f
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r11)
        L_0x0011:
            r1 = r12
            r2 = r13
            r8 = r15
            r4 = r3
            r7 = r3
            r10 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r16
            r12.A00 = r0
            return
        L_0x001f:
            X.4ek r2 = r0.A01
            X.4ek r0 = X.C269204ek.ALWAYS
            if (r2 == r0) goto L_0x0033
            X.4ek r1 = X.C269204ek.USE_DEFAULTS
            if (r2 == r1) goto L_0x002a
            r11 = 1
        L_0x002a:
            X.4ek r0 = X.C269204ek.NON_NULL
            if (r2 == r0) goto L_0x0033
            if (r2 == r1) goto L_0x0033
            java.lang.Object r9 = X.C8244Qkx.A0H
            goto L_0x0011
        L_0x0033:
            r9 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8242Qkp.<init>(X.4eF, X.SK8, X.4eb, java.lang.String):void");
    }

    public final void A02(17Z r4, C269504fE r5, Object obj) {
        Object A0S = r5.A0S(this.A00);
        if (A0S != null) {
            JsonSerializer A02 = SuT.A02(r5, this, A0S);
            Object obj2 = this.A09;
            if (obj2 != null && SuT.A03(A02, r5, obj2, A0S)) {
                return;
            }
            if (A0S != obj || !A05(r4, A02, r5)) {
                r4.A0k(this.A04);
                Pxi.A1D(r4, A02, r5, this.A03, A0S);
            }
        } else if (this.A01 != null) {
            r4.A0k(this.A04);
            this.A01.A0A(r4, r5, (Object) null);
        }
    }

    public C8242Qkp() {
    }
}
