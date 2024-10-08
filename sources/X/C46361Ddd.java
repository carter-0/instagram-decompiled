package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Ddd  reason: case insensitive filesystem */
public final class C46361Ddd {
    public UserSession A00;
    public C46365Ddh A01;
    public C46364Ddg A02;
    public C49401Ev3 A03;
    public EyJ A04;
    public EyJ A05;
    public EyJ A06;
    public EyJ A07;
    public C49517Eww A08;
    public C49518Ewx A09;
    public Integer A0A;
    public List A0B = AnonymousClass7TE.A1C();
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Set A0G = new CopyOnWriteArraySet();

    public static C46361Ddd A00(UserSession userSession) {
        return (C46361Ddd) userSession.A01(C46361Ddd.class, new C51586Fwa(userSession, 17));
    }

    public static boolean A02(C46361Ddd ddd) {
        if (!ddd.A06.A02 || !ddd.A05.A02 || !ddd.A04.A02) {
            return false;
        }
        if (ddd.A03() == AnonymousClass05K.A00 || ddd.A07.A02) {
            return true;
        }
        return false;
    }

    public final Integer A03() {
        Boolean bool = this.A04.A00;
        if (bool == null || !bool.booleanValue()) {
            return AnonymousClass05K.A00;
        }
        Boolean bool2 = this.A07.A00;
        if (bool2 == null || !bool2.booleanValue()) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A0C;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A04() {
        /*
            r17 = this;
            java.lang.String r6 = "ig_payment_settings"
            r2 = r17
            java.lang.Integer r0 = r2.A0A
            if (r0 != 0) goto L_0x00d5
            X.EyJ r4 = r2.A06
            r11 = 0
            r4.A02 = r11
            X.EyJ r0 = r2.A05
            r0.A02 = r11
            com.instagram.common.session.UserSession r0 = r2.A00
            X.0xa r3 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r1 = "has_stored_payment_info"
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L_0x0032
            r0 = 1
            boolean r0 = r3.getBoolean(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            if (r1 != 0) goto L_0x006f
        L_0x002a:
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x006f
            X.Eww r4 = r2.A08
            monitor-enter(r4)
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x002a
        L_0x0034:
            boolean r0 = r4.A01     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0083
            r0 = 1
            X.C49517Eww.A00(r4, r0)     // Catch:{ all -> 0x006c }
            X.2IS r5 = X.C41845B3m.A04()     // Catch:{ all -> 0x006c }
            r0 = 5113(0x13f9, float:7.165E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x006c }
            r5.A04(r0, r6)     // Catch:{ all -> 0x006c }
            java.lang.Class<X.Dqt> r1 = X.C47117Dqt.class
            java.lang.String r0 = "IgPaymentsSettingsInfoQuery"
            X.3Fa r3 = new X.3Fa     // Catch:{ all -> 0x006c }
            r3.<init>(r5, r1, r0, r11)     // Catch:{ all -> 0x006c }
            X.02m r1 = X.02m.A0p     // Catch:{ all -> 0x006c }
            r0 = 39059457(0x2540001, float:1.5575301E-37)
            r1.markerStart(r0)     // Catch:{ all -> 0x006c }
            com.instagram.common.session.UserSession r0 = r4.A00     // Catch:{ all -> 0x006c }
            X.1OC r3 = X.C46479Dfi.A00(r3, r0)     // Catch:{ all -> 0x006c }
            r0 = 40
            X.EDV.A00(r3, r4, r2, r0)     // Catch:{ all -> 0x006c }
            r1 = 218(0xda, float:3.05E-43)
            r0 = 3
            X.1ES.A05(r3, r1, r0, r11, r11)     // Catch:{ all -> 0x006c }
            goto L_0x0083
        L_0x006c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x006f:
            r0 = 1
            r4.A02 = r0
            r4.A00 = r1
            if (r1 == 0) goto L_0x0081
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x0081
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x007e:
            r2.A0A = r0
            goto L_0x0084
        L_0x0081:
            r0 = 0
            goto L_0x007e
        L_0x0083:
            monitor-exit(r4)
        L_0x0084:
            X.Ddg r3 = r2.A02
            monitor-enter(r3)
            boolean r0 = r3.A01     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x00cb
            r0 = 1
            X.C46364Ddg.A00(r3, r0)     // Catch:{ all -> 0x00c8 }
            r12 = 0
            X.2IS r1 = X.C41845B3m.A04()     // Catch:{ all -> 0x00c8 }
            X.2IS r0 = X.C41845B3m.A04()     // Catch:{ all -> 0x00c8 }
            X.1vR r6 = X.C41845B3m.A05()     // Catch:{ all -> 0x00c8 }
            java.util.Map r8 = r1.getParamsCopy()     // Catch:{ all -> 0x00c8 }
            java.util.Map r9 = r0.getParamsCopy()     // Catch:{ all -> 0x00c8 }
            java.lang.Class<X.9Oo> r10 = X.C378119Oo.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x00c8 }
            java.lang.String r7 = "IgDonationsEligibilityQuery"
            java.lang.String r15 = "me"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest     // Catch:{ all -> 0x00c8 }
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00c8 }
            com.instagram.common.session.UserSession r0 = r3.A00     // Catch:{ all -> 0x00c8 }
            X.1vn r4 = X.1vm.A01(r0)     // Catch:{ all -> 0x00c8 }
            r1 = 38
            X.EDV r0 = new X.EDV     // Catch:{ all -> 0x00c8 }
            r0.<init>(r1, r3, r2)     // Catch:{ all -> 0x00c8 }
            r4.A06(r5, r0)     // Catch:{ all -> 0x00c8 }
            goto L_0x00cb
        L_0x00c6:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00cb:
            monitor-exit(r3)
            X.EyJ r0 = r2.A04
            r0.A02 = r11
            X.Ddh r0 = r2.A01
            r0.A01(r2)
        L_0x00d5:
            A01(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46361Ddd.A04():void");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Eww, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.Ddg] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.Ddh] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.Ewx] */
    public C46361Ddd(UserSession userSession) {
        this.A00 = userSession;
        this.A0A = null;
        this.A03 = new C49401Ev3(userSession);
        ? obj = new Object();
        obj.A00 = userSession;
        obj.A01 = false;
        this.A08 = obj;
        ? obj2 = new Object();
        obj2.A00 = userSession;
        obj2.A01 = false;
        this.A02 = obj2;
        ? obj3 = new Object();
        obj3.A00 = userSession;
        obj3.A01 = false;
        this.A01 = obj3;
        ? obj4 = new Object();
        obj4.A00 = userSession;
        obj4.A01 = false;
        this.A09 = obj4;
        this.A06 = new EyJ();
        this.A05 = new EyJ();
        this.A04 = new EyJ();
        this.A07 = new EyJ();
        this.A0D = 182.A06(0Tu.A05, userSession, 36312625637754058L);
        0xa A032 = 1Al.A01(userSession).A03(1An.A1O);
        this.A0F = A032.getBoolean("fbpay_enabled", false);
        this.A0E = A032.getBoolean("fbpay_connected", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r10.A07.A01 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r1 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f2, code lost:
        if (X.2Ek.A01(X.0eE.A00(r6).A00()) != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ab, code lost:
        if (r1 == null) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b5, code lost:
        if (r1.booleanValue() == false) goto L_0x01ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C46361Ddd r10) {
        /*
            boolean r0 = A02(r10)
            if (r0 != 0) goto L_0x000b
            java.lang.Integer r0 = r10.A0A
            if (r0 != 0) goto L_0x000b
        L_0x000a:
            return
        L_0x000b:
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0013
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r10.A0A = r0
        L_0x0013:
            java.lang.Integer r3 = r10.A0A
            if (r3 != 0) goto L_0x003e
            X.EyJ r2 = r10.A06
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0030
            X.EyJ r0 = r10.A05
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0030
            X.EyJ r0 = r10.A04
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0030
            X.EyJ r0 = r10.A07
            boolean r1 = r0.A01
            r0 = 0
            if (r1 == 0) goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            r3 = 0
            if (r0 != 0) goto L_0x003e
            java.lang.Boolean r2 = r2.A00
            X.EyJ r0 = r10.A05
            java.lang.Boolean r1 = r0.A00
            if (r2 != 0) goto L_0x01a5
            if (r1 != 0) goto L_0x01b1
        L_0x003e:
            r10.A0A = r3
            java.util.Set r0 = r10.A0G
            java.util.Iterator r9 = r0.iterator()
        L_0x0046:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x000a
            java.lang.Object r3 = r9.next()
            com.instagram.settings.common.PaymentOptionsFragment r3 = (com.instagram.settings.common.PaymentOptionsFragment) r3
            java.lang.Integer r2 = r10.A0A
            if (r2 != 0) goto L_0x0069
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r3.emptyStateView
            if (r1 == 0) goto L_0x005f
            X.6rr r0 = X.C320156rr.EMPTY
            r1.A0P(r0)
        L_0x005f:
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0046
            X.C49952FGh.A01(r0)
            goto L_0x0046
        L_0x0069:
            java.lang.Integer r4 = r10.A03()
            r1 = 1
            X.0qQ.A0B(r4, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r4 != r0) goto L_0x013e
            if (r2 == r0) goto L_0x013e
            androidx.fragment.app.FragmentActivity r7 = r3.getActivity()
            if (r7 == 0) goto L_0x0046
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity"
            X.0qQ.A0C(r7, r0)
            X.0eM r0 = r3.A03
            java.lang.Object r6 = r0.getValue()
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.String r4 = r3.A01
            if (r4 != 0) goto L_0x009d
            java.lang.String r0 = "sessionId"
        L_0x0095:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x009d:
            r8 = 0
            X.0qQ.A0B(r6, r1)
            int r0 = r2.intValue()
            if (r0 != r1) goto L_0x0131
            X.0t1 r0 = X.0eE.A00(r6)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = r0.CPm()
            if (r0 != 0) goto L_0x00c3
            X.0t1 r0 = X.0eE.A00(r6)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.2Ek.A01(r0)
            if (r0 == 0) goto L_0x00d5
        L_0x00c3:
            r2 = 2131953829(0x7f1308a5, float:1.954414E38)
            r0 = 64
            X.FPG r1 = new X.FPG
            r1.<init>((int) r0, (java.lang.Object) r7, (java.lang.Object) r6)
            X.Fmc r0 = new X.Fmc
            r0.<init>((android.content.Context) r7, (android.view.View.OnClickListener) r1, (int) r2)
            r5.add(r8, r0)
        L_0x00d5:
            X.0t1 r0 = X.0eE.A00(r6)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = r0.CPm()
            if (r0 != 0) goto L_0x00f4
            X.0t1 r0 = X.0eE.A00(r6)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.2Ek.A01(r0)
            r1 = 2131969224(0x7f1344c8, float:1.9575365E38)
            if (r0 == 0) goto L_0x00f7
        L_0x00f4:
            r1 = 2131952085(0x7f1301d5, float:1.9540603E38)
        L_0x00f7:
            java.lang.String r0 = "IgPaymentsSettingsPaymentMethodsRoute"
            X.Fmc r0 = X.C49135Epy.A00(r7, r6, r0, r4, r1)
            r5.add(r0)
            r1 = 2131972969(0x7f135369, float:1.958296E38)
            java.lang.String r0 = "IgPaymentsSettingsSecurityPinRoute"
            X.Fmc r0 = X.C49135Epy.A00(r7, r6, r0, r4, r1)
            r5.add(r0)
            r1 = 2131956575(0x7f13135f, float:1.954971E38)
            java.lang.String r0 = "IgPaymentsSettingsContactInfoRoute"
            X.Fmc r0 = X.C49135Epy.A00(r7, r6, r0, r4, r1)
            r5.add(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312625637754058(0x810224000004ca, double:3.027588900298184E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0131
            r1 = 2131957625(0x7f131779, float:1.955184E38)
            java.lang.String r0 = "IgPaymentsSettingsShippingInfoRoute"
            X.Fmc r0 = X.C49135Epy.A00(r7, r6, r0, r4, r1)
            r5.add(r0)
        L_0x0131:
            X.NKx r0 = r3.A00
            if (r0 != 0) goto L_0x0139
            java.lang.String r0 = "adapter"
            goto L_0x0095
        L_0x0139:
            r0.setItems(r5)
            goto L_0x0046
        L_0x013e:
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r3.emptyStateView
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0149
            X.6rr r0 = X.C320156rr.ERROR
            r1.A0W(r0, r2)
        L_0x0149:
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r3.emptyStateView
            if (r1 == 0) goto L_0x0152
            X.6rr r0 = X.C320156rr.ERROR
            r1.A0V(r0, r2)
        L_0x0152:
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r3.emptyStateView
            if (r1 == 0) goto L_0x015b
            X.6rr r0 = X.C320156rr.ERROR
            r1.A0U(r0, r2)
        L_0x015b:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r4 != r0) goto L_0x0188
            r1 = 2131969235(0x7f1344d3, float:1.9575387E38)
            r0 = 2131969236(0x7f1344d4, float:1.957539E38)
            com.instagram.settings.common.PaymentOptionsFragment.A01(r3, r1, r0)
            r2 = 2131956590(0x7f13136e, float:1.954974E38)
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r3.emptyStateView
            if (r1 == 0) goto L_0x0174
            X.6rr r0 = X.C320156rr.ERROR
            r1.A0Q(r0, r2)
        L_0x0174:
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r3.emptyStateView
            if (r1 == 0) goto L_0x017d
            X.6rr r0 = X.C320156rr.ERROR
            r1.A0O(r3, r0)
        L_0x017d:
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r3.emptyStateView
            if (r1 == 0) goto L_0x0046
            X.6rr r0 = X.C320156rr.ERROR
            r1.A0P(r0)
            goto L_0x0046
        L_0x0188:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r4 != r0) goto L_0x0196
            r1 = 2131976395(0x7f1360cb, float:1.958991E38)
            r0 = 2131976396(0x7f1360cc, float:1.9589911E38)
            com.instagram.settings.common.PaymentOptionsFragment.A01(r3, r1, r0)
            goto L_0x017d
        L_0x0196:
            r1 = 2131969229(0x7f1344cd, float:1.9575375E38)
            r0 = 2131969231(0x7f1344cf, float:1.957538E38)
            com.instagram.settings.common.PaymentOptionsFragment.A01(r3, r1, r0)
            java.lang.String r0 = "settings_not_available"
            com.instagram.settings.common.PaymentOptionsFragment.A02(r3, r0)
            goto L_0x017d
        L_0x01a5:
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L_0x01b7
            if (r1 != 0) goto L_0x01b1
        L_0x01ad:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x003e
        L_0x01b1:
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x01ad
        L_0x01b7:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46361Ddd.A01(X.Ddd):void");
    }
}
