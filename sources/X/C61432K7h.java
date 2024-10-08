package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams;

/* renamed from: X.K7h  reason: case insensitive filesystem */
public final class C61432K7h extends AnonymousClass4DH implements C273494mf, G9c {
    public static final String __redex_internal_original_name = "CreationGenAIAttributionBottomSheetFragment";
    public CreationGenAIAttributionBottomSheetParams A00;
    public C66509MUn A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final Integer A03 = AnonymousClass05K.A0j;
    public final String A04 = "creation_gen_ai_attribution_bottom_sheet";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final Integer BkZ() {
        return this.A03;
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
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
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
        int A022 = AnonymousClass0fD.A02(-458537383);
        C61432K7h.super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("arg_params");
        if (parcelable != null) {
            this.A00 = (CreationGenAIAttributionBottomSheetParams) parcelable;
            AnonymousClass0fD.A09(-628405149, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-775555823, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1611403508);
        ComposeView A0H = DbV.A0H(this, new C59112J6u(this, 41), -1994678701);
        AnonymousClass0fD.A09(1158140470, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(171314123);
        super.onDestroy();
        this.A01 = null;
        AnonymousClass0fD.A09(-445568865, A022);
    }
}
