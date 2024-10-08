package X;

import java.util.List;

/* renamed from: X.6Tt  reason: invalid class name and case insensitive filesystem */
public final class C308306Tt implements C277004uH {
    public final C308296Ts A00;
    public final C277044uL A01;
    public final Object[] A02;
    public final Object[] A03;

    public final /* bridge */ /* synthetic */ C277014uI AKh(C276634te r6, List list) {
        C277044uL r0;
        C277044uL r3 = this.A01;
        if (r3 != null) {
            C276634te r2 = r3.A00;
            C276634te r1 = r2;
            if (!(r6 == null || r2 == null)) {
                r2 = r2.ClQ(r6);
            }
            if (null == r3.A01 && r2 == r1) {
                r0 = r3;
            } else {
                r0 = new C277044uL(r2, (List) null);
            }
            if (r0 != r3) {
                return new C308306Tt(this.A00, r0, this.A02, this.A03);
            }
        }
        return this;
    }

    public final void ASe(C307906Ry r1) {
    }

    public final C308306Tt FJJ() {
        return this;
    }

    public final String Bq3() {
        return this.A00.A03.A00;
    }

    public final C276634te Bxl() {
        C277044uL r0 = this.A01;
        if (r0 == null) {
            return null;
        }
        return r0.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r5.length > 0) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C308306Tt(X.C308296Ts r3, X.C277044uL r4, java.lang.Object[] r5, java.lang.Object[] r6) {
        /*
            r2 = this;
            r2.<init>()
            r3.getClass()
            r2.A00 = r3
            r2.A02 = r5
            r2.A03 = r6
            r2.A01 = r4
            if (r5 == 0) goto L_0x0014
            int r0 = r5.length
            r1 = 0
            if (r0 <= 0) goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            java.lang.String r0 = "boundArgs must not be empty; use null"
            X.C308316Tu.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308306Tt.<init>(X.6Ts, X.4uL, java.lang.Object[], java.lang.Object[]):void");
    }
}
