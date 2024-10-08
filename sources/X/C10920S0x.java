package X;

import java.util.List;

/* renamed from: X.S0x  reason: case insensitive filesystem */
public final class C10920S0x {
    public final C13900TjN[] A00;
    public final List A01;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if ("application/cea-708".equals(r6) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.YBZ r8, X.SR8 r9) {
        /*
            r7 = this;
            r4 = 0
        L_0x0001:
            X.TjN[] r3 = r7.A00
            int r0 = r3.length
            if (r4 >= r0) goto L_0x0065
            r9.A03()
            X.SR8.A02(r9)
            int r1 = r9.A00
            r0 = 3
            X.TjN r2 = r8.FHV(r1, r0)
            java.util.List r0 = r7.A01
            java.lang.Object r5 = r0.get(r4)
            X.SJM r5 = (X.SJM) r5
            java.lang.String r6 = r5.A0Y
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r1 = 1
        L_0x002f:
            java.lang.String r0 = "Invalid closed caption MIME type provided: "
            java.lang.String r0 = X.002.A0R(r0, r6)
            X.C11366SPh.A03(r1, r0)
            java.lang.String r0 = r5.A0V
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = r5.A0V
        L_0x003e:
            X.SOW r1 = X.SOW.A00()
            r1.A0T = r0
            r1.A01(r6)
            int r0 = r5.A0J
            r1.A0H = r0
            java.lang.String r0 = r5.A0X
            r1.A0V = r0
            int r0 = r5.A03
            r1.A02 = r0
            java.util.List r0 = r5.A0Z
            r1.A0X = r0
            X.C13900TjN.A00(r1, r2)
            r3[r4] = r2
            int r4 = r4 + 1
            goto L_0x0001
        L_0x005f:
            X.SR8.A02(r9)
            java.lang.String r0 = r9.A01
            goto L_0x003e
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10920S0x.A00(X.YBZ, X.SR8):void");
    }

    public C10920S0x(List list) {
        this.A01 = list;
        this.A00 = new C13900TjN[list.size()];
    }
}
