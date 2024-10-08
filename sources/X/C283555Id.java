package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.5Id  reason: invalid class name and case insensitive filesystem */
public final class C283555Id implements AnonymousClass11X {
    public final UserSession A00;
    public final 2br A01;
    public final C228012ke A02;
    public final List A03;

    public C283555Id(UserSession userSession, 2br r3, C228012ke r4, List list) {
        0qQ.A0B(r4, 2);
        0qQ.A0B(userSession, 4);
        this.A03 = list;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = userSession;
    }

    public final String getName() {
        return "QP SDK Choose Promotions Callback";
    }

    public final int getRunnableId() {
        return 958178636;
    }

    public final void onCancel() {
    }

    public final void onStart() {
    }

    public final void run() {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onFinish() {
        /*
            r11 = this;
            X.2br r1 = r11.A01     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "fetch_callback_invoked"
            r1.AVz(r0)     // Catch:{ all -> 0x0089 }
            X.2ke r0 = r11.A02     // Catch:{ all -> 0x0089 }
            java.util.List r1 = r11.A03     // Catch:{ all -> 0x0089 }
            X.2bu r8 = r0.A00     // Catch:{ all -> 0x0089 }
            X.2br r7 = r8.A09     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "process_promotion"
            r7.AVz(r0)     // Catch:{ all -> 0x0089 }
            r8.A00 = r1     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "all_triggers_sdk"
            r7.AVz(r0)     // Catch:{ all -> 0x0089 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x003b
            monitor-enter(r8)     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "no promotion available"
            r7.AVz(r0)     // Catch:{ all -> 0x0086 }
            r7.AVs()     // Catch:{ all -> 0x0086 }
            java.util.Set r0 = r8.A0E     // Catch:{ all -> 0x0086 }
            r0.clear()     // Catch:{ all -> 0x0086 }
            X.2bX r0 = r8.A08     // Catch:{ all -> 0x0086 }
            r0.DUR()     // Catch:{ all -> 0x0086 }
            r0 = 0
            r8.A00 = r0     // Catch:{ all -> 0x0086 }
            X.C283565Ie.A00()     // Catch:{ all -> 0x0086 }
            goto L_0x0082
        L_0x003b:
            X.0Yt.A0E()     // Catch:{ all -> 0x0089 }
            java.lang.Class<com.instagram.quickpromotion.intf.QuickPromotionSurface> r1 = com.instagram.quickpromotion.intf.QuickPromotionSurface.class
            java.util.EnumMap r0 = new java.util.EnumMap     // Catch:{ all -> 0x0089 }
            r0.<init>(r1)     // Catch:{ all -> 0x0089 }
            monitor-enter(r8)     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "promotion_available"
            r7.AVz(r0)     // Catch:{ all -> 0x0086 }
            java.util.Set r0 = r8.A0E     // Catch:{ all -> 0x0086 }
            r0.clear()     // Catch:{ all -> 0x0086 }
            X.2bX r3 = r8.A08     // Catch:{ all -> 0x0086 }
            r3.AHF()     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "clash_manage_in_progress"
            r7.AVz(r0)     // Catch:{ all -> 0x0086 }
            X.2bw r0 = r8.A0D     // Catch:{ all -> 0x0086 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r2 = r0.A00     // Catch:{ all -> 0x0086 }
            X.2bx r0 = r8.A0C     // Catch:{ all -> 0x0086 }
            X.Dcs r1 = new X.Dcs     // Catch:{ all -> 0x0086 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0086 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0086 }
            r10.<init>()     // Catch:{ all -> 0x0086 }
            java.util.List r0 = r8.A00     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0071
            r10.addAll(r0)     // Catch:{ all -> 0x0086 }
        L_0x0071:
            r0 = 0
            r8.A00 = r0     // Catch:{ all -> 0x0086 }
            X.01V.A1D(r10, r1)     // Catch:{ all -> 0x0086 }
            com.instagram.common.session.UserSession r6 = r8.A07     // Catch:{ all -> 0x0086 }
            android.content.Context r4 = r8.A05     // Catch:{ all -> 0x0086 }
            com.instagram.quickpromotion.intf.QuickPromotionSlot r9 = r8.A0A     // Catch:{ all -> 0x0086 }
            X.0iw r5 = r8.A06     // Catch:{ all -> 0x0086 }
            r3.EIf(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0086 }
        L_0x0082:
            monitor-exit(r8)     // Catch:{ all -> 0x0089 }
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x0089 }
            goto L_0x008f
        L_0x0086:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            X.0eQ r0 = new X.0eQ
            r0.<init>(r1)
        L_0x008f:
            java.lang.Throwable r3 = X.0eR.A00(r0)
            if (r3 == 0) goto L_0x00a5
            com.instagram.common.session.UserSession r2 = r11.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            java.lang.String r0 = "Error in SDK choose promotions callback processing"
            X.C46436Dey.A00(r2, r1, r0, r3)
            X.2br r1 = r11.A01
            java.lang.String r0 = "fetch_callback_error"
            r1.AVv(r0)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C283555Id.onFinish():void");
    }
}
