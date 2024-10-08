package X;

public final class PSS implements 1aV {
    public final /* synthetic */ long A00;
    public final /* synthetic */ OMX A01;
    public final /* synthetic */ C70723OHs A02;

    public PSS(OMX omx, C70723OHs oHs, long j) {
        this.A01 = omx;
        this.A02 = oHs;
        this.A00 = j;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r10) {
        /*
            r9 = this;
            X.Nj7 r10 = (X.C69306Nj7) r10
            r2 = -1
            if (r10 == 0) goto L_0x006c
            int r1 = r10.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0089
            r0 = 1
            if (r1 == r0) goto L_0x0047
            r0 = 5
            if (r1 == r0) goto L_0x0044
            r0 = 2
            if (r1 == r0) goto L_0x0041
            r0 = 3
            if (r1 == r0) goto L_0x003e
            r0 = 4
            if (r1 != r0) goto L_0x006c
            java.lang.String r5 = "processSyncPathNotification: invalid mailbox"
        L_0x001d:
            X.OMX r0 = r9.A01
            com.instagram.common.session.UserSession r4 = r0.A01
            X.OHs r0 = r9.A02
            com.instagram.common.notifications.push.intf.PushChannelType r1 = com.instagram.common.notifications.push.intf.PushChannelType.SYNC
            X.5HJ r3 = X.C70132Nxm.A00(r4, r0)
            r0 = 3
            X.0qQ.A0B(r1, r0)
            java.lang.String r1 = "sync"
            r0 = 7
            X.C67295MlU.A02(r3, r4, r5, r1, r0)
            X.MYi r0 = X.C66596MYi.A01
            long r7 = r9.A00
            r0.DUd(r7, r2, r5)
        L_0x003a:
            X.OUn r2 = X.OUn.A00
            monitor-enter(r2)
            goto L_0x0077
        L_0x003e:
            java.lang.String r5 = "processSyncPathNotification: mailbox code gen returns null result.value"
            goto L_0x001d
        L_0x0041:
            java.lang.String r5 = "processSyncPathNotification: failed to insert into DB"
            goto L_0x001d
        L_0x0044:
            java.lang.String r5 = "processSyncPathNotification: received processing state from CQL which is unexpected"
            goto L_0x001d
        L_0x0047:
            java.lang.String r5 = "duplicate notification dropped in processSyncPathNotification"
            X.OMX r0 = r9.A01
            com.instagram.common.session.UserSession r4 = r0.A01
            X.OHs r0 = r9.A02
            com.instagram.common.notifications.push.intf.PushChannelType r3 = com.instagram.common.notifications.push.intf.PushChannelType.SYNC
            X.5HJ r2 = X.C70132Nxm.A00(r4, r0)
            java.lang.String r1 = "sync"
            r0 = 6
            X.C67295MlU.A02(r2, r4, r5, r1, r0)
            java.lang.String r0 = "duplicate_dropped"
            X.O1R.A00(r2, r3, r4, r0)
            X.MYi r3 = X.C66596MYi.A01
            long r7 = r9.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            r6 = 1003(0x3eb, float:1.406E-42)
            r3.DUg(r4, r5, r6, r7)
            goto L_0x003a
        L_0x006c:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "processSyncPathNotification: unexpected result, result = "
            java.lang.String r5 = X.AnonymousClass7TG.A0m(r10, r0, r1)
            goto L_0x001d
        L_0x0077:
            java.util.Map r0 = X.OUn.A01     // Catch:{ all -> 0x0085 }
            java.util.Collection r1 = r0.values()     // Catch:{ all -> 0x0085 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0085 }
            r1.remove(r0)     // Catch:{ all -> 0x0085 }
            goto L_0x0088
        L_0x0085:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0088:
            monitor-exit(r2)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PSS.accept(java.lang.Object):void");
    }
}
