package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.concurrent.CountDownLatch;

public final class AV4 implements C341047mF {
    public final /* synthetic */ C382259dP A00;

    public final /* synthetic */ void D0F(int i) {
    }

    public final /* synthetic */ void D8b(int i) {
    }

    public final /* synthetic */ void Dh5(int i, int i2) {
    }

    public final /* synthetic */ void Dh7(Surface surface, int i, int i2) {
    }

    public final /* synthetic */ void Dh9(Surface surface) {
    }

    public final /* synthetic */ void ECm(SurfaceTexture surfaceTexture) {
    }

    public final /* synthetic */ void EgZ(boolean z) {
    }

    public AV4(C382259dP r1) {
        this.A00 = r1;
    }

    public final C343177pn Bc6() {
        return null;
    }

    public final C343177pn Bje() {
        return null;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final android.graphics.SurfaceTexture C3H(int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        /*
            r6 = this;
            X.9dP r5 = r6.A00
            java.lang.Object r4 = r5.A04
            monitor-enter(r4)
            android.graphics.SurfaceTexture r0 = r5.A05     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x000c
            android.graphics.SurfaceTexture r0 = r5.A05     // Catch:{ all -> 0x002a }
            goto L_0x0028
        L_0x000c:
            monitor-exit(r4)
            java.util.concurrent.CountDownLatch r3 = r5.A01     // Catch:{ InterruptedException -> 0x0019 }
            if (r3 == 0) goto L_0x0025
            r1 = 5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0019 }
            r3.await(r1, r0)     // Catch:{ InterruptedException -> 0x0019 }
            goto L_0x0025
        L_0x0019:
            r2 = move-exception
            java.lang.String r1 = "PassThroughSurfacePipeComponent"
            java.lang.String r0 = "Timeout when creating SurfaceNode: "
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r0, r2)
            android.util.Log.e(r1, r0)
        L_0x0025:
            monitor-enter(r4)
            android.graphics.SurfaceTexture r0 = r5.A05     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r4)
            return r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AV4.C3H(int, int, int, int, int, int, int, int):android.graphics.SurfaceTexture");
    }

    public final Surface C3I() {
        Surface surface;
        SurfaceHolder holder;
        C382259dP r0 = this.A00;
        synchronized (r0.A04) {
            SurfaceView surfaceView = r0.A06;
            if (surfaceView == null || (holder = surfaceView.getHolder()) == null) {
                surface = null;
            } else {
                surface = holder.getSurface();
            }
        }
        return surface;
    }

    public final /* synthetic */ SurfaceTexture C3J() {
        return null;
    }

    public final C341827na CEH() {
        return this.A00.A00;
    }

    public final /* synthetic */ C343177pn CHY() {
        return null;
    }

    public final void Dh6(SurfaceTexture surfaceTexture, int i, int i2) {
        C382259dP r0 = this.A00;
        synchronized (r0.A04) {
            r0.A05 = surfaceTexture;
            CountDownLatch countDownLatch = r0.A01;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    public final void Dh8(SurfaceTexture surfaceTexture) {
        C382259dP r3 = this.A00;
        synchronized (r3.A04) {
            if (r3.A05 != null) {
                r3.A05 = null;
                r3.A01 = new CountDownLatch(1);
            }
        }
    }

    public final boolean FNS() {
        C382259dP r0 = this.A00;
        C343667qb r2 = B34.A00;
        Object A0u = AnonymousClass7TE.A0u();
        Object Apu = r0.A00.Apu(r2);
        if (Apu != null) {
            A0u = Apu;
        }
        return AnonymousClass7TE.A1a(A0u);
    }

    public final /* synthetic */ Object BYV(C341907ni r2) {
        return null;
    }
}
