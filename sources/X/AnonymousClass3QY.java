package X;

/* renamed from: X.3QY  reason: invalid class name */
public final class AnonymousClass3QY {
    public static AnonymousClass3R2 A00;

    /* JADX WARNING: type inference failed for: r2v4, types: [com.facebook.push.fbns.ipc.FbnsAIDLRequest, com.facebook.push.fbns.ipc.FbnsAIDLResult] */
    /* JADX WARNING: type inference failed for: r0v18, types: [com.facebook.push.fbns.ipc.FbnsAIDLRequest, com.facebook.push.fbns.ipc.FbnsAIDLResult] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized X.AnonymousClass3R2 A00() {
        /*
            java.lang.Class<X.3QY> r8 = X.AnonymousClass3QY.class
            monitor-enter(r8)
            X.3R2 r1 = A00     // Catch:{ all -> 0x00c7 }
            if (r1 != 0) goto L_0x00c5
            android.content.Context r4 = X.C60960kU.A00     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "com.amazon.device.messaging.ADM"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0015 }
            X.OtY r1 = new X.OtY     // Catch:{ ClassNotFoundException -> 0x0015 }
            r1.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x0015 }
            goto L_0x00c3
        L_0x0015:
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x00c7 }
            r0 = 18296440422072656(0x41008400030150, double:1.8915368625644897E-307)
            boolean r0 = X.1AW.A06(r2, r0)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0079
            r0 = 18859390375690259(0x43008400060013, double:2.1140442484927944E-307)
            java.lang.String r1 = X.1AW.A04(r2, r0)     // Catch:{ all -> 0x00c7 }
            r6 = 0
            r2 = 0
            X.3Re r7 = new X.3Re     // Catch:{ all -> 0x00c7 }
            r7.<init>(r4)     // Catch:{ all -> 0x00c7 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x00c7 }
            r5.<init>()     // Catch:{ all -> 0x00c7 }
            X.3RY r0 = X.AnonymousClass3RY.A09     // Catch:{ all -> 0x00c7 }
            r0.A00(r5, r1)     // Catch:{ all -> 0x00c7 }
            X.3RY r1 = X.AnonymousClass3RY.A08     // Catch:{ all -> 0x00c7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00c7 }
            r1.A00(r5, r0)     // Catch:{ all -> 0x00c7 }
            X.3Rg r0 = X.C241803Rg.SET_PREF_BASED_CONFIG     // Catch:{ all -> 0x00c7 }
            int r3 = r0.A00     // Catch:{ all -> 0x00c7 }
            com.facebook.push.fbns.ipc.FbnsAIDLRequest r2 = new com.facebook.push.fbns.ipc.FbnsAIDLRequest     // Catch:{ all -> 0x00c7 }
            r2.<init>((android.os.Bundle) r5)     // Catch:{ all -> 0x00c7 }
            r2.A00 = r3     // Catch:{ all -> 0x00c7 }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x00c7 }
            r1.<init>()     // Catch:{ all -> 0x00c7 }
            X.3RY r0 = X.AnonymousClass3RY.A07     // Catch:{ all -> 0x00c7 }
            r0.A00(r1, r6)     // Catch:{ all -> 0x00c7 }
            com.facebook.push.fbns.ipc.FbnsAIDLRequest r0 = new com.facebook.push.fbns.ipc.FbnsAIDLRequest     // Catch:{ all -> 0x00c7 }
            r0.<init>((android.os.Bundle) r1)     // Catch:{ all -> 0x00c7 }
            r0.A00 = r3     // Catch:{ all -> 0x00c7 }
            r6 = 2
            com.facebook.push.fbns.ipc.FbnsAIDLRequest[] r5 = new com.facebook.push.fbns.ipc.FbnsAIDLRequest[]{r2, r0}     // Catch:{ all -> 0x00c7 }
            r3 = 0
        L_0x0068:
            r2 = r5[r3]     // Catch:{ all -> 0x00c7 }
            java.util.concurrent.ExecutorService r1 = r7.A05     // Catch:{ all -> 0x00c7 }
            X.3Rh r0 = new X.3Rh     // Catch:{ all -> 0x00c7 }
            r0.<init>(r2, r7)     // Catch:{ all -> 0x00c7 }
            r1.submit(r0)     // Catch:{ all -> 0x00c7 }
            int r3 = r3 + 1
            if (r3 >= r6) goto L_0x0079
            goto L_0x0068
        L_0x0079:
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.GoogleApiAvailability.A00     // Catch:{ all -> 0x00c7 }
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r1.A03(r4, r0)     // Catch:{ all -> 0x00c7 }
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "FCMModule.waitForInit"
            X.0lp r3 = X.0lq.A00(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.Class<X.2Qk> r2 = X.C70522Qk.class
            monitor-enter(r2)     // Catch:{ all -> 0x009e }
            java.lang.Object r1 = X.C70522Qk.A01     // Catch:{ all -> 0x009b }
            monitor-exit(r2)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x00aa
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x00aa }
            r1.wait()     // Catch:{ all -> 0x0098 }
            monitor-exit(r1)     // Catch:{ all -> 0x0098 }
            goto L_0x00aa
        L_0x0098:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0098 }
            throw r0     // Catch:{ InterruptedException -> 0x00aa }
        L_0x009b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009b }
            throw r0     // Catch:{ all -> 0x009e }
        L_0x009e:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00a3 }
            goto L_0x00a7
        L_0x00a3:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ all -> 0x00c7 }
        L_0x00a7:
            throw r1     // Catch:{ all -> 0x00c7 }
        L_0x00a8:
            r0 = 0
            goto L_0x00be
        L_0x00aa:
            r3.close()     // Catch:{ all -> 0x00c7 }
            X.C70522Qk.A00()     // Catch:{ all -> 0x00c7 }
            X.2Qi r3 = X.C70522Qk.A00     // Catch:{ all -> 0x00c7 }
            X.0eM r2 = X.C70522Qk.A05     // Catch:{ all -> 0x00c7 }
            X.C70522Qk.A00()     // Catch:{ all -> 0x00c7 }
            X.0eM r1 = X.C70522Qk.A04     // Catch:{ all -> 0x00c7 }
            X.3R1 r0 = new X.3R1     // Catch:{ all -> 0x00c7 }
            r0.<init>(r4, r3, r2, r1)     // Catch:{ all -> 0x00c7 }
        L_0x00be:
            X.3R3 r1 = new X.3R3     // Catch:{ all -> 0x00c7 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x00c7 }
        L_0x00c3:
            A00 = r1     // Catch:{ all -> 0x00c7 }
        L_0x00c5:
            monitor-exit(r8)
            return r1
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QY.A00():X.3R2");
    }
}
