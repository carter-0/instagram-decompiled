package X;

/* renamed from: X.3w1  reason: invalid class name and case insensitive filesystem */
public final class C256593w1 implements Runnable {
    public final /* synthetic */ 2A9 A00;

    public C256593w1(2A9 r1) {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void run() {
        /*
            r7 = this;
        L_0x0000:
            X.2A9 r3 = r7.A00
        L_0x0002:
            java.util.LinkedList r4 = r3.A04
            monitor-enter(r4)
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x0024
            java.util.concurrent.atomic.AtomicInteger r5 = r3.A05     // Catch:{ all -> 0x00ea }
            r5.incrementAndGet()     // Catch:{ all -> 0x00ea }
            r0 = 600000(0x927c0, double:2.964394E-318)
            r4.wait(r0)     // Catch:{ InterruptedException -> 0x0017 }
            goto L_0x0021
        L_0x0017:
            java.lang.String r2 = "TaskQueueExecutor"
            java.lang.String r1 = "killed worker after idle"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x00ea }
            X.27B.A01(r2, r1, r0)     // Catch:{ all -> 0x00ea }
        L_0x0021:
            r5.decrementAndGet()     // Catch:{ all -> 0x00ea }
        L_0x0024:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x002d
            monitor-exit(r4)     // Catch:{ all -> 0x00ea }
            goto L_0x00d9
        L_0x002d:
            monitor-exit(r4)     // Catch:{ all -> 0x00ea }
            monitor-enter(r4)
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x0037
            monitor-exit(r4)     // Catch:{ all -> 0x00e7 }
            goto L_0x0002
        L_0x0037:
            java.util.List r0 = X.C256423vk.A00     // Catch:{ all -> 0x00e7 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x00e7 }
        L_0x003d:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x006e
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x00e7 }
            X.3vk r2 = (X.C256423vk) r2     // Catch:{ all -> 0x00e7 }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x00e7 }
        L_0x004d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x003d
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x00e7 }
            r6.getClass()     // Catch:{ all -> 0x00e7 }
            X.3vt r6 = (X.C256513vt) r6     // Catch:{ all -> 0x00e7 }
            X.3vn r0 = r6.A00     // Catch:{ all -> 0x00e7 }
            X.3vk r0 = r0.Bff()     // Catch:{ all -> 0x00e7 }
            if (r0 != r2) goto L_0x004d
            r1.remove()     // Catch:{ all -> 0x00e7 }
        L_0x0067:
            java.util.HashSet r1 = r3.A03     // Catch:{ all -> 0x00e7 }
            r1.add(r6)     // Catch:{ all -> 0x00e7 }
            monitor-exit(r4)     // Catch:{ all -> 0x00e7 }
            goto L_0x0075
        L_0x006e:
            java.lang.Object r6 = r4.removeFirst()     // Catch:{ all -> 0x00e7 }
            X.3vt r6 = (X.C256513vt) r6     // Catch:{ all -> 0x00e7 }
            goto L_0x0067
        L_0x0075:
            r2 = 0
            if (r6 == 0) goto L_0x00d9
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.getId()
            X.3vn r5 = r6.A00
            r5.APw()     // Catch:{ all -> 0x0091 }
            r5.onComplete()     // Catch:{ all -> 0x0091 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x009b }
            r1.remove(r6)     // Catch:{ all -> 0x008e }
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            goto L_0x0000
        L_0x008e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            goto L_0x009a
        L_0x0091:
            r0 = move-exception
            monitor-enter(r4)     // Catch:{ Exception -> 0x009b }
            r1.remove(r6)     // Catch:{ all -> 0x0098 }
        L_0x0096:
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            goto L_0x009a
        L_0x0098:
            r0 = move-exception
            goto L_0x0096
        L_0x009a:
            throw r0     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r4 = move-exception
            boolean r0 = r4 instanceof java.io.IOException
            if (r0 == 0) goto L_0x00c5
            java.util.concurrent.atomic.AtomicInteger r1 = r6.A01
            int r0 = r1.decrementAndGet()
            if (r0 < 0) goto L_0x00c5
            X.2A9.A00(r6, r3, r2)
            java.lang.String r3 = "TaskQueueExecutor"
            java.lang.String r2 = "Task failed. Remain retry %d, %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5}
            boolean r0 = X.27B.A00
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = java.lang.String.format(r2, r1)
            android.util.Log.w(r3, r0, r4)
            goto L_0x0000
        L_0x00c0:
            java.lang.String.format(r2, r1)
            goto L_0x0000
        L_0x00c5:
            java.lang.String r2 = "TaskQueueExecutor"
            java.lang.String r1 = "Task failed on fatal error or exceeded retry limit. %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0, r4)
            r5.DED()
            goto L_0x0000
        L_0x00d9:
            java.lang.Object r1 = r3.A02
            monitor-enter(r1)
            int r0 = r3.A00     // Catch:{ all -> 0x00e4 }
            int r0 = r0 + -1
            r3.A00 = r0     // Catch:{ all -> 0x00e4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            return
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            throw r0
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e7 }
            throw r0
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ea }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256593w1.run():void");
    }
}
