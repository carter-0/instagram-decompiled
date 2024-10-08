package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class KQW extends C61887KQc implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A08 = {new 01B(KQW.class, "scrollView", "getScrollView()Landroidx/core/widget/NestedScrollView;", 0)};
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveRestoreFlowV2Fragment";
    public IgdsBottomButtonLayout A00;
    public C62320sa A01 = new C67485Mof(this, 11);
    public boolean A02;
    public boolean A03;
    public final C319956rV A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;

    public final void A0K(S5E s5e) {
        A0L(false);
        JTT.A0U(this).A0H(s5e);
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "encrypted_backups_gdrive_restore_flow_2";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        double d;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        JTT.A0U(this).A0I(C71145Oe2.A01(this), AnonymousClass7TF.A1Z(this.A07));
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 40), AnonymousClass07a.A00(viewLifecycleOwner));
        ViewGroup A0I = DbX.A0I(view, R.id.container);
        if (AnonymousClass65A.A02(((AnonymousClass65E) this.A05.getValue()).A00, 36315949952274243L)) {
            d = 0.85d;
        } else {
            d = 0.75d;
        }
        C71145Oe2.A05(A0I, this, d);
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
        View view = (View) this.A04.A03(this, A08[0]);
        if (view == null || JTP.A1Y(view)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.Dde, X.6rV] */
    public KQW() {
        C67485Mof mof = new C67485Mof(this, 10);
        C67485Mof mof2 = new C67485Mof(this, 7);
        0eO r4 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r4, new C67485Mof(mof2, 8));
        this.A06 = DbS.A0I(new C67485Mof(A002, 9), mof, new C73664Phd(43, A002, (Object) null), DbS.A0z(C67715MtU.class));
        this.A07 = AnonymousClass1YB.A00(new C67485Mof(this, 12));
        this.A04 = new C46362Dde(this, new C67485Mof(this, 2));
        this.A05 = AnonymousClass0eN.A00(r4, new C67485Mof(this, 1));
    }

    public final void A0E() {
        JTT.A0U(this).A0E();
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final boolean onBackPressed() {
        JTT.A0U(this).A0E();
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-64491312);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_eb_gdrive_restore_flow_v2_layout, viewGroup, false);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(inflate, R.id.headline);
        igdsHeadline.setHeadline(2131961687);
        FGX fgx = new FGX(requireContext(), AnonymousClass7TE.A0v(), 4);
        fgx.A05((CharSequence) null, getString(2131961680), R.drawable.instagram_eye_pano_outline_24);
        fgx.A05((CharSequence) null, getString(2131961681), R.drawable.instagram_reshare_pano_outline_24);
        fgx.A05((CharSequence) null, getString(2131961675), R.drawable.instagram_phone_verified_pano_outline_24);
        igdsHeadline.setBulletList(fgx.A04());
        IgdsBottomButtonLayout A0c = DbT.A0c(inflate, R.id.bottom_buttons);
        this.A00 = A0c;
        if (A0c != null) {
            A0c.setPrimaryActionOnClickListener(LYD.A01(this, 68));
        }
        AnonymousClass0fD.A09(-1360669227, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1557406564);
        this.A00 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-619712821, A022);
    }
}
