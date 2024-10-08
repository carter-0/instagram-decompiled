package X;

/* renamed from: X.Y2a  reason: case insensitive filesystem */
public final class C22394Y2a implements Runnable {
    public final int A00;
    public final /* synthetic */ 28Y A01;

    public C22394Y2a(28Y r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r71 = this;
            r17 = 0
        L_0x0002:
            r70 = r71
            r0 = r70
            X.28Y r6 = r0.A01     // Catch:{ InterruptedException -> 0x0379 }
            java.util.concurrent.BlockingQueue r0 = r6.A0C     // Catch:{ InterruptedException -> 0x0379 }
            r69 = r0
            java.lang.Object r0 = r69.take()     // Catch:{ InterruptedException -> 0x0379 }
            X.Xbz r0 = (X.C21467Xbz) r0     // Catch:{ InterruptedException -> 0x0379 }
            X.Xb8 r1 = r0.A04     // Catch:{ InterruptedException -> 0x0379 }
            android.net.Uri r2 = r1.A03     // Catch:{ InterruptedException -> 0x0379 }
            r68 = r2
            java.lang.Integer r3 = r0.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r3 != r2) goto L_0x0002
            r16 = 1
            r7 = 0
            boolean r2 = r6.A07     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3wo r4 = new X.3wo     // Catch:{ IOException | RuntimeException -> 0x030e }
            r4.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x030e }
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException | RuntimeException -> 0x030e }
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r8 = r6.A02     // Catch:{ IOException | RuntimeException -> 0x030e }
            r2 = 0
            X.28m r3 = new X.28m     // Catch:{ IOException | RuntimeException -> 0x030e }
            r3.<init>(r8, r2)     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3m5 r3 = r3.A00     // Catch:{ IOException | RuntimeException -> 0x030e }
            r5.add(r3)     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.5fP r8 = r0.A06     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.5fO r8 = (X.C290485fO) r8     // Catch:{ IOException | RuntimeException -> 0x030e }
            monitor-enter(r8)     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3w6 r3 = r8.A01     // Catch:{ all -> 0x030b }
            r11 = 0
            if (r3 == 0) goto L_0x0046
            r17 = r3
            r11 = 1
        L_0x0046:
            monitor-exit(r8)     // Catch:{ IOException | RuntimeException -> 0x030e }
            com.facebook.exoplayer.monitor.VpsEventCallback r10 = r0.A03     // Catch:{ IOException | RuntimeException -> 0x030e }
            if (r10 == 0) goto L_0x00c4
            X.3wn r14 = r0.A05     // Catch:{ IOException | RuntimeException -> 0x030e }
            r32 = 0
            java.lang.String r13 = r0.A07     // Catch:{ IOException | RuntimeException -> 0x030e }
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ IOException | RuntimeException -> 0x030e }
            r9.<init>(r7)     // Catch:{ IOException | RuntimeException -> 0x030e }
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ IOException | RuntimeException -> 0x030e }
            r8.<init>(r7)     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.28N r3 = X.28N.A00     // Catch:{ IOException | RuntimeException -> 0x030e }
            java.lang.String r27 = r3.A01()     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3p9 r12 = r1.A04     // Catch:{ IOException | RuntimeException -> 0x030e }
            if (r11 == 0) goto L_0x006d
            r3 = r17
            boolean r3 = r3.A0U     // Catch:{ IOException | RuntimeException -> 0x030e }
            r37 = 1
            if (r3 != 0) goto L_0x0071
        L_0x006d:
            r37 = 0
            if (r11 == 0) goto L_0x0079
        L_0x0071:
            r3 = r17
            boolean r3 = r3.A0V     // Catch:{ IOException | RuntimeException -> 0x030e }
            r38 = 1
            if (r3 != 0) goto L_0x007d
        L_0x0079:
            r38 = 0
            if (r11 == 0) goto L_0x0085
        L_0x007d:
            r3 = r17
            boolean r3 = r3.A0W     // Catch:{ IOException | RuntimeException -> 0x030e }
            r39 = 1
            if (r3 != 0) goto L_0x0089
        L_0x0085:
            r39 = 0
            if (r11 == 0) goto L_0x0091
        L_0x0089:
            r3 = r17
            boolean r3 = r3.A0R     // Catch:{ IOException | RuntimeException -> 0x030e }
            r40 = 1
            if (r3 != 0) goto L_0x0093
        L_0x0091:
            r40 = 0
        L_0x0093:
            boolean r11 = r6.A08     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3ww r22 = new X.3ww     // Catch:{ IOException | RuntimeException -> 0x030e }
            r22.<init>()     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3wy r3 = new X.3wy     // Catch:{ IOException | RuntimeException -> 0x030e }
            r18 = r3
            r19 = r2
            r20 = r10
            r21 = r12
            r23 = r14
            r24 = r2
            r25 = r2
            r26 = r13
            r28 = r2
            r29 = r2
            r30 = r9
            r31 = r8
            r34 = r16
            r35 = r7
            r36 = r7
            r41 = r7
            r42 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ IOException | RuntimeException -> 0x030e }
            r5.add(r3)     // Catch:{ IOException | RuntimeException -> 0x030e }
        L_0x00c4:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r5)     // Catch:{ IOException | RuntimeException -> 0x030e }
            r4.A00 = r3     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3p9 r3 = r1.A04     // Catch:{ IOException | RuntimeException -> 0x030e }
            int r13 = r3.A00     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3wn r3 = r0.A05     // Catch:{ IOException | RuntimeException -> 0x030e }
            java.lang.String r11 = r6.A05     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.28X r10 = r6.A0B     // Catch:{ IOException | RuntimeException -> 0x030e }
            int r9 = r6.A00     // Catch:{ IOException | RuntimeException -> 0x030e }
            boolean r8 = r6.A0E     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3wq r6 = r4.A01     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.XU3 r5 = X.C22293Xz2.A0B     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.28N r20 = X.28N.A00     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.Xz2 r5 = new X.Xz2     // Catch:{ IOException | RuntimeException -> 0x030e }
            r18 = r5
            r19 = r10
            r21 = r4
            r22 = r3
            r23 = r6
            r24 = r11
            r25 = r9
            r26 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ IOException | RuntimeException -> 0x030e }
            java.util.Map r58 = java.util.Collections.emptyMap()     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3wB r6 = r1.A05     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3wA r4 = r6.A0N     // Catch:{ IOException | RuntimeException -> 0x030e }
            java.lang.String r12 = r4.A07     // Catch:{ IOException | RuntimeException -> 0x030e }
            int r4 = r6.A05     // Catch:{ IOException | RuntimeException -> 0x030e }
            long r8 = (long) r4     // Catch:{ IOException | RuntimeException -> 0x030e }
            int r11 = r1.A02     // Catch:{ IOException | RuntimeException -> 0x030e }
            int r10 = r1.A01     // Catch:{ IOException | RuntimeException -> 0x030e }
            r41 = -1
            java.lang.String r6 = r3.A07     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3x3 r3 = new X.3x3     // Catch:{ IOException | RuntimeException -> 0x030e }
            r4 = r16
            r3.<init>(r6, r4)     // Catch:{ IOException | RuntimeException -> 0x030e }
            r43 = 0
            int r4 = r1.A00     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3x5 r19 = X.C257243x5.A02     // Catch:{ IOException | RuntimeException -> 0x030e }
            java.lang.String r25 = ""
            r6 = -1
            X.3x6 r18 = new X.3x6     // Catch:{ IOException | RuntimeException -> 0x030e }
            r21 = r12
            r22 = r2
            r23 = r2
            r24 = r2
            r26 = r25
            r27 = r2
            r28 = r2
            r29 = r11
            r30 = r10
            r31 = r6
            r32 = r13
            r33 = r6
            r34 = r6
            r35 = r4
            r36 = r6
            r37 = r6
            r38 = r6
            r39 = r8
            r45 = r41
            r47 = r41
            r49 = r41
            r51 = r41
            r53 = r7
            r54 = r7
            r55 = r7
            r56 = r7
            r57 = r7
            r20 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45, r47, r49, r51, r53, r54, r55, r56, r57)     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.C256703wD.A02(r68)     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3x7 r4 = new X.3x7     // Catch:{ IOException | RuntimeException -> 0x030e }
            r54 = r4
            r55 = r68
            r56 = r18
            r57 = r2
            r59 = r2
            r60 = r16
            r61 = r7
            r62 = r43
            r64 = r43
            r66 = r41
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r64, r66)     // Catch:{ IOException | RuntimeException -> 0x030e }
            monitor-enter(r5)     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3wn r14 = r5.A05     // Catch:{ all -> 0x0308 }
            java.lang.String r12 = r14.A07     // Catch:{ all -> 0x0308 }
            android.net.Uri r11 = r4.A06     // Catch:{ all -> 0x0308 }
            X.3x6 r8 = r4.A07     // Catch:{ all -> 0x0308 }
            X.XIj r10 = new X.XIj     // Catch:{ all -> 0x0308 }
            r10.<init>(r12, r11)     // Catch:{ all -> 0x0308 }
            X.XU3 r9 = X.C22293Xz2.A0B     // Catch:{ all -> 0x0308 }
            monitor-enter(r9)     // Catch:{ all -> 0x0308 }
            X.3ws r13 = r9.A00(r10)     // Catch:{ all -> 0x0305 }
            r3 = 0
            if (r13 != 0) goto L_0x02d6
            X.28X r13 = r5.A03     // Catch:{ all -> 0x0305 }
            byte[] r15 = r13.A01(r11, r12)     // Catch:{ all -> 0x0305 }
            if (r15 != 0) goto L_0x02d6
            X.28N r3 = r5.A04     // Catch:{ all -> 0x0305 }
            r27 = r3
            java.lang.String r3 = r5.A07     // Catch:{ all -> 0x0305 }
            r20 = r3
            boolean r3 = r8.A0U     // Catch:{ all -> 0x0305 }
            r24 = 8500(0x2134, float:1.1911E-41)
            if (r3 != 0) goto L_0x01a4
            r24 = 8000(0x1f40, float:1.121E-41)
            r3 = 8000(0x1f40, float:1.121E-41)
            goto L_0x01a6
        L_0x01a4:
            int r3 = r5.A02     // Catch:{ all -> 0x0305 }
        L_0x01a6:
            X.3m6 r8 = r5.A00     // Catch:{ all -> 0x0305 }
            r19 = r8
            X.3wq r8 = r5.A06     // Catch:{ all -> 0x0305 }
            r18 = r8
            boolean r15 = r5.A08     // Catch:{ all -> 0x0305 }
            X.XIl r8 = new X.XIl     // Catch:{ all -> 0x0305 }
            r21 = r19
            r22 = r18
            r23 = r20
            r25 = r3
            r26 = r15
            r18 = r8
            r19 = r13
            r20 = r27
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0305 }
            r9.A02(r10, r8)     // Catch:{ all -> 0x0305 }
            monitor-exit(r9)     // Catch:{ all -> 0x0305 }
            java.lang.String r15 = r14.A03     // Catch:{ IOException -> 0x02cd }
            java.lang.String r13 = r14.A04     // Catch:{ IOException -> 0x02cd }
            r3 = r16
            X.3x7 r4 = X.C22293Xz2.A00(r5, r4, r15, r13, r3)     // Catch:{ IOException -> 0x02cd }
            X.3m6 r13 = r8.A01     // Catch:{ IOException -> 0x02cd }
            if (r13 == 0) goto L_0x01dc
            X.3wz r3 = X.C257183wz.NOT_CACHED     // Catch:{ IOException -> 0x02cd }
            r13.Dtd(r3, r4)     // Catch:{ IOException -> 0x02cd }
        L_0x01dc:
            monitor-enter(r8)     // Catch:{ IOException -> 0x02cd }
            r8.A04 = r2     // Catch:{ all -> 0x02ca }
            r8.A01 = r6     // Catch:{ all -> 0x02ca }
            r8.A00 = r6     // Catch:{ all -> 0x02ca }
            r8.A00 = r6     // Catch:{ all -> 0x02ca }
            r3 = r16
            r8.A06 = r3     // Catch:{ all -> 0x02ca }
            monitor-exit(r8)     // Catch:{ all -> 0x02ca }
            X.28N r3 = r8.A0B     // Catch:{ IOException -> 0x02cd }
            r25 = r3
            java.lang.String r3 = r8.A0C     // Catch:{ IOException -> 0x02cd }
            r22 = r3
            X.3m6 r3 = r8.A01     // Catch:{ IOException -> 0x02cd }
            r18 = r3
            X.3wq r15 = r8.A03     // Catch:{ IOException -> 0x02cd }
            int r13 = r8.A08     // Catch:{ IOException -> 0x02cd }
            int r3 = r8.A09     // Catch:{ IOException -> 0x02cd }
            r19 = r14
            r20 = r15
            r21 = r18
            r23 = r13
            r24 = r3
            r18 = r25
            X.3wr r13 = r18.A00(r19, r20, r21, r22, r23, r24)     // Catch:{ IOException -> 0x02cd }
            long r3 = r13.open(r4)     // Catch:{ IOException -> 0x02a4 }
            monitor-enter(r8)     // Catch:{ IOException -> 0x02a4 }
            X.3m6 r15 = r8.A01     // Catch:{ all -> 0x02a1 }
            boolean r14 = r8.A0D     // Catch:{ all -> 0x02a1 }
            r8.A02(r15, r14)     // Catch:{ all -> 0x02a1 }
            int r14 = (int) r3     // Catch:{ all -> 0x02a1 }
            r8.A01 = r14     // Catch:{ all -> 0x02a1 }
            boolean r3 = X.AnonymousClass7TF.A1S(r14, r6)
            r8.A05 = r3     // Catch:{ all -> 0x02a1 }
            X.3wr r3 = r8.A02     // Catch:{ all -> 0x02a1 }
            if (r3 == 0) goto L_0x023f
            java.util.Map r4 = r3.getResponseHeaders()     // Catch:{ all -> 0x02a1 }
            if (r4 == 0) goto L_0x023f
            java.lang.String r3 = "X-FB-Video-Livehead"
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x02a1 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x02a1 }
            if (r3 == 0) goto L_0x023f
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x02a1 }
            if (r3 != 0) goto L_0x023f
            r3 = r16
            r8.A05 = r3     // Catch:{ all -> 0x02a1 }
        L_0x023f:
            r8.A00 = r7     // Catch:{ all -> 0x02a1 }
            int r3 = r8.A01     // Catch:{ all -> 0x02a1 }
            r14 = 1048576(0x100000, float:1.469368E-39)
            if (r3 > r14) goto L_0x024a
            if (r3 < 0) goto L_0x024a
            r14 = r3
        L_0x024a:
            byte[] r6 = new byte[r14]     // Catch:{ all -> 0x02a1 }
            r8.A02 = r13     // Catch:{ all -> 0x02a1 }
            r8.A03 = r6     // Catch:{ all -> 0x02a1 }
            r8.notifyAll()     // Catch:{ all -> 0x02a1 }
            monitor-exit(r8)     // Catch:{ all -> 0x02a1 }
        L_0x0254:
            boolean r3 = r8.A06     // Catch:{ IOException -> 0x02a4 }
            if (r3 == 0) goto L_0x027b
            int r4 = r8.A00     // Catch:{ IOException -> 0x02a4 }
            if (r4 >= r14) goto L_0x027b
            int r3 = r14 - r4
            int r4 = r13.read(r6, r4, r3)     // Catch:{ IOException -> 0x02a4 }
            monitor-enter(r8)     // Catch:{ IOException -> 0x02a4 }
            if (r4 >= 0) goto L_0x0266
            goto L_0x0272
        L_0x0266:
            int r3 = r8.A00     // Catch:{ all -> 0x0278 }
            int r3 = r3 + r4
            r8.A00 = r3     // Catch:{ all -> 0x0278 }
            if (r4 <= 0) goto L_0x0270
            r8.notifyAll()     // Catch:{ all -> 0x0278 }
        L_0x0270:
            monitor-exit(r8)     // Catch:{ all -> 0x0278 }
            goto L_0x0254
        L_0x0272:
            int r3 = r8.A00     // Catch:{ all -> 0x0278 }
            r8.A01 = r3     // Catch:{ all -> 0x0278 }
            monitor-exit(r8)     // Catch:{ all -> 0x0278 }
            goto L_0x027b
        L_0x0278:
            r3 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0278 }
            throw r3     // Catch:{ IOException -> 0x02a4 }
        L_0x027b:
            monitor-enter(r8)     // Catch:{ IOException -> 0x02a4 }
            r8.A06 = r7     // Catch:{ all -> 0x029e }
            int r4 = r8.A01     // Catch:{ all -> 0x029e }
            int r3 = r8.A00     // Catch:{ all -> 0x029e }
            if (r4 != r3) goto L_0x0299
            r13.close()     // Catch:{ IOException -> 0x0287 }
        L_0x0287:
            r8.A02 = r2     // Catch:{ all -> 0x0296 }
            X.28X r6 = r8.A0A     // Catch:{ all -> 0x0296 }
            if (r6 == 0) goto L_0x0294
            byte[] r4 = r8.A03     // Catch:{ all -> 0x0296 }
            int r3 = r8.A01     // Catch:{ all -> 0x0296 }
            r6.A00(r11, r12, r4, r3)     // Catch:{ all -> 0x0296 }
        L_0x0294:
            r13 = r2
            goto L_0x0299
        L_0x0296:
            r3 = move-exception
            r13 = r2
            goto L_0x029f
        L_0x0299:
            r8.notifyAll()     // Catch:{ all -> 0x029e }
            monitor-exit(r8)     // Catch:{ all -> 0x029e }
            goto L_0x02be
        L_0x029e:
            r3 = move-exception
        L_0x029f:
            monitor-exit(r8)     // Catch:{ all -> 0x029e }
            throw r3     // Catch:{ IOException -> 0x02a4 }
        L_0x02a1:
            r3 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x02a1 }
            throw r3     // Catch:{ IOException -> 0x02a4 }
        L_0x02a4:
            r4 = move-exception
            X.3m6 r3 = r8.A01     // Catch:{ IOException -> 0x02cd }
            if (r3 == 0) goto L_0x02ac
            r3.DtY(r4)     // Catch:{ IOException -> 0x02cd }
        L_0x02ac:
            monitor-enter(r8)     // Catch:{ IOException -> 0x02cd }
            r8.A06 = r7     // Catch:{ all -> 0x02c7 }
            r13.close()     // Catch:{ IOException -> 0x02b2 }
        L_0x02b2:
            r8.A02 = r2     // Catch:{ all -> 0x02c7 }
            int r3 = r8.A00     // Catch:{ all -> 0x02c7 }
            if (r3 < 0) goto L_0x02c3
            r8.A04 = r4     // Catch:{ all -> 0x02c7 }
            r8.notifyAll()     // Catch:{ all -> 0x02c7 }
            monitor-exit(r8)     // Catch:{ all -> 0x02c7 }
        L_0x02be:
            r8.A01 = r2     // Catch:{ IOException -> 0x02cd }
            int r3 = r8.A00     // Catch:{ IOException -> 0x02cd }
            goto L_0x02d7
        L_0x02c3:
            r8.notifyAll()     // Catch:{ all -> 0x02c7 }
            throw r4     // Catch:{ all -> 0x02c7 }
        L_0x02c7:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x02c7 }
            goto L_0x02cc
        L_0x02ca:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x02ca }
        L_0x02cc:
            throw r1     // Catch:{ IOException -> 0x02cd }
        L_0x02cd:
            r1 = move-exception
            monitor-enter(r9)     // Catch:{ all -> 0x0308 }
            r9.A01(r10)     // Catch:{ all -> 0x02d4 }
        L_0x02d2:
            monitor-exit(r9)     // Catch:{ all -> 0x02d4 }
            goto L_0x0307
        L_0x02d4:
            r1 = move-exception
            goto L_0x02d2
        L_0x02d6:
            monitor-exit(r9)     // Catch:{ all -> 0x0305 }
        L_0x02d7:
            monitor-exit(r5)     // Catch:{ IOException | RuntimeException -> 0x030e }
            java.lang.Integer r2 = X.AnonymousClass05K.A01     // Catch:{ IOException | RuntimeException -> 0x030e }
            r0.A00(r2)     // Catch:{ IOException | RuntimeException -> 0x030e }
            java.lang.String r6 = "DashLiveSegmentPrefetcher"
            java.lang.String r5 = "[thread=%d] Prefetch is done, fetched: %d, url=%s, cacheKey=%s"
            r2 = r70
            int r2 = r2.A00     // Catch:{ IOException | RuntimeException -> 0x030e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException | RuntimeException -> 0x030e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException | RuntimeException -> 0x030e }
            java.lang.String r2 = r1.A06     // Catch:{ IOException | RuntimeException -> 0x030e }
            if (r2 != 0) goto L_0x02f3
            java.lang.String r2 = "null"
        L_0x02f3:
            r1 = r68
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r3, r1, r2}     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.27B.A01(r6, r5, r1)     // Catch:{ IOException | RuntimeException -> 0x030e }
            X.3wf r1 = r0.A02     // Catch:{ IOException | RuntimeException -> 0x030e }
            if (r1 == 0) goto L_0x0002
            r1.A00()     // Catch:{ IOException | RuntimeException -> 0x030e }
            goto L_0x0002
        L_0x0305:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0305 }
        L_0x0307:
            throw r1     // Catch:{ all -> 0x0308 }
        L_0x0308:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ IOException | RuntimeException -> 0x030e }
            goto L_0x030d
        L_0x030b:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ IOException | RuntimeException -> 0x030e }
        L_0x030d:
            throw r1     // Catch:{ IOException | RuntimeException -> 0x030e }
        L_0x030e:
            r4 = move-exception
            boolean r1 = r4 instanceof X.C2609447q
            if (r1 == 0) goto L_0x0343
            java.lang.String r3 = "DashLiveSegmentPrefetcher"
            java.lang.Object[] r2 = new java.lang.Object[]{r68}
            java.lang.String r1 = "Invalid response happens while fetching %s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            android.util.Log.e(r3, r1, r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0.A00(r1)
            X.47q r4 = (X.C2609447q) r4
            int r1 = r4.A00
            r5 = 410(0x19a, float:5.75E-43)
            if (r1 != r5) goto L_0x0002
            com.facebook.exoplayer.monitor.VpsEventCallback r1 = r0.A03
            if (r1 == 0) goto L_0x0002
            X.3wn r0 = r0.A05
            java.lang.String r3 = r0.A07
            r4 = 0
            r6 = -1
            X.Qdh r2 = new X.Qdh
            r2.<init>(r3, r4, r5, r6, r7)
            r1.callback(r2)
            goto L_0x0002
        L_0x0343:
            int r1 = r0.A00
            int r2 = r1 + -1
            r0.A00 = r2
            if (r2 <= 0) goto L_0x0363
            java.lang.String r3 = "DashLiveSegmentPrefetcher"
            r1 = r68
            java.lang.Object[] r2 = X.C51968G9o.A1Z(r1, r2)
            java.lang.String r1 = "Error happens while fetching %s retry remain: %d"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            android.util.Log.e(r3, r1, r4)
            r1 = r69
            r1.add(r0)
            goto L_0x0002
        L_0x0363:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0.A00(r1)
            java.lang.String r2 = "DashLiveSegmentPrefetcher"
            java.lang.Object[] r1 = new java.lang.Object[]{r68}
            java.lang.String r0 = "Error happens while fetching %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.e(r2, r0, r4)
            goto L_0x0002
        L_0x0379:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22394Y2a.run():void");
    }
}
