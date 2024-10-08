package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class K7W extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "HighlightsListFragment";
    public L13 A00;
    public Boolean A01;
    public RecyclerView A02;
    public boolean A03;
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new C58672Ivh(this, 49));
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(C59917Jbg.A00(this, 0));
    public final String A07 = "highlights_list";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A03) {
            DbX.A1B(view, R.id.action_bar);
        } else {
            LYB.A00(view.requireViewById(R.id.back_button), 55, this);
        }
        RecyclerView A0F = DbZ.A0F(view, R.id.recycler_view);
        this.A02 = A0F;
        if (A0F != null) {
            A0F.setAdapter((2Rw) AnonymousClass7TE.A14(this.A04));
        }
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            DbU.A15(getContext(), recyclerView, 1, false);
        }
        RecyclerView recyclerView2 = this.A02;
        if (recyclerView2 != null) {
            AnonymousClass3AQ r0 = new AnonymousClass3AQ();
            r0.A00 = false;
            recyclerView2.setItemAnimator(r0);
        }
        AnonymousClass0eM r4 = this.A06;
        Dba.A15(getViewLifecycleOwner(), ((C60130JgB) r4.getValue()).A00, new MP4(this, 36), 10);
        C60130JgB jgB = (C60130JgB) r4.getValue();
        jgB.A02.A00(requireContext(), jgB.A01, KXE.A00, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, DbU.A0u(this.A05), false);
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

    public final String getModuleName() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
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
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            return C2808154f.A05(recyclerView);
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

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(58829381);
        K7W.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = DbU.A0g(requireArguments, "uses_creation_state_machine");
        this.A03 = requireArguments.getBoolean("open_as_bottom_sheet");
        AnonymousClass0fD.A09(-1239738234, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-718195069);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_highlights_list, false);
        AnonymousClass0fD.A09(1162613115, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-169977090);
        super.onDestroyView();
        this.A02 = null;
        AnonymousClass0fD.A09(-412764453, A022);
    }
}
