package X;

/* renamed from: X.GPf  reason: case insensitive filesystem */
public final class C52360GPf extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C267324bN A02;
    public final /* synthetic */ C52016GBn A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52360GPf(C267324bN r5, C52016GBn gBn, int i, int i2) {
        super(2056489509, 2, false, true);
        this.A03 = gBn;
        this.A00 = i;
        this.A02 = r5;
        this.A01 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (X.C51965G9l.A1a(X.0Tu.A05, r3, 36328916448722606L) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            X.GBn r0 = r9.A03     // Catch:{ SecurityException -> 0x000c }
            android.media.AudioManager r3 = r0.A08     // Catch:{ SecurityException -> 0x000c }
            r2 = 3
            int r1 = r9.A00     // Catch:{ SecurityException -> 0x000c }
            r0 = 1
            r3.adjustStreamVolume(r2, r1, r0)     // Catch:{ SecurityException -> 0x000c }
            goto L_0x0014
        L_0x000c:
            r2 = move-exception
            java.lang.String r1 = "ClipsVideoPlayerController"
            java.lang.String r0 = "Failed to set the volume"
            X.0KC.A0F(r1, r0, r2)
        L_0x0014:
            X.GBn r5 = r9.A03
            X.4bN r8 = r9.A02
            int r7 = r9.A01
            X.GDy r0 = X.C52019GBq.A02(r5)
            if (r0 == 0) goto L_0x006d
            X.JRN r6 = X.C52016GBn.A02(r5, r0)
            if (r6 == 0) goto L_0x006d
            android.media.AudioManager r1 = r5.A08
            r0 = 3
            int r0 = r1.getStreamVolume(r0)
            boolean r4 = X.AnonymousClass7TF.A1R(r0)
            r0 = 25
            if (r7 != r0) goto L_0x0044
            com.instagram.common.session.UserSession r3 = r5.A0E
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328916448722606(0x8110f500003eae, double:3.037891274752524E-306)
            boolean r0 = X.C51965G9l.A1a(r2, r3, r0)
            if (r0 == 0) goto L_0x0050
        L_0x0044:
            com.instagram.common.session.UserSession r3 = r5.A0E
            X.1GF r0 = X.1GE.A00(r3)
            r0.A00(r4)
            X.C52016GBn.A08(r8, r6, r5, r7)
        L_0x0050:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322018731239315(0x810aaf00002793, double:3.033529130441212E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x006d
            X.1Av r0 = r5.A0G
            r2 = r4 ^ 1
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "last_clips_volume_is_mute"
            r1.E5T(r0, r2)
            r1.apply()
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52360GPf.run():void");
    }
}
