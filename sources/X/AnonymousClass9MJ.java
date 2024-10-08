package X;

/* renamed from: X.9MJ  reason: invalid class name */
public final class AnonymousClass9MJ extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MJ(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (r0 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0110, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x01db;
                case 1: goto L_0x01c7;
                case 2: goto L_0x01b3;
                case 3: goto L_0x0192;
                case 4: goto L_0x0142;
                case 5: goto L_0x0128;
                case 6: goto L_0x0111;
                case 7: goto L_0x00f5;
                case 8: goto L_0x00d9;
                case 9: goto L_0x00c2;
                case 10: goto L_0x0062;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r12.A03
            X.0lg r6 = (X.0lg) r6
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315610640223663(0x8104db00030daf, double:3.029476627879602E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0041
            X.SAf r0 = X.C8834RBs.A00
            java.lang.Object r7 = r12.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r5 = r12.A02
            com.facebook.quicklog.LightweightQuickPerformanceLogger r5 = (com.facebook.quicklog.LightweightQuickPerformanceLogger) r5
            r0 = 36320004391575407(0x8108da00001f6f, double:3.032255253926662E-306)
            boolean r4 = X.182.A06(r2, r6, r0)
            r0 = 36602832282981180(0x820a150000133c, double:3.21111675130818E-306)
            long r2 = X.182.A01(r2, r6, r0)
            int r1 = (int) r2
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r0 = 2
            X.0qQ.A0B(r5, r0)
            X.RBs r6 = new X.RBs
            r6.<init>(r7, r5, r1, r4)
            return r6
        L_0x0041:
            java.lang.Object r5 = r12.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r12.A02
            com.facebook.quicklog.LightweightQuickPerformanceLogger r4 = (com.facebook.quicklog.LightweightQuickPerformanceLogger) r4
            r0 = 36320004391575407(0x8108da00001f6f, double:3.032255253926662E-306)
            boolean r3 = X.182.A06(r2, r6, r0)
            r0 = 36602832282981180(0x820a150000133c, double:3.21111675130818E-306)
            long r1 = X.182.A01(r2, r6, r0)
            int r0 = (int) r1
            X.1Cd r6 = new X.1Cd
            r6.<init>(r5, r4, r0, r3)
            return r6
        L_0x0062:
            r0 = 4341(0x10f5, float:6.083E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            r4 = 0
            java.lang.Object r2 = r12.A03     // Catch:{ InterruptedException -> 0x0098, all -> 0x0073 }
            com.instagram.util.startup.appwarmer.KeepWarmReceiver r2 = (com.instagram.util.startup.appwarmer.KeepWarmReceiver) r2     // Catch:{ InterruptedException -> 0x0098, all -> 0x0073 }
            r0 = 9000(0x2328, double:4.4466E-320)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0098, all -> 0x0073 }
            goto L_0x00a1
        L_0x0073:
            r3 = move-exception
            java.lang.Object r0 = r12.A03
            com.instagram.util.startup.appwarmer.KeepWarmReceiver r0 = (com.instagram.util.startup.appwarmer.KeepWarmReceiver) r0
            android.content.BroadcastReceiver$PendingResult r0 = r0.A00     // Catch:{ IllegalStateException -> 0x007f }
            if (r0 == 0) goto L_0x007f
            r0.finish()     // Catch:{ IllegalStateException -> 0x007f }
        L_0x007f:
            java.lang.Object r0 = r12.A02
            android.content.Intent r0 = (android.content.Intent) r0
            boolean r0 = r0.getBooleanExtra(r5, r4)
            if (r0 == 0) goto L_0x0097
            java.lang.Object r2 = r12.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Class<com.instagram.util.startup.appwarmer.KeepWarmAgainReceiver> r1 = com.instagram.util.startup.appwarmer.KeepWarmAgainReceiver.class
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r2.sendBroadcast(r0)
        L_0x0097:
            throw r3
        L_0x0098:
            java.lang.Object r0 = r12.A03
            com.instagram.util.startup.appwarmer.KeepWarmReceiver r0 = (com.instagram.util.startup.appwarmer.KeepWarmReceiver) r0
            android.content.BroadcastReceiver$PendingResult r0 = r0.A00     // Catch:{ IllegalStateException -> 0x00a8 }
            if (r0 == 0) goto L_0x00a8
            goto L_0x00a5
        L_0x00a1:
            android.content.BroadcastReceiver$PendingResult r0 = r2.A00     // Catch:{ IllegalStateException -> 0x00a8 }
            if (r0 == 0) goto L_0x00a8
        L_0x00a5:
            r0.finish()     // Catch:{ IllegalStateException -> 0x00a8 }
        L_0x00a8:
            java.lang.Object r0 = r12.A02
            android.content.Intent r0 = (android.content.Intent) r0
            boolean r0 = r0.getBooleanExtra(r5, r4)
            if (r0 == 0) goto L_0x018f
            java.lang.Object r2 = r12.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Class<com.instagram.util.startup.appwarmer.KeepWarmAgainReceiver> r1 = com.instagram.util.startup.appwarmer.KeepWarmAgainReceiver.class
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r2.sendBroadcast(r0)
            goto L_0x018f
        L_0x00c2:
            com.facebook.common.callercontext.CallerContext r0 = X.2Lk.A08
            java.lang.Object r2 = r12.A02
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            X.0qQ.A0A(r1)
            java.lang.Object r0 = r12.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2Lk r6 = new X.2Lk
            r6.<init>(r1, r0, r2)
            return r6
        L_0x00d9:
            java.lang.Object r2 = r12.A03
            X.3YK r2 = (X.AnonymousClass3YK) r2
            java.lang.Object r1 = r12.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r12.A02
            X.3YL r0 = (X.AnonymousClass3YL) r0
            boolean r0 = r0.A02(r1)
            if (r0 != 0) goto L_0x00ed
            r0 = 0
            goto L_0x010c
        L_0x00ed:
            java.lang.String r0 = r1.getId()
            r2.A00 = r0
            r0 = 1
            goto L_0x010c
        L_0x00f5:
            java.lang.Object r0 = r12.A03
            X.3fg r0 = (X.C247043fg) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            X.C246413eY.A00(r2)
            java.lang.Object r1 = r12.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r12.A02
            X.3fi r0 = (X.C247063fi) r0
            boolean r0 = r0.A06
            boolean r0 = X.AnonymousClass3eZ.A01(r2, r1, r0)
        L_0x010c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x0111:
            java.lang.Object r3 = r12.A02
            X.2V5 r3 = (X.2V5) r3
            java.lang.Object r2 = r12.A03
            X.2V5 r2 = (X.2V5) r2
            java.lang.Object r1 = r12.A01
            X.2V5 r1 = (X.2V5) r1
            X.4jL r0 = new X.4jL
            r0.<init>(r3, r2, r1)
            X.4jM r6 = new X.4jM
            r6.<init>(r0)
            return r6
        L_0x0128:
            java.lang.Object r4 = r12.A01
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r12.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            boolean r0 = r4.A6a(r3)
            if (r0 == 0) goto L_0x018f
            X.I6E r2 = X.I6E.A00
            java.lang.Object r1 = r12.A02
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A04(r1, r3, r4, r0)
            goto L_0x018f
        L_0x0142:
            java.lang.Object r4 = r12.A02
            X.JwB r4 = (X.C61073JwB) r4
            if (r4 == 0) goto L_0x018f
            java.lang.Object r6 = r12.A03
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r5 = r12.A01
            android.content.Context r5 = (android.content.Context) r5
            r0 = 1
            X.0qQ.A0B(r6, r0)
            r0 = 2
            X.0qQ.A0B(r5, r0)
            java.lang.String r7 = r4.A01
            java.lang.String r9 = r4.A03
            X.0qQ.A0B(r9, r0)
            if (r7 == 0) goto L_0x0188
            X.0wc r2 = X.AnonymousClass0kN.A02(r6)
            java.lang.String r1 = "ig_cg_feed_show_fundraiser_donate_pill"
            X.0kJ r0 = r2.A00
            X.0Aj r3 = r2.A00(r0, r1)
            r2 = 10
            java.lang.Long r1 = X.00y.A0n(r2, r7)
            java.lang.String r0 = "fundraiser_id"
            r3.A9F(r0, r1)
            java.lang.Long r1 = X.00y.A0n(r2, r9)
            r0 = 963(0x3c3, float:1.35E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.A9F(r0, r1)
            r3.Cgf()
        L_0x0188:
            java.lang.String r10 = r4.A02
            java.lang.String r8 = "FEED_POST"
            X.LTV.A04(r5, r6, r7, r8, r9, r10)
        L_0x018f:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0192:
            java.lang.Object r7 = r12.A01
            android.content.Context r7 = (android.content.Context) r7
            X.0qQ.A0A(r7)
            java.lang.Object r8 = r12.A02
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Object r1 = r12.A03
            X.1X8 r1 = (X.1X8) r1
            X.0eM r0 = r1.A07
            java.lang.Object r9 = r0.getValue()
            X.1XD r9 = (X.1XD) r9
            X.1XA r10 = r1.A03
            X.1XE r11 = r1.A05
            X.38Y r6 = new X.38Y
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x01b3:
            java.lang.Object r2 = r12.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r12.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r12.A03
            X.6bK r0 = (X.C310606bK) r0
            X.07Z r0 = r0.A00
            X.HFl r6 = new X.HFl
            r6.<init>(r2, r0, r1)
            return r6
        L_0x01c7:
            java.lang.Object r0 = r12.A03
            X.6iU r0 = (X.C314576iU) r0
            com.instagram.common.session.UserSession r2 = r0.A03
            java.lang.Object r1 = r12.A02
            X.6nA r1 = (X.C317376nA) r1
            java.lang.Object r0 = r12.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.6kF r6 = new X.6kF
            r6.<init>(r0, r2, r1)
            return r6
        L_0x01db:
            java.lang.Object r5 = r12.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r12.A01
            X.4DU r4 = (X.AnonymousClass4DU) r4
            java.lang.Object r3 = r12.A02
            X.1L5 r3 = (X.1L5) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318140377208738(0x810728001617a2, double:3.031076443735397E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x020a
            X.6KZ r2 = new X.6KZ
            r2.<init>(r5, r4)
            X.2pc r0 = X.C230432pc.STORIES
            X.5sx r1 = new X.5sx
            r1.<init>(r5, r2, r0)
            X.5sz r0 = X.C298155sy.A00(r5, r3, r0)
            X.6Ka r6 = new X.6Ka
            r6.<init>(r0, r1)
            return r6
        L_0x020a:
            X.4LP r6 = new X.4LP
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9MJ.invoke():java.lang.Object");
    }
}
