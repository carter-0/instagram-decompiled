package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;

/* renamed from: X.Vvx  reason: case insensitive filesystem */
public final class C18647Vvx {
    public final int A00;
    public final float[] A01 = new float[16];
    public final C18656VwB A02;
    public final Object A03;
    public volatile int A04;
    public volatile int A05;
    public volatile int A06;
    public volatile int A07;
    public volatile long A08;
    public volatile C346027uT A09;
    public volatile boolean A0A;
    public volatile boolean A0B;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A01() {
        /*
            r5 = this;
            X.7uT r4 = r5.A09
            r3 = 0
            r5.A09 = r3
            if (r4 == 0) goto L_0x002b
            monitor-enter(r4)
            android.graphics.SurfaceTexture r2 = r4.A0B     // Catch:{ RuntimeException -> 0x0023 }
            if (r2 == 0) goto L_0x0023
            X.VwB r0 = r5.A02     // Catch:{ RuntimeException -> 0x0023 }
            r0.A01()     // Catch:{ RuntimeException -> 0x0023 }
            java.lang.Object r1 = r5.A03     // Catch:{ RuntimeException -> 0x0023 }
            monitor-enter(r1)     // Catch:{ RuntimeException -> 0x0023 }
            r2.detachFromGLContext()     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            boolean r0 = r5.A0A     // Catch:{ RuntimeException -> 0x0023 }
            if (r0 == 0) goto L_0x0023
            r2.setOnFrameAvailableListener(r3)     // Catch:{ RuntimeException -> 0x0023 }
            goto L_0x0023
        L_0x0020:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ RuntimeException -> 0x0023 }
        L_0x0023:
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            r0 = 0
            r5.A0A = r0
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18647Vvx.A01():void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A02(android.graphics.SurfaceTexture.OnFrameAvailableListener r4, X.C346027uT r5) {
        /*
            r3 = this;
            X.7uT r0 = r3.A09
            if (r5 == r0) goto L_0x0031
            r3.A01()
            monitor-enter(r5)
            android.graphics.SurfaceTexture r2 = r5.A0B     // Catch:{ RuntimeException -> 0x002b }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r5)     // Catch:{ all -> 0x002d }
            return
        L_0x000e:
            if (r4 == 0) goto L_0x0023
            X.VwB r0 = r3.A02     // Catch:{ RuntimeException -> 0x002b }
            r0.A01()     // Catch:{ RuntimeException -> 0x002b }
            r2.setOnFrameAvailableListener(r4)     // Catch:{ RuntimeException -> 0x002b }
            java.lang.Object r1 = r3.A03     // Catch:{ RuntimeException -> 0x002b }
            monitor-enter(r1)     // Catch:{ RuntimeException -> 0x002b }
            r2.updateTexImage()     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            goto L_0x0023
        L_0x0020:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ RuntimeException -> 0x002b }
        L_0x0023:
            r3.A09 = r5     // Catch:{ RuntimeException -> 0x002b }
            boolean r0 = X.AnonymousClass7TF.A1V(r4)
            r3.A0A = r0     // Catch:{ RuntimeException -> 0x002b }
        L_0x002b:
            monitor-exit(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0030
        L_0x002d:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002d }
            throw r0
        L_0x0030:
            return
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18647Vvx.A02(android.graphics.SurfaceTexture$OnFrameAvailableListener, X.7uT):void");
    }

    public final boolean A03(SurfaceTexture surfaceTexture) {
        long j;
        C346027uT r3 = this.A09;
        if (r3 != null) {
            if (surfaceTexture == null) {
                surfaceTexture = r3.A0B;
            }
            if (r3.A0B == surfaceTexture) {
                try {
                    this.A02.A01();
                    synchronized (this.A03) {
                        try {
                            synchronized (r3) {
                                SurfaceTexture surfaceTexture2 = r3.A0B;
                                if (surfaceTexture2 != null) {
                                    surfaceTexture2.updateTexImage();
                                }
                            }
                        } catch (Throwable th) {
                            while (true) {
                                th = th;
                                break;
                            }
                        }
                    }
                    synchronized (r3) {
                        try {
                            SurfaceTexture surfaceTexture3 = r3.A0B;
                            if (surfaceTexture3 != null) {
                                j = surfaceTexture3.getTimestamp();
                            } else {
                                j = 0;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    this.A08 = j;
                    this.A07 = r3.A0A;
                    this.A06 = r3.A05;
                    this.A05 = r3.A04;
                    this.A04 = r3.A03;
                    this.A0B = r3.A0F;
                    float[] fArr = this.A01;
                    synchronized (r3) {
                        SurfaceTexture surfaceTexture4 = r3.A0B;
                        if (surfaceTexture4 != null) {
                            surfaceTexture4.getTransformMatrix(fArr);
                        } else {
                            Matrix.setIdentityM(fArr, 0);
                        }
                        r3.A03(fArr);
                    }
                    return true;
                } catch (RuntimeException unused) {
                    return false;
                }
            }
        }
        return false;
    }

    public C18647Vvx(C18656VwB vwB, Object obj) {
        this.A02 = vwB;
        this.A03 = obj;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        A00("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        A00(002.A0O("glBindTexture ", i));
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        C13990Tnq.A0i(36197, 9729.0f);
        A00("glTexParameter");
        this.A00 = i;
    }

    public static void A00(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String A0g = 002.A0g(str, ": glError 0x", Integer.toHexString(glGetError));
            Log.e("EglSurfaceInput", A0g);
            throw new RuntimeException(A0g);
        }
    }
}
