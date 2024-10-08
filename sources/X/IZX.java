package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;

public final class IZX implements C273494mf {
    public final ClipsViewerConfig A00;

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
        Integer num;
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null) {
            num = clipsWatchAndBrowseData.A07;
        } else {
            num = null;
        }
        if (num == AnonymousClass05K.A01 && clipsWatchAndBrowseData != null && clipsWatchAndBrowseData.A0H) {
            return EVS.LOWEST_PARTIAL_STATE;
        }
        return EVS.CLOSED_STATE;
    }

    public final boolean doNotDismissOnDraggingDown() {
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData == null || !clipsWatchAndBrowseData.A0B) {
            return false;
        }
        return true;
    }

    public final boolean doNotDragWhenDismissLocked() {
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData == null || !clipsWatchAndBrowseData.A0B) {
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
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null) {
            return clipsWatchAndBrowseData.A00;
        }
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final double getSwipeDownDistanceAdjustment() {
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null) {
            return clipsWatchAndBrowseData.A01;
        }
        return 0.0d;
    }

    public final float getSwipeDownFlingVelocity() {
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null) {
            return clipsWatchAndBrowseData.A05;
        }
        return 3500.0f;
    }

    public final double getSwipeUpDistanceAdjustment() {
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null) {
            return clipsWatchAndBrowseData.A02;
        }
        return 0.0d;
    }

    public final float getSwipeUpFlingVelocity() {
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null) {
            return clipsWatchAndBrowseData.A06;
        }
        return 3500.0f;
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

    public IZX(ClipsViewerConfig clipsViewerConfig) {
        this.A00 = clipsViewerConfig;
    }
}
