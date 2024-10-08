package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public final class E5B extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "MultiBlockBottomSheetFragment";
    public int A00;
    public G7R A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public View A06;
    public ImageUrl A07;
    public String A08;
    public boolean A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public static final void A00(E5B e5b, boolean z) {
        e5b.A03 = true;
        DbX.A14(e5b.requireContext(), AnonymousClass37D.A00);
        I21 i21 = I21.A00;
        AnonymousClass0eM r4 = e5b.A0A;
        0lg A0R = DbY.A0R(r4);
        02m r2 = 02m.A0p;
        0qQ.A07(r2);
        r2.markerPoint(309476254, AnonymousClass000.A00(2706));
        i21.A01(A0R);
        i21.A01(DbT.A0X(r4));
        G7R g7r = e5b.A01;
        if (g7r != null) {
            g7r.D5T(2, z);
        } else {
            0qQ.A0F("callback");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "multi_block_bottom_sheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0073, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbT.A0X(r4), 36321438910653822L) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0165, code lost:
        if (X.AnonymousClass48O.A01(r1) != false) goto L_0x0167;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r3 = 0
            X.0qQ.A0B(r14, r3)
            super.onViewCreated(r14, r15)
            X.0eM r4 = r13.A0A
            java.lang.Object r0 = r4.getValue()
            X.0qQ.A0B(r0, r3)
            X.02m r2 = X.02m.A0p
            X.0qQ.A07(r2)
            r1 = 309476254(0x12723b9e, float:7.643522E-28)
            r0 = 2707(0xa93, float:3.793E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.markerPoint(r1, r0)
            r0 = 2131436595(0x7f0b2433, float:1.8495065E38)
            android.view.View r7 = r14.findViewById(r0)
            com.instagram.igds.components.headline.IgdsHeadline r7 = (com.instagram.igds.components.headline.IgdsHeadline) r7
            com.instagram.common.typedurl.ImageUrl r8 = r13.A07
            if (r8 != 0) goto L_0x0038
            java.lang.String r5 = "targetProfilePicUrl"
        L_0x0030:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0038:
            java.lang.String r9 = r13.A08
            java.lang.String r5 = "targetUsername"
            if (r9 == 0) goto L_0x0030
            r10 = 0
            r11 = r10
            r12 = r10
            r7.setCircularImageUrl(r8, r9, r10, r11, r12)
            android.content.res.Resources r2 = X.DbV.A05(r13)
            r1 = 2131967709(0x7f133edd, float:1.9572292E38)
            r6 = 1
            java.lang.String r0 = r13.A08
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r2, r0, r1)
            r7.setHeadline((java.lang.CharSequence) r0)
            android.content.Context r0 = r13.requireContext()
            boolean r0 = X.0oI.A09(r0)
            if (r0 == 0) goto L_0x0075
            X.0lg r5 = X.DbT.A0X(r4)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321438910653822(0x810a280000257e, double:3.033162449568196E-306)
            boolean r1 = X.182.A06(r2, r5, r0)
            r0 = 2131975314(0x7f135c92, float:1.9587717E38)
            if (r1 != 0) goto L_0x0078
        L_0x0075:
            r0 = 2131967705(0x7f133ed9, float:1.9572284E38)
        L_0x0078:
            r7.setBody((int) r0)
            android.content.Context r2 = r13.requireContext()
            boolean r0 = X.0oI.A09(r2)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            if (r0 == 0) goto L_0x0133
            X.0lg r5 = X.DbT.A0X(r4)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321438910653822(0x810a280000257e, double:3.033162449568196E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0133
            android.content.Context r0 = r13.requireContext()
            r5 = 4
            X.FGX r4 = new X.FGX
            r4.<init>((android.content.Context) r0, (java.lang.Boolean) r6, (int) r5)
            r0 = 2131975317(0x7f135c95, float:1.9587723E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131238102(0x7f081cd6, float:1.8092473E38)
            r4.A05(r10, r1, r0)
            r0 = 2131975316(0x7f135c94, float:1.958772E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131238268(0x7f081d7c, float:1.809281E38)
            r4.A05(r10, r1, r0)
            r0 = 2131967710(0x7f133ede, float:1.9572294E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131237867(0x7f081beb, float:1.8091997E38)
            r4.A05(r10, r1, r0)
        L_0x00cb:
            java.util.List r0 = r4.A04()
            r7.setBulletList(r0)
            r0 = 2131436592(0x7f0b2430, float:1.8495059E38)
            android.view.View r3 = r14.findViewById(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r3 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r3
            r0 = 51
            X.FP4 r0 = X.FP4.A00(r13, r0)
            r3.setPrimaryActionOnClickListener(r0)
            boolean r0 = r13.A09
            if (r0 == 0) goto L_0x010a
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131953889(0x7f1308e1, float:1.9544262E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 52
            X.FP4 r0 = X.FP4.A00(r13, r0)
            r3.setSecondaryAction(r1, r0)
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131953890(0x7f1308e2, float:1.9544264E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setFooterText(r0)
        L_0x010a:
            X.37E r1 = X.AnonymousClass37D.A00
            android.content.Context r0 = r13.requireContext()
            X.37D r2 = r1.A02(r0)
            if (r2 == 0) goto L_0x0121
            r1 = 8
            X.FmI r0 = new X.FmI
            r0.<init>(r13, r1)
            X.37F r2 = (X.AnonymousClass37F) r2
            r2.A0H = r0
        L_0x0121:
            r0 = 2131436594(0x7f0b2432, float:1.8495063E38)
            android.view.View r1 = r14.findViewById(r0)
            r13.A06 = r1
            X.OkD r0 = new X.OkD
            r0.<init>(r5, r1, r3)
            r3.addOnLayoutChangeListener(r0)
            return
        L_0x0133:
            android.content.Context r0 = r13.requireContext()
            r5 = 4
            X.FGX r4 = new X.FGX
            r4.<init>((android.content.Context) r0, (java.lang.Boolean) r6, (int) r5)
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x018d
            r1 = 2131967712(0x7f133ee0, float:1.9572298E38)
        L_0x0144:
            java.lang.String r1 = r2.getString(r1)
            r0 = 2131238149(0x7f081d05, float:1.8092569E38)
            r4.A05(r10, r1, r0)
            boolean r0 = r13.A04
            if (r0 == 0) goto L_0x0189
            int r1 = r13.A00
            boolean r0 = X.AnonymousClass48O.A02(r1)
            if (r0 != 0) goto L_0x0167
            r0 = 29
            if (r1 == r0) goto L_0x0167
            boolean r1 = X.AnonymousClass48O.A01(r1)
            r0 = 2131967708(0x7f133edc, float:1.957229E38)
            if (r1 == 0) goto L_0x016a
        L_0x0167:
            r0 = 2131967706(0x7f133eda, float:1.9572286E38)
        L_0x016a:
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131237867(0x7f081beb, float:1.8091997E38)
            r4.A05(r10, r1, r0)
            android.content.res.Resources r2 = r2.getResources()
            r1 = 2131967711(0x7f133edf, float:1.9572296E38)
            java.lang.String[] r0 = new java.lang.String[r3]
            android.text.Spanned r1 = X.0bC.A01(r2, r0, r1)
            r0 = 2131238771(0x7f081f73, float:1.809383E38)
            r4.A05(r10, r1, r0)
            goto L_0x00cb
        L_0x0189:
            r0 = 2131967710(0x7f133ede, float:1.9572294E38)
            goto L_0x016a
        L_0x018d:
            boolean r0 = r13.A02
            r1 = 2131967713(0x7f133ee1, float:1.95723E38)
            if (r0 == 0) goto L_0x0144
            r1 = 2131967707(0x7f133edb, float:1.9572288E38)
            goto L_0x0144
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E5B.onViewCreated(android.view.View, android.os.Bundle):void");
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
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
        View view = this.A06;
        if (view == null || view.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.1qK, java.lang.Object] */
    public final boolean onBackPressed() {
        G7R g7r = this.A01;
        if (g7r != null) {
            g7r.onCancel();
            DbX.A0R(this.A0A).A00(new Object());
            return false;
        }
        0qQ.A0F("callback");
        throw AnonymousClass00P.createAndThrow();
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
        int A022 = AnonymousClass0fD.A02(1119870091);
        E5B.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A08 = C320236s2.A01(requireArguments, C66579MXk.A00(107));
        this.A07 = (ImageUrl) C320236s2.A00(requireArguments, ImageUrl.class, "arg_target_profile_pic_url");
        if (DbT.A1X(requireArguments, "arg_is_report_after_block_supported")) {
            this.A09 = 182.A06(0Tu.A05, DbT.A0X(this.A0A), 36313978552518998L);
        }
        this.A04 = requireArguments.getBoolean("arg_is_group_chat_admin");
        this.A00 = requireArguments.getInt("arg_thread_sub_type");
        this.A05 = requireArguments.getBoolean("arg_is_user_subscribed_to_creator");
        this.A02 = requireArguments.getBoolean("arg_is_block_from_comment_deletion_upsell");
        AnonymousClass0fD.A09(-1940870215, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1100570233);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.multi_block_bottom_sheet_fragment, false);
        AnonymousClass0fD.A09(1947606470, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1312152395);
        super.onDestroyView();
        this.A06 = null;
        I21.A00.A00(DbT.A0X(this.A0A));
        AnonymousClass0fD.A09(40210306, A022);
    }
}
