package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.44N  reason: invalid class name */
public final class AnonymousClass44N implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass44N(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final X.AnonymousClass6BN E4Y(X.AnonymousClass651 r11, X.AnonymousClass653 r12, java.util.List r13, java.util.Map r14, X.0sL r15, X.0sL r16, boolean r17) {
        /*
            r10 = this;
            r0 = 0
            X.0qQ.A0B(r14, r0)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            r0 = 2
            X.0qQ.A0B(r12, r0)
            r0 = 5
            X.0qQ.A0B(r15, r0)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r4 = r14.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            com.instagram.common.session.UserSession r3 = r10.A00
            r2 = 0
            X.0Tu r5 = X.0Tu.A05
            r0 = 2342159521797509553(0x208105ad000a11b1, double:4.0626288471422245E-152)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x012f
            if (r4 == 0) goto L_0x012f
            java.lang.String r1 = r12.A00
            java.lang.String r6 = "add"
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "remove"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x012f
        L_0x003c:
            java.lang.Object r5 = r15.invoke(r4, r11)
            X.2Eq r5 = (X.2Eq) r5
            if (r5 != 0) goto L_0x0047
            X.XPd r0 = X.C21215XPd.A00
            return r0
        L_0x0047:
            r0 = 0
            X.C70148Ny2.A00(r3, r11, r4, r0)
            X.0c5 r1 = X.0c9.A04     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = r12.A02     // Catch:{ IOException -> 0x0121 }
            X.0qQ.A06(r0)     // Catch:{ IOException -> 0x0121 }
            X.0c9 r0 = r1.A01(r3, r0)     // Catch:{ IOException -> 0x0121 }
            X.Cui r3 = X.C44665Cij.parseFromJson(r0)     // Catch:{ IOException -> 0x0121 }
            X.0qQ.A07(r3)     // Catch:{ IOException -> 0x0121 }
            X.2Dm r4 = r10.A01     // Catch:{ IOException -> 0x0121 }
            com.instagram.model.direct.DirectThreadKey r1 = r5.BJy()     // Catch:{ IOException -> 0x0121 }
            int r0 = r3.A00     // Catch:{ IOException -> 0x0121 }
            r4.FLs(r1, r0)     // Catch:{ IOException -> 0x0121 }
            java.lang.String r1 = r12.A00     // Catch:{ IOException -> 0x0121 }
            boolean r0 = X.0qQ.A0K(r1, r6)     // Catch:{ IOException -> 0x0121 }
            if (r0 == 0) goto L_0x00be
            com.instagram.model.direct.DirectThreadKey r0 = r5.BJy()     // Catch:{ IOException -> 0x0121 }
            java.util.List r9 = r3.A01     // Catch:{ IOException -> 0x0121 }
            java.util.List r8 = r3.A02     // Catch:{ IOException -> 0x0121 }
            r7 = r4
            X.2Dr r7 = (X.2Dr) r7     // Catch:{ IOException -> 0x0121 }
            monitor-enter(r4)     // Catch:{ IOException -> 0x0121 }
            X.48S r6 = r7.A0P(r0)     // Catch:{ all -> 0x011b }
            if (r6 == 0) goto L_0x0119
            X.3U9 r5 = r6.A0I     // Catch:{ all -> 0x011b }
            java.util.List r0 = r5.BRZ()     // Catch:{ all -> 0x011b }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x011b }
            r3.<init>(r0)     // Catch:{ all -> 0x011b }
            X.3Te r1 = r6.A0L()     // Catch:{ all -> 0x011b }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x011b }
            if (r9 == 0) goto L_0x00a1
            java.util.List r0 = r1.A0B     // Catch:{ all -> 0x011b }
            java.util.List r0 = X.AEL.A02(r0, r9)     // Catch:{ all -> 0x011b }
            r1.A0B = r0     // Catch:{ all -> 0x011b }
            r3.addAll(r9)     // Catch:{ all -> 0x011b }
        L_0x00a1:
            if (r8 == 0) goto L_0x00ae
            java.util.List r0 = r1.A0D     // Catch:{ all -> 0x011b }
            java.util.List r0 = X.AEL.A02(r0, r8)     // Catch:{ all -> 0x011b }
            r1.A0D = r0     // Catch:{ all -> 0x011b }
            r3.addAll(r8)     // Catch:{ all -> 0x011b }
        L_0x00ae:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x011b }
            r0.<init>(r3)     // Catch:{ all -> 0x011b }
            X.C370828x8.A01(r5, r0)     // Catch:{ all -> 0x011b }
            X.2Kb r0 = r6.A0M(r1)     // Catch:{ all -> 0x011b }
            X.2Dr.A0E(r0, r7, r2)     // Catch:{ all -> 0x011b }
            goto L_0x0119
        L_0x00be:
            java.lang.String r0 = "remove"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ IOException -> 0x0121 }
            if (r0 == 0) goto L_0x011e
            com.instagram.model.direct.DirectThreadKey r0 = r5.BJy()     // Catch:{ IOException -> 0x0121 }
            java.util.List r9 = r3.A01     // Catch:{ IOException -> 0x0121 }
            java.util.List r8 = r3.A02     // Catch:{ IOException -> 0x0121 }
            r6 = r4
            X.2Dr r6 = (X.2Dr) r6     // Catch:{ IOException -> 0x0121 }
            monitor-enter(r4)     // Catch:{ IOException -> 0x0121 }
            X.48S r7 = r6.A0P(r0)     // Catch:{ all -> 0x011b }
            if (r7 == 0) goto L_0x0119
            X.3U9 r5 = r7.A0I     // Catch:{ all -> 0x011b }
            java.util.List r0 = r5.BRZ()     // Catch:{ all -> 0x011b }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x011b }
            r3.<init>(r0)     // Catch:{ all -> 0x011b }
            X.3Te r1 = r7.A0L()     // Catch:{ all -> 0x011b }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x011b }
            if (r9 == 0) goto L_0x00fd
            java.util.List r0 = r1.A0B     // Catch:{ all -> 0x011b }
            java.util.ArrayList r0 = X.AEL.A00(r0, r9)     // Catch:{ all -> 0x011b }
            r1.A0B = r0     // Catch:{ all -> 0x011b }
            java.util.List r0 = r1.A0D     // Catch:{ all -> 0x011b }
            java.util.List r0 = X.AEL.A01(r9, r0)     // Catch:{ all -> 0x011b }
            r3.removeAll(r0)     // Catch:{ all -> 0x011b }
        L_0x00fd:
            if (r8 == 0) goto L_0x010a
            java.util.List r0 = r1.A0D     // Catch:{ all -> 0x011b }
            java.util.ArrayList r0 = X.AEL.A00(r0, r8)     // Catch:{ all -> 0x011b }
            r1.A0D = r0     // Catch:{ all -> 0x011b }
            r3.removeAll(r8)     // Catch:{ all -> 0x011b }
        L_0x010a:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x011b }
            r0.<init>(r3)     // Catch:{ all -> 0x011b }
            X.C370828x8.A01(r5, r0)     // Catch:{ all -> 0x011b }
            X.2Kb r0 = r7.A0M(r1)     // Catch:{ all -> 0x011b }
            X.2Dr.A0E(r0, r6, r2)     // Catch:{ all -> 0x011b }
        L_0x0119:
            monitor-exit(r4)     // Catch:{ IOException -> 0x0121 }
            goto L_0x011e
        L_0x011b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x0121 }
            throw r0     // Catch:{ IOException -> 0x0121 }
        L_0x011e:
            X.6BL r0 = X.AnonymousClass6BL.A00
            return r0
        L_0x0121:
            r2 = move-exception
            java.lang.String r1 = "invalid broadcast collaborator format"
            java.lang.String r0 = "Invalid Collaborator format"
            X.0wb.A03(r1, r0)
            X.6BR r0 = new X.6BR
            r0.<init>(r2, r1, r1)
            return r0
        L_0x012f:
            X.6BO r0 = X.AnonymousClass6BO.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass44N.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }
}
