package X;

import android.view.View;

/* renamed from: X.Lyq  reason: case insensitive filesystem */
public final class C65736Lyq implements C273494mf {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LDJ A01;
    public final /* synthetic */ boolean A02;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public C65736Lyq(LDJ ldj, int i, boolean z) {
        this.A02 = z;
        this.A01 = ldj;
        this.A00 = i;
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

    public final void onBottomSheetPositionChanged(int i, int i2) {
        View view;
        float A002;
        if (this.A02 && (view = this.A01.A00) != null) {
            int i3 = this.A00;
            if (view.getHeight() == 0) {
                A002 = 0.0f;
            } else {
                A002 = JTP.A00((float) i, view);
            }
            float min = Math.min(1.0f, Math.max(JTP.A00(((float) i) - ((1.0f - Math.min(1.0f, Math.max(A002, 0.0f))) * ((float) i3)), view), 0.0f));
            view.setScaleX(min);
            view.setScaleY(min);
        }
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
