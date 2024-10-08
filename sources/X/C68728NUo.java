package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.NUo  reason: case insensitive filesystem */
public final class C68728NUo extends NJT implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A01 = NJT.A0A(C68728NUo.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsMexUpsellNuxFragment";
    public final C319956rV A00 = NJT.A02(this, 14);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "encrypted_backups_mex_upsell_nux_fragment";
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
        return NJT.A09(this.A00, this, A01, 0);
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
        int A02 = AnonymousClass0fD.A02(1382842918);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.encryptedbackups_mex_upsell_nux, viewGroup, false);
        IgdsHeadline A0O = C66584MXp.A0O(inflate);
        FGX A022 = FGX.A02(requireContext(), true);
        A022.A05(getString(2131966496), DbW.A0h(requireContext(), DbV.A05(this).getString(R.string.f0nameremoved), 2131966494), R.drawable.instagram_device_phone_pano_outline_24);
        FGX.A03(A022, A0O, getString(2131966497), getString(2131966495), R.drawable.instagram_lock_pano_outline_24);
        C71407Ok6.A02((C3021461u) AnonymousClass7TF.A0F(inflate, R.id.bottom_buttons), this, 27);
        AnonymousClass0fD.A09(-583406569, A02);
        return inflate;
    }
}
