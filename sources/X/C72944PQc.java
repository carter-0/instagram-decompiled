package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.PQc  reason: case insensitive filesystem */
public final class C72944PQc implements C273494mf, C273504mg {
    public final int A00;
    public final Object A01;

    public C72944PQc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r5) {
        if (1 - this.A00 == 0) {
            0qQ.A0B(r5, 0);
            C68467NJf nJf = (C68467NJf) this.A01;
            ViewGroup viewGroup = (ViewGroup) r5.getView();
            0qQ.A0B(viewGroup, 0);
            if (nJf.A00 == null) {
                View A08 = DbU.A08(LayoutInflater.from(nJf.getContext()), R.layout.music_note_add_to_spotify_layout);
                nJf.A00 = A08;
                if (A08 != null) {
                    C71397Ojw.A00(A08, 30, nJf);
                }
                C68467NJf.A03(nJf);
                viewGroup.addView(nJf.A00);
            }
        }
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
        if (1 - this.A00 != 0) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        if (1 - this.A00 == 0) {
            return true;
        }
        OZV ozv = ((NKM) this.A01).A00;
        if (ozv != null) {
            return C2808154f.A03(ozv.A09);
        }
        0qQ.A0F("reactionsPickerController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void onBottomSheetClosed() {
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
