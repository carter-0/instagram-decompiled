package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import java.util.List;

public final class S3S {
    public int A00;
    public int A01;
    public BluetoothAdapter A02;
    public BluetoothLeScanner A03;
    public C7347Q5k A04;
    public AnonymousClass0JP A05;
    public AnonymousClass0JR A06;
    public boolean A07;
    public final T77 A08;
    public final List A09 = Pxe.A1A();
    public final List A0A = AnonymousClass7TE.A1C();

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void A00() {
        /*
            r5 = this;
            monitor-enter(r5)
            X.Q5k r1 = r5.A04     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0087
            r0 = 0
            r4 = 0
            r5.A07 = r0     // Catch:{ Exception -> 0x0078 }
            android.bluetooth.le.BluetoothLeScanner r0 = r5.A03     // Catch:{ Exception -> 0x0078 }
            r0.flushPendingScanResults(r1)     // Catch:{ Exception -> 0x0078 }
            android.bluetooth.le.BluetoothLeScanner r1 = r5.A03     // Catch:{ Exception -> 0x0078 }
            X.Q5k r0 = r5.A04     // Catch:{ Exception -> 0x0078 }
            X.0fF.A00(r1, r0)     // Catch:{ Exception -> 0x0078 }
            java.lang.Object r2 = X.Pxe.A0p()     // Catch:{ Exception -> 0x0078 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0030 }
            android.os.Handler r1 = X.AnonymousClass7TF.A0D()     // Catch:{ all -> 0x002d }
            X.TB7 r0 = new X.TB7     // Catch:{ all -> 0x002d }
            r0.<init>(r2)     // Catch:{ all -> 0x002d }
            r1.post(r0)     // Catch:{ all -> 0x002d }
            r0 = 200(0xc8, double:9.9E-322)
            r2.wait(r0)     // Catch:{ all -> 0x002d }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            goto L_0x0030
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r0     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            r1 = 3
            X.0I2 r0 = X.0KC.A01     // Catch:{ Exception -> 0x0078 }
            boolean r0 = r0.isLoggable(r1)     // Catch:{ Exception -> 0x0078 }
            if (r0 == 0) goto L_0x0049
            java.util.List r1 = r5.A0A     // Catch:{ Exception -> 0x0078 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0078 }
            X.0JR r0 = r5.A06     // Catch:{ all -> 0x0046 }
            r0.now()     // Catch:{ all -> 0x0046 }
            r1.size()     // Catch:{ all -> 0x0046 }
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0049
        L_0x0046:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0077
        L_0x0049:
            X.T77 r3 = r5.A08     // Catch:{ Exception -> 0x0078 }
            if (r3 == 0) goto L_0x0080
            monitor-enter(r3)     // Catch:{ Exception -> 0x0078 }
            java.util.List r2 = r3.A00     // Catch:{ all -> 0x0075 }
            java.util.ListIterator r1 = r2.listIterator()     // Catch:{ all -> 0x0075 }
        L_0x0054:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0075 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x0075 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0075 }
            if (r0 != r5) goto L_0x0054
            r1.remove()     // Catch:{ all -> 0x0075 }
            goto L_0x0054
        L_0x006a:
            int r0 = r2.size()     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x0073
            X.14i.A07(r3)     // Catch:{ all -> 0x0075 }
        L_0x0073:
            monitor-exit(r3)     // Catch:{ Exception -> 0x0078 }
            goto L_0x0080
        L_0x0075:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x0078 }
        L_0x0077:
            throw r0     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            r2 = move-exception
            java.lang.Class<X.S3S> r1 = X.S3S.class
            java.lang.String r0 = "Couldn't stop scanning"
            X.0KC.A05(r1, r0, r2)     // Catch:{ all -> 0x0083 }
        L_0x0080:
            r5.A04 = r4     // Catch:{ all -> 0x0089 }
            goto L_0x0087
        L_0x0083:
            r0 = move-exception
            r5.A04 = r4     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0087:
            monitor-exit(r5)
            return
        L_0x0089:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S3S.A00():void");
    }

    public S3S(AnonymousClass0JP r2, AnonymousClass0JR r3, T77 t77) {
        this.A05 = r2;
        this.A06 = r3;
        this.A08 = t77;
    }
}
