package X;

public final class IZV implements C273494mf {
    public final C54512HGy A00;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean includeFragmentDragSpace() {
        return true;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final boolean useCustomScrollDetermination() {
        return true;
    }

    public final EVS backPressDestination() {
        return this.A00.A05;
    }

    public final boolean doNotDismissOnDraggingDown() {
        C54512HGy hGy = this.A00;
        if (!hGy.A0B || hGy.A0A) {
            return false;
        }
        return true;
    }

    public final boolean doNotDragWhenDismissLocked() {
        C54512HGy hGy = this.A00;
        if (!hGy.A0B || hGy.A0A) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final double getDragUpReleaseRatio() {
        return this.A00.A00;
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

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }

    public IZV(C54512HGy hGy) {
        this.A00 = hGy;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
