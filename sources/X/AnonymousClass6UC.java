package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6UC  reason: invalid class name */
public final class AnonymousClass6UC implements Runnable {
    public int A00;
    public 14r A01;
    public AtomicBoolean A02 = new AtomicBoolean(false);
    public boolean A03;
    public boolean A04;
    public boolean A05;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r8 = this;
            X.14r r0 = r8.A01
            java.util.List r1 = r0.A08
            monitor-enter(r1)
            X.14w[] r7 = r0.A04     // Catch:{ all -> 0x0049 }
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            if (r7 == 0) goto L_0x003e
            int r6 = r7.length
            if (r6 <= 0) goto L_0x003e
            r5 = 0
        L_0x000e:
            r4 = r7[r5]
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0045
            boolean r0 = r8.A05
            boolean r3 = r8.A04
            if (r0 == 0) goto L_0x002e
            if (r3 != 0) goto L_0x0029
            X.14r r2 = r8.A01
            boolean r1 = r8.A03
            int r0 = r8.A00
            r4.onPostRequestBoost(r2, r1, r0)
        L_0x0029:
            int r5 = r5 + 1
            if (r5 >= r6) goto L_0x003e
            goto L_0x000e
        L_0x002e:
            X.14r r2 = r8.A01
            int r1 = r8.A00
            boolean r0 = r8.A03
            if (r3 == 0) goto L_0x003a
            r4.onPreReleaseBoost(r2, r1, r0)
            goto L_0x0029
        L_0x003a:
            r4.onPostReleaseBoost(r2, r1, r0)
            goto L_0x0029
        L_0x003e:
            java.util.Queue r1 = X.14r.A0A
            monitor-enter(r1)
            r1.offer(r8)     // Catch:{ all -> 0x0046 }
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
        L_0x0045:
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            throw r0
        L_0x0049:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6UC.run():void");
    }
}
