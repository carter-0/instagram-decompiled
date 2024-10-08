package X;

import android.view.View;

public final class IVE implements AnonymousClass6ZA, C273494mf, C273504mg {
    public final int A00;
    public final Object A01;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public IVE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ void CtS() {
    }

    public final void D9e() {
        switch (this.A00) {
            case 0:
                ((C72369P3i) this.A01).A05.Cyg();
                return;
            case 2:
                2eQ.A06((View) this.A01, 500);
                return;
            case 4:
                C68478NJv.A03((C68478NJv) this.A01).A03(true);
                return;
            case 6:
                ((C52031GCd) this.A01).A0A.Cud();
                return;
            case 7:
                ((C51922G7q) this.A01).onDismiss();
                return;
            case 8:
                C55821Ho4 ho4 = (C55821Ho4) this.A01;
                ho4.A04.A0M(ho4.A01, (Integer) null, (String) null, (String) null, "three_dot_menu");
                return;
            default:
                return;
        }
    }

    public final void Din(View view, int i) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(view, 1);
                ((C72369P3i) this.A01).A05.Cyg();
                return;
            case 4:
                if (i != 0) {
                    C68478NJv.A03((C68478NJv) this.A01).A03(true);
                    return;
                }
                return;
            case 5:
                ((C59631JQz) this.A01).CtT(i);
                return;
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
        switch (this.A00) {
            case 1:
            case 2:
            case 7:
                return false;
            default:
                return true;
        }
    }

    public final /* synthetic */ void onBottomSheetClosed() {
        switch (this.A00) {
            case 1:
                ((C332257Ug) this.A01).Cyg();
                return;
            case 5:
                ((C59631JQz) this.A01).CtR();
                return;
            default:
                return;
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

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }
}
