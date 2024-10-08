package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class K7L extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "ShareToBarcelonaAutoPostUpsellFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final String A01 = "share_to_barcelona_auto_post_upsell";

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
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MXB mxb;
        String str;
        int A02 = AnonymousClass0fD.A02(545057463);
        AnonymousClass0eM r6 = this.A00;
        C347427wn r0 = (C347427wn) C347397wk.A00(AnonymousClass7TE.A0l(r6)).A02.getValue();
        C62623Kiu kiu = null;
        if (r0 != null) {
            mxb = r0.CGy();
            if (mxb != null) {
                kiu = mxb.AXt();
            }
        } else {
            mxb = null;
        }
        boolean A1W = AnonymousClass7TF.A1W(kiu, C62623Kiu.PRIVATE);
        if (mxb == null || (str = mxb.getUsername()) == null) {
            str = "";
        }
        C367998ru.A01(AnonymousClass818.IG_FEED_COMPOSER_SHARE_BUTTON, AnonymousClass819.BOTTOMSHEET_FEED_THREADS, AnonymousClass7TE.A0l(r6));
        ComposeView A0H = DbV.A0H(this, new J7Q(this, str, 2, A1W), 594046426);
        AnonymousClass0fD.A09(-666808957, A02);
        return A0H;
    }
}
