package X;

import com.instagram.common.session.UserSession;

public final class OVJ {
    public static final Integer[] A04;
    public static final Integer[] A05;
    public C71062Oah A00 = new C71062Oah();
    public final 1a8 A01 = C66581MXm.A0P();
    public final UserSession A02;
    public final String A03;

    static {
        Integer num = AnonymousClass05K.A00;
        Integer num2 = AnonymousClass05K.A01;
        A05 = new Integer[]{num, num2, AnonymousClass05K.A0C};
        A04 = new Integer[]{num, num2};
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A00(java.util.ArrayList r13) {
        /*
            r12 = this;
            X.Oah r3 = r12.A00
            r6 = 0
            com.instagram.common.session.UserSession r4 = r12.A02
            X.0Tu r2 = X.0Tu.A06
            r0 = 36597669732354927(0x82056300010b6f, double:3.207851933504215E-306)
            int r11 = X.DbS.A04(r2, r4, r0)
            r0 = 36597669732486001(0x82056300030b71, double:3.2078519335871066E-306)
            int r10 = X.DbS.A04(r2, r4, r0)
            r0 = 36597669732551538(0x82056300040b72, double:3.2078519336285525E-306)
            int r5 = X.DbS.A04(r2, r4, r0)
            if (r5 < 0) goto L_0x004f
            java.lang.Integer[] r1 = A05
            r0 = 3
            if (r5 >= r0) goto L_0x004f
            r7 = r1[r5]
        L_0x002b:
            r0 = 36597669732748147(0x82056300070b73, double:3.207851933752889E-306)
            int r2 = X.DbS.A04(r2, r4, r0)
            if (r2 < 0) goto L_0x004a
            java.lang.Integer[] r1 = A04
            r0 = 2
            if (r2 >= r0) goto L_0x004a
            r8 = r1[r2]
        L_0x003d:
            X.GAX r6 = new X.GAX
            r9 = r13
            r6.<init>((java.lang.Integer) r7, (java.lang.Integer) r8, (java.util.List) r9, (int) r10, (int) r11)
            r0 = 1
            X.Pm1 r0 = X.C73921Pm1.A00(r12, r0)
            monitor-enter(r3)
            goto L_0x0054
        L_0x004a:
            java.lang.Integer[] r0 = A04
            r8 = r0[r6]
            goto L_0x003d
        L_0x004f:
            java.lang.Integer[] r0 = A05
            r7 = r0[r6]
            goto L_0x002b
        L_0x0054:
            r3.A00 = r6     // Catch:{ all -> 0x0089 }
            r3.A03 = r0     // Catch:{ all -> 0x0089 }
            X.C71062Oah.A02(r3)     // Catch:{ all -> 0x0089 }
            monitor-exit(r3)
            boolean r0 = X.DbT.A1b(r13)
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r12.A03
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x007c
            com.instagram.user.model.User r0 = X.DbV.A0j(r4, r0)
            if (r0 == 0) goto L_0x0074
            java.lang.String r1 = r0.getFullName()
            if (r1 != 0) goto L_0x0075
        L_0x0074:
            r1 = r2
        L_0x0075:
            X.O5c r0 = new X.O5c
            r0.<init>(r1)
        L_0x007a:
            monitor-enter(r3)
            goto L_0x0082
        L_0x007c:
            X.O5c r0 = new X.O5c
            r0.<init>(r2)
            goto L_0x007a
        L_0x0082:
            r3.A02 = r0     // Catch:{ all -> 0x0089 }
            X.C71062Oah.A02(r3)     // Catch:{ all -> 0x0089 }
            monitor-exit(r3)
        L_0x0088:
            return
        L_0x0089:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OVJ.A00(java.util.ArrayList):void");
    }

    public OVJ(UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
    }
}
