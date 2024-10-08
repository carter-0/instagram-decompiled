package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.NUq  reason: case insensitive filesystem */
public final class C68730NUq extends NJT implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A02 = NJT.A0A(C68730NUq.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeEnterCodeIntroFragment";
    public final C319956rV A00 = NJT.A01(this, 49);
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C73908Plj(this, 48));

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
        AnonymousClass0eM r2 = this.A01;
        C68714NUa.A05((C68714NUa) r2.getValue(), "NORMAL_RESTORE");
        C66580MXl.A0U(r2).A0B("OTC_LANDING_NUX_IMPRESSION");
        C66580MXl.A0U(r2).A0E("IS_OTC_V2", false);
        C71407Ok6.A02((C3021461u) AnonymousClass7TF.A0F(requireView(), R.id.bottom_button), this, 23);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(requireView(), R.id.enter_code_intro_headline);
        igdsHeadline.setHeadline(2131961677);
        igdsHeadline.setBody(2131961676);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_lock_confirmation_refresh);
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
        return NJT.A08(this.A00, this, A02);
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
        int A022 = AnonymousClass0fD.A02(-1909475726);
        0qQ.A0B(layoutInflater, 0);
        C68730NUq.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_enter_code_intro_v2_fragment, viewGroup, false);
        NJT.A04(inflate, this);
        AnonymousClass0fD.A09(1253579093, A022);
        return inflate;
    }
}
