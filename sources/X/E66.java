package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class E66 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "RestrictInfoBottomSheetFragmentImpl";
    public View A00;
    public 0wc A01;
    public C48088EVg A02;
    public C51889G6e A03;
    public String A04;
    public String A05;
    public boolean A06;
    public ImageUrl A07;
    public String A08;
    public boolean A09;
    public final 1YZ A0A = 1YZ.A02;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007b, code lost:
        if (r0.booleanValue() == false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r6 = 0
            r7 = r21
            X.0qQ.A0B(r7, r6)
            r8 = r20
            r0 = r22
            super.onViewCreated(r7, r0)
            r0 = 2131439944(0x7f0b3148, float:1.8501857E38)
            android.view.View r14 = X.AnonymousClass7TF.A0F(r7, r0)
            com.instagram.igds.components.headline.IgdsHeadline r14 = (com.instagram.igds.components.headline.IgdsHeadline) r14
            X.0wW r3 = r8.getSession()
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321486155294136(0x810a33000025b8, double:3.0331923272689696E-306)
            boolean r13 = X.182.A06(r2, r3, r0)
            r4 = 1
            java.lang.String r2 = "targetDisplayedUsername"
            if (r13 == 0) goto L_0x012e
            r1 = 2131972341(0x7f1350f5, float:1.9581687E38)
            java.lang.String r0 = r8.A08
            if (r0 == 0) goto L_0x0197
            java.lang.String r0 = X.DbV.A0z(r8, r0, r1)
            r14.setHeadline((java.lang.CharSequence) r0)
            r0 = 2131972340(0x7f1350f4, float:1.9581685E38)
            r14.setBody((int) r0)
        L_0x003e:
            com.instagram.common.typedurl.ImageUrl r15 = r8.A07
            if (r15 == 0) goto L_0x0051
            java.lang.String r0 = r8.A08
            if (r0 == 0) goto L_0x0197
            r17 = 0
            r18 = r17
            r19 = r17
            r16 = r0
            r14.setCircularImageUrl(r15, r16, r17, r18, r19)
        L_0x0051:
            X.72z r0 = X.C3255272z.DEFAULT
            r14.setType(r0)
            android.content.Context r12 = r8.requireContext()
            if (r13 == 0) goto L_0x00d4
            X.0eE r0 = X.AnonymousClass0t1.A01
            X.0eM r10 = r8.A0B
            com.instagram.user.model.User r2 = X.DbX.A0l(r0, r10)
            java.lang.Integer r1 = r2.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x007d
            X.4Cl r0 = r2.A03
            java.lang.Boolean r0 = r0.Cae()
            if (r0 == 0) goto L_0x007d
            boolean r0 = r0.booleanValue()
            r3 = 2131972350(0x7f1350fe, float:1.9581705E38)
            if (r0 != 0) goto L_0x0080
        L_0x007d:
            r3 = 2131972349(0x7f1350fd, float:1.9581703E38)
        L_0x0080:
            android.content.Context r1 = r8.requireContext()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2 = 0
            X.FGX r9 = X.FGX.A01(r1, r0)
            r0 = 2131972345(0x7f1350f9, float:1.9581695E38)
            java.lang.String r1 = r12.getString(r0)
            r0 = 2131238268(0x7f081d7c, float:1.809281E38)
            r9.A05(r2, r1, r0)
            r0 = 2131972342(0x7f1350f6, float:1.9581689E38)
            java.lang.String r1 = r12.getString(r0)
            r0 = 2131238148(0x7f081d04, float:1.8092567E38)
            r9.A05(r2, r1, r0)
            java.lang.String r1 = r12.getString(r3)
            r0 = 2131238858(0x7f081fca, float:1.8094007E38)
            r9.A05(r2, r1, r0)
        L_0x00b1:
            java.util.List r0 = r9.A04()
            r14.setBulletList(r0)
            r0 = 2131439942(0x7f0b3146, float:1.8501853E38)
            android.view.View r0 = r7.requireViewById(r0)
            r8.A00 = r0
            r0 = 2131439948(0x7f0b314c, float:1.8501866E38)
            android.view.View r3 = X.AnonymousClass7TF.A0F(r7, r0)
            X.61u r3 = (X.C3021461u) r3
            boolean r0 = r8.A09
            if (r0 == 0) goto L_0x013e
            r0 = 8
            r3.setVisibility(r0)
            return
        L_0x00d4:
            X.0eM r10 = r8.A0B
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r10)
            boolean r0 = X.C272094k5.A09(r0)
            r11 = 2131972321(0x7f1350e1, float:1.9581646E38)
            if (r0 == 0) goto L_0x00e6
            r11 = 2131972320(0x7f1350e0, float:1.9581644E38)
        L_0x00e6:
            android.content.Context r1 = r8.requireContext()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r5 = 0
            X.FGX r9 = X.FGX.A01(r1, r0)
            r0 = 2131972361(0x7f135109, float:1.9581727E38)
            java.lang.String r1 = r12.getString(r0)
            r0 = 2131238780(0x7f081f7c, float:1.8093848E38)
            r9.A05(r1, r5, r0)
            X.EVg r1 = r8.A02
            java.lang.String r4 = "entryPoint"
            if (r1 == 0) goto L_0x019b
            X.EVg r3 = X.C48088EVg.REPLY_REPORTING
            r0 = 2131972319(0x7f1350df, float:1.9581642E38)
            if (r1 != r3) goto L_0x0110
            r0 = 2131972352(0x7f135100, float:1.958171E38)
        L_0x0110:
            java.lang.String r2 = r12.getString(r0)
            X.EVg r1 = r8.A02
            if (r1 == 0) goto L_0x019b
            r0 = 2131238148(0x7f081d04, float:1.8092567E38)
            if (r1 != r3) goto L_0x0120
            r0 = 2131238713(0x7f081f39, float:1.8093712E38)
        L_0x0120:
            r9.A05(r2, r5, r0)
            java.lang.String r1 = r12.getString(r11)
            r0 = 2131238210(0x7f081d42, float:1.8092692E38)
            r9.A05(r1, r5, r0)
            goto L_0x00b1
        L_0x012e:
            r1 = 2131972312(0x7f1350d8, float:1.9581628E38)
            java.lang.String r0 = r8.A08
            if (r0 == 0) goto L_0x0197
            java.lang.String r0 = X.DbV.A0z(r8, r0, r1)
            r14.setHeadline((java.lang.CharSequence) r0)
            goto L_0x003e
        L_0x013e:
            r3.setVisibility(r6)
            r1 = 6
            X.OkD r0 = new X.OkD
            r0.<init>(r1, r8, r3)
            r3.addOnLayoutChangeListener(r0)
            X.EVg r1 = r8.A02
            java.lang.String r2 = "entryPoint"
            if (r1 == 0) goto L_0x0197
            X.EVg r0 = X.C48088EVg.REPLY_REPORTING
            if (r1 == r0) goto L_0x0158
            X.EVg r0 = X.C48088EVg.COMMENT_REPORTING
            if (r1 != r0) goto L_0x0170
        L_0x0158:
            X.0wW r0 = r8.getSession()
            X.0qQ.A0B(r0, r6)
            X.02m r2 = X.02m.A0p
            X.0qQ.A07(r2)
            r1 = 309476254(0x12723b9e, float:7.643522E-28)
            r0 = 3893(0xf35, float:5.455E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.markerPoint(r1, r0)
        L_0x0170:
            r0 = 2131972311(0x7f1350d7, float:1.9581626E38)
            if (r13 == 0) goto L_0x0178
            r0 = 2131972313(0x7f1350d9, float:1.958163E38)
        L_0x0178:
            java.lang.String r1 = r8.getString(r0)
            r0 = 69
            X.FP4 r0 = X.FP4.A00(r8, r0)
            r3.setPrimaryAction(r1, r0)
            X.1Av r0 = X.DbX.A0h(r10)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "restrict_info_bottomsheet_shown_count"
            int r0 = r2.getInt(r1, r6)
            int r0 = r0 + 1
            X.AnonymousClass7TG.A1M(r2, r1, r0)
            return
        L_0x0197:
            X.0qQ.A0F(r2)
            goto L_0x019e
        L_0x019b:
            X.0qQ.A0F(r4)
        L_0x019e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E66.onViewCreated(android.view.View, android.os.Bundle):void");
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
        return "restrict_half_sheet";
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
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

    public final boolean isScrolledToTop() {
        View view = this.A00;
        if (view == null || view.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public E66() {
        0eO r2 = 0eO.A02;
        this.A0B = AnonymousClass0eN.A00(r2, new C58175Inf(this, 38));
        this.A0C = AnonymousClass0eN.A00(r2, new C58175Inf(this, 37));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        C48088EVg eVg;
        int A022 = AnonymousClass0fD.A02(-993508712);
        E66.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AnonymousClass0kN.A01(this, getSession());
        Object obj = requireArguments.get(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (!(obj instanceof C48088EVg) || (eVg = (C48088EVg) obj) == null) {
            eVg = C48088EVg.UNKNOWN;
        }
        this.A02 = eVg;
        this.A04 = requireArguments.getString("analytics_extra");
        this.A05 = requireArguments.getString("target_user_id", "");
        this.A08 = requireArguments.getString("target_username", "");
        this.A07 = (ImageUrl) requireArguments.getParcelable("target_profile_url");
        this.A09 = requireArguments.getBoolean("hide_action_button");
        this.A06 = requireArguments.getBoolean("dont_dismiss_on_restrict_success");
        AnonymousClass0fD.A09(1421280467, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-451799264);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_restrict_user_bottom_sheet, false);
        AnonymousClass0fD.A09(1046787591, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(197923933);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(-704684650, A022);
    }
}
