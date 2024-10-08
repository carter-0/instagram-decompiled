package X;

import android.os.ConditionVariable;

public final class TR7 extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C7939Qdc A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TR7(ConditionVariable conditionVariable, C7939Qdc qdc) {
        super("ExoPlayer:SimpleCacheInit");
        this.A01 = qdc;
        this.A00 = conditionVariable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: int} */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.io.IOException] */
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
    /* JADX WARNING: Multi-variable type inference failed */
    public final void run() {
        /*
            r9 = this;
            X.Qdc r3 = r9.A01
            monitor-enter(r3)
            android.os.ConditionVariable r0 = r9.A00     // Catch:{ all -> 0x011c }
            r0.open()     // Catch:{ all -> 0x011c }
            java.lang.String r0 = "VPS-SimpleCacheV2Init"
            X.27d.A01(r0)     // Catch:{ all -> 0x0117 }
            java.io.File r5 = r3.A09     // Catch:{ all -> 0x0117 }
            boolean r0 = r5.exists()     // Catch:{ all -> 0x0117 }
            if (r0 != 0) goto L_0x001c
            X.C7939Qdc.A04(r5)     // Catch:{ 5HZ -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r1 = move-exception
            goto L_0x0103
        L_0x001c:
            java.io.File[] r6 = r5.listFiles()     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = "SimpleCacheV2"
            if (r6 != 0) goto L_0x0026
            goto L_0x00f1
        L_0x0026:
            int r8 = r6.length     // Catch:{ all -> 0x0117 }
            r7 = 0
        L_0x0028:
            if (r7 >= r8) goto L_0x0062
            r2 = r6[r7]     // Catch:{ all -> 0x0117 }
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = ".uid"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x0059
            r0 = 46
            int r0 = r1.indexOf(r0)     // Catch:{ NumberFormatException -> 0x0049 }
            java.lang.String r1 = X.Pxe.A0x(r1, r0)     // Catch:{ NumberFormatException -> 0x0049 }
            r0 = 16
            long r7 = java.lang.Long.parseLong(r1, r0)     // Catch:{ NumberFormatException -> 0x0049 }
            goto L_0x005c
        L_0x0049:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "Malformed UID file: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)     // Catch:{ all -> 0x0117 }
            X.0KC.A0C(r4, r0)     // Catch:{ all -> 0x0117 }
            r2.delete()     // Catch:{ all -> 0x0117 }
        L_0x0059:
            int r7 = r7 + 1
            goto L_0x0028
        L_0x005c:
            r1 = -1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0099
        L_0x0062:
            java.security.SecureRandom r0 = new java.security.SecureRandom     // Catch:{ IOException -> 0x00dd }
            r0.<init>()     // Catch:{ IOException -> 0x00dd }
            long r7 = r0.nextLong()     // Catch:{ IOException -> 0x00dd }
            r1 = -9223372036854775808
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0074
            r0 = 0
            goto L_0x0078
        L_0x0074:
            long r0 = java.lang.Math.abs(r7)     // Catch:{ IOException -> 0x00dd }
        L_0x0078:
            r2 = 16
            java.lang.String r1 = java.lang.Long.toString(r0, r2)     // Catch:{ IOException -> 0x00dd }
            java.lang.String r0 = ".uid"
            java.io.File r2 = X.Pxf.A0U(r1, r0, r5)     // Catch:{ IOException -> 0x00dd }
            boolean r0 = r2.createNewFile()     // Catch:{ IOException -> 0x00dd }
            if (r0 != 0) goto L_0x0099
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x00dd }
            java.lang.String r0 = "Failed to create UID file: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)     // Catch:{ IOException -> 0x00dd }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException -> 0x00dd }
            throw r0     // Catch:{ IOException -> 0x00dd }
        L_0x0099:
            X.SJa r2 = r3.A08     // Catch:{ IOException -> 0x00c9 }
            r2.A02()     // Catch:{ IOException -> 0x00c9 }
            r0 = 1
            X.C7939Qdc.A01(r3, r5, r6, r0)     // Catch:{ IOException -> 0x00c9 }
            java.util.HashMap r0 = r2.A03     // Catch:{ all -> 0x0117 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0117 }
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.A03(r0)     // Catch:{ all -> 0x0117 }
            X.3kO r1 = r0.iterator()     // Catch:{ all -> 0x0117 }
        L_0x00b0:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)     // Catch:{ all -> 0x0117 }
            r2.A04(r0)     // Catch:{ all -> 0x0117 }
            goto L_0x00b0
        L_0x00be:
            r2.A03()     // Catch:{ IOException -> 0x00c2 }
            goto L_0x0105
        L_0x00c2:
            r1 = move-exception
            java.lang.String r0 = "Storing index file failed"
            X.0KC.A0F(r4, r0, r1)     // Catch:{ all -> 0x0117 }
            goto L_0x0105
        L_0x00c9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "Failed to initialize cache indices: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r1)     // Catch:{ all -> 0x0117 }
            X.0KC.A0F(r4, r0, r2)     // Catch:{ all -> 0x0117 }
            X.5HZ r1 = new X.5HZ     // Catch:{ all -> 0x0117 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0117 }
            goto L_0x0103
        L_0x00dd:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "Failed to create cache UID: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r1)     // Catch:{ all -> 0x0117 }
            X.0KC.A0F(r4, r0, r2)     // Catch:{ all -> 0x0117 }
            X.5HZ r1 = new X.5HZ     // Catch:{ all -> 0x0117 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0117 }
            goto L_0x0103
        L_0x00f1:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "Failed to list cache directory files: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r1)     // Catch:{ all -> 0x0117 }
            X.0KC.A0C(r4, r0)     // Catch:{ all -> 0x0117 }
            X.5HZ r1 = new X.5HZ     // Catch:{ all -> 0x0117 }
            r1.<init>(r0)     // Catch:{ all -> 0x0117 }
        L_0x0103:
            r3.A00 = r1     // Catch:{ all -> 0x0117 }
        L_0x0105:
            X.27d.A00()     // Catch:{ all -> 0x011c }
            java.lang.Object r1 = r3.A0A     // Catch:{ all -> 0x011c }
            monitor-enter(r1)     // Catch:{ all -> 0x011c }
            r0 = 1
            r3.A01 = r0     // Catch:{ all -> 0x0114 }
            r1.notifyAll()     // Catch:{ all -> 0x0114 }
            monitor-exit(r1)     // Catch:{ all -> 0x0114 }
            monitor-exit(r3)     // Catch:{ all -> 0x011c }
            return
        L_0x0114:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0114 }
            goto L_0x011b
        L_0x0117:
            r0 = move-exception
            X.27d.A00()     // Catch:{ all -> 0x011c }
        L_0x011b:
            throw r0     // Catch:{ all -> 0x011c }
        L_0x011c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x011c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TR7.run():void");
    }
}
