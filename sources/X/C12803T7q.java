package X;

import android.view.View;

/* renamed from: X.T7q  reason: case insensitive filesystem */
public final class C12803T7q implements AnonymousClass6ZA {
    public final /* synthetic */ T7B A00;
    public final /* synthetic */ AnonymousClass6a7 A01;

    public final /* synthetic */ void CtS() {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C12803T7q(T7B t7b, AnonymousClass6a7 r2) {
        this.A00 = t7b;
        this.A01 = r2;
    }

    public final void D9e() {
        T7B t7b = this.A00;
        T7B.A01(t7b, "ctc_confirmation_dialog_cancel");
        14i.A06(t7b);
        AnonymousClass6a7 r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public final void Din(View view, int i) {
        AnonymousClass6a7 r0 = this.A01;
        if (r0 != null) {
            r0.A00();
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
