package X;

import com.instagram.common.session.UserSession;

public final class IZW implements C273494mf {
    public final UserSession A00;

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
        if (182.A06(0Tu.A06, this.A00, 36321584939935271L)) {
            return EVS.LOWEST_PARTIAL_STATE;
        }
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

    public final double getSwipeUpDistanceAdjustment() {
        return 182.A00(0Tu.A06, this.A00, 37166009870320026L);
    }

    public final float getSwipeUpFlingVelocity() {
        return C51965G9l.A00(0Tu.A06, this.A00, 37166009870188953L);
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

    public IZW(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }
}
