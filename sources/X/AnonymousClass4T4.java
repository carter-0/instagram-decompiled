package X;

/* renamed from: X.4T4  reason: invalid class name */
public final class AnonymousClass4T4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ long A08;
    public final /* synthetic */ AnonymousClass4OI A09;
    public final /* synthetic */ AnonymousClass4OS A0A;
    public final /* synthetic */ Integer A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;

    public AnonymousClass4T4(AnonymousClass4OI r3, AnonymousClass4OS r4, Integer num, String str, String str2, String str3, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0A = r4;
        this.A09 = r3;
        this.A0B = num;
        this.A01 = i;
        this.A00 = i2;
        this.A0C = str;
        this.A03 = j;
        this.A07 = j2;
        this.A06 = j3;
        this.A08 = j4;
        this.A02 = j5;
        this.A0G = z;
        this.A04 = j6;
        this.A05 = j7;
        this.A0I = z2;
        this.A0E = str2;
        this.A0H = z3;
        this.A0F = z4;
        this.A0D = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c7, code lost:
        if (r7.A19.A0F == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d3, code lost:
        if (r7.A19.A0F == false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r42 = this;
            r8 = r42
            X.4OS r7 = r8.A0A
            r6 = 0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "buildRenderersCompleted starts"
            X.AnonymousClass4OS.A0E(r7, r0, r1)
            X.4OI r5 = r8.A09
            X.3uU r14 = r5.A0K
            X.4OI r0 = r7.A15
            if (r0 == 0) goto L_0x00f4
            X.4OI r0 = r7.A15
            X.3uU r0 = r0.A0K
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00f4
            r4 = 1
            r7.A0d = r4
            java.lang.Integer r0 = r8.A0B
            r7.A0U = r0
            int r0 = r8.A01
            r7.A06 = r0
            int r0 = r8.A00
            r7.A05 = r0
            java.lang.String r0 = r8.A0C
            r7.A0V = r0
            X.4My r9 = r7.A13
            long r0 = r8.A03
            r40 = r0
            long r0 = r8.A07
            r22 = r0
            long r0 = r8.A06
            r38 = r0
            long r15 = r8.A08
            long r28 = android.os.SystemClock.elapsedRealtime()
            long r12 = r8.A02
            boolean r0 = r8.A0G
            r20 = r0
            long r10 = r8.A04
            long r2 = r8.A05
            boolean r0 = r8.A0I
            r19 = r0
            java.lang.String r0 = r8.A0E
            r18 = r0
            int r0 = r9.A00
            r17 = r0
            long r0 = r9.A02
            X.4My r9 = new X.4My
            r24 = r15
            r26 = r0
            r30 = r12
            r32 = r10
            r34 = r2
            r36 = r20
            r37 = r19
            r15 = r9
            r16 = r18
            r18 = r40
            r20 = r22
            r22 = r38
            r15.<init>(r16, r17, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r37)
            boolean r0 = r8.A0H
            r7.A0h = r0
            boolean r0 = r8.A0F
            r7.A0e = r0
            java.lang.String r0 = r8.A0D
            r7.A0Y = r0
            android.os.Handler r1 = r7.A0G
            r0 = 24
            android.os.Message r0 = r1.obtainMessage(r0, r9)
            X.AnonymousClass4OS.A07(r0, r7)
            android.view.Surface r1 = r7.A0J
            if (r1 == 0) goto L_0x009b
            X.4P4 r0 = r7.A19
            r0.A0A(r1, r6)
            r7.A0I = r1
        L_0x009b:
            float r0 = r7.A01
            X.AnonymousClass4OS.A0B(r7, r0)
            float r0 = r7.A00
            X.AnonymousClass4OS.A0A(r7, r0)
            int r0 = r7.A02
            X.AnonymousClass4OS.A0C(r7, r0)
            int r1 = r5.A01
            if (r1 <= 0) goto L_0x00ba
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r7.A0w
            boolean r0 = r0.A32
            if (r0 == 0) goto L_0x00ba
            X.4P4 r2 = r7.A19
            long r0 = (long) r1
            r2.A09(r0, r6)
        L_0x00ba:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r7.A0w
            X.1yD r1 = r0.A10
            boolean r0 = r1.A0F
            if (r0 == 0) goto L_0x00c9
            X.4P4 r0 = r7.A19
            boolean r0 = r0.A0F
            r2 = 1
            if (r0 != 0) goto L_0x00ca
        L_0x00c9:
            r2 = 0
        L_0x00ca:
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x00d5
            X.4P4 r0 = r7.A19
            boolean r0 = r0.A0F
            r1 = 1
            if (r0 != 0) goto L_0x00d6
        L_0x00d5:
            r1 = 0
        L_0x00d6:
            boolean r0 = r5.A0D
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r14.A03()
            if (r0 == 0) goto L_0x00ee
            X.4P4 r0 = r7.A19
            X.4R5 r0 = r0.A0A
            boolean r0 = r0.Bd1()
            if (r0 == 0) goto L_0x00ee
        L_0x00ea:
            X.AnonymousClass4OS.A0F(r7, r6, r2)
        L_0x00ed:
            return
        L_0x00ee:
            if (r1 == 0) goto L_0x00ed
            X.AnonymousClass4OS.A0F(r7, r4, r4)
            return
        L_0x00f4:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "skipped buildRenderersCompleted because of non-matching request"
            X.AnonymousClass4OS.A0E(r7, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4T4.run():void");
    }
}
