package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.4XH  reason: invalid class name */
public final class AnonymousClass4XH extends AnonymousClass4XI {
    public float A00 = 1.0f;
    public C264564Qj A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public int A06;
    public C266134Xr A07;
    public 28w A08;
    public C266164Xu A09;
    public C264184Ox A0A;
    public final HeroPlayerSetting A0B;

    public AnonymousClass4XH(C264564Qj r3, 28w r4, C264184Ox r5, HeroPlayerSetting heroPlayerSetting, C264854Ro r7, int[] iArr) {
        super(r7, iArr);
        this.A08 = r4;
        this.A01 = r3;
        this.A0B = heroPlayerSetting;
        this.A0A = r5;
        this.A02 = AnonymousClass05K.A00;
        this.A04 = false;
        this.A03 = false;
    }

    public final int Brh() {
        return this.A05;
    }

    public final Object Brx() {
        return this.A09;
    }

    public final int Brz() {
        return this.A06;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [X.4Xr, java.lang.Object] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0592  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x05ca  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x06da  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x06e0  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x074d A[LOOP:11: B:346:0x0747->B:348:0x074d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0765 A[LOOP:12: B:350:0x075f->B:352:0x0765, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x072c A[EDGE_INSN: B:432:0x072c->B:341:0x072c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e8  */
    public final void FLS(X.AnonymousClass4XP r73, X.AnonymousClass4Y2 r74, long r75, long r77, long r79, long r81, boolean r83, boolean r84) {
        /*
            r72 = this;
            r5 = r72
            r21 = r73
            int r0 = r5.A01
            r22 = r0
            X.3wB[] r0 = new X.C256683wB[r0]
            r20 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = r21
            X.4XN r0 = (X.AnonymousClass4XN) r0
            r21 = r0
            X.3w6 r0 = r0.A0D
            if (r0 == 0) goto L_0x0070
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0070
            if (r22 <= 0) goto L_0x0070
            java.util.ArrayList r3 = r21.A06()
            int r8 = r3.size()
            X.3wB[] r7 = new X.C256683wB[r8]
            r2 = 0
        L_0x002c:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x003f
            java.lang.Object r0 = r3.get(r2)
            X.3wG r0 = (X.C256733wG) r0
            X.3wB r0 = r0.A02
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x002c
        L_0x003f:
            r6 = 0
        L_0x0040:
            X.3wB[] r4 = r5.A02
            int r0 = r4.length
            if (r6 >= r0) goto L_0x0070
            r9 = 0
        L_0x0046:
            if (r9 >= r8) goto L_0x006a
            r0 = r4[r6]
            java.lang.String r3 = r0.A0T
            r2 = r7[r9]
            java.lang.String r0 = r2.A0T
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x006d
            r3 = r4[r6]
            int r0 = r2.A05
            X.3w8 r2 = new X.3w8
            r2.<init>(r3)
            r2.A03 = r0
            r2.A0B = r0
            X.3wB r0 = new X.3wB
            r0.<init>(r2)
            r4[r6] = r0
        L_0x006a:
            int r6 = r6 + 1
            goto L_0x0040
        L_0x006d:
            int r9 = r9 + 1
            goto L_0x0046
        L_0x0070:
            long r13 = android.os.SystemClock.elapsedRealtime()
            r11 = 0
            r3 = 0
        L_0x0076:
            r0 = r22
            if (r3 >= r0) goto L_0x0093
            X.3wB[] r0 = r5.A02
            r2 = r0[r3]
            r20[r3] = r2
            boolean r0 = r5.CPT(r3, r13)
            if (r0 == 0) goto L_0x008f
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r5.A0B
            boolean r0 = r0.A1g
            if (r0 == 0) goto L_0x008f
        L_0x008c:
            int r3 = r3 + 1
            goto L_0x0076
        L_0x008f:
            r1.add(r2)
            goto L_0x008c
        L_0x0093:
            X.3wB[] r0 = new X.C256683wB[r11]
            java.lang.Object[] r15 = r1.toArray(r0)
            X.3wB[] r15 = (X.C256683wB[]) r15
            r0 = r21
            java.util.Map r0 = r0.A0e
            r69 = r0
            java.util.HashMap r25 = new java.util.HashMap
            r1 = r22
            r0 = r25
            r0.<init>(r1)
            r4 = 0
            r31 = -1
            r29 = -1
        L_0x00af:
            r58 = r74
            r70 = r75
            r60 = r81
            r0 = r22
            if (r4 >= r0) goto L_0x0121
            X.3wB[] r0 = r5.A02
            r0 = r0[r4]
            java.lang.String r1 = r0.A0T
            r0 = r69
            java.lang.Object r6 = r0.get(r1)
            X.4XR r6 = (X.AnonymousClass4XR) r6
            if (r6 == 0) goto L_0x0207
            X.4XE r0 = r6.A02
            if (r0 == 0) goto L_0x0207
            r57 = 0
            r62 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r56 = r21
            r59 = r6
            long r2 = r56.A02(r57, r58, r59, r60, r62)
            long r9 = r6.A00()
            r7 = -1
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x00ea
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0207
        L_0x00ea:
            r0 = r70
            boolean r0 = r6.A05(r0)
            if (r0 == 0) goto L_0x0207
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0207
            long r16 = r6.A02(r2)     // Catch:{ 4Yv | IndexOutOfBoundsException -> 0x0207 }
            r8 = 0
            int r0 = (r31 > r8 ? 1 : (r31 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0106
            int r0 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0106
            r31 = r16
        L_0x0106:
            X.4XE r7 = r6.A02     // Catch:{ 4Yv | IndexOutOfBoundsException -> 0x0207 }
            long r0 = r6.A01     // Catch:{ 4Yv | IndexOutOfBoundsException -> 0x0207 }
            long r2 = r2 - r0
            long r1 = r7.C7P(r2)     // Catch:{ 4Yv | IndexOutOfBoundsException -> 0x0207 }
            int r0 = (r29 > r8 ? 1 : (r29 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0119
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0119
            r29 = r1
        L_0x0119:
            int r0 = (r29 > r8 ? 1 : (r29 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0207
            int r0 = (r31 > r8 ? 1 : (r31 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0207
        L_0x0121:
            r23 = 0
            int r0 = (r31 > r23 ? 1 : (r31 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x0131
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MICROSECONDS
            r0 = 2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r31 = r3.convert(r0, r2)
        L_0x0131:
            r12 = 0
        L_0x0132:
            r0 = r22
            if (r12 >= r0) goto L_0x020b
            X.3wB[] r0 = r5.A02
            r10 = r0[r12]
            r57 = 0
            java.lang.String r1 = r10.A0T
            r0 = r69
            java.lang.Object r4 = r0.get(r1)
            X.4XR r4 = (X.AnonymousClass4XR) r4
            if (r4 == 0) goto L_0x01c1
            X.4XE r0 = r4.A02
            if (r0 == 0) goto L_0x01c1
            r62 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r56 = r21
            r59 = r4
            long r2 = r56.A02(r57, r58, r59, r60, r62)
            long r8 = r4.A00()
            r6 = -1
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0167
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x01c1
        L_0x0167:
            r0 = r70
            boolean r0 = r4.A05(r0)
            if (r0 == 0) goto L_0x01c1
            long r38 = r4.A02(r2)     // Catch:{ 4Yv -> 0x0178 }
            int r0 = (r38 > r23 ? 1 : (r38 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0178
            goto L_0x017a
        L_0x0178:
            r38 = r31
        L_0x017a:
            X.4XE r8 = r4.A02
            long r6 = r4.A01
            long r0 = r2 - r6
            long r36 = r8.C7P(r0)
            int r0 = (r36 > r23 ? 1 : (r36 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x018a
            r36 = r29
        L_0x018a:
            int r0 = r10.A05
            long r0 = (long) r0
            r26 = r0
            X.4XE r0 = r4.A02
            long r8 = r0.B6B()
            long r0 = r4.A01
            long r8 = r8 + r0
            long r6 = r4.A00()
            r16 = -1
            r18 = -1
            r0 = 0
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x01e0
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x01e0
            X.4XE r1 = r4.A02     // Catch:{ 4Yv | IndexOutOfBoundsException -> 0x01d0 }
            long r8 = r4.A01     // Catch:{ 4Yv | IndexOutOfBoundsException -> 0x01d0 }
            long r6 = r2 - r8
            long r16 = r1.C7P(r6)     // Catch:{ 4Yv | IndexOutOfBoundsException -> 0x01d0 }
            long r18 = r4.A02(r2)     // Catch:{ 4Yv | IndexOutOfBoundsException -> 0x01d0 }
            X.4XE r1 = r4.A02     // Catch:{ 4Yv | IndexOutOfBoundsException -> 0x01d0 }
            long r6 = r4.A01     // Catch:{ 4Yv | IndexOutOfBoundsException -> 0x01d0 }
            long r2 = r2 - r6
            X.3vz r0 = r1.BrV(r2)     // Catch:{ 4Yv | IndexOutOfBoundsException -> 0x01d0 }
            goto L_0x01da
        L_0x01c1:
            r27 = -1
            int r0 = r10.A05
            long r0 = (long) r0
            X.4Xq r2 = new X.4Xq
            r26 = r2
            r33 = r0
            r26.<init>(r27, r29, r31, r33)
            goto L_0x01f9
        L_0x01d0:
            r3 = move-exception
            java.lang.String r2 = "HeroAdaptiveTrackSelection"
            java.lang.String r1 = r3.getMessage()
            android.util.Log.w(r2, r1, r3)
        L_0x01da:
            int r1 = (r18 > r23 ? 1 : (r18 == r23 ? 0 : -1))
            if (r1 <= 0) goto L_0x01e0
            r38 = r18
        L_0x01e0:
            int r1 = (r16 > r23 ? 1 : (r16 == r23 ? 0 : -1))
            if (r1 < 0) goto L_0x01e6
            r36 = r16
        L_0x01e6:
            if (r0 == 0) goto L_0x0204
            long r0 = r0.A01
            int r2 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r2 <= 0) goto L_0x0204
        L_0x01ee:
            X.4Xq r2 = new X.4Xq
            r33 = r2
            r34 = r0
            r40 = r26
            r33.<init>(r34, r36, r38, r40)
        L_0x01f9:
            java.lang.String r1 = r10.A0T
            r0 = r25
            r0.put(r1, r2)
            int r12 = r12 + 1
            goto L_0x0132
        L_0x0204:
            r0 = -1
            goto L_0x01ee
        L_0x0207:
            int r4 = r4 + 1
            goto L_0x00af
        L_0x020b:
            r3 = 0
            r30 = 1
            java.lang.Integer r2 = r5.A02
            int r1 = r2.intValue()
            r0 = r30
            if (r1 != r0) goto L_0x021c
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r5.A02 = r2
        L_0x021c:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 == r0) goto L_0x0221
            r3 = 1
        L_0x0221:
            int r0 = r5.A05
            if (r3 == 0) goto L_0x0230
            android.os.SystemClock.elapsedRealtime()
            r5.A05 = r11
            if (r11 == r0) goto L_0x022f
            r0 = 2
        L_0x022d:
            r5.A06 = r0
        L_0x022f:
            return
        L_0x0230:
            boolean r0 = r5.CPT(r0, r13)
            if (r0 == 0) goto L_0x023f
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r5.A0B
            boolean r0 = r0.A1g
            if (r0 == 0) goto L_0x023f
            r0 = 0
            r5.A07 = r0
        L_0x023f:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r5.A0B
            boolean r0 = r0.A3D
            if (r0 == 0) goto L_0x024d
            X.4Xr r0 = r5.A07
            if (r0 == 0) goto L_0x024d
            if (r83 == 0) goto L_0x024d
            if (r74 == 0) goto L_0x07cb
        L_0x024d:
            X.4Xr r8 = r5.A07
            if (r8 != 0) goto L_0x0258
            X.4Xr r8 = new X.4Xr
            r8.<init>()
            r5.A07 = r8
        L_0x0258:
            X.28w r0 = r5.A08
            float r1 = r5.A00
            r68 = r1
            X.4Ox r1 = r5.A0A
            r23 = r1
            if (r1 == 0) goto L_0x02b3
            X.214 r1 = r1.A05
            r29 = r1
        L_0x0268:
            X.27s r1 = r0.A0B
            r28 = r1
            r27 = 1
            r1 = r15[r11]
            boolean r26 = X.C256933wa.A02(r1)
            X.28w.A01(r0, r15)
            r3 = r15[r11]
            X.3wB r1 = r8.A01
            if (r1 == 0) goto L_0x0289
            java.lang.String r2 = r1.A0T
            r1 = r25
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0289
            X.3wB r3 = r8.A01
        L_0x0289:
            java.lang.String r3 = r3.A0T
            r1 = r25
            java.lang.Object r1 = r1.get(r3)
            X.4Xq r1 = (X.C266124Xq) r1
            long r1 = r1.A01
            r66 = r1
            r1 = r25
            java.lang.Object r1 = r1.get(r3)
            X.4Xq r1 = (X.C266124Xq) r1
            long r1 = r1.A00
            r18 = r1
            X.28i r1 = r0.A02
            r24 = r1
            java.lang.String r6 = r24.A02()
            r1 = 1000(0x3e8, double:4.94E-321)
            long r16 = r18 / r1
            java.lang.Class<X.4Xs> r14 = X.C266144Xs.class
            monitor-enter(r14)
            goto L_0x02b6
        L_0x02b3:
            X.214 r29 = X.214.A06
            goto L_0x0268
        L_0x02b6:
            java.util.HashMap r4 = X.C266144Xs.A01     // Catch:{ all -> 0x07d9 }
            boolean r1 = r4.containsKey(r6)     // Catch:{ all -> 0x07d9 }
            if (r1 == 0) goto L_0x02d8
            java.lang.Object r1 = r4.get(r6)     // Catch:{ all -> 0x07d9 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x07d9 }
            long r1 = r1.longValue()     // Catch:{ all -> 0x07d9 }
            long r1 = r1 + r16
        L_0x02ca:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x07d9 }
            r4.put(r6, r1)     // Catch:{ all -> 0x07d9 }
            long r1 = X.C266144Xs.A00     // Catch:{ all -> 0x07d9 }
            long r1 = r1 + r16
            X.C266144Xs.A00 = r1     // Catch:{ all -> 0x07d9 }
            goto L_0x0318
        L_0x02d8:
            int r2 = r4.size()     // Catch:{ all -> 0x07d9 }
            r1 = 20
            if (r2 != r1) goto L_0x0315
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r3 = 0
            java.util.Set r1 = r4.keySet()     // Catch:{ all -> 0x07d9 }
            java.util.Iterator r7 = r1.iterator()     // Catch:{ all -> 0x07d9 }
        L_0x02ec:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x07d9 }
            if (r1 == 0) goto L_0x0312
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x07d9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x07d9 }
            java.lang.Object r1 = r4.get(r2)     // Catch:{ all -> 0x07d9 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x07d9 }
            long r9 = r1.longValue()     // Catch:{ all -> 0x07d9 }
            int r1 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ec
            java.lang.Object r1 = r4.get(r2)     // Catch:{ all -> 0x07d9 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x07d9 }
            long r12 = r1.longValue()     // Catch:{ all -> 0x07d9 }
            r3 = r2
            goto L_0x02ec
        L_0x0312:
            r4.remove(r3)     // Catch:{ all -> 0x07d9 }
        L_0x0315:
            r1 = r16
            goto L_0x02ca
        L_0x0318:
            monitor-exit(r14)
            X.28g r10 = r0.A04
            if (r10 == 0) goto L_0x04b0
            boolean r1 = r10.A00
            if (r1 != 0) goto L_0x04b0
            java.lang.String r1 = "initializeCachedInitSegments"
            X.27d.A01(r1)
            java.lang.String r9 = r24.A02()     // Catch:{ all -> 0x07d1 }
            boolean r14 = r24.A07()     // Catch:{ all -> 0x07d1 }
            boolean r1 = r10.A00     // Catch:{ all -> 0x07d1 }
            if (r1 != 0) goto L_0x049e
            r1 = r30
            r10.A00 = r1     // Catch:{ all -> 0x07d1 }
            X.29t r1 = r10.A02     // Catch:{ all -> 0x07d1 }
            r17 = r1
            if (r1 == 0) goto L_0x049e
            int r1 = r15.length     // Catch:{ all -> 0x07d1 }
            r59 = r1
            r6 = 0
        L_0x0340:
            r1 = r59
            if (r6 >= r1) goto L_0x049e
            r1 = r15[r6]     // Catch:{ all -> 0x07d1 }
            java.lang.String r3 = r1.A0T     // Catch:{ all -> 0x07d1 }
            if (r3 != 0) goto L_0x0355
            java.lang.String r3 = "CachedSegmentManager"
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ all -> 0x07d1 }
            java.lang.String r1 = "format missing id -- skipping"
            X.27B.A01(r3, r1, r2)     // Catch:{ all -> 0x07d1 }
            goto L_0x049a
        L_0x0355:
            r1 = r69
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x07d1 }
            X.4XR r1 = (X.AnonymousClass4XR) r1     // Catch:{ all -> 0x07d1 }
            if (r1 == 0) goto L_0x049a
            X.4XE r1 = r1.A02     // Catch:{ all -> 0x07d1 }
            if (r1 != 0) goto L_0x049a
            r1 = r69
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x07d1 }
            X.4XR r1 = (X.AnonymousClass4XR) r1     // Catch:{ all -> 0x07d1 }
            if (r1 != 0) goto L_0x036e
            goto L_0x0373
        L_0x036e:
            X.3wG r2 = r1.A03     // Catch:{ all -> 0x07d1 }
            X.3vz r7 = r2.A03     // Catch:{ all -> 0x07d1 }
            goto L_0x0374
        L_0x0373:
            r7 = 0
        L_0x0374:
            r32 = 0
            if (r7 == 0) goto L_0x037c
            if (r1 != 0) goto L_0x037f
            r12 = 0
            goto L_0x038d
        L_0x037c:
            r12 = r32
            goto L_0x038d
        L_0x037f:
            X.3wG r2 = r1.A03     // Catch:{ all -> 0x07d1 }
            X.3vz r4 = r2.A01()     // Catch:{ all -> 0x07d1 }
            java.lang.String r2 = r2.A03()     // Catch:{ all -> 0x07d1 }
            X.3vz r12 = r7.A01(r4, r2)     // Catch:{ all -> 0x07d1 }
        L_0x038d:
            r2 = r69
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x07d1 }
            X.4XR r2 = (X.AnonymousClass4XR) r2     // Catch:{ all -> 0x07d1 }
            if (r2 == 0) goto L_0x039e
            X.3wG r2 = r2.A03     // Catch:{ all -> 0x07d1 }
            java.lang.String r4 = r2.A02()     // Catch:{ all -> 0x07d1 }
            goto L_0x039f
        L_0x039e:
            r4 = 0
        L_0x039f:
            if (r12 == 0) goto L_0x0491
            if (r4 == 0) goto L_0x0491
            if (r1 != 0) goto L_0x03a7
            r7 = 0
            goto L_0x03b1
        L_0x03a7:
            X.3wG r2 = r1.A03     // Catch:{ all -> 0x07d1 }
            java.lang.String r2 = r2.A03()     // Catch:{ all -> 0x07d1 }
            android.net.Uri r7 = r12.A00(r2)     // Catch:{ all -> 0x07d1 }
        L_0x03b1:
            long r2 = r12.A02     // Catch:{ all -> 0x07d1 }
            r64 = r2
            long r2 = r12.A01     // Catch:{ all -> 0x07d1 }
            r62 = r2
            r12 = r14
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r3 = r10.A04     // Catch:{ all -> 0x07d1 }
            boolean r2 = r3.A3G     // Catch:{ all -> 0x07d1 }
            java.lang.String r35 = X.27B.A00(r7, r4, r9, r14, r2)     // Catch:{ all -> 0x07d1 }
            X.28b r13 = r10.A01     // Catch:{ all -> 0x07d1 }
            r33 = r13
            r34 = r7
            r36 = r9
            r37 = r64
            r39 = r62
            boolean r16 = r33.CPs(r34, r35, r36, r37, r39)     // Catch:{ all -> 0x07d1 }
            boolean r3 = r3.A1Q     // Catch:{ all -> 0x07d1 }
            if (r3 == 0) goto L_0x03e6
            if (r16 != 0) goto L_0x03e8
            if (r14 == 0) goto L_0x049a
            java.lang.String r35 = X.27B.A00(r7, r4, r9, r11, r2)     // Catch:{ all -> 0x07d1 }
            boolean r2 = r33.CPs(r34, r35, r36, r37, r39)     // Catch:{ all -> 0x07d1 }
            if (r2 == 0) goto L_0x049a
            r12 = 0
            goto L_0x03e8
        L_0x03e6:
            if (r16 == 0) goto L_0x049a
        L_0x03e8:
            X.28e r2 = r10.A03     // Catch:{ all -> 0x07d1 }
            X.3wn r13 = new X.3wn     // Catch:{ all -> 0x07d1 }
            r13.<init>(r2, r9, r12)     // Catch:{ all -> 0x07d1 }
            r48 = 0
            java.util.HashMap r42 = new java.util.HashMap     // Catch:{ all -> 0x07d1 }
            r42.<init>()     // Catch:{ all -> 0x07d1 }
            X.3p9 r35 = X.C252463p9.DASH_VIDEO     // Catch:{ all -> 0x07d1 }
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x07d1 }
            r3.<init>(r11)     // Catch:{ all -> 0x07d1 }
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x07d1 }
            r2.<init>(r11)     // Catch:{ all -> 0x07d1 }
            java.lang.String r39 = "initSeg"
            r31 = r17
            r33 = r32
            r34 = r32
            r36 = r13
            r37 = r32
            r38 = r32
            r40 = r32
            r41 = r32
            r43 = r3
            r44 = r2
            r45 = r11
            r46 = r11
            r47 = r11
            r50 = r11
            r51 = r11
            r52 = r11
            r53 = r11
            r54 = r11
            r55 = r11
            r56 = r11
            r57 = r30
            X.3wu r3 = r31.A04(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r51, r52, r53, r54, r55, r56, r57)     // Catch:{ all -> 0x07d1 }
            java.lang.String r2 = "Failed to load initialization chunk"
            if (r1 == 0) goto L_0x049a
            X.3x7 r12 = X.C257263x7.A0B     // Catch:{ all -> 0x07d1 }
            java.util.Map r44 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x07d1 }
            X.3x6 r42 = new X.3x6     // Catch:{ all -> 0x07d1 }
            r42.<init>()     // Catch:{ all -> 0x07d1 }
            X.3x7 r40 = new X.3x7     // Catch:{ all -> 0x07d1 }
            r41 = r7
            r43 = r4
            r45 = r32
            r46 = r30
            r50 = r64
            r52 = r62
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r50, r52)     // Catch:{ all -> 0x07d1 }
            X.4XK r4 = new X.4XK     // Catch:{ all -> 0x07d1 }
            r4.<init>(r3)     // Catch:{ all -> 0x07d1 }
            X.3wG r3 = r1.A03     // Catch:{ all -> 0x07d1 }
            X.3wB r7 = r3.A02     // Catch:{ all -> 0x07d1 }
            X.4Se r3 = r1.A06     // Catch:{ all -> 0x07d1 }
            X.4Xw r1 = new X.4Xw     // Catch:{ all -> 0x07d1 }
            r33 = r1
            r34 = r7
            r35 = r3
            r36 = r4
            r37 = r40
            r39 = r11
            r33.<init>(r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x07d1 }
            r1.Cg1()     // Catch:{ EOFException -> 0x0484, IOException | IllegalArgumentException -> 0x0477 }
            r3 = r21
            r3.D1o(r1)     // Catch:{ EOFException -> 0x0484, IOException | IllegalArgumentException -> 0x0477 }
            goto L_0x049a
        L_0x0477:
            r4 = move-exception
            java.lang.String r3 = "Exo2DashChunkSourceAccessor"
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x07d1 }
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x07d1 }
            android.util.Log.e(r3, r1, r4)     // Catch:{ all -> 0x07d1 }
            goto L_0x049a
        L_0x0484:
            r4 = move-exception
            java.lang.String r3 = "Exo2DashChunkSourceAccessor"
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x07d1 }
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x07d1 }
            android.util.Log.e(r3, r1, r4)     // Catch:{ all -> 0x07d1 }
            goto L_0x049a
        L_0x0491:
            java.lang.String r3 = "CachedSegmentManager"
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ all -> 0x07d1 }
            java.lang.String r1 = "format not valid -- skipping"
            X.27B.A01(r3, r1, r2)     // Catch:{ all -> 0x07d1 }
        L_0x049a:
            int r6 = r6 + 1
            goto L_0x0340
        L_0x049e:
            java.lang.String r3 = "StitchAbrEvaluator"
            java.lang.String r2 = "completed loading init segments for video: %s"
            java.lang.String r1 = r24.A02()     // Catch:{ all -> 0x07d1 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ all -> 0x07d1 }
            X.27B.A01(r3, r2, r1)     // Catch:{ all -> 0x07d1 }
            X.27d.A00()
        L_0x04b0:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
            X.28z r9 = r0.A03
            r33 = 0
            r1 = r33
            int r7 = r9.A03(r1, r15)
            int r1 = r15.length
            r32 = r1
            r6 = 0
        L_0x04c4:
            r1 = r32
            if (r6 >= r1) goto L_0x04d1
            r2 = r15[r6]
            int r1 = r2.A05
            if (r1 <= r7) goto L_0x04d5
            int r6 = r6 + 1
            goto L_0x04c4
        L_0x04d1:
            int r1 = r32 + -1
            r2 = r15[r1]
        L_0x04d5:
            r36 = r15[r11]
            int r31 = r9.A05(r15)
            int r56 = r9.A03(r4, r15)
            X.3mA r1 = r0.A0A
            r64 = r1
            X.3wB r12 = r8.A01
            java.lang.String r38 = r24.A01()
            java.lang.String r39 = "UNKNOWN"
            if (r28 != 0) goto L_0x0716
            r55 = 0
        L_0x04ef:
            r1 = r21
            X.3w6 r1 = r1.A0D
            java.lang.String r9 = r1.A0N
            java.lang.String r7 = r1.A0J
            java.lang.String r6 = r1.A0M
            r16 = r77
            r34 = r64
            r35 = r12
            r37 = r2
            r40 = r9
            r41 = r7
            r42 = r6
            r43 = r4
            r44 = r15
            r45 = r68
            r46 = r31
            r47 = r70
            r49 = r16
            r51 = r66
            r53 = r18
            r34.Ewd(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49, r51, r53, r55)
            long r6 = r1.A06
            r1 = r26
            int r9 = X.28w.A00(r0, r1)
            X.4Tv r4 = new X.4Tv
            r4.<init>()
            r1 = r16
            r4.A01 = r1
            r1 = r70
            r4.A02 = r1
            r4.A03 = r6
            r1 = r29
            r4.A04 = r1
            r4.A00 = r9
            X.3wB r13 = r8.A01
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r12 = r0.A09
            X.1xk r1 = r12.abrSetting
            boolean r1 = r1.A10
            if (r1 == 0) goto L_0x0712
            X.3wB r1 = r8.A02
            if (r1 == 0) goto L_0x0712
            r13 = r1
        L_0x0546:
            r27 = 0
        L_0x0548:
            java.lang.String r9 = r0.A0E
            if (r9 == 0) goto L_0x06f0
            X.3wB[] r7 = r0.A0F
            int r6 = r7.length
        L_0x054f:
            if (r3 >= r6) goto L_0x06f0
            r2 = r7[r3]
            java.lang.String r1 = r2.A0T
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x06ec
            X.Xwx r3 = new X.Xwx
            r3.<init>(r0, r2)
        L_0x0560:
            r1 = r21
            X.3w6 r1 = r1.A0D
            if (r1 != 0) goto L_0x06e6
            r2 = 0
        L_0x0567:
            r1 = r21
            X.3w6 r1 = r1.A0D
            if (r1 != 0) goto L_0x06e0
            r6 = 0
        L_0x056e:
            r1 = r21
            X.3w6 r1 = r1.A0D
            if (r1 != 0) goto L_0x06da
            r7 = 0
        L_0x0575:
            X.3wZ r1 = new X.3wZ
            r1.<init>(r6, r7, r2)
            r50 = r3
            r51 = r4
            r52 = r1
            r53 = r13
            r54 = r25
            r55 = r15
            r57 = r31
            X.4U4 r9 = r50.ASx(r51, r52, r53, r54, r55, r56, r57)
            X.3wB r1 = r9.A01
            r8.A02 = r1
            if (r26 != 0) goto L_0x0594
            r0.A0D = r1
        L_0x0594:
            int r0 = r12.getMinMosForCachedQuality()
            float r1 = (float) r0
            boolean r0 = r3.EtT()
            if (r0 != 0) goto L_0x0779
            if (r10 == 0) goto L_0x0779
            boolean r0 = r3.CUq()
            if (r0 == 0) goto L_0x05a9
            if (r27 == 0) goto L_0x0779
        L_0x05a9:
            X.3wB r0 = r9.A01
            r45 = r0
            java.lang.String r30 = r24.A02()
            r29 = 1065353216(0x3f800000, float:1.0)
            boolean r28 = r12.shouldUseMosAwareCachedSelection()
            int r0 = (int) r1
            r44 = r0
            boolean r27 = r24.A07()
            X.4Xt r2 = new X.4Xt
            r0 = r45
            r2.<init>(r0)
            r13 = 0
        L_0x05c6:
            r0 = r32
            if (r13 >= r0) goto L_0x072c
            r7 = r15[r13]
            java.lang.String r6 = r7.A0T
            if (r6 == 0) goto L_0x05e6
            r0 = r69
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L_0x05e6
            r0 = r69
            java.lang.Object r0 = r0.get(r6)
            X.4XR r0 = (X.AnonymousClass4XR) r0
            if (r0 == 0) goto L_0x05e9
            X.4XE r0 = r0.A02
            if (r0 != 0) goto L_0x05e9
        L_0x05e6:
            int r13 = r13 + 1
            goto L_0x05c6
        L_0x05e9:
            r0 = r69
            java.lang.Object r12 = r0.get(r6)
            X.4XR r12 = (X.AnonymousClass4XR) r12
            if (r12 == 0) goto L_0x05e6
            X.4XE r0 = r12.A02
            if (r0 == 0) goto L_0x05e6
            r62 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r56 = r21
            r57 = r33
            r59 = r12
            long r3 = r56.A02(r57, r58, r59, r60, r62)
            long r25 = r12.A00()     // Catch:{ IndexOutOfBoundsException -> 0x06d4 }
            r18 = -1
            int r0 = (r25 > r18 ? 1 : (r25 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0614
            int r0 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r0 > 0) goto L_0x05e6
        L_0x0614:
            r0 = r70
            boolean r0 = r12.A05(r0)     // Catch:{ IndexOutOfBoundsException -> 0x06d4 }
            if (r0 == 0) goto L_0x05e6
            X.4XE r0 = r12.A02     // Catch:{ IndexOutOfBoundsException -> 0x06d4 }
            r14 = r0
            long r0 = r12.A01     // Catch:{ IndexOutOfBoundsException -> 0x06d4 }
            long r3 = r3 - r0
            X.3vz r3 = r14.BrV(r3)     // Catch:{ IndexOutOfBoundsException -> 0x06d4 }
            if (r3 == 0) goto L_0x05e6
            X.3wG r0 = r12.A03
            java.lang.String r0 = r0.A03()
            android.net.Uri r4 = r3.A00(r0)
            long r0 = r3.A01
            r25 = 0
            int r12 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r12 >= 0) goto L_0x06cc
            r18 = 0
        L_0x063c:
            r0 = r69
            java.lang.Object r0 = r0.get(r6)
            X.4XR r0 = (X.AnonymousClass4XR) r0
            if (r0 == 0) goto L_0x06ca
            X.3wG r0 = r0.A03
            java.lang.String r12 = r0.A02()
        L_0x064c:
            long r0 = r3.A02
            r42 = r0
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r10.A04
            boolean r3 = r1.A3G
            r14 = r30
            r0 = r27
            java.lang.String r36 = X.27B.A00(r4, r12, r14, r0, r3)
            X.28b r0 = r10.A01
            r34 = r0
            r35 = r4
            r37 = r14
            r38 = r42
            r40 = r18
            boolean r14 = r34.CPs(r35, r36, r37, r38, r40)
            boolean r0 = r1.A1Q
            if (r0 == 0) goto L_0x06c7
            if (r14 != 0) goto L_0x0680
            if (r27 == 0) goto L_0x05e6
            r0 = r30
            java.lang.String r36 = X.27B.A00(r4, r12, r0, r11, r3)
            boolean r0 = r34.CPs(r35, r36, r37, r38, r40)
            if (r0 == 0) goto L_0x05e6
        L_0x0680:
            int r2 = r7.A05
            r0 = r45
            int r0 = r0.A05
            if (r2 >= r0) goto L_0x071c
            int r0 = (r77 > r25 ? 1 : (r77 == r25 ? 0 : -1))
            if (r0 < 0) goto L_0x071c
            X.1xk r0 = r1.A0w
            boolean r2 = r0.A0a
            r3 = r7
            r1 = r31
            r0 = r45
            float r4 = com.facebook.video.heroplayer.common.MosScoreCalculation.A00(r0, r1, r2)
            float r2 = com.facebook.video.heroplayer.common.MosScoreCalculation.A00(r7, r1, r2)
            r0 = r44
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x06b5
            X.4Xt r2 = new X.4Xt
            r2.<init>(r7)
        L_0x06a9:
            X.3wB r0 = r2.A00
            boolean r0 = r7.equals(r0)
            if (r28 == 0) goto L_0x0727
            if (r0 != 0) goto L_0x0727
            goto L_0x05e6
        L_0x06b5:
            r1 = 0
            float r1 = r1 * r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            float r2 = r2 + r1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x06c1
            r3 = r45
        L_0x06c1:
            X.4Xt r2 = new X.4Xt
            r2.<init>(r3)
            goto L_0x06a9
        L_0x06c7:
            if (r14 == 0) goto L_0x05e6
            goto L_0x0680
        L_0x06ca:
            r12 = 0
            goto L_0x064c
        L_0x06cc:
            float r12 = (float) r0
            float r12 = r12 * r29
            long r0 = (long) r12
            r18 = r0
            goto L_0x063c
        L_0x06d4:
            r0 = move-exception
            r0.getMessage()
            goto L_0x05e6
        L_0x06da:
            java.lang.String r7 = r1.A03()
            goto L_0x0575
        L_0x06e0:
            android.util.Pair r6 = r1.A01()
            goto L_0x056e
        L_0x06e6:
            boolean r2 = r1.A04()
            goto L_0x0567
        L_0x06ec:
            int r3 = r3 + 1
            goto L_0x054f
        L_0x06f0:
            monitor-enter(r24)
            r1 = r24
            boolean r1 = r1.A06     // Catch:{ all -> 0x07d6 }
            monitor-exit(r24)
            if (r1 != 0) goto L_0x070e
            boolean r1 = r24.A07()
            if (r1 != 0) goto L_0x070e
            r1 = r26
            boolean r1 = r12.enableQoERationalGamblerAbr(r1)
            if (r1 == 0) goto L_0x070a
            X.295 r3 = r0.A06
            goto L_0x0560
        L_0x070a:
            X.290 r3 = r0.A08
            goto L_0x0560
        L_0x070e:
            X.294 r3 = r0.A05
            goto L_0x0560
        L_0x0712:
            if (r13 != 0) goto L_0x0546
            goto L_0x0548
        L_0x0716:
            boolean r55 = r28.A01()
            goto L_0x04ef
        L_0x071c:
            r0 = r69
            r0.get(r6)
            X.4Xt r2 = new X.4Xt
            r2.<init>(r7)
            goto L_0x072c
        L_0x0727:
            r0 = r69
            r0.get(r6)
        L_0x072c:
            X.3wB r1 = r2.A00
            if (r1 == 0) goto L_0x0779
            X.3wB r0 = r9.A01
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0779
            r9.A01 = r1
            X.3wd r1 = X.C256963wd.USE_CACHED
            r0 = r64
            r0.A7k(r1)
            java.util.List r0 = r2.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x0747:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0759
            java.lang.Object r1 = r3.next()
            X.3wd r1 = (X.C256963wd) r1
            r0 = r64
            r0.A7k(r1)
            goto L_0x0747
        L_0x0759:
            java.util.List r0 = r2.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x075f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0779
            java.lang.Object r0 = r3.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r2 = r0.first
            X.4U3 r2 = (X.AnonymousClass4U3) r2
            java.lang.Object r1 = r0.second
            java.lang.String r1 = (java.lang.String) r1
            r0 = r64
            r0.A7l(r2, r1)
            goto L_0x075f
        L_0x0779:
            X.3wB r0 = r9.A01
            r8.A01 = r0
            monitor-enter(r24)
            monitor-exit(r24)
            X.3wB r1 = r8.A01
            r0 = r64
            r0.ASF(r1)
            X.5fc r0 = r64.AXf()
            if (r0 == 0) goto L_0x0790
            X.4Xu r0 = r0.A01
            r8.A00 = r0
        L_0x0790:
            r0 = r22
            if (r11 >= r0) goto L_0x07ae
            r0 = r20[r11]
            java.lang.String r0 = r0.A0T
            if (r0 == 0) goto L_0x07ce
            X.4Xr r0 = r5.A07
            X.3wB r2 = r0.A01
            if (r2 == 0) goto L_0x07ce
            r0 = r20[r11]
            java.lang.String r1 = r0.A0T
            java.lang.String r0 = r2.A0T
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07ce
            r5.A05 = r11
        L_0x07ae:
            X.4Xr r0 = r5.A07
            X.3wB r0 = r0.A01
            if (r0 == 0) goto L_0x07c5
            if (r23 == 0) goto L_0x07c5
            java.lang.String r1 = r0.A0S
            if (r1 == 0) goto L_0x07c5
            java.lang.String r0 = "video"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x07c5
            r23.A05()
        L_0x07c5:
            X.4Xr r0 = r5.A07
            X.4Xu r0 = r0.A00
            r5.A09 = r0
        L_0x07cb:
            r0 = 3
            goto L_0x022d
        L_0x07ce:
            int r11 = r11 + 1
            goto L_0x0790
        L_0x07d1:
            r0 = move-exception
            X.27d.A00()
            throw r0
        L_0x07d6:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        L_0x07d9:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XH.FLS(X.4XP, X.4Y2, long, long, long, long, boolean, boolean):void");
    }
}
