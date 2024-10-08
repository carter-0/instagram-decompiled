package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.35E  reason: invalid class name */
public final class AnonymousClass35E {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass35F A02;

    public AnonymousClass35E(AnonymousClass4DH r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = new AnonymousClass35F(userSession);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.Integer r10) {
        /*
            r9 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 1
            r0 = 33
            r1 = 0
            if (r2 < r0) goto L_0x0009
            r1 = 1
        L_0x0009:
            r6 = 0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == 0) goto L_0x0021
            if (r10 != r0) goto L_0x0018
            X.35F r1 = r9.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A09
            r1.A00(r0, r6)
            return
        L_0x0018:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r10 != r0) goto L_0x002a
            X.35F r1 = r9.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0A
            goto L_0x0027
        L_0x0021:
            if (r10 != r0) goto L_0x002a
            X.35F r1 = r9.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0B
        L_0x0027:
            r1.A00(r0, r6)
        L_0x002a:
            com.instagram.common.session.UserSession r7 = r9.A01
            X.1Am r2 = X.1Al.A01(r7)
            X.1An r1 = X.1An.A2I
            java.lang.Class<X.4DW> r0 = X.AnonymousClass4DW.class
            X.0xa r8 = r2.A04(r1, r0)
            java.lang.String r2 = "ndx_impression_timestamp"
            r0 = 0
            long r3 = r8.getLong(r2, r0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x004c
            X.35F r1 = r9.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            r1.A00(r0, r6)
            return
        L_0x004c:
            java.lang.String r2 = "ndx_immersive_written_timestamp"
            long r3 = r8.getLong(r2, r0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x005e
            X.35F r1 = r9.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            r1.A00(r0, r6)
            return
        L_0x005e:
            long r0 = java.lang.System.currentTimeMillis()
            X.EDO r4 = new X.EDO
            r4.<init>(r9, r10, r0)
            java.lang.String r1 = X.C49048EoS.A00(r10)
            r3 = 0
            r0 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r7, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r2.A08(r0)
            java.lang.String r0 = "devices/ndx/api/async_get_ndx_ig_steps/"
            r2.A0A(r0)
            X.FTF r0 = new X.FTF
            r0.<init>(r1)
            r2.A04 = r0
            java.lang.Class<X.DvB> r1 = X.DvB.class
            java.lang.Class<X.F6s> r0 = X.C49784F6s.class
            r2.A0O(r6, r1, r0, r3)
            X.1OC r1 = r2.A0M()
            r1.A00 = r4
            r0 = 1260133026(0x4b1c1aa2, float:1.0230434E7)
            X.1ES.A05(r1, r0, r5, r5, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35E.A00(java.lang.Integer):void");
    }
}
