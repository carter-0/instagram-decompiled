package X;

import android.widget.ImageView;

/* renamed from: X.WfV  reason: case insensitive filesystem */
public final class C19788WfV implements XCE {
    public final /* synthetic */ C17530VZj A00;
    public final /* synthetic */ C310236ae A01;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C19788WfV(C17530VZj vZj, C310236ae r2) {
        this.A01 = r2;
        this.A00 = vZj;
    }

    public final void DdB() {
        Integer num;
        C17530VZj vZj = this.A00;
        Integer num2 = vZj.A04;
        if (num2 == AnonymousClass05K.A0C) {
            ImageView imageView = vZj.A00;
            imageView.setImageDrawable(new C299325uw(AnonymousClass7TE.A0S(imageView), vZj.A01, vZj.A03, AnonymousClass05K.A01, num2));
        } else {
            C299325uw r2 = vZj.A02;
            if (new C310296al(vZj.A01).A01(vZj.A03)) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            if (num != r2.A00) {
                r2.A00 = num;
                C299325uw.A00(r2);
            }
        }
        vZj.A00.setContentDescription(vZj.A02.A0B());
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
