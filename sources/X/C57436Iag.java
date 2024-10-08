package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iag  reason: case insensitive filesystem */
public final class C57436Iag implements XCE {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ AnonymousClass3W1 A02;
    public final /* synthetic */ AnonymousClass3VA A03;
    public final /* synthetic */ AnonymousClass3V9 A04;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C57436Iag(UserSession userSession, 1Xj r2, AnonymousClass3W1 r3, AnonymousClass3VA r4, AnonymousClass3V9 r5) {
        this.A01 = r2;
        this.A00 = userSession;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void DdB() {
        1Xj r5 = this.A01;
        UserSession userSession = this.A00;
        boolean A6T = r5.A6T(userSession);
        AnonymousClass3V9 r3 = this.A04;
        if (A6T) {
            Context context = r3.A0F;
            AnonymousClass3VA r1 = this.A03;
            r3.A0H(C243193Xt.A03(context, userSession, r5, r1));
            r3.A0F(C243193Xt.A00(context, userSession, r5, r1));
            return;
        }
        r3.A0A();
        AnonymousClass3W1 r2 = this.A02;
        r2.A0k(false);
        r2.A07(r2.A03, this.A03.ordinal()).A00 = AnonymousClass05K.A00;
        r3.A0D();
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
