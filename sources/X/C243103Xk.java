package X;

/* renamed from: X.3Xk  reason: invalid class name and case insensitive filesystem */
public abstract class C243103Xk {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x015b A[Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0165 A[Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x018f A[Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0194 A[SYNTHETIC, Splitter:B:110:0x0194] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a1 A[Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x013a A[Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }] */
    public static final X.C244853br A00(X.C243063Xg r27, java.lang.Object r28, java.util.List r29, int r30) {
        /*
            r10 = 1
            r9 = r29
            X.0qQ.A0B(r9, r10)
            r2 = 3
            r5 = r28
            X.0qQ.A0B(r5, r2)
            r3 = r30
            if (r30 == 0) goto L_0x001a
            r0 = 2
            if (r3 == r0) goto L_0x001a
            r0 = 4
            if (r3 == r0) goto L_0x001a
            r0 = 6
            r6 = 0
            if (r3 != r0) goto L_0x001b
        L_0x001a:
            r6 = 1
        L_0x001b:
            monitor-enter(r5)
            java.util.Iterator r11 = r9.iterator()     // Catch:{ all -> 0x0380 }
        L_0x0020:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0380 }
            r4 = r27
            if (r0 == 0) goto L_0x008a
            java.lang.Object r8 = r11.next()     // Catch:{ all -> 0x0380 }
            X.3Xg r8 = (X.C243063Xg) r8     // Catch:{ all -> 0x0380 }
            boolean r0 = r8.A06     // Catch:{ all -> 0x0380 }
            if (r0 != 0) goto L_0x0020
            boolean r0 = r8 instanceof X.C243053Xf     // Catch:{ all -> 0x0380 }
            if (r0 == 0) goto L_0x0064
            r7 = r8
            X.3Xf r7 = (X.C243053Xf) r7     // Catch:{ all -> 0x0380 }
            boolean r0 = r4 instanceof X.C243053Xf     // Catch:{ all -> 0x0380 }
            if (r0 == 0) goto L_0x0020
            X.3mp r0 = r7.A04     // Catch:{ all -> 0x0380 }
            int r1 = r0.A00     // Catch:{ all -> 0x0380 }
            X.3Xf r4 = (X.C243053Xf) r4     // Catch:{ all -> 0x0380 }
            X.3mp r0 = r4.A04     // Catch:{ all -> 0x0380 }
            int r0 = r0.A00     // Catch:{ all -> 0x0380 }
            if (r1 != r0) goto L_0x0020
            X.2V1 r0 = r7.A05     // Catch:{ all -> 0x0380 }
            X.2VJ r1 = r0.A07     // Catch:{ all -> 0x0380 }
            X.2V1 r0 = r4.A05     // Catch:{ all -> 0x0380 }
            X.2VJ r0 = r0.A07     // Catch:{ all -> 0x0380 }
            if (r1 != r0) goto L_0x0020
            boolean r0 = r7.A09     // Catch:{ all -> 0x0380 }
            if (r0 != 0) goto L_0x0083
            int r1 = r7.A03     // Catch:{ all -> 0x0380 }
            int r0 = r4.A03     // Catch:{ all -> 0x0380 }
            if (r1 != r0) goto L_0x0020
            int r1 = r7.A02     // Catch:{ all -> 0x0380 }
            int r0 = r4.A02     // Catch:{ all -> 0x0380 }
            if (r1 == r0) goto L_0x0083
            goto L_0x0020
        L_0x0064:
            r7 = r8
            X.3bs r7 = (X.C244863bs) r7     // Catch:{ all -> 0x0380 }
            boolean r0 = r4 instanceof X.C244863bs     // Catch:{ all -> 0x0380 }
            if (r0 == 0) goto L_0x0020
            int r1 = r7.A04     // Catch:{ all -> 0x0380 }
            X.3bs r4 = (X.C244863bs) r4     // Catch:{ all -> 0x0380 }
            int r0 = r4.A04     // Catch:{ all -> 0x0380 }
            if (r1 != r0) goto L_0x0020
            int r1 = r7.A00     // Catch:{ all -> 0x0380 }
            int r0 = r4.A00     // Catch:{ all -> 0x0380 }
            if (r1 != r0) goto L_0x0020
            X.3bq r1 = r7.A07     // Catch:{ all -> 0x0380 }
            X.3bq r0 = r4.A07     // Catch:{ all -> 0x0380 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0380 }
            if (r0 == 0) goto L_0x0020
        L_0x0083:
            boolean r0 = r8.A06(r6)     // Catch:{ all -> 0x0380 }
            if (r0 == 0) goto L_0x0020
            goto L_0x0094
        L_0x008a:
            r8 = r4
            boolean r0 = r4.A06(r6)     // Catch:{ all -> 0x0380 }
            if (r0 == 0) goto L_0x0370
            r9.add(r4)     // Catch:{ all -> 0x0380 }
        L_0x0094:
            monitor-exit(r5)
            int r4 = android.os.Process.myTid()
            java.util.concurrent.atomic.AtomicInteger r1 = r8.A03
            r0 = -1
            boolean r0 = r1.compareAndSet(r0, r4)
            if (r0 == 0) goto L_0x00a7
            java.util.concurrent.RunnableFuture r0 = r8.A00
            r0.run()
        L_0x00a7:
            int r12 = r1.get()
            r13 = 0
            if (r12 == r4) goto L_0x00af
            r13 = 1
        L_0x00af:
            java.util.concurrent.RunnableFuture r7 = r8.A00
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L_0x00d4
            if (r13 == 0) goto L_0x00d4
            r1 = 1
            boolean r0 = X.AnonymousClass2VL.A01()
            if (r0 != 0) goto L_0x00d5
            if (r30 == 0) goto L_0x00d5
            r0 = 2
            if (r3 == r0) goto L_0x00d5
            r0 = 4
            if (r3 == r0) goto L_0x00d5
            r0 = 6
            if (r3 == r0) goto L_0x00d5
            r0 = 0
            X.3br r3 = new X.3br
            r3.<init>(r0)
        L_0x00d1:
            monitor-enter(r5)
            goto L_0x02b7
        L_0x00d4:
            r1 = 0
        L_0x00d5:
            boolean r0 = X.AnonymousClass2VL.A01()
            if (r0 == 0) goto L_0x011d
            if (r1 == 0) goto L_0x011d
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x0100
            java.util.concurrent.atomic.AtomicInteger r3 = r8.A01
            int r1 = r3.get()
            r0 = 0
            if (r1 == 0) goto L_0x010e
            r0 = 2
            if (r1 == r0) goto L_0x0100
        L_0x00ed:
            int r6 = r8.A02()
            java.lang.String r3 = r8.A04()
            r0 = 2
            X.MYK r1 = new X.MYK
            r1.<init>(r3, r0)
            java.lang.String r0 = "Litho.TreeFuture.Interrupt"
            X.C243113Xl.A00(r0, r1, r6)
        L_0x0100:
            r0 = -4
            int r11 = android.os.Process.getThreadPriority(r12)
        L_0x0105:
            if (r0 >= r11) goto L_0x011b
            android.os.Process.setThreadPriority(r12, r0)     // Catch:{ SecurityException -> 0x010b }
            goto L_0x011b
        L_0x010b:
            int r0 = r0 + 1
            goto L_0x0105
        L_0x010e:
            boolean r0 = r3.compareAndSet(r0, r10)
            if (r0 != 0) goto L_0x00ed
            int r0 = r3.get()
            if (r0 != r10) goto L_0x0100
            goto L_0x00ed
        L_0x011b:
            r14 = 1
            goto L_0x011f
        L_0x011d:
            r11 = 0
            r14 = 0
        L_0x011f:
            if (r13 == 0) goto L_0x0136
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r0 = r0.isTracing()
            r19 = 1
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = "get"
            X.C243063Xg.A01(r8, r0)     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            java.lang.String r0 = "wait"
            X.C243063Xg.A01(r8, r0)     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            goto L_0x0138
        L_0x0136:
            r19 = 0
        L_0x0138:
            if (r12 == r4) goto L_0x014d
            int r6 = r8.A02()     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            java.lang.String r3 = r8.A04()     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            r0 = 0
            X.MYN r1 = new X.MYN     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            r1.<init>(r12, r3, r0)     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            java.lang.String r0 = "Litho.TreeFuture.Wait"
            X.C243113Xl.A00(r0, r1, r6)     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
        L_0x014d:
            java.lang.Object r3 = r7.get()     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            X.0qQ.A07(r3)     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            r0 = r3
            X.3br r0 = (X.C244853br) r0     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            X.2T6 r7 = r0.A00     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            if (r7 == 0) goto L_0x0162
            boolean r0 = r7.CYv()     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            r13 = 1
            if (r0 == r10) goto L_0x0163
        L_0x0162:
            r13 = 0
        L_0x0163:
            if (r12 != r4) goto L_0x018d
            if (r13 == 0) goto L_0x017a
            int r4 = r8.A02()     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            java.lang.String r0 = r8.A04()     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            X.MYK r1 = new X.MYK     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            r1.<init>(r0, r10)     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            java.lang.String r0 = "Litho.TreeFuture.GetPartial"
            X.C243113Xl.A00(r0, r1, r4)     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            goto L_0x018d
        L_0x017a:
            int r6 = r8.A02()     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            java.lang.String r4 = r8.A04()     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            r0 = 0
            X.MYK r1 = new X.MYK     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            r1.<init>(r4, r0)     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            java.lang.String r0 = "Litho.TreeFuture.Get"
            X.C243113Xl.A00(r0, r1, r6)     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
        L_0x018d:
            if (r19 == 0) goto L_0x0192
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
        L_0x0192:
            if (r14 == 0) goto L_0x0197
            android.os.Process.setThreadPriority(r12, r11)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0197 }
        L_0x0197:
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A01     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            int r0 = r0.get()     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            if (r0 != r10) goto L_0x02a1
            if (r13 == 0) goto L_0x02a1
            boolean r0 = X.AnonymousClass2VL.A01()     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            r18 = 0
            if (r0 == 0) goto L_0x029a
            int r6 = r8.A02()     // Catch:{ all -> 0x0319 }
            java.lang.String r4 = r8.A04()     // Catch:{ all -> 0x0319 }
            X.MYK r1 = new X.MYK     // Catch:{ all -> 0x0319 }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0319 }
            java.lang.String r0 = "Litho.TreeFuture.Resume"
            X.C243113Xl.A00(r0, r1, r6)     // Catch:{ all -> 0x0319 }
            r11 = r8
            boolean r0 = r8 instanceof X.C243053Xf     // Catch:{ all -> 0x0319 }
            if (r0 == 0) goto L_0x0311
            X.3Xf r11 = (X.C243053Xf) r11     // Catch:{ all -> 0x0319 }
            X.3bq r7 = (X.C244843bq) r7     // Catch:{ all -> 0x0319 }
            java.lang.String r3 = "Litho.ComponentTree.Resume"
            java.lang.Integer r17 = X.2SN.A01(r3)     // Catch:{ all -> 0x0319 }
            if (r17 == 0) goto L_0x01dd
            int r2 = r17.intValue()     // Catch:{ all -> 0x0319 }
            int r0 = r11.A00     // Catch:{ all -> 0x0319 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0319 }
            java.util.HashMap r0 = X.C243053Xf.A00(r11)     // Catch:{ all -> 0x0319 }
            X.2SN.A05(r3, r1, r0, r2)     // Catch:{ all -> 0x0319 }
        L_0x01dd:
            if (r7 == 0) goto L_0x02f2
            java.lang.String r3 = r11.A08     // Catch:{ all -> 0x0302 }
            r2 = 0
            java.util.concurrent.atomic.AtomicLong r11 = X.C243133Xn.A08     // Catch:{ all -> 0x0302 }
            r0 = 1
            r11.addAndGet(r0)     // Catch:{ all -> 0x0302 }
            X.2V1 r0 = r7.A02     // Catch:{ all -> 0x0302 }
            r22 = r0
            X.3mp r0 = r7.A01     // Catch:{ all -> 0x0302 }
            r21 = r0
            int r0 = r7.A00     // Catch:{ all -> 0x0302 }
            r20 = r0
            boolean r0 = r7.A09     // Catch:{ all -> 0x0302 }
            if (r0 == 0) goto L_0x02ea
            X.2TR r14 = r7.A03     // Catch:{ all -> 0x0302 }
            if (r14 == 0) goto L_0x02e2
            X.3Xz r13 = r7.A04     // Catch:{ all -> 0x0302 }
            if (r13 == 0) goto L_0x02fa
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00     // Catch:{ all -> 0x0302 }
            boolean r16 = r0.isTracing()     // Catch:{ all -> 0x0302 }
            if (r16 == 0) goto L_0x0221
            if (r3 == 0) goto L_0x0214
            java.lang.String r0 = "extra:"
            java.lang.String r0 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x02d6 }
            com.facebook.litho.ComponentsSystrace.A02(r0)     // Catch:{ all -> 0x02d6 }
        L_0x0214:
            java.lang.String r1 = "resume:"
            java.lang.String r0 = r21.A0J()     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x02d6 }
            com.facebook.litho.ComponentsSystrace.A02(r0)     // Catch:{ all -> 0x02d6 }
        L_0x0221:
            X.3XI r12 = r7.A06     // Catch:{ all -> 0x02d6 }
            X.2VC r11 = r12.A05     // Catch:{ all -> 0x02d6 }
            X.2V6 r1 = r11.A00     // Catch:{ all -> 0x02d6 }
            monitor-enter(r1)     // Catch:{ all -> 0x02d6 }
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x02cf }
            r0.add(r11)     // Catch:{ all -> 0x02cf }
            monitor-exit(r1)     // Catch:{ all -> 0x02d6 }
            r0 = r22
            java.lang.ThreadLocal r15 = r0.A0E     // Catch:{ all -> 0x02d6 }
            java.lang.Object r0 = r15.get()     // Catch:{ all -> 0x02d6 }
            X.2VG r0 = (X.2VG) r0     // Catch:{ all -> 0x02d6 }
            r15.set(r13)     // Catch:{ all -> 0x02cd }
            X.AnonymousClass3Y0.A06(r14, r13)     // Catch:{ all -> 0x02cd }
            r15.set(r0)     // Catch:{ all -> 0x02d6 }
            X.3bl r26 = X.AnonymousClass3Y0.A05(r14)     // Catch:{ all -> 0x02d6 }
            X.3Xp r0 = r13.A08     // Catch:{ all -> 0x02d6 }
            r0.A00 = r10     // Catch:{ all -> 0x02d6 }
            java.util.List r10 = r13.A01     // Catch:{ all -> 0x02d6 }
            r1.A00(r11)     // Catch:{ all -> 0x02d6 }
            java.util.concurrent.atomic.AtomicReference r1 = r7.A08     // Catch:{ all -> 0x02d6 }
            X.3Xp r0 = X.C243153Xp.A04     // Catch:{ all -> 0x02d6 }
            java.lang.Object r0 = r1.getAndSet(r0)     // Catch:{ all -> 0x02d6 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x02d6 }
            X.3Xp r0 = (X.C243153Xp) r0     // Catch:{ all -> 0x02d6 }
            X.3bq r7 = new X.3bq     // Catch:{ all -> 0x02d6 }
            r23 = r14
            r24 = r0
            r25 = r18
            r27 = r12
            r28 = r10
            r29 = r20
            r30 = r2
            r20 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x02d6 }
            if (r16 == 0) goto L_0x027a
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ all -> 0x0302 }
            if (r3 == 0) goto L_0x027a
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ all -> 0x0302 }
        L_0x027a:
            if (r17 == 0) goto L_0x0287
            int r1 = r17.intValue()     // Catch:{ all -> 0x0319 }
            X.0sm r0 = X.0Yt.A0E()     // Catch:{ all -> 0x0319 }
            X.2SN.A03(r1, r0)     // Catch:{ all -> 0x0319 }
        L_0x0287:
            X.0qQ.A0B(r7, r2)     // Catch:{ all -> 0x0319 }
            X.3br r3 = new X.3br     // Catch:{ all -> 0x0319 }
            r3.<init>(r7)     // Catch:{ all -> 0x0319 }
            X.MYK r1 = new X.MYK     // Catch:{ all -> 0x0319 }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0319 }
            java.lang.String r0 = "Litho.TreeFuture.Get"
            X.C243113Xl.A00(r0, r1, r6)     // Catch:{ all -> 0x0319 }
            goto L_0x02a1
        L_0x029a:
            X.3br r3 = new X.3br     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
            r0 = r18
            r3.<init>(r0)     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
        L_0x02a1:
            if (r19 == 0) goto L_0x02a6
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x02a6:
            monitor-enter(r8)
            boolean r0 = r8.A06     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x02b2
            r0 = 0
            X.3br r3 = new X.3br     // Catch:{ all -> 0x031d }
            r3.<init>(r0)     // Catch:{ all -> 0x031d }
            goto L_0x02b4
        L_0x02b2:
            X.3br r3 = (X.C244853br) r3     // Catch:{ all -> 0x031d }
        L_0x02b4:
            monitor-exit(r8)
            goto L_0x00d1
        L_0x02b7:
            java.util.concurrent.atomic.AtomicInteger r1 = r8.A02     // Catch:{ all -> 0x0380 }
            int r0 = r1.decrementAndGet()     // Catch:{ all -> 0x0380 }
            if (r0 < 0) goto L_0x0378
            int r0 = r1.get()     // Catch:{ all -> 0x0380 }
            if (r0 != 0) goto L_0x02cb
            r8.A05()     // Catch:{ all -> 0x0380 }
            r9.remove(r8)     // Catch:{ all -> 0x0380 }
        L_0x02cb:
            monitor-exit(r5)
            return r3
        L_0x02cd:
            r2 = move-exception
            goto L_0x02d2
        L_0x02cf:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02d6 }
            goto L_0x02d5
        L_0x02d2:
            r15.set(r0)     // Catch:{ all -> 0x02d6 }
        L_0x02d5:
            throw r2     // Catch:{ all -> 0x02d6 }
        L_0x02d6:
            r1 = move-exception
            if (r16 == 0) goto L_0x0301
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ all -> 0x0302 }
            if (r3 == 0) goto L_0x0301
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ all -> 0x0302 }
            goto L_0x0301
        L_0x02e2:
            java.lang.String r0 = "Cannot resume a partial result with a null node"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0302 }
            r1.<init>(r0)     // Catch:{ all -> 0x0302 }
            goto L_0x0301
        L_0x02ea:
            java.lang.String r0 = "Cannot resume a non-partial result"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0302 }
            r1.<init>(r0)     // Catch:{ all -> 0x0302 }
            goto L_0x0301
        L_0x02f2:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0302 }
            r1.<init>(r0)     // Catch:{ all -> 0x0302 }
            goto L_0x0301
        L_0x02fa:
            java.lang.String r0 = "RenderStateContext cannot be null during resume"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0302 }
            r1.<init>(r0)     // Catch:{ all -> 0x0302 }
        L_0x0301:
            throw r1     // Catch:{ all -> 0x0302 }
        L_0x0302:
            r2 = move-exception
            if (r17 == 0) goto L_0x0318
            int r1 = r17.intValue()     // Catch:{ all -> 0x0319 }
            X.0sm r0 = X.0Yt.A0E()     // Catch:{ all -> 0x0319 }
            X.2SN.A03(r1, r0)     // Catch:{ all -> 0x0319 }
            goto L_0x0318
        L_0x0311:
            java.lang.String r0 = "LayoutTreeFuture cannot be resumed."
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0319 }
            r2.<init>(r0)     // Catch:{ all -> 0x0319 }
        L_0x0318:
            throw r2     // Catch:{ all -> 0x0319 }
        L_0x0319:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x031b }
        L_0x031b:
            r0 = move-exception
            throw r0     // Catch:{ ExecutionException -> 0x033c, InterruptedException -> 0x0324, CancellationException -> 0x0320 }
        L_0x031d:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0320:
            r1 = move-exception
            if (r19 == 0) goto L_0x0357
            goto L_0x0354
        L_0x0324:
            r1 = move-exception
            if (r19 == 0) goto L_0x032a
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ all -> 0x0369 }
        L_0x032a:
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ all -> 0x0369 }
            boolean r0 = r2 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0369 }
            if (r0 != 0) goto L_0x0368
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0369 }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0369 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0369 }
            goto L_0x0368
        L_0x033c:
            r1 = move-exception
            if (r19 == 0) goto L_0x0342
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ all -> 0x0369 }
        L_0x0342:
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ all -> 0x0369 }
            boolean r0 = r2 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0369 }
            if (r0 != 0) goto L_0x0368
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0369 }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0369 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0369 }
            goto L_0x0368
        L_0x0354:
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ all -> 0x0369 }
        L_0x0357:
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ all -> 0x0369 }
            boolean r0 = r2 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0369 }
            if (r0 != 0) goto L_0x0368
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0369 }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0369 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0369 }
        L_0x0368:
            throw r2     // Catch:{ all -> 0x0369 }
        L_0x0369:
            r0 = move-exception
            if (r19 == 0) goto L_0x036f
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x036f:
            throw r0
        L_0x0370:
            java.lang.String r0 = "Failed to register to tree future"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0380 }
            r1.<init>(r0)     // Catch:{ all -> 0x0380 }
            goto L_0x037f
        L_0x0378:
            java.lang.String r0 = "TreeFuture ref count is below 0"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0380 }
            r1.<init>(r0)     // Catch:{ all -> 0x0380 }
        L_0x037f:
            throw r1     // Catch:{ all -> 0x0380 }
        L_0x0380:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243103Xk.A00(X.3Xg, java.lang.Object, java.util.List, int):X.3br");
    }
}
