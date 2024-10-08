package X;

/* renamed from: X.Flx  reason: case insensitive filesystem */
public final class C50970Flx implements C273494mf {
    public final /* synthetic */ C314626ia A00;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C50970Flx(C314626ia r1) {
        this.A00 = r1;
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
        return true;
    }

    public final void onBottomSheetClosed() {
        this.A00.A08.DcF();
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
