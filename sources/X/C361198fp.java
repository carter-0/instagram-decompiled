package X;

/* renamed from: X.8fp  reason: invalid class name and case insensitive filesystem */
public abstract class C361198fp implements C361208fq {
    public C345897uG A00;
    public C344567s4 A01;
    public C40137ATd A02;
    public C361218fr A03;
    public final C344407ro A04;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void detach() {
        /*
            r4 = this;
            r2 = r4
            r3 = r4
            boolean r0 = r4 instanceof X.C361188fo
            if (r0 == 0) goto L_0x0028
            X.8fo r2 = (X.C361188fo) r2
            X.7su r0 = r2.A00
            r1 = 0
            if (r0 == 0) goto L_0x0012
            r0.detach()
            r2.A00 = r1
        L_0x0012:
            X.7su r0 = r2.A01
            if (r0 == 0) goto L_0x001b
            r0.detach()
            r2.A01 = r1
        L_0x001b:
            r1 = 0
            r4.A00 = r1
            X.8fr r0 = r4.A03
            if (r0 == 0) goto L_0x0027
            r0.detach()
            r4.A03 = r1
        L_0x0027:
            return
        L_0x0028:
            boolean r0 = r4 instanceof X.C367488qp
            if (r0 == 0) goto L_0x0058
            X.8qp r2 = (X.C367488qp) r2
            monitor-enter(r3)
            X.ATm r0 = r2.A02     // Catch:{ all -> 0x007a }
            r1 = 0
            if (r0 == 0) goto L_0x0039
            r0.detach()     // Catch:{ all -> 0x007a }
            r2.A02 = r1     // Catch:{ all -> 0x007a }
        L_0x0039:
            X.ATm r0 = r2.A03     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0042
            r0.detach()     // Catch:{ all -> 0x007a }
            r2.A03 = r1     // Catch:{ all -> 0x007a }
        L_0x0042:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl r0 = r2.A00     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0049
            r0.release()     // Catch:{ all -> 0x007a }
        L_0x0049:
            X.8o4 r0 = r2.A05     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0050
            r0.detach()     // Catch:{ all -> 0x007a }
        L_0x0050:
            com.facebook.onecamera.components.mediagraph.iglu.nativegraph.IgluFilterNativeGraph r0 = r2.A01     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x006b
            r0.detach()     // Catch:{ all -> 0x007a }
            goto L_0x006b
        L_0x0058:
            boolean r0 = r4 instanceof X.C382329dW
            if (r0 == 0) goto L_0x006d
            X.9dW r2 = (X.C382329dW) r2
            monitor-enter(r3)
            r1 = 0
            X.7su r0 = r2.A00     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0069
            r0.detach()     // Catch:{ all -> 0x007a }
            r2.A00 = r1     // Catch:{ all -> 0x007a }
        L_0x0069:
            r2.A02 = r1     // Catch:{ all -> 0x007a }
        L_0x006b:
            monitor-exit(r3)
            goto L_0x001b
        L_0x006d:
            X.9dV r2 = (X.C382319dV) r2
            X.7su r0 = r2.A00
            if (r0 == 0) goto L_0x001b
            r0.detach()
            r0 = 0
            r2.A00 = r0
            goto L_0x001b
        L_0x007a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361198fp.detach():void");
    }

    public final void release() {
        this.A01 = null;
    }

    public final C361218fr A01() {
        if (this.A03 == null) {
            this.A03 = new C361218fr(this.A04);
            this.A01.getClass();
            C361218fr r1 = this.A03;
            C345897uG r0 = this.A00;
            r0.getClass();
            r1.ACn(r0);
        }
        return this.A03;
    }

    public final void ACn(C345897uG r3) {
        C345897uG r0 = this.A00;
        if (!(r0 == null || r0 == r3)) {
            this.A04.A00(C368978td.GL_COPY_RENDERER_CONTEXT_NOT_DETACHED);
        }
        this.A00 = r3;
    }

    public final void CMa(C344567s4 r3) {
        C344567s4 r0 = this.A01;
        if (!(r0 == null || r0 == r3)) {
            this.A04.A00(C368978td.GL_COPY_RENDERER_HOST_NOT_DETACHED);
        }
        this.A01 = r3;
    }

    public C361198fp(C344407ro r1) {
        this.A04 = r1 == null ? C344407ro.A01 : r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (android.os.Looper.myLooper().getThread() != android.os.Looper.getMainLooper().getThread()) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
            r3 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L_0x0019
            android.os.Looper r0 = android.os.Looper.myLooper()
            java.lang.Thread r2 = r0.getThread()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r0.getThread()
            r0 = 1
            if (r2 == r1) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r2 = 0
            if (r0 == 0) goto L_0x0025
            X.7ro r1 = r3.A04
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_CALLED_FROM_UI_THREAD
        L_0x0021:
            r1.A00(r0)
            return r2
        L_0x0025:
            X.7s4 r0 = r3.A01
            if (r0 != 0) goto L_0x002e
            X.7ro r1 = r3.A04
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_NOT_INITIALIZED
            goto L_0x0021
        L_0x002e:
            X.7uG r0 = r3.A00
            if (r0 != 0) goto L_0x0037
            X.7ro r1 = r3.A04
            X.8td r0 = X.C368978td.GL_COPY_RENDERER_SKIP_NULL_GL_CONTEXT
            goto L_0x0021
        L_0x0037:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361198fp.A02():boolean");
    }
}
