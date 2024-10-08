package X;

import java.util.Map;

/* renamed from: X.7v0  reason: invalid class name and case insensitive filesystem */
public class C346337v0 {
    public final int A00;
    public final int A01;
    public final C346367v3 A02;
    public final boolean A03;
    public final Map A04;
    public volatile boolean A05 = false;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000e, code lost:
        if (r3.A03 != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        android.opengl.GLES20.glDeleteTextures(1, new int[]{r3.A00}, 0);
        r0 = X.C344577s5.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r0 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r2 = r0.C5n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r2 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.A01.remove(r3.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        r2 = X.C345917uI.A02.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.A01.remove(r3.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        return r3.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A05     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            return r0
        L_0x0008:
            r2 = 1
            r3.A05 = r2     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0040
            int r0 = r3.A00
            r1 = 0
            int[] r0 = new int[]{r0}
            android.opengl.GLES20.glDeleteTextures(r2, r0, r1)
            X.7s3 r0 = X.C344577s5.A02()
            if (r0 == 0) goto L_0x002f
            X.7s7 r2 = r0.C5n()
            if (r2 == 0) goto L_0x002f
            monitor-enter(r2)
            java.util.Map r1 = r2.A01     // Catch:{ all -> 0x003c }
            X.7v3 r0 = r3.A02     // Catch:{ all -> 0x003c }
            r1.remove(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r2)
        L_0x002f:
            X.7uI r0 = X.C345917uI.A02
            X.7s7 r2 = r0.A00
            monitor-enter(r2)
            java.util.Map r1 = r2.A01     // Catch:{ all -> 0x003c }
            X.7v3 r0 = r3.A02     // Catch:{ all -> 0x003c }
            r1.remove(r0)     // Catch:{ all -> 0x003c }
            goto L_0x003f
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x003f:
            monitor-exit(r2)
        L_0x0040:
            boolean r0 = r3.A05
            return r0
        L_0x0043:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346337v0.A01():boolean");
    }

    /* JADX INFO: finally extract failed */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public C346337v0(X.C346327uz r17) {
        /*
            r16 = this;
            r4 = r16
            r4.<init>()
            r8 = 0
            r4.A05 = r8
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r3 = 0
        L_0x000e:
            r1 = r17
            android.util.SparseIntArray r2 = r1.A0A
            int r0 = r2.size()
            if (r3 >= r0) goto L_0x002e
            int r0 = r2.keyAt(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.valueAt(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.put(r1, r0)
            int r3 = r3 + 1
            goto L_0x000e
        L_0x002e:
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)
            r4.A04 = r5
            int r3 = r1.A03
            r4.A01 = r3
            android.graphics.Bitmap r7 = r1.A05
            r15 = 0
            int r2 = r1.A01
            r0 = -1
            if (r2 != r0) goto L_0x004b
            r2 = 1
            int[] r0 = new int[r2]
            android.opengl.GLES20.glGenTextures(r2, r0, r8)
            r2 = r0[r8]
            r4.A00 = r2
            goto L_0x004d
        L_0x004b:
            r4.A00 = r2
        L_0x004d:
            android.opengl.GLES20.glBindTexture(r3, r2)     // Catch:{ all -> 0x00ff }
            java.util.Set r0 = r5.entrySet()     // Catch:{ all -> 0x00ff }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x00ff }
        L_0x0058:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x007e
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x00ff }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00ff }
            int r3 = r4.A01     // Catch:{ all -> 0x00ff }
            java.lang.Object r0 = r5.getKey()     // Catch:{ all -> 0x00ff }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00ff }
            int r2 = r0.intValue()     // Catch:{ all -> 0x00ff }
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x00ff }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00ff }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00ff }
            android.opengl.GLES20.glTexParameteri(r3, r2, r0)     // Catch:{ all -> 0x00ff }
            goto L_0x0058
        L_0x007e:
            if (r7 == 0) goto L_0x0090
            int r0 = r4.A01     // Catch:{ all -> 0x00ff }
            android.opengl.GLUtils.texImage2D(r0, r8, r7, r8)     // Catch:{ all -> 0x00ff }
            int r10 = r7.getWidth()     // Catch:{ all -> 0x00ff }
            int r11 = r7.getHeight()     // Catch:{ all -> 0x00ff }
            r13 = 6408(0x1908, float:8.98E-42)
            goto L_0x00b1
        L_0x0090:
            int r13 = r1.A00     // Catch:{ all -> 0x00ff }
            int r10 = r1.A04     // Catch:{ all -> 0x00ff }
            int r11 = r1.A02     // Catch:{ all -> 0x00ff }
            boolean r0 = r1.A08     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r1.A09     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00ab
            int r7 = r4.A01     // Catch:{ all -> 0x00ff }
            r9 = 32857(0x8059, float:4.6042E-41)
            r14 = 33640(0x8368, float:4.714E-41)
        L_0x00a6:
            r12 = r8
            android.opengl.GLES20.glTexImage2D(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00ff }
            goto L_0x00b1
        L_0x00ab:
            int r7 = r4.A01     // Catch:{ all -> 0x00ff }
            r14 = 5121(0x1401, float:7.176E-42)
            r9 = r13
            goto L_0x00a6
        L_0x00b1:
            int r0 = r4.A01
            android.opengl.GLES20.glBindTexture(r0, r8)
            boolean r2 = r1.A07
            r4.A03 = r2
            boolean r1 = r1.A09
            X.7v3 r0 = new X.7v3
            r0.<init>(r10, r11, r13, r1)
            r4.A02 = r0
            if (r2 != 0) goto L_0x00fe
            X.7s3 r2 = X.C344577s5.A02()
            if (r2 == 0) goto L_0x00db
            X.7s7 r1 = r2.C5n()
            if (r1 == 0) goto L_0x00db
            X.7uI r3 = X.C345917uI.A02
            monitor-enter(r3)
            java.util.Set r0 = r3.A01     // Catch:{ all -> 0x00fb }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x00fb }
            goto L_0x00e0
        L_0x00db:
            X.7uI r0 = X.C345917uI.A02
            X.7s7 r3 = r0.A00
            goto L_0x00e7
        L_0x00e0:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x00db
            X.7s7 r3 = r2.C5n()
        L_0x00e7:
            monitor-enter(r3)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00fb }
            r2.<init>(r4)     // Catch:{ all -> 0x00fb }
            monitor-enter(r3)     // Catch:{ all -> 0x00fb }
            java.util.Map r1 = r3.A01     // Catch:{ all -> 0x00f8 }
            X.7v3 r0 = r4.A02     // Catch:{ all -> 0x00f8 }
            r1.put(r0, r2)     // Catch:{ all -> 0x00f8 }
            monitor-exit(r3)     // Catch:{ all -> 0x00fb }
            monitor-exit(r3)
            return
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00fb }
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x00fe:
            return
        L_0x00ff:
            r1 = move-exception
            int r0 = r4.A01
            android.opengl.GLES20.glBindTexture(r0, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346337v0.<init>(X.7uz):void");
    }

    public void A00(int i, int i2) {
        C346367v3 r0 = this.A02;
        r0.A01 = i;
        r0.A00 = i2;
    }
}
