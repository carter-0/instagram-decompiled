package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.UbL  reason: case insensitive filesystem */
public abstract class C15368UbL extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "VariantSelectorFragment";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void A01(C20926X4r x4r) {
        if (this instanceof C16240Ur3) {
            ((C16240Ur3) this).A00.A02 = x4r;
        } else if (this instanceof C16241Ur4) {
            ((C16241Ur4) this).A01.A00 = x4r;
        } else {
            C16242Ur5 ur5 = (C16242Ur5) this;
            ur5.A02.A00 = x4r;
            ur5.A03.A00 = x4r;
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

    public final boolean isScrolledToTop() {
        if (this instanceof C16240Ur3) {
            return true;
        }
        if (this instanceof C16241Ur4) {
            RecyclerView recyclerView = ((C16241Ur4) this).A00;
            if (recyclerView != null) {
                return !JTP.A1Y(recyclerView);
            }
            return false;
        }
        C16242Ur5 ur5 = (C16242Ur5) this;
        RecyclerView recyclerView2 = ur5.A00;
        if (recyclerView2 != null && !recyclerView2.canScrollVertically(-1)) {
            return true;
        }
        RecyclerView recyclerView3 = ur5.A01;
        if (recyclerView3 == null || recyclerView3.canScrollVertically(-1)) {
            return false;
        }
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
