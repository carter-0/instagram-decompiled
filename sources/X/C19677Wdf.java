package X;

/* renamed from: X.Wdf  reason: case insensitive filesystem */
public final class C19677Wdf implements C273494mf, C273504mg {
    public final int A00;

    public C19677Wdf(int i) {
        this.A00 = i;
    }

    public final /* synthetic */ EVS backPressDestination() {
        if (this.A00 != 0) {
            return EVS.LOWEST_PARTIAL_STATE;
        }
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
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
        if (this.A00 != 0) {
            return 200.0d;
        }
        return 0.0d;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        if (this.A00 != 0) {
            return 1500.0f;
        }
        return 3500.0f;
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
        if (this.A00 != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }
}
