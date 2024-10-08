package X;

import com.instagram.user.model.UpcomingEvent;
import java.util.List;

public final class PRU implements XCE {
    public final /* synthetic */ C68181N3w A00;
    public final /* synthetic */ PI2 A01;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public PRU(C68181N3w n3w, PI2 pi2) {
        this.A01 = pi2;
        this.A00 = n3w;
    }

    public final void DdB() {
        Object value;
        N4F n4f;
        List list;
        C67732Mtl mtl = this.A01.A06;
        UpcomingEvent upcomingEvent = mtl.A02;
        if (upcomingEvent != null) {
            boolean A012 = mtl.A01.A06.A01(upcomingEvent);
            05G r4 = mtl.A04;
            do {
                value = r4.getValue();
                n4f = (N4F) value;
                boolean z = n4f.A05;
                list = n4f.A04;
                if (z != A012) {
                    list = 00k.A0T(new PI8(A012), list);
                }
            } while (!r4.AIY(value, N4F.A01(n4f, n4f.A02, list, A012)));
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
