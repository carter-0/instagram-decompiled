package X;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: X.Lro  reason: case insensitive filesystem */
public final class C65348Lro implements AnonymousClass6ZA, C273494mf, C273504mg {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65348Lro(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* synthetic */ void CtS() {
    }

    public final void D9e() {
        switch (this.A00) {
            case 0:
                JTU.A1J(C62495Kgl.DISMISSED_WITHOUT_SELECTION, (1IX) this.A01);
                return;
            case 1:
                Object obj = ((0rm) this.A01).A00;
                if (obj != null) {
                    JWG jwg = (JWG) this.A02;
                    if (obj.equals(jwg.A01)) {
                        jwg.A01 = null;
                        jwg.A02 = null;
                        27p.A01(jwg.A08).A1l("EXIT_DIALOG_CANCEL");
                        return;
                    }
                    return;
                }
                return;
            case 2:
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.A01;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(C19201WPh.A0X);
                    C311396cc r0 = (C311396cc) this.A02;
                    if (r0 != null) {
                        r0.onDismiss();
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0y();
            case 3:
                C46430Der.A0J((C46430Der) this.A02, "following_overflow_menu_cancelled", DbS.A0q(this.A01));
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void Din(View view, int i) {
        switch (this.A00) {
            case 1:
                Object obj = ((0rm) this.A01).A00;
                if (obj != null) {
                    JWG jwg = (JWG) this.A02;
                    if (obj.equals(jwg.A01)) {
                        jwg.A01 = null;
                        jwg.A02 = null;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.A01;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(C19201WPh.A0X);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            default:
                return;
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
        if (3 - this.A00 != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
        if (4 - this.A00 == 0) {
            ((C52033GCf) this.A02).A0E.A00();
            2eQ.A06((View) this.A01, 1000);
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

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }
}
