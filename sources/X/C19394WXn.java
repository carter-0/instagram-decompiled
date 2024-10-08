package X;

import android.view.View;

/* renamed from: X.WXn  reason: case insensitive filesystem */
public final class C19394WXn implements AnonymousClass6ZA {
    public final /* synthetic */ 0wc A00;
    public final /* synthetic */ C18697Vwv A01;
    public final /* synthetic */ String A02;

    public final /* synthetic */ void Din(View view, int i) {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C19394WXn(0wc r1, C18697Vwv vwv, String str) {
        this.A00 = r1;
        this.A01 = vwv;
        this.A02 = str;
    }

    public final void CtS() {
        C18697Vwv.A01(AnonymousClass7TE.A0e(this.A00, "ig_add_collaborator_edit_confirmation_impression"), this.A02);
    }

    public final void D9e() {
        C18697Vwv.A01(AnonymousClass7TE.A0e(this.A00, "ig_add_collaborator_edit_confirmation_dismiss_tap"), this.A02);
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
}
