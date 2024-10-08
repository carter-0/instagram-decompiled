package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.NUr  reason: case insensitive filesystem */
public final class C68731NUr extends NJT implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A02 = NJT.A0A(C68731NUr.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsPinSellWarnNuxV3Fragment";
    public final C319956rV A00 = NJT.A02(this, 44);
    public final AnonymousClass0eM A01;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "encrypted_backups_pin_sell_nux_v3_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void afterOnViewCreated() {
        ((C67719MtY) this.A01.getValue()).A00.A0B("SOFT_BLOCK_PIN_LEADING_SCREEN_IMPRESSION");
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
        return NJT.A09(this.A00, this, A02, 0);
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, java.lang.Object, X.NUr] */
    public C68731NUr() {
        C73663Phc phc = new C73663Phc(this, 48);
        AnonymousClass0eM A03 = NJT.A03(new C73663Phc(this, 45), 0eO.A02, 46);
        this.A01 = DbS.A0I(new C73663Phc(A03, 47), phc, C73915Plq.A00(A03, (Object) null, 5), DbS.A0z(C67719MtY.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(441758768);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_pin_sell_warn_nux_v3, viewGroup, false);
        IgdsHeadline A0O = C66584MXp.A0O(inflate);
        FGX A012 = FGX.A01(requireContext(), AnonymousClass7TE.A0v());
        NJT.A05(this, A012, 2131961141);
        FGX.A03(A012, A0O, (CharSequence) null, getString(2131961142), R.drawable.instagram_key_pano_outline_24);
        NJT.A04(inflate, this);
        C3021461u r1 = (C3021461u) AnonymousClass7TF.A0F(inflate, R.id.bottom_buttons);
        C71407Ok6.A02(r1, this, 35);
        NJT.A07(r1, this, 36);
        AnonymousClass0fD.A09(67165886, A022);
        return inflate;
    }
}
