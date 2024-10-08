package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.H1m  reason: case insensitive filesystem */
public final class C54167H1m extends AnonymousClass4DH implements C273494mf, G9c {
    public static final String __redex_internal_original_name = "CreatedWithAIBottomSheetFragment";
    public 1Xj A00;
    public String A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final Integer A03 = AnonymousClass05K.A0j;
    public final String A04 = "magic_mod_created_with_ai_bottom_sheet";

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
        String string;
        int A022 = AnonymousClass0fD.A02(-1105601979);
        C54167H1m.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("args_media_id")) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(-1625155930, A022);
            throw A0y;
        }
        this.A01 = string;
        1E8 A0d = DbX.A0d(this.A02);
        String str = this.A01;
        if (str == null) {
            0qQ.A0F("mediaId");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = A0d.A02(str);
        AnonymousClass0fD.A09(-1530613941, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1638759588);
        ComposeView A0H = DbV.A0H(this, new C59112J6u(this, 39), 267308281);
        AnonymousClass0fD.A09(1885828424, A022);
        return A0H;
    }
}
