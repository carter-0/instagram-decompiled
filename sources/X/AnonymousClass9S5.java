package X;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.9S5  reason: invalid class name */
public final class AnonymousClass9S5 implements Camera.OnZoomChangeListener {
    public int A00;
    public int A01;
    public int A02;
    public Camera A03;
    public final Handler A04 = new Handler(Looper.getMainLooper(), new W6B(this, 2));
    public final C378969Rx A05;
    public final C3496981j A06 = new C3496981j();
    public final C340757lm A07;
    public final Callable A08 = new C41369Asq((Object) this, 12);
    public volatile int A09;
    public volatile List A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void A00(int r6) {
        /*
            r5 = this;
            r4 = r5
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x007b
            int r0 = r5.A09
            if (r6 == r0) goto L_0x007b
            int r0 = r5.A01
            if (r6 > r0) goto L_0x007b
            if (r6 < 0) goto L_0x007b
            boolean r0 = X.C342057ny.A02()
            if (r0 != 0) goto L_0x0073
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x003b
            monitor-enter(r4)
            r5.A02 = r6     // Catch:{ all -> 0x0070 }
            boolean r0 = r5.A0C     // Catch:{ all -> 0x0070 }
            r1 = 1
            if (r0 == 0) goto L_0x0030
            boolean r0 = r5.A0D     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x006e
            r5.A0D = r1     // Catch:{ all -> 0x0070 }
            android.hardware.Camera r0 = r5.A03     // Catch:{ all -> 0x0070 }
            r0.getClass()     // Catch:{ all -> 0x0070 }
            r0.stopSmoothZoom()     // Catch:{ all -> 0x0070 }
            goto L_0x006e
        L_0x0030:
            r5.A0C = r1     // Catch:{ all -> 0x0070 }
            android.hardware.Camera r0 = r5.A03     // Catch:{ all -> 0x0070 }
            r0.getClass()     // Catch:{ all -> 0x0070 }
            r0.startSmoothZoom(r6)     // Catch:{ all -> 0x0070 }
            goto L_0x006e
        L_0x003b:
            X.9Rx r1 = r5.A05     // Catch:{ Exception -> 0x005b }
            int r0 = r5.A00     // Catch:{ Exception -> 0x005b }
            X.9Ry r3 = r1.A00(r0)     // Catch:{ Exception -> 0x005b }
            X.7p4 r2 = X.C342717p3.A11     // Catch:{ Exception -> 0x005b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x005b }
            X.7p7 r0 = r3.A00     // Catch:{ Exception -> 0x005b }
            r0.A01(r2, r1)     // Catch:{ Exception -> 0x005b }
            r3.A02()     // Catch:{ Exception -> 0x005b }
            r1 = 1
            android.hardware.Camera r0 = r5.A03     // Catch:{ Exception -> 0x005b }
            r0.getClass()     // Catch:{ Exception -> 0x005b }
            r5.onZoomChange(r6, r1, r0)     // Catch:{ Exception -> 0x005b }
            return
        L_0x005b:
            r1 = move-exception
            java.lang.String r0 = "Failed to set zoom level to: "
            java.lang.String r0 = X.002.A0O(r0, r6)
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0, r1)
            monitor-enter(r4)
            android.os.Handler r1 = r5.A04     // Catch:{ all -> 0x0070 }
            r0 = 2
            X.AnonymousClass7TE.A1S(r1, r2, r0)     // Catch:{ all -> 0x0070 }
        L_0x006e:
            monitor-exit(r4)
            return
        L_0x0070:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0073:
            java.lang.String r1 = "Attempting to zoom on the UI thread!"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9S5.A00(int):void");
    }

    public final synchronized void onZoomChange(int i, boolean z, Camera camera) {
        this.A09 = i;
        int i2 = 0;
        if (this.A0E) {
            this.A0C = AnonymousClass7TF.A1Q(z ? 1 : 0);
            if (z) {
                this.A0D = false;
                if (this.A0B && this.A02 != i) {
                    this.A07.A07("update_zoom_level", this.A08);
                }
            }
        }
        Handler handler = this.A04;
        if (z) {
            i2 = 1;
        }
        handler.sendMessage(handler.obtainMessage(1, i, i2));
    }

    public AnonymousClass9S5(C378969Rx r4, C340757lm r5) {
        this.A05 = r4;
        this.A07 = r5;
    }
}
