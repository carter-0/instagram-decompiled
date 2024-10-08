package X;

import com.facebook.blescan.BleScanOperation;

public final class TB6 implements Runnable {
    public final /* synthetic */ BleScanOperation A00;

    public TB6(BleScanOperation bleScanOperation) {
        this.A00 = bleScanOperation;
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.Object, java.util.Comparator] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x0073=Splitter:B:33:0x0073, B:89:0x00f4=Splitter:B:89:0x00f4} */
    public final void run() {
        /*
            r8 = this;
            com.facebook.blescan.BleScanOperation r3 = r8.A00     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            X.S3S r4 = r3.A01     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            r2 = 2
            r1 = 0
            monitor-enter(r4)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            boolean r0 = r4.A07     // Catch:{ all -> 0x011c }
            if (r0 != 0) goto L_0x0101
            X.T77 r5 = r4.A08     // Catch:{ all -> 0x011c }
            if (r5 == 0) goto L_0x0018
            boolean r0 = X.14i.A09()     // Catch:{ all -> 0x011c }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0018
            goto L_0x0079
        L_0x0018:
            java.util.List r0 = r4.A0A     // Catch:{ all -> 0x011c }
            monitor-enter(r0)     // Catch:{ all -> 0x011c }
            r0.clear()     // Catch:{ all -> 0x00fe }
            monitor-exit(r0)     // Catch:{ all -> 0x00fe }
            r4.A00 = r1     // Catch:{ all -> 0x011c }
            android.bluetooth.BluetoothAdapter r0 = r4.A02     // Catch:{ Exception -> 0x00fc }
            if (r0 == 0) goto L_0x00f4
            android.bluetooth.le.BluetoothLeScanner r0 = r4.A03     // Catch:{ Exception -> 0x00fc }
            if (r0 == 0) goto L_0x00f4
            X.Q5k r0 = r4.A04     // Catch:{ Exception -> 0x00fc }
            if (r0 == 0) goto L_0x0030
            r4.A00()     // Catch:{ Exception -> 0x00fc }
        L_0x0030:
            X.0JR r0 = r4.A06     // Catch:{ Exception -> 0x00fc }
            r0.now()     // Catch:{ Exception -> 0x00fc }
            r7 = 0
            X.Q5k r0 = new X.Q5k     // Catch:{ Exception -> 0x00fc }
            r0.<init>(r4)     // Catch:{ Exception -> 0x00fc }
            r4.A04 = r0     // Catch:{ Exception -> 0x00fc }
            r4.A01 = r2     // Catch:{ Exception -> 0x00fc }
            android.bluetooth.le.ScanSettings$Builder r6 = new android.bluetooth.le.ScanSettings$Builder     // Catch:{ Exception -> 0x00fc }
            r6.<init>()     // Catch:{ Exception -> 0x00fc }
            int r0 = r4.A01     // Catch:{ Exception -> 0x00fc }
            r6.setScanMode(r0)     // Catch:{ Exception -> 0x00fc }
            r0 = 0
            r6.setReportDelay(r0)     // Catch:{ Exception -> 0x00fc }
            android.bluetooth.le.BluetoothLeScanner r2 = r4.A03     // Catch:{ Exception -> 0x00fc }
            android.bluetooth.le.ScanSettings r1 = r6.build()     // Catch:{ Exception -> 0x00fc }
            X.Q5k r0 = r4.A04     // Catch:{ Exception -> 0x00fc }
            X.0fF.A01(r2, r0, r1, r7)     // Catch:{ Exception -> 0x00fc }
            r2 = 1
            r4.A07 = r2     // Catch:{ Exception -> 0x00fc }
            if (r5 == 0) goto L_0x0079
            monitor-enter(r5)     // Catch:{ Exception -> 0x00fc }
            java.util.List r1 = r5.A00     // Catch:{ all -> 0x0075 }
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r4)     // Catch:{ all -> 0x0075 }
            r1.add(r0)     // Catch:{ all -> 0x0075 }
            int r0 = r1.size()     // Catch:{ all -> 0x0075 }
            if (r0 != r2) goto L_0x0073
            X.14i r0 = X.14i.A08     // Catch:{ all -> 0x0075 }
            r0.A0B(r5)     // Catch:{ all -> 0x0075 }
        L_0x0073:
            monitor-exit(r5)     // Catch:{ Exception -> 0x00fc }
            goto L_0x0079
        L_0x0075:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ Exception -> 0x00fc }
            goto L_0x00fb
        L_0x0079:
            monitor-exit(r4)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ Exception -> 0x007f }
        L_0x007f:
            X.S3S r0 = r3.A01     // Catch:{ Exception -> 0x0085 }
            r0.A00()     // Catch:{ Exception -> 0x0085 }
            goto L_0x008d
        L_0x0085:
            r2 = move-exception
            java.lang.String r1 = "com.facebook.blescan.BleScanOperation"
            java.lang.String r0 = "Exception stopping BLE scanning"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
        L_0x008d:
            X.S3S r2 = r3.A01     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            monitor-enter(r2)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            int r0 = r2.A00     // Catch:{ all -> 0x00f1 }
            monitor-exit(r2)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            if (r0 != 0) goto L_0x011f
            X.S3S r4 = r3.A01     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            monitor-enter(r4)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            java.util.List r1 = r4.A0A     // Catch:{ all -> 0x011c }
            monitor-enter(r1)     // Catch:{ all -> 0x011c }
            java.util.ArrayList r2 = X.C51970G9q.A0m(r1)     // Catch:{ all -> 0x00ee }
            r2.addAll(r1)     // Catch:{ all -> 0x00ee }
            monitor-exit(r1)     // Catch:{ all -> 0x00ee }
            monitor-exit(r4)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            int r1 = r2.size()     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            X.S0D r0 = r3.A00     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            int r0 = r0.A00     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            if (r1 <= r0) goto L_0x00c5
            X.TLZ r0 = new X.TLZ     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            r0.<init>()     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            java.util.Collections.sort(r2, r0)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            X.S0D r0 = r3.A00     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            int r1 = r0.A00     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            int r0 = r2.size()     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            java.util.List r0 = r2.subList(r1, r0)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            r0.clear()     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
        L_0x00c5:
            byte[] r0 = X.C11158SCo.A00     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            r1 = 3
            X.0I2 r0 = X.0KC.A01     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            boolean r0 = r0.isLoggable(r1)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r2.isEmpty()     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            if (r0 != 0) goto L_0x00e7
            r2.size()     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
        L_0x00dd:
            boolean r0 = r1.hasNext()     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            if (r0 == 0) goto L_0x00e7
            r1.next()     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            goto L_0x00dd
        L_0x00e7:
            com.facebook.blescan.BleScanOperation.A00(r3)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            r3.A01(r2)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            return
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ee }
            throw r0     // Catch:{ all -> 0x011c }
        L_0x00f1:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            goto L_0x0126
        L_0x00f4:
            java.lang.Integer r0 = X.AnonymousClass05K.A1F     // Catch:{ Exception -> 0x00fc }
            X.RK7 r1 = new X.RK7     // Catch:{ Exception -> 0x00fc }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00fc }
        L_0x00fb:
            throw r1     // Catch:{ Exception -> 0x00fc }
        L_0x00fc:
            r3 = move-exception
            goto L_0x0109
        L_0x00fe:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fe }
            goto L_0x011b
        L_0x0101:
            java.lang.Integer r0 = X.AnonymousClass05K.A15     // Catch:{ all -> 0x011c }
            X.RK7 r1 = new X.RK7     // Catch:{ all -> 0x011c }
            r1.<init>(r0)     // Catch:{ all -> 0x011c }
            goto L_0x011b
        L_0x0109:
            java.lang.Integer r2 = X.AnonymousClass05K.A1F     // Catch:{ all -> 0x011c }
            java.lang.String r1 = "Ble scan error: "
            java.lang.String r0 = "UNKNOWN_ERROR"
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x011c }
            X.RK7 r1 = new X.RK7     // Catch:{ all -> 0x011c }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x011c }
            r2.getClass()     // Catch:{ all -> 0x011c }
        L_0x011b:
            throw r1     // Catch:{ all -> 0x011c }
        L_0x011c:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            goto L_0x0126
        L_0x011f:
            java.lang.Integer r0 = X.AnonymousClass05K.A1F     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            X.RK7 r1 = new X.RK7     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
            r1.<init>(r0)     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
        L_0x0126:
            throw r1     // Catch:{ RK7 -> 0x0137, Exception -> 0x0127 }
        L_0x0127:
            com.facebook.blescan.BleScanOperation r2 = r8.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            X.RK7 r0 = new X.RK7
            r0.<init>(r1)
            com.facebook.blescan.BleScanOperation.A00(r2)
            r2.A02(r0)
            return
        L_0x0137:
            r1 = move-exception
            com.facebook.blescan.BleScanOperation r0 = r8.A00
            com.facebook.blescan.BleScanOperation.A00(r0)
            r0.A02(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TB6.run():void");
    }
}
