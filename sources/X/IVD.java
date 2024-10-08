package X;

import android.view.View;

public final class IVD implements AnonymousClass6ZA, C273494mf, C273504mg {
    public final int A00;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public IVD(int i) {
        this.A00 = i;
    }

    public final /* synthetic */ void CtS() {
    }

    public final /* synthetic */ void D9e() {
        if (2 - this.A00 == 0) {
            C307976Sf.A00();
        }
    }

    public final /* synthetic */ void Din(View view, int i) {
        if (2 - this.A00 == 0) {
            C307976Sf.A00();
        }
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
        if (2 - this.A00 != 0) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
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

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }
}
