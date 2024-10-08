package X;

import java.util.concurrent.Callable;

/* renamed from: X.3Xi  reason: invalid class name and case insensitive filesystem */
public final class C243083Xi implements Callable {
    public final /* synthetic */ C243063Xg A00;

    public C243083Xi(C243063Xg r1) {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r5 = this;
            X.3Xg r4 = r5.A00
            monitor-enter(r4)
            boolean r0 = r4.A06     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x000e
            r0 = 0
            X.3br r2 = new X.3br     // Catch:{ all -> 0x0039 }
            r2.<init>(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0037
        L_0x000e:
            monitor-exit(r4)
            int r3 = r4.A02()
            java.lang.String r2 = r4.A04()
            r0 = 4
            X.MYK r1 = new X.MYK
            r1.<init>(r2, r0)
            java.lang.String r0 = "Litho.TreeFuture.Run"
            X.C243113Xl.A00(r0, r1, r3)
            X.2T6 r1 = r4.A03()
            monitor-enter(r4)
            boolean r0 = r4.A06     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0032
            r0 = 0
            X.3br r2 = new X.3br     // Catch:{ all -> 0x0039 }
            r2.<init>(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0037
        L_0x0032:
            X.3br r2 = new X.3br     // Catch:{ all -> 0x0039 }
            r2.<init>(r1)     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r4)
            return r2
        L_0x0039:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243083Xi.call():java.lang.Object");
    }
}
