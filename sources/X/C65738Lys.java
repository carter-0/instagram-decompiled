package X;

import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.Lys  reason: case insensitive filesystem */
public final class C65738Lys implements C273494mf, C273504mg {
    public final int A00;
    public final Object A01;

    public C65738Lys(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
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
        switch (this.A00) {
            case 0:
            case 7:
                return C2808154f.A05(((C61364K4g) this.A01).A07());
            case 1:
            case 2:
                WebView webView = ((R8R) this.A01).A02;
                if (webView == null || webView.getScrollY() <= 0) {
                    return true;
                }
                return false;
            case 3:
                return ((Fragment) this.A01).isScrolledToTop();
            case 5:
                RecyclerView recyclerView = ((C15262UYc) this.A01).A00;
                if (recyclerView == null || JTP.A1Y(recyclerView)) {
                    return false;
                }
                break;
        }
        return true;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
        switch (this.A00) {
            case 4:
                ((C314976j9) this.A01).A07.EHd();
                return;
            case 6:
                C68478NJv.A03((C68478NJv) this.A01).A03(true);
                return;
            case 8:
                C54133H0c h0c = (C54133H0c) this.A01;
                IgdsListCell igdsListCell = h0c.A03;
                if (igdsListCell == null) {
                    0qQ.A0F("audioTranslationsLanguageSelector");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    igdsListCell.A0K(String.valueOf(JTS.A0q(((C60253JiA) h0c.A0B.getValue()).A02).size()), false);
                    return;
                }
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

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }
}
