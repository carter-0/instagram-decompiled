package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lrn  reason: case insensitive filesystem */
public final class C65347Lrn implements AnonymousClass6ZA {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ boolean A01;

    public final /* synthetic */ void CtS() {
    }

    public final /* synthetic */ void Din(View view, int i) {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C65347Lrn(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }

    public final void D9e() {
        String str;
        UserSession userSession = this.A00;
        boolean z = this.A01;
        27r A012 = 27p.A01(userSession);
        if (z) {
            str = "RESUME_DRAFT_EXIT_DIALOG_CANCEL";
        } else {
            str = "EXIT_DIALOG_CANCEL";
        }
        A012.A1l(str);
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
