package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class K7Q extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "StoryPartyFragment";
    public RecyclerView A00;
    public IgTextView A01;
    public final String A02 = AnonymousClass000.A00(2933);
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgTextView A0X = JTO.A0X(requireView(), R.id.attribution_text);
        DbT.A1H(A0X);
        this.A01 = A0X;
        RecyclerView A0K = DbX.A0K(requireView());
        JTR.A19(requireContext(), A0K);
        Dba.A17(A0K, this.A03);
        this.A00 = A0K;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MH5 mh5 = new MH5(r4, this, viewLifecycleOwner, (AnonymousClass4D7) null, 33);
        19B r2 = 19B.A00;
        AnonymousClass07Z A0I = JTP.A0I(this, r2, mh5, A002);
        1Eo.A05(r2, new MH5(r4, this, A0I, (AnonymousClass4D7) null, 32), AnonymousClass07a.A00(A0I));
        AnonymousClass0eM r42 = this.A07;
        2YL A0H = DbS.A0H(r42);
        Resources A0R = JTR.A0R(this);
        AnonymousClass0eM r3 = this.A04;
        String A0t = DbS.A0t(r3);
        1Eo.A05(r2, new C66173MGk(A0R, A0H, A0t, (AnonymousClass4D7) null, 13), JTP.A0J(A0H, A0t, 1));
        2YL A0H2 = DbS.A0H(r42);
        String A0t2 = DbS.A0t(r3);
        1Eo.A05(r2, new MFV(A0H2, A0t2, (AnonymousClass4D7) null, 24), JTP.A0J(A0H2, A0t2, 0));
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
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
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

    public K7Q() {
        0eO r2 = 0eO.A02;
        this.A04 = C66294MMd.A00(this, r2, 15);
        this.A03 = AnonymousClass0eN.A00(r2, MLN.A00);
        this.A05 = C66294MMd.A00(this, r2, 16);
        C66294MMd mMd = new C66294MMd(this, 20);
        AnonymousClass0eM A002 = C66294MMd.A00(new C66294MMd(this, 17), r2, 18);
        this.A07 = DbS.A0I(new C66294MMd(A002, 19), mMd, new MJ8(25, (Object) null, A002), DbS.A0z(C60155Jga.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2115683010);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_story_party, false);
        AnonymousClass0fD.A09(1302033127, A022);
        return A0D;
    }
}
