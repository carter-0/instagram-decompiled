package com.bloks.components.bkavatareditorsparkavatarpreview;

import X.02m;
import X.0nA;
import X.0qQ;
import X.2db;
import X.AnonymousClass0xx;
import X.AnonymousClass12U;
import X.AnonymousClass4CZ;
import X.C14097Tpp;
import X.C17788Vg0;
import X.C17843Vgw;
import X.C262224Cq;
import X.C276544tV;
import X.C307786Rm;
import X.C308206Td;
import X.C46604Dhk;
import X.C61042Jvg;
import X.DbS;
import X.DbV;
import X.U4Q;
import X.VLB;
import X.VLP;
import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class BKBloksAvatarEditorSparkAvatarPreviewRenderUnit extends C14097Tpp {
    public boolean A00;
    public final C17788Vg0 A01;
    public final C17788Vg0 A02;
    public final VLB A03;
    public final VLB A04;
    public final VLP A05;
    public final C17843Vgw A06;
    public final C61042Jvg A07;
    public final QuickPerformanceLogger A08;
    public final C307786Rm A09;
    public final C307786Rm A0A;
    public final C276544tV A0B;
    public final C276544tV A0C;
    public final UserSession A0D;
    public final AnonymousClass4CZ A0E;
    public final C262224Cq A0F;
    public final C262224Cq A0G;

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        Activity A002;
        0qQ.A0B(context, 0);
        if (this.A0B.A0R(52, false) && (A002 = C46604Dhk.A00(context)) != null) {
            Window window = A002.getWindow();
            0qQ.A07(window);
            2db.A08(window, true);
            2db.A02(A002, A002.getColor(R.color.fds_transparent));
        }
        return new U4Q(context, -((int) 0nA.A00(context, 1.0f)));
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Object, X.V4I] */
    /* JADX WARNING: type inference failed for: r19v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0O(android.widget.FrameLayout r22, X.C15037UKq r23, X.C15046UKz r24, X.C18073Vl1 r25, X.AnonymousClass4D7 r26) {
        /*
            r21 = this;
            r3 = 17
            r4 = r26
            boolean r0 = X.MEC.A03(r3, r4)
            r9 = r21
            if (r0 == 0) goto L_0x00ab
            r5 = r4
            X.MEC r5 = (X.MEC) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ab
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r7 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r7) goto L_0x00b4
            X.0eS.A00(r0)
        L_0x0028:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
        L_0x002c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0031:
            X.0eS.A00(r0)
            X.6Rm r1 = r9.A09
            androidx.fragment.app.Fragment r0 = X.C308206Td.A00(r1)
            X.07Z r8 = r0.getViewLifecycleOwner()
            X.4tV r3 = r9.A0B
            java.lang.Object r6 = X.C307476Qg.A06(r1, r3)
            X.VQH r6 = (X.VQH) r6
            if (r6 == 0) goto L_0x00a9
            com.instagram.common.session.UserSession r2 = r9.A0D
            android.content.Context r10 = r1.A00
            X.4Cq r1 = r9.A0F
            X.Vg0 r12 = r9.A02
            r0 = 55
            boolean r20 = r3.A0R(r0, r7)
            r5.A00 = r7
            X.VLB r13 = new X.VLB
            r13.<init>(r2)
            X.DbY.A1S(r2, r1)
            com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider r7 = new com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider
            r7.<init>(r8, r13, r2, r1)
            r8 = r24
            java.lang.Double r0 = r8.A06
            if (r0 == 0) goto L_0x009b
            double r0 = r0.doubleValue()
        L_0x006f:
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r2
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            X.V4I r9 = new X.V4I
            r9.<init>()
            r9.A01 = r2
            r9.A00 = r0
            X.UI6 r14 = new X.UI6
            r14.<init>(r13, r9, r8)
            com.facebook.commonavatarliveediting.CommonSparkAvatarPreviewController r9 = r6.A00
            r11 = r22
            r15 = r23
            r17 = r25
            r18 = r7
            r19 = r5
            r16 = r8
            java.lang.Object r0 = r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r0 != r4) goto L_0x0028
            return r4
        L_0x009b:
            com.instagram.common.session.UserSession r3 = r13.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 37162097154785499(0x8406bb000500db, double:3.564798108216113E-306)
            double r0 = X.182.A00(r2, r3, r0)
            goto L_0x006f
        L_0x00a9:
            r0 = 0
            goto L_0x002c
        L_0x00ab:
            r0 = 42
            X.MEC r5 = new X.MEC
            r5.<init>(r9, r4, r3, r0)
            goto L_0x001a
        L_0x00b4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit.A0O(android.widget.FrameLayout, X.UKq, X.UKz, X.Vl1, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [X.VQN, java.lang.Object] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A0P(android.widget.FrameLayout r11) {
        /*
            r10 = this;
            X.6Rm r6 = r10.A09
            X.4tV r3 = r10.A0B
            java.lang.Object r0 = X.C307476Qg.A06(r6, r3)
            X.VQH r0 = (X.VQH) r0
            if (r0 == 0) goto L_0x00de
            com.facebook.commonavatarliveediting.CommonSparkAvatarPreviewController r5 = r0.A00
            X.VQM r0 = X.VQM.A01
            if (r0 != 0) goto L_0x0019
            X.VQM r0 = new X.VQM
            r0.<init>()
            X.VQM.A01 = r0
        L_0x0019:
            java.util.ArrayList r0 = r0.A00
            r0.remove(r5)
            com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider r2 = r5.A00
            if (r2 == 0) goto L_0x00db
            monitor-enter(r2)
            X.MTM r4 = r2.A01     // Catch:{ all -> 0x00d7 }
            if (r4 == 0) goto L_0x006d
            com.facebook.commonavatarliveediting.CdlProviderImpl r4 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r4     // Catch:{ all -> 0x00d7 }
            monitor-enter(r4)     // Catch:{ all -> 0x00d7 }
            monitor-enter(r4)     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r0 = r4.A05     // Catch:{ all -> 0x00b5 }
            java.util.Iterator r1 = X.AnonymousClass7TF.A0s(r0)     // Catch:{ all -> 0x00b5 }
        L_0x0031:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = X.C13991Tnr.A0Y(r1)     // Catch:{ all -> 0x00b5 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00b5 }
            com.facebook.commonavatarliveediting.CdlProviderImpl.A03(r4, r0)     // Catch:{ all -> 0x00b5 }
            goto L_0x0031
        L_0x0044:
            monitor-exit(r4)     // Catch:{ all -> 0x00d4 }
            X.L7W r0 = r4.A00     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x006c
            X.LNu r0 = r0.A01     // Catch:{ all -> 0x00d4 }
            X.L5i r1 = r0.A00     // Catch:{ all -> 0x00d4 }
            if (r1 != 0) goto L_0x0055
            java.lang.String r9 = "flipperPluginBridge"
        L_0x0051:
            X.0qQ.A0F(r9)     // Catch:{ all -> 0x00d4 }
            goto L_0x00b0
        L_0x0055:
            X.Lb4 r0 = r1.A00     // Catch:{ all -> 0x00d4 }
            java.lang.String r9 = "avatarDebuggerFlipperPlugin"
            r8 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String r7 = r1.A01     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x00d4 }
            r0.remove(r7)     // Catch:{ all -> 0x00d4 }
            X.Lb4 r1 = r1.A00     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x0051
            java.lang.String r0 = "destroy"
            r1.A00(r7, r0, r8)     // Catch:{ all -> 0x00d4 }
        L_0x006c:
            monitor-exit(r4)     // Catch:{ all -> 0x00d7 }
        L_0x006d:
            r7 = 0
            r2.A01 = r7     // Catch:{ all -> 0x00d7 }
            X.VzM r4 = r2.A02     // Catch:{ all -> 0x00d7 }
            if (r4 != 0) goto L_0x007e
            java.lang.String r0 = "commonLiveEditingProvider"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x00d7 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x00d6
        L_0x007e:
            monitor-enter(r4)     // Catch:{ all -> 0x00d7 }
            java.util.List r0 = X.C18288VpB.A00     // Catch:{ all -> 0x00d4 }
            r0.remove(r4)     // Catch:{ all -> 0x00d4 }
            r4.A02 = r7     // Catch:{ all -> 0x00d4 }
            X.Vl1 r1 = r4.A05     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x008e
            r0 = 3
            r1.A05(r0)     // Catch:{ all -> 0x00d4 }
        L_0x008e:
            r4.A05 = r7     // Catch:{ all -> 0x00d4 }
            X.Vji r0 = r4.A03     // Catch:{ all -> 0x00d4 }
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = "fallbackLogic"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x00d4 }
            goto L_0x00b0
        L_0x009a:
            r0.A00()     // Catch:{ all -> 0x00d4 }
            X.VlB r1 = r4.A0B     // Catch:{ all -> 0x00d4 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A0E     // Catch:{ all -> 0x00d4 }
            r0.remove(r4)     // Catch:{ all -> 0x00d4 }
            r1.A02()     // Catch:{ all -> 0x00d4 }
            com.facebook.quicklog.QuickPerformanceLogger r1 = X.VJT.A00     // Catch:{ all -> 0x00d4 }
            if (r1 != 0) goto L_0x00b8
            java.lang.String r0 = "quickPerformanceLogger"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x00d4 }
        L_0x00b0:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x00b7
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00d4 }
        L_0x00b7:
            throw r0     // Catch:{ all -> 0x00d4 }
        L_0x00b8:
            r0 = 231933222(0xdd30526, float:1.3005118E-30)
            r1.dropAllInstancesOfMarker(r0)     // Catch:{ all -> 0x00d4 }
            X.VQN r0 = X.VQN.A01     // Catch:{ all -> 0x00d4 }
            if (r0 != 0) goto L_0x00c9
            X.VQN r0 = new X.VQN     // Catch:{ all -> 0x00d4 }
            r0.<init>()     // Catch:{ all -> 0x00d4 }
            X.VQN.A01 = r0     // Catch:{ all -> 0x00d4 }
        L_0x00c9:
            r0.A00 = r7     // Catch:{ all -> 0x00d4 }
            monitor-exit(r4)     // Catch:{ all -> 0x00d7 }
            X.X7R r0 = r2.A00     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x00da
            r0.AOt()     // Catch:{ all -> 0x00d7 }
            goto L_0x00da
        L_0x00d4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00d7 }
        L_0x00d6:
            throw r0     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00da:
            monitor-exit(r2)
        L_0x00db:
            r0 = 0
            r5.A00 = r0
        L_0x00de:
            r11.removeAllViews()
            android.content.Context r2 = r6.A00
            r1 = 52
            r0 = 0
            boolean r0 = r3.A0R(r1, r0)
            if (r0 == 0) goto L_0x00f7
            android.app.Activity r1 = X.C46604Dhk.A00(r2)
            if (r1 == 0) goto L_0x00f7
            X.2k3 r0 = X.C227842k3.DEFAULT
            X.2db.A05(r1, r0)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit.A0P(android.widget.FrameLayout):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BKBloksAvatarEditorSparkAvatarPreviewRenderUnit(C17788Vg0 vg0, C307786Rm r12, C276544tV r13) {
        super(r12, r13);
        UserSession A0A2 = C308206Td.A0A(r12);
        DbS.A1Z(A0A2);
        UserSession userSession = A0A2;
        VLB vlb = new VLB(userSession);
        AnonymousClass0xx A0J = DbV.A0J(C308206Td.A00(r12));
        0qQ.A0B(userSession, 4);
        AnonymousClass4CZ r4 = new AnonymousClass12U().A04;
        02m r3 = 02m.A0p;
        0qQ.A07(r3);
        C17843Vgw vgw = C17843Vgw.A03;
        if (vgw == null) {
            vgw = new C17843Vgw();
            C17843Vgw.A03 = vgw;
        }
        C61042Jvg jvg = new C61042Jvg(2, 1, true);
        0qQ.A0B(vgw, 8);
        this.A0C = r13;
        this.A0A = r12;
        this.A01 = vg0;
        this.A04 = vlb;
        this.A0G = A0J;
        this.A0E = r4;
        this.A08 = r3;
        this.A06 = vgw;
        this.A07 = jvg;
        this.A05 = new VLP(vlb);
        this.A0B = r13;
        this.A09 = r12;
        this.A02 = vg0;
        this.A0D = userSession;
        this.A03 = vlb;
        this.A0F = A0J;
    }
}
