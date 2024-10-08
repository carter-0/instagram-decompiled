package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class K7S extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "CreationGenAIFeatureUnavailableBottomSheetFragment";
    public C66509MUn A00;
    public String A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C66218MIz(this, 31));
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final String A04 = "creation_gen_ai_feature_unavailable_bottom_sheet";

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
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
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
        String string;
        int A022 = AnonymousClass0fD.A02(280883326);
        K7S.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("args_media_id")) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(1208874136, A022);
            throw A0y;
        }
        this.A01 = string;
        AnonymousClass0fD.A09(-424870112, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-302576905);
        ComposeView A0H = DbV.A0H(this, new C59112J6u(this, 43), 2062520665);
        AnonymousClass0fD.A09(-1467846720, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-575386075);
        super.onDestroy();
        this.A00 = null;
        AnonymousClass0fD.A09(492483321, A022);
    }
}
