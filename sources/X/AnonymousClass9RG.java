package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.9RG  reason: invalid class name */
public final class AnonymousClass9RG implements Runnable {
    public int A00;
    public int A01;
    public XBw A02;
    public AnonymousClass9RF A03;
    public boolean A04;
    public final AnonymousClass9R7 A05;
    public final Object A06 = new Object();
    public final Object A07 = new Object();
    public final Queue A08 = new LinkedList();
    public final UserSession A09;
    public final Object A0A = new Object();
    public volatile Integer A0B = AnonymousClass05K.A00;
    public volatile Long A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    public final void A00() {
        this.A0D = false;
        this.A05.A01();
        Object obj = this.A07;
        synchronized (obj) {
            obj.notify();
        }
        Object obj2 = this.A06;
        synchronized (obj2) {
            obj2.notify();
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00b3 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b8 A[Catch:{ Exception -> 0x0178, all -> 0x01a0 }] */
    public final void run() {
        /*
            r10 = this;
            r6 = 1
            r10.A0D = r6     // Catch:{ Exception -> 0x0178 }
            r8 = 0
            r10.A0E = r8     // Catch:{ Exception -> 0x0178 }
            X.9R7 r3 = r10.A05     // Catch:{ Exception -> 0x0178 }
            int r9 = r10.A01     // Catch:{ Exception -> 0x0178 }
            int r2 = r10.A00     // Catch:{ Exception -> 0x0178 }
            int r7 = r3.A05     // Catch:{ Exception -> 0x0178 }
            if (r7 <= 0) goto L_0x0166
            int r1 = r3.A04     // Catch:{ Exception -> 0x0178 }
            if (r1 <= 0) goto L_0x0166
            X.9R6 r5 = r3.A09     // Catch:{ Exception -> 0x0178 }
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r4 = r3.A0A     // Catch:{ Exception -> 0x0178 }
            if (r4 == 0) goto L_0x0022
            r0 = r4
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0     // Catch:{ Exception -> 0x0178 }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r0 = r0.A02     // Catch:{ Exception -> 0x0178 }
            r5.A04(r0)     // Catch:{ Exception -> 0x0178 }
        L_0x0022:
            r5.A02 = r7     // Catch:{ Exception -> 0x0178 }
            r5.A01 = r1     // Catch:{ Exception -> 0x0178 }
            X.AnonymousClass9R6.A02(r5)     // Catch:{ Exception -> 0x0178 }
            r5.A04 = r9     // Catch:{ Exception -> 0x0178 }
            r5.A03 = r2     // Catch:{ Exception -> 0x0178 }
            X.9To r0 = X.AnonymousClass9R6.A00(r5)     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x0040
            X.9Tp r0 = X.C343837qt.A02(r0)     // Catch:{ Exception -> 0x0178 }
            X.9SN r0 = (X.AnonymousClass9SN) r0     // Catch:{ Exception -> 0x0178 }
            r0.A05 = r9     // Catch:{ Exception -> 0x0178 }
            r0.A04 = r2     // Catch:{ Exception -> 0x0178 }
            X.AnonymousClass9SN.A03(r0)     // Catch:{ Exception -> 0x0178 }
        L_0x0040:
            X.9To r0 = X.AnonymousClass9R6.A00(r5)     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x0050
            boolean r1 = r5.A0B     // Catch:{ Exception -> 0x0178 }
            X.9Tp r0 = X.C343837qt.A02(r0)     // Catch:{ Exception -> 0x0178 }
            X.9SN r0 = (X.AnonymousClass9SN) r0     // Catch:{ Exception -> 0x0178 }
            r0.A08 = r1     // Catch:{ Exception -> 0x0178 }
        L_0x0050:
            android.view.Surface r1 = r3.A06     // Catch:{ Exception -> 0x0178 }
            X.9To r0 = X.AnonymousClass9R6.A00(r5)     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x007d
            X.9Tp r7 = X.C343837qt.A02(r0)     // Catch:{ Exception -> 0x0178 }
            X.9SN r7 = (X.AnonymousClass9SN) r7     // Catch:{ Exception -> 0x0178 }
            X.7uT r2 = new X.7uT     // Catch:{ Exception -> 0x0178 }
            r2.<init>((android.view.Surface) r1, (boolean) r8)     // Catch:{ Exception -> 0x0178 }
            boolean r0 = r7.A08     // Catch:{ Exception -> 0x0178 }
            r0 = r0 ^ 1
            r2.A08 = r0     // Catch:{ Exception -> 0x0178 }
            r7.A0F = r2     // Catch:{ Exception -> 0x0178 }
            X.7ro r0 = r7.A0B     // Catch:{ Exception -> 0x0178 }
            X.7uU r1 = new X.7uU     // Catch:{ Exception -> 0x0178 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0178 }
            X.7rv r0 = X.AnonymousClass9SN.A00(r7)     // Catch:{ Exception -> 0x0178 }
            X.7sH r0 = r0.BQ8()     // Catch:{ Exception -> 0x0178 }
            r0.A8c(r1, r8)     // Catch:{ Exception -> 0x0178 }
        L_0x007d:
            r10.A04 = r6     // Catch:{ Exception -> 0x0178 }
            X.9RF r0 = r10.A03     // Catch:{ Exception -> 0x0178 }
            r2 = 0
            if (r0 == 0) goto L_0x015c
            r0.A03()     // Catch:{ Exception -> 0x0178 }
        L_0x0087:
            boolean r0 = r10.A0D     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x013f
            java.lang.Object r7 = r10.A07     // Catch:{ Exception -> 0x0178 }
            monitor-enter(r7)     // Catch:{ Exception -> 0x0178 }
            java.lang.Integer r1 = r10.A0B     // Catch:{ all -> 0x0175 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0175 }
            if (r1 != r0) goto L_0x0098
            r7.wait()     // Catch:{ InterruptedException -> 0x009b }
            goto L_0x009b
        L_0x0098:
            java.lang.Thread.yield()     // Catch:{ all -> 0x0175 }
        L_0x009b:
            monitor-exit(r7)     // Catch:{ Exception -> 0x0178 }
            java.lang.Object r1 = r10.A06     // Catch:{ Exception -> 0x0178 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0178 }
            boolean r0 = r10.A0E     // Catch:{ all -> 0x013c }
            monitor-exit(r1)     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x00bf
            X.9RF r0 = r10.A03     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x015c
            r0.A04()     // Catch:{ Exception -> 0x0178 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0178 }
            boolean r0 = r10.A0E     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x00b3
            r1.wait()     // Catch:{ InterruptedException -> 0x00b3 }
        L_0x00b3:
            monitor-exit(r1)     // Catch:{ Exception -> 0x0178 }
            boolean r0 = r10.A0D     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x00bf
            X.9RF r0 = r10.A03     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x015c
            r0.A05()     // Catch:{ Exception -> 0x0178 }
        L_0x00bf:
            boolean r0 = r10.A0D     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x013f
            X.9RF r0 = r10.A03     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x015c
            boolean r0 = r0.A07()     // Catch:{ Exception -> 0x0178 }
            if (r0 != 0) goto L_0x013f
            java.util.Queue r7 = r10.A08     // Catch:{ Exception -> 0x0178 }
            monitor-enter(r7)     // Catch:{ Exception -> 0x0178 }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x0175 }
        L_0x00d4:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0175 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0175 }
            r0.run()     // Catch:{ all -> 0x0175 }
            goto L_0x00d4
        L_0x00e4:
            r7.clear()     // Catch:{ all -> 0x0175 }
            monitor-exit(r7)     // Catch:{ Exception -> 0x0178 }
            java.lang.Long r7 = r10.A0C     // Catch:{ Exception -> 0x0178 }
            X.8Ko r0 = r3.A02     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x00f1
            r0.DYe()     // Catch:{ Exception -> 0x0178 }
        L_0x00f1:
            X.8sn r1 = r3.A07     // Catch:{ Exception -> 0x0178 }
            if (r1 == 0) goto L_0x00fe
            boolean r0 = r3.A03     // Catch:{ Exception -> 0x0178 }
            if (r0 != 0) goto L_0x00fe
            r1.A0C(r2, r2)     // Catch:{ Exception -> 0x0178 }
            r3.A03 = r6     // Catch:{ Exception -> 0x0178 }
        L_0x00fe:
            if (r4 == 0) goto L_0x0108
            r0 = r4
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0     // Catch:{ Exception -> 0x0178 }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r0 = r0.A02     // Catch:{ Exception -> 0x0178 }
            r5.A04(r0)     // Catch:{ Exception -> 0x0178 }
        L_0x0108:
            X.9To r0 = X.AnonymousClass9R6.A00(r5)     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x0133
            X.9Sx r0 = (X.C379199Sx) r0     // Catch:{ Exception -> 0x0178 }
            X.7qg r1 = X.AnonymousClass9Tp.A00     // Catch:{ Exception -> 0x0178 }
            X.7qt r0 = r0.A00     // Catch:{ Exception -> 0x0178 }
            X.7qe r1 = r0.Ape(r1)     // Catch:{ Exception -> 0x0178 }
            X.9Tp r1 = (X.AnonymousClass9Tp) r1     // Catch:{ Exception -> 0x0178 }
            X.9SN r1 = (X.AnonymousClass9SN) r1     // Catch:{ Exception -> 0x0178 }
            X.7mP r0 = r1.A0E     // Catch:{ Exception -> 0x0178 }
            if (r0 != 0) goto L_0x012e
            X.7qg r0 = X.C344447rs.A00     // Catch:{ Exception -> 0x0178 }
            X.7qe r0 = r1.A0A(r0)     // Catch:{ Exception -> 0x0178 }
            X.7rs r0 = (X.C344447rs) r0     // Catch:{ Exception -> 0x0178 }
            X.7mP r0 = r0.Blg()     // Catch:{ Exception -> 0x0178 }
            r1.A0E = r0     // Catch:{ Exception -> 0x0178 }
        L_0x012e:
            X.7mP r0 = r1.A0E     // Catch:{ Exception -> 0x0178 }
            r0.DGn(r7)     // Catch:{ Exception -> 0x0178 }
        L_0x0133:
            X.9RF r0 = r10.A03     // Catch:{ Exception -> 0x0178 }
            if (r0 == 0) goto L_0x015c
            r0.A06()     // Catch:{ Exception -> 0x0178 }
            goto L_0x0087
        L_0x013c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0178 }
            goto L_0x0177
        L_0x013f:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x019c
            X.9RF r0 = r10.A03     // Catch:{ Exception -> 0x0155 }
            if (r0 != 0) goto L_0x0151
            java.lang.String r0 = "renderController"
            X.0qQ.A0F(r0)     // Catch:{ Exception -> 0x0155 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ Exception -> 0x0155 }
            throw r0     // Catch:{ Exception -> 0x0155 }
        L_0x0151:
            r0.A02()     // Catch:{ Exception -> 0x0155 }
            goto L_0x019c
        L_0x0155:
            r1 = move-exception
            java.lang.String r0 = "OneCameraRenderContext:renderController.onFinish"
            X.0wb.A07(r0, r1)
            goto L_0x019c
        L_0x015c:
            java.lang.String r0 = "renderController"
            X.0qQ.A0F(r0)     // Catch:{ Exception -> 0x0178 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0177
        L_0x0166:
            java.lang.String r2 = "OneCameraVideoRenderer.init inputWidth:"
            java.lang.String r1 = " inputHeight:"
            int r0 = r3.A04     // Catch:{ Exception -> 0x0178 }
            java.lang.String r0 = X.002.A02(r7, r0, r2, r1)     // Catch:{ Exception -> 0x0178 }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x0178 }
            goto L_0x0177
        L_0x0175:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ Exception -> 0x0178 }
        L_0x0177:
            throw r0     // Catch:{ Exception -> 0x0178 }
        L_0x0178:
            r1 = move-exception
            java.lang.String r0 = "OneCameraRenderContext:run"
            X.0wb.A07(r0, r1)     // Catch:{ all -> 0x01a0 }
            X.9RF r1 = r10.A03     // Catch:{ all -> 0x01a0 }
            if (r1 != 0) goto L_0x018c
            java.lang.String r0 = "renderController"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01a0 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x01a0 }
            throw r0     // Catch:{ all -> 0x01a0 }
        L_0x018c:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x019a
            r1.A02()     // Catch:{ Exception -> 0x0194 }
            goto L_0x019a
        L_0x0194:
            r1 = move-exception
            java.lang.String r0 = "OneCameraRenderContext:renderController.onFinish"
            X.0wb.A07(r0, r1)
        L_0x019a:
            X.9R7 r3 = r10.A05     // Catch:{ Exception -> 0x01ce }
        L_0x019c:
            r3.A01()     // Catch:{ Exception -> 0x01ce }
            goto L_0x01e2
        L_0x01a0:
            r2 = move-exception
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x01bd
            X.9RF r0 = r10.A03     // Catch:{ Exception -> 0x01b7 }
            if (r0 != 0) goto L_0x01b3
            java.lang.String r0 = "renderController"
            X.0qQ.A0F(r0)     // Catch:{ Exception -> 0x01b7 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ Exception -> 0x01b7 }
            throw r0     // Catch:{ Exception -> 0x01b7 }
        L_0x01b3:
            r0.A02()     // Catch:{ Exception -> 0x01b7 }
            goto L_0x01bd
        L_0x01b7:
            r1 = move-exception
            java.lang.String r0 = "OneCameraRenderContext:renderController.onFinish"
            X.0wb.A07(r0, r1)
        L_0x01bd:
            X.9R7 r0 = r10.A05     // Catch:{ Exception -> 0x01c3 }
            r0.A01()     // Catch:{ Exception -> 0x01c3 }
            goto L_0x01ea
        L_0x01c3:
            r1 = move-exception
            java.lang.String r0 = "OneCameraRenderContext:renderer.finish"
            X.0wb.A07(r0, r1)
            X.9RF r0 = r10.A03
            if (r0 != 0) goto L_0x01ea
            goto L_0x01d8
        L_0x01ce:
            r1 = move-exception
            java.lang.String r0 = "OneCameraRenderContext:renderer.finish"
            X.0wb.A07(r0, r1)
            X.9RF r0 = r10.A03
            if (r0 != 0) goto L_0x01e2
        L_0x01d8:
            java.lang.String r0 = "renderController"
            X.0qQ.A0F(r0)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x01e2:
            java.lang.Object r1 = r10.A0A
            monitor-enter(r1)
            r1.notifyAll()     // Catch:{ all -> 0x01f2 }
            monitor-exit(r1)
            return
        L_0x01ea:
            java.lang.Object r1 = r10.A0A
            monitor-enter(r1)
            r1.notifyAll()     // Catch:{ all -> 0x01f2 }
            monitor-exit(r1)
            throw r2
        L_0x01f2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9RG.run():void");
    }

    public final void A01() {
        synchronized (this.A06) {
            this.A0E = true;
        }
        A03((Long) null);
    }

    public final void A02(Integer num) {
        if (this.A0B == num || this.A0B != AnonymousClass05K.A01) {
            this.A0B = num;
            return;
        }
        this.A0B = num;
        A03((Long) null);
    }

    public final void A03(Long l) {
        if (l != null) {
            this.A0C = l;
        }
        Object obj = this.A07;
        synchronized (obj) {
            obj.notify();
        }
    }

    public AnonymousClass9RG(UserSession userSession, AnonymousClass9R7 r3, int i, int i2, int i3, int i4) {
        this.A05 = r3;
        this.A01 = i3;
        this.A00 = i4;
        this.A09 = userSession;
        this.A02 = new C14247TsU(i, i2);
    }
}
