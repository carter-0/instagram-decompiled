package X;

import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;

/* renamed from: X.PQa  reason: case insensitive filesystem */
public final class C72942PQa implements C273494mf {
    public final /* synthetic */ C71085Ob8 A00;
    public final /* synthetic */ NKM A01;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public C72942PQa(C71085Ob8 ob8, NKM nkm) {
        this.A01 = nkm;
        this.A00 = ob8;
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
        OZV ozv = this.A01.A00;
        if (ozv != null) {
            return C2808154f.A03(ozv.A09);
        }
        0qQ.A0F("reactionsPickerController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onBottomSheetClosed() {
        FrameLayout frameLayout = this.A00.A0N;
        if (frameLayout.getVisibility() == 8) {
            frameLayout.setVisibility(0);
        }
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        C71085Ob8 ob8 = this.A00;
        int i3 = ob8.A02;
        if (i3 == -1) {
            ob8.A02 = i;
            i3 = i;
        }
        float f = ((float) (i3 - i)) / ((float) i3);
        if (182.A06(0Tu.A05, ob8.A0Q, 36326816209713136L)) {
            f /= 0.65f;
            if (f > 1.0f) {
                f = 1.0f;
            }
        }
        float f2 = ob8.A01;
        float f3 = ob8.A00;
        float f4 = f3 + ((f2 - f3) * f);
        ob8.A04(ob8.A0A, f4);
        int height = ob8.A0N.getHeight();
        View view = ob8.A04;
        if (view != null) {
            view.setTranslationY(f4 + ((float) height));
        }
        View view2 = ob8.A04;
        if (view2 != null) {
            view2.setAlpha(f);
        }
        ob8.A0R.getView().setAlpha(f);
        ob8.A0L.setAlpha(f);
        if (ob8.A0b || ob8.A0c || ob8.A0d) {
            C71091OcD ocD = ob8.A08;
            if (ocD != null) {
                float f5 = 1.0f - f;
                IgTextView igTextView = ocD.A05;
                if (igTextView != null) {
                    int i4 = ocD.A02;
                    if (i4 == 0) {
                        i4 = igTextView.getHeight();
                        ocD.A02 = i4;
                    }
                    igTextView.setHeight((int) (((float) i4) * f5));
                    igTextView.setAlpha(f5);
                }
            }
            0qQ.A0F("reactionsTrayController");
            throw AnonymousClass00P.createAndThrow();
        }
        C71091OcD ocD2 = ob8.A08;
        if (ocD2 != null) {
            ocD2.A05(1.0f - f);
            IgSegmentedTabLayout2 igSegmentedTabLayout2 = this.A01.A02;
            if (igSegmentedTabLayout2 != null) {
                igSegmentedTabLayout2.setTranslationY((-f) * ((float) i));
                return;
            }
            return;
        }
        0qQ.A0F("reactionsTrayController");
        throw AnonymousClass00P.createAndThrow();
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
