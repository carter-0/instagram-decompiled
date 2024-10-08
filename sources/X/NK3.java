package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import java.util.List;

public abstract class NK3 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "ExistingThreadSheetFragment";
    public View A00;
    public RecyclerView A01;
    public AnonymousClass2t9 A02;
    public IgProgressBar A03;
    public String A04;
    public List A05;

    /* renamed from: A01 */
    public abstract UserSession getSession();

    public abstract C62030KWg A02();

    public abstract C74461PvG A03();

    public abstract boolean A04();

    public abstract boolean A05();

    public abstract boolean A06();

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = view;
        this.A03 = (IgProgressBar) view.requireViewById(R.id.progressbar_loading);
        DbZ.A1C(this, new C73566Pfn(this, (AnonymousClass4D7) null, 38), A02().A01);
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
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null || !JTP.A1Y(recyclerView)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final ViewModelListUpdate A00() {
        ViewModelListUpdate A0R = DbS.A0R();
        List<C2609247o> list = this.A05;
        if (list == null) {
            0qQ.A0F("threads");
            throw AnonymousClass00P.createAndThrow();
        }
        for (C2609247o r2 : list) {
            A0R.A00(new C71964Otp(r2, 0qQ.A0K(r2.C6E(), this.A04)));
        }
        return A0R;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1763694486);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.existing_thread_sheet_fragment, false);
        AnonymousClass0fD.A09(-747744557, A022);
        return A0D;
    }
}
