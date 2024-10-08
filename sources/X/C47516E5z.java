package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;

/* renamed from: X.E5z  reason: case insensitive filesystem */
public final class C47516E5z extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "AutomaticRichPreviewBottomSheetNux";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new MMO(this, 5));
    public final String A02 = "direct_automatic_rich_preview_nux";

    public final void afterOnViewCreated() {
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A02("has_seen_rf_disclosure", true);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "SetHasSeenReceiverFetchDisclosureMutation", A04.getParamsCopy(), A042.getParamsCopy(), C43350Bwo.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_set_igd_has_seen_rf_disclosure", AnonymousClass7TE.A1C());
        Dba.A0G(this.A00).ATL(C50159FRr.A00, new FSC(this, 6), pandoGraphQLRequest);
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass7AV.A07(new C48053ESw(requireActivity, this, DbV.A02(requireActivity)), DbW.A0B(view, R.id.secondary_subtitle), AnonymousClass7TE.A16(requireActivity, 2131960450), requireActivity.getString(2131960449));
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
        return DbS.A0T(this.A00);
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(313697125);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_thread_automatic_preview_bottomsheet_nux, false);
        AnonymousClass0fD.A09(-980000072, A022);
        return A0D;
    }
}
