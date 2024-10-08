package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.NUs  reason: case insensitive filesystem */
public final class C68732NUs extends NJT implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A03 = NJT.A0A(C68732NUs.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeRestoreFragment";
    public final C319956rV A00 = NJT.A02(this, 3);
    public final AnonymousClass0eM A01 = NJT.A03(this, 0eO.A02, 1);
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C73663Phc(this, 2));

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r2 = this.A02;
        C68714NUa.A05((C68714NUa) r2.getValue(), "NORMAL_RESTORE");
        C66580MXl.A0U(r2).A0B("OTC_LANDING_NUX_IMPRESSION");
        C66580MXl.A0U(r2).A0E("IS_OTC_V2", true);
        C3021461u r1 = (C3021461u) AnonymousClass7TF.A0F(requireView(), R.id.bottom_button);
        r1.setPrimaryActionText(getString(2131961682));
        C71407Ok6.A02(r1, this, 24);
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
        return NJT.A08(this.A00, this, A03);
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1908526628);
        0qQ.A0B(layoutInflater, 0);
        C68732NUs.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_otc_restore_fragment, viewGroup, false);
        IgdsHeadline A0O = C66584MXp.A0O(inflate);
        A0O.setHeadline(2131961687);
        A0O.setImageResource(R.drawable.ig_illustrations_illo_one_time_code_warning_refresh);
        FGX A012 = FGX.A01(requireContext(), AnonymousClass7TE.A0v());
        A012.A05((CharSequence) null, getString(2131961680), R.drawable.instagram_eye_pano_outline_24);
        A012.A05((CharSequence) null, getString(2131961681), R.drawable.instagram_reshare_pano_outline_24);
        FGX.A03(A012, A0O, (CharSequence) null, getString(2131961679), R.drawable.instagram_phone_verified_pano_outline_24);
        C71145Oe2.A05(DbX.A0I(inflate, R.id.container), this, NJT.A00(C66581MXm.A0S(this.A01)));
        AnonymousClass0fD.A09(752355487, A022);
        return inflate;
    }
}
