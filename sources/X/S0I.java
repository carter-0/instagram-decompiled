package X;

public final class S0I {
    public final X0Q A00;

    public S0I(X0Q x0q) {
        this.A00 = x0q;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A00(java.util.List r11) {
        /*
            r10 = this;
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00b2
            X.X0Q r7 = r10.A00
            X.Q6S r7 = (X.Q6S) r7
            android.database.sqlite.SQLiteDatabase r4 = r7.getWritableDatabase()
            r0 = 1401505260(0x538945ec, float:1.17916723E12)
            X.AnonymousClass0fa.A01(r4, r0)
            java.util.Iterator r9 = r11.iterator()     // Catch:{ all -> 0x00aa }
        L_0x0018:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x00aa }
            X.VUY r8 = (X.VUY) r8     // Catch:{ all -> 0x00aa }
            java.lang.Integer r0 = r8.A00     // Catch:{ all -> 0x00aa }
            int r2 = r0.intValue()     // Catch:{ all -> 0x00aa }
            r0 = 0
            if (r2 == r0) goto L_0x0054
            r0 = 1
            if (r2 == r0) goto L_0x0054
            r0 = 2
            if (r2 != r0) goto L_0x0090
            android.database.sqlite.SQLiteDatabase r6 = r7.getWritableDatabase()     // Catch:{ all -> 0x00aa }
            if (r6 == 0) goto L_0x0018
            java.lang.Object r5 = r7.A00     // Catch:{ all -> 0x00aa }
            monitor-enter(r5)     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "local_contact_id"
            java.lang.String r2 = "= "
            long r0 = r8.A01     // Catch:{ SQLiteException -> 0x0052 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0052 }
            java.lang.String r2 = X.002.A0g(r3, r2, r0)     // Catch:{ SQLiteException -> 0x0052 }
            java.lang.String r1 = "contacts_upload_snapshot"
            r0 = 0
            r6.delete(r1, r2, r0)     // Catch:{ SQLiteException -> 0x0052 }
            monitor-exit(r5)     // Catch:{ all -> 0x008a }
            goto L_0x0018
        L_0x0052:
            monitor-exit(r5)     // Catch:{ all -> 0x008a }
            goto L_0x0018
        L_0x0054:
            android.database.sqlite.SQLiteDatabase r6 = r7.getWritableDatabase()     // Catch:{ all -> 0x00aa }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x00aa }
            r5.<init>()     // Catch:{ all -> 0x00aa }
            java.lang.String r2 = "local_contact_id"
            long r0 = r8.A01     // Catch:{ all -> 0x00aa }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00aa }
            r5.put(r2, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "contact_hash"
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x00aa }
            r5.put(r1, r0)     // Catch:{ all -> 0x00aa }
            if (r6 == 0) goto L_0x0018
            java.lang.Object r3 = r7.A00     // Catch:{ all -> 0x00aa }
            monitor-enter(r3)     // Catch:{ all -> 0x00aa }
            java.lang.String r2 = "contacts_upload_snapshot"
            r1 = 0
            r0 = -176569947(0xfffffffff579c1a5, float:-3.1660388E32)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLiteException -> 0x0088 }
            r6.replaceOrThrow(r2, r1, r5)     // Catch:{ SQLiteException -> 0x0088 }
            r0 = 568650322(0x21e4ea52, float:1.5511905E-18)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLiteException -> 0x0088 }
            monitor-exit(r3)     // Catch:{ all -> 0x008d }
            goto L_0x0018
        L_0x0088:
            monitor-exit(r3)     // Catch:{ all -> 0x008d }
            goto L_0x0018
        L_0x008a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x008a }
            goto L_0x009c
        L_0x008d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x008d }
            goto L_0x009c
        L_0x0090:
            java.lang.String r1 = "Unknown change type "
            int r2 = 3 - r2
            if (r2 == 0) goto L_0x009d
            java.lang.String r0 = "ADD"
        L_0x0098:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)     // Catch:{ all -> 0x00aa }
        L_0x009c:
            throw r0     // Catch:{ all -> 0x00aa }
        L_0x009d:
            java.lang.String r0 = "UNKNOWN"
            goto L_0x0098
        L_0x00a0:
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x00aa }
            r0 = -1464550526(0xffffffffa8b4bb82, float:-2.0065333E-14)
            X.AnonymousClass0fa.A03(r4, r0)
            return
        L_0x00aa:
            r1 = move-exception
            r0 = 1639582680(0x61ba0bd8, float:4.2899348E20)
            X.AnonymousClass0fa.A03(r4, r0)
            throw r1
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S0I.A00(java.util.List):void");
    }
}
