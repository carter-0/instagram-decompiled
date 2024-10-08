package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Fly  reason: case insensitive filesystem */
public final class C50971Fly implements C273494mf {
    public final /* synthetic */ UserDetailFragment A00;
    public final /* synthetic */ Boolean A01;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C50971Fly(UserDetailFragment userDetailFragment, Boolean bool) {
        this.A00 = userDetailFragment;
        this.A01 = bool;
    }

    public final EVS backPressDestination() {
        return EVS.LOWEST_PARTIAL_STATE;
    }

    public final boolean doNotDismissOnDraggingDown() {
        return !this.A01.booleanValue();
    }

    public final boolean doNotDragWhenDismissLocked() {
        return !this.A01.booleanValue();
    }

    public final boolean doNotFlingWhenDismissLocked() {
        return !this.A01.booleanValue();
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
        return Double.valueOf(182.A00(0Tu.A06, this.A00.A0I, 37164974783857022L)).doubleValue();
    }

    public final float getSwipeUpFlingVelocity() {
        return Double.valueOf(182.A00(0Tu.A06, this.A00.A0I, 37164974783725949L)).floatValue();
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
}
