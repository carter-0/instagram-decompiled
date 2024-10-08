package X;

/* renamed from: X.USe  reason: case insensitive filesystem */
public final class C15148USe extends C19062WIs {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final /* synthetic */ C18592Vuj A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15148USe(C18592Vuj vuj, int i, int i2, boolean z, boolean z2) {
        super(vuj, i);
        this.A03 = vuj;
        this.A00 = i2;
        this.A02 = z;
        this.A01 = z2;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void AT8() {
        /*
            r6 = this;
            boolean r1 = r6.A02
            X.Vuj r0 = r6.A03
            X.W0R r3 = r0.A0L
            if (r1 != 0) goto L_0x0063
            int r2 = r6.A00
            int r5 = r6.A00
            boolean r0 = r6.A01
            monitor-enter(r3)
            if (r0 != 0) goto L_0x0015
            X.WIq r2 = r3.A05     // Catch:{ all -> 0x0076 }
            r4 = 0
            goto L_0x0027
        L_0x0015:
            android.util.SparseArray r0 = r3.A03     // Catch:{ all -> 0x0076 }
            java.lang.Object r4 = r0.get(r2)     // Catch:{ all -> 0x0076 }
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x0076 }
            if (r5 == r2) goto L_0x0035
            boolean r0 = r4 instanceof android.view.ViewParent     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0035
            X.WIq r2 = r3.A05     // Catch:{ all -> 0x0076 }
            android.view.ViewParent r4 = (android.view.ViewParent) r4     // Catch:{ all -> 0x0076 }
        L_0x0027:
            r2.A01 = r5     // Catch:{ all -> 0x0076 }
            android.view.ViewParent r1 = r2.A00     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x0031
            r0 = 0
            r1.requestDisallowInterceptTouchEvent(r0)     // Catch:{ all -> 0x0076 }
        L_0x0031:
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0076 }
            goto L_0x005a
        L_0x0035:
            android.util.SparseBooleanArray r0 = r3.A04     // Catch:{ all -> 0x0076 }
            boolean r0 = r0.get(r2)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0053
            java.lang.String r1 = "Cannot block native responder on "
            java.lang.String r0 = " that is a root view"
            java.lang.String r2 = X.002.A0c(r1, r0, r2)     // Catch:{ all -> 0x0076 }
            r0 = 0
            X.0qQ.A0B(r2, r0)     // Catch:{ all -> 0x0076 }
            X.WuV r1 = new X.WuV     // Catch:{ all -> 0x0076 }
            r1.<init>(r2)     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = "SoftAssertions"
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r0, r1)     // Catch:{ all -> 0x0076 }
        L_0x0053:
            X.WIq r2 = r3.A05     // Catch:{ all -> 0x0076 }
            android.view.ViewParent r4 = r4.getParent()     // Catch:{ all -> 0x0076 }
            goto L_0x0027
        L_0x005a:
            if (r4 == 0) goto L_0x0074
            r0 = 1
            r4.requestDisallowInterceptTouchEvent(r0)     // Catch:{ all -> 0x0076 }
            r2.A00 = r4     // Catch:{ all -> 0x0076 }
            goto L_0x0074
        L_0x0063:
            monitor-enter(r3)
            X.WIq r2 = r3.A05     // Catch:{ all -> 0x0076 }
            r0 = -1
            r2.A01 = r0     // Catch:{ all -> 0x0076 }
            android.view.ViewParent r1 = r2.A00     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x0071
            r0 = 0
            r1.requestDisallowInterceptTouchEvent(r0)     // Catch:{ all -> 0x0076 }
        L_0x0071:
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0076 }
        L_0x0074:
            monitor-exit(r3)
            return
        L_0x0076:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15148USe.AT8():void");
    }
}
