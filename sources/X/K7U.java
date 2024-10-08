package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class K7U extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "InternalStickerBottomsheetFragment";
    public RecyclerView A00;
    public final L2F A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;
    public final String A07 = AnonymousClass000.A00(3402);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2YL A0H = DbS.A0H(this.A06);
        C318136oS A002 = C318116oQ.A00(A0H);
        MG3 mg3 = new MG3((Object) A0H, (AnonymousClass4D7) null, 25);
        19B r2 = 19B.A00;
        1Eo.A05(r2, mg3, A002);
        RecyclerView A0K = DbX.A0K(requireView());
        JTR.A19(requireContext(), A0K);
        Dba.A17(A0K, this.A02);
        this.A00 = A0K;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass07Z A0I = JTP.A0I(this, r2, new MH5(r4, this, viewLifecycleOwner, (AnonymousClass4D7) null, 31), AnonymousClass07a.A00(viewLifecycleOwner));
        1Eo.A05(r2, new MH5(r4, this, A0I, (AnonymousClass4D7) null, 30), AnonymousClass07a.A00(A0I));
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
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || !JTP.A1Y(recyclerView)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public K7U() {
        0eO r6 = 0eO.A02;
        this.A02 = C66297MMg.A01(this, r6, 47);
        C66294MMd mMd = new C66294MMd(this, 3);
        AnonymousClass0eM A002 = C66294MMd.A00(new C66294MMd(this, 0), r6, 1);
        this.A06 = DbS.A0I(new C66294MMd(A002, 2), mMd, new MJ8(24, (Object) null, A002), DbS.A0z(C60154JgZ.class));
        this.A04 = C66297MMg.A01(this, r6, 49);
        this.A03 = C66297MMg.A01(this, r6, 48);
        this.A01 = new L2F(this);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1560683124);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.internal_sticker_viewer_fragment, false);
        AnonymousClass0fD.A09(599944036, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-838033336);
        super.onDestroyView();
        this.A00 = null;
        ((AnonymousClass32A) this.A04.getValue()).A05 = null;
        AnonymousClass0fD.A09(-11169702, A022);
    }
}
