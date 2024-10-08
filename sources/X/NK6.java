package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.direct.capabilities.Capabilities;

public final class NK6 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "ThreadDetailsNotificationsBottomSheetFragment";
    public View A00;
    public C74449Pv4 A01;
    public N4P A02;
    public boolean A03;
    public 1a8 A04;
    public Capabilities A05;
    public final C358618bC A06 = new C72739PHt(this, 5);
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final C358618bC A08 = new C72739PHt(this, 4);
    public final String A09 = "direct_thread_info_notification";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1129951919);
        NK6.super.onCreate(bundle);
        this.A05 = (Capabilities) C320236s2.A00(requireArguments(), Capabilities.class, "DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        AnonymousClass0fD.A09(607859828, A022);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r22, android.view.ViewGroup r23, android.os.Bundle r24) {
        /*
            r21 = this;
            r0 = -1291037531(0xffffffffb30c54a5, float:-3.2673274E-8)
            int r6 = X.AnonymousClass0fD.A02(r0)
            r7 = 0
            r2 = r22
            X.0qQ.A0B(r2, r7)
            r14 = r21
            X.N4P r0 = r14.A02
            r3 = 0
            if (r0 != 0) goto L_0x001b
            r0 = 1109927350(0x422825b6, float:42.036827)
            X.AnonymousClass0fD.A09(r0, r6)
            return r3
        L_0x001b:
            r0 = 2131625154(0x7f0e04c2, float:1.8877508E38)
            r1 = r23
            android.view.View r0 = X.C66583MXo.A0A(r2, r1, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.1a8 r1 = X.C66580MXl.A0O()
            r14.A04 = r1
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.N4P r1 = r14.A02
            java.lang.String r11 = "threadDetailInfo"
            if (r1 == 0) goto L_0x00e5
            X.3sy r1 = r1.A08()
            boolean r1 = X.C66647MaG.A0F(r1)
            if (r1 != 0) goto L_0x01d5
            X.0eM r1 = r14.A07
            X.0lg r8 = X.DbT.A0X(r1)
            X.0Tu r1 = X.0Tu.A06
            r4 = 36319308607593595(0x810838000b1c7b, double:3.0318152373348667E-306)
            boolean r1 = X.182.A06(r1, r8, r4)
            if (r1 != 0) goto L_0x01d5
            X.8bC r9 = r14.A06
        L_0x0055:
            X.0eM r1 = r14.A07
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r1)
            android.content.Context r13 = r14.requireContext()
            X.N4P r8 = r14.A02
            if (r8 == 0) goto L_0x00e5
            X.1a8 r15 = r14.A04
            java.lang.String r5 = "Required value was null."
            if (r15 == 0) goto L_0x01e0
            X.Pv4 r4 = r14.A01
            java.lang.String r10 = "clientInfra"
            if (r4 == 0) goto L_0x01d0
            X.P2n r12 = new X.P2n
            r17 = r4
            r18 = r8
            r19 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            com.instagram.common.session.UserSession r16 = X.C66581MXm.A0R(r12, r2, r1)
            X.N4P r9 = r14.A02
            if (r9 == 0) goto L_0x00e5
            boolean r8 = r9.A0o
            X.8bC r4 = r14.A06
            X.1a8 r15 = r14.A04
            if (r15 == 0) goto L_0x01e8
            X.Pv4 r5 = r14.A01
            if (r5 == 0) goto L_0x01d0
            X.P2m r13 = new X.P2m
            r17 = r5
            r18 = r9
            r19 = r4
            r20 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            com.instagram.common.session.UserSession r15 = X.C66581MXm.A0R(r13, r2, r1)
            X.N4P r5 = r14.A02
            if (r5 == 0) goto L_0x00e5
            X.3sy r18 = r5.A08()
            X.N4P r5 = r14.A02
            if (r5 == 0) goto L_0x00e5
            X.P2d r13 = new X.P2d
            r16 = r5
            r17 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            com.instagram.common.session.UserSession r15 = X.C66581MXm.A0R(r13, r2, r1)
            X.N4P r5 = r14.A02
            if (r5 == 0) goto L_0x00e5
            X.3sy r19 = r5.A08()
            X.N4P r8 = r14.A02
            if (r8 == 0) goto L_0x00e5
            X.Pv4 r5 = r14.A01
            if (r5 == 0) goto L_0x01d0
            android.content.Context r13 = r14.requireContext()
            X.P2l r12 = new X.P2l
            r16 = r5
            r17 = r8
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            com.instagram.common.session.UserSession r10 = X.C66581MXm.A0R(r12, r2, r1)
            X.N4P r9 = r14.A02
            if (r9 == 0) goto L_0x00e5
            com.instagram.direct.capabilities.Capabilities r8 = r14.A05
            if (r8 != 0) goto L_0x00ed
            java.lang.String r11 = "threadCapabilities"
        L_0x00e5:
            X.0qQ.A0F(r11)
        L_0x00e8:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x00ed:
            X.1Av r5 = X.1Au.A00(r10)
            X.P2V r4 = new X.P2V
            r4.<init>(r10, r8, r9, r5)
            com.instagram.common.session.UserSession r15 = X.C66581MXm.A0R(r4, r2, r1)
            X.N4P r4 = r14.A02
            if (r4 == 0) goto L_0x00e5
            android.content.Context r13 = r14.requireContext()
            boolean r1 = r14.A03
            X.P2c r12 = new X.P2c
            r16 = r4
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r2.add(r12)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r2.iterator()
        L_0x0118:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x012f
            java.lang.Object r2 = r4.next()
            r1 = r2
            X.PuA r1 = (X.C74394PuA) r1
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L_0x0118
            r5.add(r2)
            goto L_0x0118
        L_0x012f:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r5.iterator()
        L_0x0137:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x014b
            java.lang.Object r1 = r2.next()
            X.PuA r1 = (X.C74394PuA) r1
            java.util.List r1 = r1.getItems()
            X.018.A16(r1, r4)
            goto L_0x0137
        L_0x014b:
            java.util.Iterator r8 = r4.iterator()
        L_0x014f:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x01d9
            java.lang.Object r4 = r8.next()
            boolean r1 = r4 instanceof X.PR9
            if (r1 == 0) goto L_0x01a1
            android.content.Context r1 = r14.requireContext()
            X.AnonymousClass7TF.A1H(r1, r0)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r1)
            r1 = 2131629226(0x7f0e14aa, float:1.8885767E38)
            android.view.View r5 = X.DbU.A0A(r2, r0, r1, r7)
            X.Mz1 r1 = new X.Mz1
            r1.<init>(r5)
            r5.setTag(r1)
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r1.A06
            X.C48947Eml.A00(r5, r1)
            boolean r1 = r4 instanceof X.C69187Ngl
            if (r1 == 0) goto L_0x018d
            r14.A00 = r5
            X.8bC r2 = r14.A08
            X.N4P r1 = r14.A02
            if (r1 == 0) goto L_0x00e5
            boolean r1 = r1.A0w
            r2.onToggle(r1)
        L_0x018d:
            r0.addView(r5)
            java.lang.Object r2 = r5.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.ui.menu.SimpleSwitchRowViewBinder.Holder"
            X.0qQ.A0C(r2, r1)
            X.Mz1 r2 = (X.Mz1) r2
            X.PR9 r4 = (X.PR9) r4
            X.O31.A00(r3, r2, r3, r4)
            goto L_0x014f
        L_0x01a1:
            boolean r1 = r4 instanceof X.FGF
            if (r1 == 0) goto L_0x01c6
            android.content.Context r1 = r14.requireContext()
            X.Mw9 r1 = X.ORK.A00(r1, r0)
            android.view.View r1 = r1.itemView
            X.0qQ.A07(r1)
            r0.addView(r1)
            java.lang.Object r2 = r1.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.ui.menu.SimpleTextRowViewBinder.Holder"
            X.0qQ.A0C(r2, r1)
            X.Mw9 r2 = (X.C67865Mw9) r2
            X.FGF r4 = (X.FGF) r4
            X.ORK.A01(r2, r4)
            goto L_0x014f
        L_0x01c6:
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L_0x014f
            android.view.View r4 = (android.view.View) r4
            r0.addView(r4)
            goto L_0x014f
        L_0x01d0:
            X.0qQ.A0F(r10)
            goto L_0x00e8
        L_0x01d5:
            X.8bC r9 = r14.A08
            goto L_0x0055
        L_0x01d9:
            r1 = -60994642(0xfffffffffc5d4bae, float:-4.5961303E36)
            X.AnonymousClass0fD.A09(r1, r6)
            return r0
        L_0x01e0:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r5)
            r0 = -1973252570(0xffffffff8a628e26, float:-1.0908239E-32)
            goto L_0x01ef
        L_0x01e8:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r5)
            r0 = -847627891(0xffffffffcd7a398d, float:-2.62379728E8)
        L_0x01ef:
            X.AnonymousClass0fD.A09(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NK6.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1963618681);
        super.onDestroyView();
        1a8 r0 = this.A04;
        if (r0 != null) {
            r0.A01();
        }
        this.A04 = null;
        AnonymousClass0fD.A09(998158443, A022);
    }
}
