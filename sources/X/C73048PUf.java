package X;

/* renamed from: X.PUf  reason: case insensitive filesystem */
public final class C73048PUf implements Runnable {
    public final /* synthetic */ C292835jb A00;

    public C73048PUf(C292835jb r1) {
        this.A00 = r1;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r23 = this;
            r0 = r23
            X.5jb r7 = r0.A00
            r6 = 2
            r10 = 4
            r5 = 43253761(0x2940001, float:2.1746648E-37)
            r4 = 0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r8 = r7.A05     // Catch:{ all -> 0x015a }
            r8.markerStart(r5)     // Catch:{ all -> 0x015a }
            X.0JN r9 = r7.A04     // Catch:{ all -> 0x015a }
            long r0 = r9.A05()     // Catch:{ all -> 0x015a }
            long r2 = r7.A00     // Catch:{ all -> 0x015a }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x001f
            r8.markerEnd(r5, r10)
            return
        L_0x001f:
            r4 = 1
            r7.A00 = r0     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "last_available_space_changed"
            r8.markerPoint(r5, r0)     // Catch:{ all -> 0x015a }
            long r2 = r7.A00     // Catch:{ all -> 0x015a }
            java.util.HashSet r12 = X.AnonymousClass7TE.A1F()     // Catch:{ all -> 0x015a }
            java.util.Map r1 = r7.A07     // Catch:{ all -> 0x015a }
            monitor-enter(r1)     // Catch:{ all -> 0x015a }
            java.util.Set r0 = r1.keySet()     // Catch:{ all -> 0x0157 }
            r12.addAll(r0)     // Catch:{ all -> 0x0157 }
            monitor-exit(r1)     // Catch:{ all -> 0x0157 }
            java.lang.String r10 = "notify_updates"
            java.lang.String r1 = "listener_count:"
            int r0 = r12.size()     // Catch:{ all -> 0x015a }
            java.lang.String r0 = X.002.A0O(r1, r0)     // Catch:{ all -> 0x015a }
            r8.markerPoint(r5, r10, r0)     // Catch:{ all -> 0x015a }
            r11 = 0
            java.util.Iterator r22 = r12.iterator()     // Catch:{ all -> 0x015a }
        L_0x004c:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x0125
            java.lang.Object r13 = r22.next()     // Catch:{ all -> 0x015a }
            X.1Ld r13 = (X.1Ld) r13     // Catch:{ all -> 0x015a }
            r12 = 43253764(0x2940004, float:2.1746654E-37)
            r10 = 3
            com.facebook.quicklog.LightweightQuickPerformanceLogger r15 = r13.A05     // Catch:{ all -> 0x0114 }
            r15.markerStart(r12)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "available_space"
            r15.markerAnnotate(r12, r0, r2)     // Catch:{ all -> 0x0114 }
            java.util.WeakHashMap r1 = r13.A06     // Catch:{ all -> 0x0114 }
            monitor-enter(r1)     // Catch:{ all -> 0x0114 }
            java.lang.String r14 = "listener_count"
            int r0 = r1.size()     // Catch:{ all -> 0x010e }
            r15.markerAnnotate(r12, r14, r0)     // Catch:{ all -> 0x010e }
            monitor-exit(r1)     // Catch:{ all -> 0x010e }
            monitor-enter(r13)     // Catch:{ all -> 0x0114 }
            X.Nsm r0 = r13.A00     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x0079
            goto L_0x007d
        L_0x0079:
            r16 = 419430400(0x19000000, double:2.072261515E-315)
            goto L_0x0080
        L_0x007d:
            r16 = 100000000(0x5f5e100, double:4.94065646E-316)
        L_0x0080:
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e7
            java.util.HashSet r1 = r13.A02()     // Catch:{ all -> 0x0111 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x0091
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x00e9
        L_0x0091:
            long r20 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0111 }
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r20 = r20 / r16
            X.Nsm r0 = r13.A00     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x009f
            goto L_0x00a3
        L_0x009f:
            r16 = 5242880(0x500000, double:2.590327E-317)
            goto L_0x00a6
        L_0x00a3:
            r16 = 25000000(0x17d7840, double:1.2351641E-316)
        L_0x00a6:
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c7
            java.util.concurrent.atomic.AtomicLong r0 = r13.A02     // Catch:{ all -> 0x0111 }
            long r16 = r0.get()     // Catch:{ all -> 0x0111 }
            long r18 = r20 - r16
            X.Nsm r0 = r13.A00     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            r16 = 300000(0x493e0, double:1.482197E-318)
            goto L_0x00be
        L_0x00bb:
            r16 = 43200000(0x2932e00, double:2.1343636E-316)
        L_0x00be:
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c7
            r13.A04(r1)     // Catch:{ all -> 0x0111 }
            r1 = 1
            goto L_0x00e9
        L_0x00c7:
            java.util.concurrent.atomic.AtomicLong r0 = r13.A01     // Catch:{ all -> 0x0111 }
            long r16 = r0.get()     // Catch:{ all -> 0x0111 }
            long r20 = r20 - r16
            X.Nsm r0 = r13.A00     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x00d4
            goto L_0x00d8
        L_0x00d4:
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x00db
        L_0x00d8:
            r16 = 43200000(0x2932e00, double:2.1343636E-316)
        L_0x00db:
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e4
            r13.A03(r1)     // Catch:{ all -> 0x0111 }
            r1 = 2
            goto L_0x00e9
        L_0x00e4:
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x00e9
        L_0x00e7:
            r1 = 101(0x65, float:1.42E-43)
        L_0x00e9:
            monitor-exit(r13)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "trim_action"
            r15.markerAnnotate(r12, r0, r1)     // Catch:{ all -> 0x0114 }
            r0 = 100
            r10 = 2
            if (r1 <= r0) goto L_0x00f8
            r10 = 105(0x69, float:1.47E-43)
            r0 = r2
            goto L_0x0101
        L_0x00f8:
            X.0JN r0 = r13.A04     // Catch:{ all -> 0x0114 }
            r0.A07()     // Catch:{ all -> 0x0114 }
            long r0 = r0.A05()     // Catch:{ all -> 0x0114 }
        L_0x0101:
            java.lang.String r14 = "available_space_change"
            long r0 = r0 - r2
            r15.markerAnnotate(r12, r14, r0)     // Catch:{ all -> 0x0114 }
            r15.markerEnd(r12, r10)     // Catch:{ Exception -> 0x011b }
            int r11 = r11 + 1
            goto L_0x004c
        L_0x010e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x010e }
            goto L_0x0113
        L_0x0111:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0114 }
        L_0x0113:
            throw r0     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r1 = move-exception
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r13.A05     // Catch:{ Exception -> 0x011b }
            r0.markerEnd(r12, r10)     // Catch:{ Exception -> 0x011b }
            throw r1     // Catch:{ Exception -> 0x011b }
        L_0x011b:
            r10 = move-exception
            X.0Gb r1 = r7.A03     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "StorageResourceMonitor onAvailableSpaceChanged"
            r1.Ew3(r0, r10)     // Catch:{ all -> 0x015a }
            goto L_0x004c
        L_0x0125:
            java.lang.String r1 = "notify_updates_completed"
            java.lang.String r0 = "success_count:"
            java.lang.String r0 = X.002.A0O(r0, r11)     // Catch:{ all -> 0x015a }
            r8.markerPoint(r5, r1, r0)     // Catch:{ all -> 0x015a }
            long r0 = r7.A01     // Catch:{ all -> 0x015a }
            r10 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0153
            boolean r0 = r9.A09()     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x0153
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A09     // Catch:{ all -> 0x015a }
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r4)     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x0153
            X.0nO r1 = X.0nY.A00()     // Catch:{ all -> 0x015a }
            X.NRC r0 = new X.NRC     // Catch:{ all -> 0x015a }
            r0.<init>(r7)     // Catch:{ all -> 0x015a }
            r1.ATE(r0)     // Catch:{ all -> 0x015a }
        L_0x0153:
            r8.markerEnd(r5, r6)
            return
        L_0x0157:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x015a }
        L_0x015a:
            r1 = move-exception
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r7.A05
            if (r4 != 0) goto L_0x0160
            r6 = 4
        L_0x0160:
            r0.markerEnd(r5, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73048PUf.run():void");
    }
}
