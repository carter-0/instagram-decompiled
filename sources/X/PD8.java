package X;

import com.instagram.common.session.UserSession;

public final class PD8 implements AnonymousClass1cS {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new GW6(this, 10));

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r0 = r1.equals(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r0 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        X.C66580MXl.A0e(r5).AsT(r4).A04(r3, r8.A05, X.AnonymousClass7TF.A1W(r8.A06, "uploaded"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r1.equals("queued") == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r1.equals("executing") != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        X.C66580MXl.A0e(r5).AsT(r4).A05(r8.A05, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        X.C66581MXm.A1L(r4, X.C66580MXl.A0e(r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.C66701py r8) {
        /*
            r7 = this;
            X.0eM r5 = r7.A01
            X.2Dm r1 = X.C66580MXl.A0e(r5)
            java.lang.String r0 = r8.A00
            if (r0 == 0) goto L_0x006a
            X.3U9 r4 = r1.C60(r0)
            if (r4 == 0) goto L_0x0026
            java.util.Map r3 = r8.A01
            if (r3 == 0) goto L_0x0026
            java.lang.String r1 = r8.A06
            int r0 = r1.hashCode()
            java.lang.String r6 = "uploaded"
            switch(r0) {
                case -1090974990: goto L_0x0054;
                case -948696717: goto L_0x004b;
                case 1501196714: goto L_0x002f;
                case 1563991648: goto L_0x002a;
                case 1885454214: goto L_0x0027;
                default: goto L_0x001f;
            }
        L_0x001f:
            X.2Dm r0 = X.C66580MXl.A0e(r5)
            X.C66581MXm.A1L(r4, r0)
        L_0x0026:
            return
        L_0x0027:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x0031
        L_0x002a:
            boolean r0 = r1.equals(r6)
            goto L_0x0035
        L_0x002f:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x0031:
            boolean r0 = r1.equals(r0)
        L_0x0035:
            if (r0 == 0) goto L_0x001f
            X.2Dm r0 = X.C66580MXl.A0e(r5)
            X.3SB r2 = r0.AsT(r4)
            java.lang.String r1 = r8.A05
            java.lang.String r0 = r8.A06
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r6)
            r2.A04(r3, r1, r0)
            goto L_0x001f
        L_0x004b:
            java.lang.String r0 = "queued"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005c
            goto L_0x001f
        L_0x0054:
            java.lang.String r0 = "executing"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
        L_0x005c:
            X.2Dm r0 = X.C66580MXl.A0e(r5)
            X.3SB r1 = r0.AsT(r4)
            java.lang.String r0 = r8.A05
            r1.A05(r0, r3)
            goto L_0x001f
        L_0x006a:
            X.C66580MXl.A18()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PD8.A00(X.1py):void");
    }

    public final /* bridge */ /* synthetic */ void DTJ(1OS r1, C74248Prc prc) {
        C66701py r12 = (C66701py) r1;
        AnonymousClass7TG.A1N(r12, prc);
        A00(r12);
    }

    public final /* bridge */ /* synthetic */ void DTO(1OS r1, C74248Prc prc, C74248Prc prc2) {
        C66701py r12 = (C66701py) r1;
        DbY.A1S(r12, prc2);
        A00(r12);
    }

    public PD8(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ void DTN(1OS r1, C74248Prc prc) {
    }
}
