package X;

import android.content.Context;

public final class GCJ implements C250603lj {
    public boolean A00;
    public final Context A01;
    public final GJT A02;
    public final C52012GBj A03;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        if (X.182.A06(X.C51968G9o.A0b(r2), r2, 36322916380322470L) != false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fe, code lost:
        if (X.GH7.A00(r8, r2) != false) goto L_0x0100;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r11, X.C252093oY r12) {
        /*
            r10 = this;
            r7 = 0
            boolean r6 = X.AnonymousClass7TF.A1U(r7, r11, r12)
            java.lang.Object r0 = r11.A04
            X.GDe r0 = (X.C52058GDe) r0
            X.3W1 r5 = r0.A0E
            X.GJT r4 = r10.A02
            java.lang.Object r3 = r11.A03
            X.4bN r3 = (X.C267324bN) r3
            boolean r0 = r4.A03(r3)
            if (r0 == 0) goto L_0x0100
            X.GBj r0 = r10.A03
            X.4bN r8 = X.C52012GBj.A04(r0)
            if (r5 == 0) goto L_0x004e
            if (r8 == 0) goto L_0x004e
            com.instagram.common.session.UserSession r2 = r4.A04
            X.0Tu r9 = X.0Tu.A06
            r0 = 36322916379404959(0x810b8000002a9f, double:3.034096806755704E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x004e
            X.0Tu r9 = X.C51968G9o.A0b(r2)
            r0 = 36322916380125860(0x810b80000b2aa4, double:3.034096807211605E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 != 0) goto L_0x00f0
            X.0Tu r9 = X.C51968G9o.A0b(r2)
            r0 = 36322916380322470(0x810b80000e2aa6, double:3.034096807335942E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 != 0) goto L_0x00f0
        L_0x004e:
            r2 = 1
        L_0x004f:
            int r1 = X.C51968G9o.A0A(r11, r12)
            if (r1 == r7) goto L_0x007b
            r0 = 2
            if (r1 != r0) goto L_0x007a
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x007a
            if (r5 == 0) goto L_0x007a
            if (r2 == 0) goto L_0x007a
            int r0 = r5.hashCode()
            java.util.Map r3 = r4.A05
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r3.get(r2)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L_0x007a
            android.os.Handler r0 = r4.A03
            r0.removeCallbacks(r1)
            r3.remove(r2)
        L_0x007a:
            return
        L_0x007b:
            if (r5 == 0) goto L_0x007a
            if (r2 == 0) goto L_0x007a
            android.content.Context r7 = r10.A01
            X.3OA r3 = r3.A06()
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x007a
            X.3y6 r0 = r3.A0E
            if (r0 == 0) goto L_0x007a
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x00b7
            com.instagram.common.session.UserSession r0 = r4.A04
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.DbS.A0N(r0)
            java.lang.String r0 = "com.bloks.www.bloks.ig_contextual_tray_infra_controller.bottom_sheet"
            r2.A0R = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.Hqo r1 = X.GJT.A00(r7, r4, r3, r0)
            X.8dD r0 = r2.A05()
            r1.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.Hqo r1 = X.GJT.A00(r7, r4, r3, r0)
            X.8dD r0 = r2.A05()
            r1.A00(r0)
            r4.A01 = r6
        L_0x00b7:
            int r0 = r5.hashCode()
            java.util.Map r3 = r4.A05
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r3.get(r2)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L_0x00d1
            android.os.Handler r0 = r4.A03
            r0.removeCallbacks(r1)
            r3.remove(r2)
        L_0x00d1:
            X.Igp r6 = new X.Igp
            r6.<init>(r4, r5)
            java.lang.Integer r0 = X.C51969G9p.A0q(r5)
            r3.put(r0, r6)
            com.instagram.common.session.UserSession r3 = r4.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36601024102010965(0x82087000041055, double:3.209973250381656E-306)
            long r1 = X.182.A01(r2, r3, r0)
            android.os.Handler r0 = r4.A03
            r0.postDelayed(r6, r1)
            return
        L_0x00f0:
            X.3W8 r0 = r5.A3U
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x004e
            boolean r0 = X.GH7.A00(r8, r2)
            if (r0 == 0) goto L_0x004e
        L_0x0100:
            r2 = 0
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCJ.ATF(X.30Y, X.3oY):void");
    }

    public GCJ(Context context, GJT gjt, C52012GBj gBj) {
        AnonymousClass7TG.A1P(context, gBj);
        this.A01 = context;
        this.A02 = gjt;
        this.A03 = gBj;
    }
}
