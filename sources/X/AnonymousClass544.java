package X;

/* renamed from: X.544  reason: invalid class name */
public final class AnonymousClass544 extends 0ng {
    public final /* synthetic */ AnonymousClass540 A00;
    public final /* synthetic */ C278744xS A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass544(AnonymousClass540 r4, C278744xS r5) {
        super(399, 3, false, false);
        this.A01 = r5;
        this.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (X.AnonymousClass1B1.A00(r14).A00(X.1B2.A0f) == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        if (X.1Au.A00(r14).A01.getBoolean("reel_tray_personalization_is_high_me_user", false) == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            boolean r0 = X.14i.A08()
            java.lang.String r7 = "reel_background_prefetch"
            r5 = r19
            if (r0 == 0) goto L_0x00fc
            X.1Jf r0 = X.AnonymousClass1K7.A00()
            boolean r0 = r0.A0D()
            if (r0 != 0) goto L_0x00fc
            X.1Jf r0 = X.AnonymousClass1K7.A00()
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x00fc
            X.4xS r4 = r5.A01
            com.instagram.common.session.UserSession r14 = r4.A02
            X.0Tu r6 = X.0Tu.A05
            r0 = 36316224821858425(0x81056a00171079, double:3.029865038818537E-306)
            boolean r13 = X.182.A06(r6, r14, r0)
            r0 = 36316224821923962(0x81056a0018107a, double:3.0298650388599826E-306)
            boolean r0 = X.182.A06(r6, r14, r0)
            r11 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0049
            X.1Av r0 = X.1Au.A00(r14)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "reel_tray_personalization_is_high_me_user"
            boolean r0 = r1.getBoolean(r0, r11)
            r12 = 1
            if (r0 != 0) goto L_0x004a
        L_0x0049:
            r12 = 0
        L_0x004a:
            r0 = 36316224821989499(0x81056a0019107b, double:3.0298650389014284E-306)
            boolean r0 = X.182.A06(r6, r14, r0)
            if (r0 == 0) goto L_0x0070
            X.1Av r0 = X.1Au.A00(r14)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "reel_tray_personalization_lness28_score"
            int r0 = r1.getInt(r0, r11)
            long r2 = (long) r0
            r0 = 36597699798764409(0x82056a001a0b79, double:3.207870947622639E-306)
            long r9 = X.182.A01(r6, r14, r0)
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0070
            r11 = 1
        L_0x0070:
            if (r13 != 0) goto L_0x0084
            if (r12 != 0) goto L_0x0084
            if (r11 != 0) goto L_0x0084
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r14)
            X.1B2 r0 = X.1B2.A0f
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x00fc
        L_0x0084:
            X.540 r3 = r5.A00     // Catch:{ all -> 0x00e6 }
            X.1NN r0 = X.1NM.A00(r14)     // Catch:{ all -> 0x00e6 }
            com.instagram.common.session.UserSession r2 = r0.A00     // Catch:{ all -> 0x00e6 }
            r0 = 36317234138518469(0x810655000d13c5, double:3.0305033347385405E-306)
            boolean r0 = X.182.A06(r6, r2, r0)     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x00da
            java.lang.Integer r15 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x00e6 }
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x00e6 }
            r13 = 0
            X.1OP r0 = X.1OP.$redex_init_class     // Catch:{ all -> 0x00e6 }
            X.0qQ.A0B(r15, r8)     // Catch:{ all -> 0x00e6 }
            r0 = 2
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x00e6 }
            r17 = r13
            r18 = r8
            r16 = r1
            X.4Z5 r1 = X.1NP.A05(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00e6 }
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x00e6 }
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x00e6 }
        L_0x00b5:
            X.EDR r2 = new X.EDR     // Catch:{ all -> 0x00e6 }
            r2.<init>(r3, r1, r4)     // Catch:{ all -> 0x00e6 }
            boolean r0 = r1 instanceof X.AnonymousClass4Z5     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x00ca
            X.4Z5 r1 = (X.AnonymousClass4Z5) r1     // Catch:{ all -> 0x00e6 }
            X.1OC r1 = r1.A00     // Catch:{ all -> 0x00e6 }
            r1.A00 = r2     // Catch:{ all -> 0x00e6 }
        L_0x00c4:
            X.11X r1 = (X.AnonymousClass11X) r1     // Catch:{ all -> 0x00e6 }
            X.1ES.A03(r1)     // Catch:{ all -> 0x00e6 }
            goto L_0x00e5
        L_0x00ca:
            boolean r0 = r1 instanceof X.AnonymousClass4Z6     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x00fb
            X.FTL r0 = new X.FTL     // Catch:{ all -> 0x00e6 }
            r0.<init>(r2)     // Catch:{ all -> 0x00e6 }
            X.4Z6 r1 = (X.AnonymousClass4Z6) r1     // Catch:{ all -> 0x00e6 }
            X.FZ9 r1 = r1.A00     // Catch:{ all -> 0x00e6 }
            r1.A00 = r0     // Catch:{ all -> 0x00e6 }
            goto L_0x00c4
        L_0x00da:
            X.F1X r2 = X.C49294Esd.A00     // Catch:{ all -> 0x00e6 }
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x00e6 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x00e6 }
            X.4Z6 r1 = r2.A00(r14, r1, r0)     // Catch:{ all -> 0x00e6 }
            goto L_0x00b5
        L_0x00e5:
            return
        L_0x00e6:
            r2 = move-exception
            r1 = 276376133(0x10792a45, float:4.9139155E-29)
            java.lang.String r0 = "exception"
            X.0f9 r0 = X.0wj.A00(r0, r1, r8)
            r0.ERJ(r2)
            r0.report()
            X.540 r0 = r5.A00
            r0.AVX(r7)
        L_0x00fb:
            return
        L_0x00fc:
            X.540 r0 = r5.A00
            r0.AVX(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass544.run():void");
    }
}
