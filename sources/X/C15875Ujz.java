package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.Ujz  reason: case insensitive filesystem */
public final class C15875Ujz extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C256243vS A01;
    public final /* synthetic */ C255653uU A02;
    public final /* synthetic */ HeroPlayerSetting A03;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x017f, code lost:
        if (r0 != null) goto L_0x0123;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            boolean r0 = X.W14.A04
            int r4 = r12.A00
            X.3uU r9 = r12.A02
            X.0qQ.A0A(r9)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r3 = r12.A03
            X.WKi r2 = new X.WKi
            r2.<init>(r9, r3)
            X.W00 r1 = X.W14.A00
            X.WoV r0 = new X.WoV
            r0.<init>(r2, r1, r4)
            r1.A03(r0)
            X.3vS r8 = r12.A01
            android.util.ArrayMap r7 = new android.util.ArrayMap
            r7.<init>()
            X.3uU r4 = r8.A0D
            java.lang.String r1 = r4.A0G
            java.lang.String r0 = "VIDEO_ID"
            r7.put(r0, r1)
            X.3uR r0 = r4.A07
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "FORMAT_TYPE"
            r7.put(r0, r1)
            int r0 = r8.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = -1
            if (r0 == r2) goto L_0x0045
            if (r1 == 0) goto L_0x0045
            java.lang.String r0 = "BIT_RATE"
            r7.put(r0, r1)
        L_0x0045:
            int r0 = r8.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r0 == r2) goto L_0x0052
            java.lang.String r0 = "PREFETCH_SEGMENT"
            r7.put(r0, r1)
        L_0x0052:
            X.3uT r0 = r4.A06
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "CONTENT_TYPE"
            r7.put(r0, r1)
            boolean r0 = r4.A0M
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "IS_SPHERICAL"
            r7.put(r0, r1)
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0u()
            java.lang.String r0 = "IS_BROADCAST"
            r7.put(r0, r2)
            long r0 = r8.A06
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            r10 = -1
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0084
            if (r6 == 0) goto L_0x0084
            java.lang.String r0 = "PREFETCH_DURATION"
            r7.put(r0, r6)
        L_0x0084:
            int r0 = r8.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "VIDEO_TOTAL_DURATION"
            r7.put(r0, r1)
            long r0 = r8.A09
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "TARGET_CONTENT_READY_TIME_MS"
            r7.put(r0, r1)
            java.lang.String r1 = r4.A0C
            java.lang.String r0 = "PREFETCH_ORIGIN"
            r7.put(r0, r1)
            java.lang.String r1 = r4.A0A
            java.lang.String r0 = "PLAYER_ORIGIN"
            r7.put(r0, r1)
            java.lang.String r1 = r4.A0B
            java.lang.String r0 = "PLAYER_SUB_ORIGIN"
            r7.put(r0, r1)
            java.lang.String r1 = r8.A0H
            r0 = 881(0x371, float:1.235E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.put(r0, r1)
            java.lang.String r1 = ""
            java.lang.String r0 = "PREFETCH_TAG"
            r7.put(r0, r1)
            java.lang.String r0 = "PREFETCHING_MODULE"
            r7.put(r0, r1)
            boolean r0 = r8.A0N
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "USE_HERO_MANAGER_BACKGROUND_THREAD"
            r7.put(r0, r1)
            boolean r0 = r8.A0V
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "IS_BACKGROUND_PREFETCH"
            r7.put(r0, r1)
            boolean r0 = r4.A0N
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "IS_SPONSORED"
            r7.put(r0, r1)
            java.lang.String r0 = "IS_AD_BREAK"
            r7.put(r0, r2)
            java.lang.Integer r0 = r8.A0F
            java.lang.String r0 = X.C256253vT.A00(r0)
            java.lang.String r1 = X.AnonymousClass7TF.A0k(r0)
            java.lang.String r0 = "QUEUE_BEHAVIOR"
            r7.put(r0, r1)
            boolean r2 = r3.A2H
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "IS_PARTIAL_SEGMENT_PREFETCH"
            r7.put(r0, r1)
            if (r2 == 0) goto L_0x0113
            int r0 = r3.A0W
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "PARTIAL_SEGMENT_PREFETCH_DURATION_MS"
            r7.put(r0, r1)
        L_0x0113:
            X.27v r1 = X.27v.A00()
            monitor-enter(r1)
            long r4 = r1.A02     // Catch:{ all -> 0x0185 }
            monitor-exit(r1)
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x013a
            X.27q r0 = X.27q.A06
        L_0x0123:
            java.lang.String r1 = r0.name()
            if (r1 == 0) goto L_0x012e
            java.lang.String r0 = "HERO_CONNECTION_QUALITY"
            r7.put(r0, r1)
        L_0x012e:
            java.lang.String r1 = r9.A0G
            boolean r0 = r8.A0L
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.W14.A01(r7, r1, r0)
            return
        L_0x013a:
            X.27q r1 = X.27q.A01
            X.1y8 r10 = r3.A0r
            int r0 = r10.A01
            X.0eP r6 = X.AnonymousClass7TF.A0x(r1, r0)
            X.27q r1 = X.27q.A05
            int r0 = r10.A05
            X.0eP r3 = X.AnonymousClass7TF.A0x(r1, r0)
            X.27q r1 = X.27q.A04
            int r0 = r10.A04
            X.0eP r2 = X.AnonymousClass7TF.A0x(r1, r0)
            X.27q r1 = X.27q.A03
            int r0 = r10.A03
            X.0eP r0 = X.AnonymousClass7TF.A0x(r1, r0)
            X.0eP[] r0 = new X.0eP[]{r6, r3, r2, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0168:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0182
            X.0eP r3 = X.JTO.A1A(r6)
            int r0 = X.C51969G9p.A0A(r3)
            long r1 = (long) r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0168
            java.lang.Object r0 = r3.A00
            X.27q r0 = (X.27q) r0
            if (r0 == 0) goto L_0x012e
            goto L_0x0123
        L_0x0182:
            X.27q r0 = X.27q.A02
            goto L_0x0123
        L_0x0185:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15875Ujz.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15875Ujz(C256243vS r4, C255653uU r5, HeroPlayerSetting heroPlayerSetting, int i) {
        super(1634974759, 3, false, false);
        this.A00 = i;
        this.A02 = r5;
        this.A03 = heroPlayerSetting;
        this.A01 = r4;
    }
}
