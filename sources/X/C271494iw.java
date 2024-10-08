package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4iw  reason: invalid class name and case insensitive filesystem */
public final class C271494iw {
    public int A00 = 0;
    public Integer A01 = AnonymousClass05K.A00;
    public final 0xa A02;
    public final Object A03 = new Object();
    public volatile String A04 = null;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.0lg r6, java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Object r2 = r5.A03
            monitor-enter(r2)
            java.lang.Integer r1 = r5.A01     // Catch:{ all -> 0x0064 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0064 }
            if (r1 == r0) goto L_0x0011
            if (r9 == 0) goto L_0x000f
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0064 }
            r5.A01 = r0     // Catch:{ all -> 0x0064 }
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x0064 }
            return
        L_0x0011:
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0064 }
            r5.A01 = r0     // Catch:{ all -> 0x0064 }
            monitor-exit(r2)     // Catch:{ all -> 0x0064 }
            r5.A04 = r8
            X.1NY r3 = new X.1NY
            r3.<init>(r6)
            r3.A08(r0)
            java.lang.String r0 = "zr/dual_tokens/"
            r3.A0A(r0)
            java.lang.String r0 = "normal_token_hash"
            r3.A9m(r0, r7)
            android.content.Context r0 = X.C60960kU.A00
            java.lang.String r4 = X.0qv.A00(r0)
            r2 = 0
            r1 = 9
            r0 = 119(0x77, float:1.67E-43)
            java.lang.String r0 = X.AnonymousClass9NE.A01(r2, r1, r0)
            r3.A9m(r0, r4)
            X.0qv r1 = X.0qv.A02
            android.content.Context r0 = X.C60960kU.A00
            java.lang.String r1 = r1.A05(r0)
            java.lang.String r0 = "custom_device_id"
            r3.A9m(r0, r1)
            java.lang.String r0 = "fetch_reason"
            r3.A9m(r0, r8)
            java.lang.Class<X.5AM> r1 = X.AnonymousClass5AM.class
            java.lang.Class<X.5AN> r0 = X.AnonymousClass5AN.class
            r3.A0R(r1, r0)
            X.1OC r1 = r3.A0M()
            X.5AO r0 = new X.5AO
            r0.<init>(r6, r5, r7, r8)
            r1.A00 = r0
            X.1ES.A03(r1)
            return
        L_0x0064:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0064 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C271494iw.A00(X.0lg, java.lang.String, java.lang.String, boolean):void");
    }

    public C271494iw(0lg r3) {
        0xa A012;
        if (r3 instanceof UserSession) {
            A012 = 1Al.A01((UserSession) r3).A03(1An.A3d);
        } else {
            A012 = 0xn.A01("PrefZeroRatingDebugFilename");
        }
        this.A02 = A012;
    }
}
