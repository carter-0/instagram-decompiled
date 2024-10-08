package X;

import android.view.View;

public final class PHL implements AnonymousClass6ZA {
    public final /* synthetic */ OIR A00;
    public final /* synthetic */ OIR A01;
    public final /* synthetic */ C72366P3f A02;
    public final /* synthetic */ C72367P3g A03;

    public final /* synthetic */ void CtS() {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public PHL(OIR oir, OIR oir2, C72366P3f p3f, C72367P3g p3g) {
        this.A03 = p3g;
        this.A00 = oir;
        this.A01 = oir2;
        this.A02 = p3f;
    }

    public final void D9e() {
        this.A03.DUZ(this.A00);
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

    public final void Din(View view, int i) {
        AnonymousClass7TF.A0D().postDelayed(new C73359PbI(this.A01, this.A00, this.A02, this.A03), 200);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
