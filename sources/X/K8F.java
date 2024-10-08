package X;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;

public final class K8F extends MYR implements C273494mf {
    public static final String __redex_internal_original_name = "IgLiveRoomsRequestsFragment";
    public X9V A00;
    public final AnonymousClass0eM A01 = C66293MMc.A00(this, 31);
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final Collection getDefinitions() {
        return JTT.A0s(new KG8(C66365MOw.A00), new C15796Uif(this, AnonymousClass7TE.A0l(this.A03), (G7P) null, C313666go.BROADCASTER, this.A00, new MPC(this, 4)));
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new MPC(this, 5));
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A02;
        DbV.A1F(getViewLifecycleOwner(), ((C62305Kdd) r4.getValue()).A01, new MPC(this, 6), 65);
        ((C62305Kdd) r4.getValue()).A07();
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
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

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public K8F() {
        C66293MMc mMc = new C66293MMc(this, 32);
        AnonymousClass0eM A012 = C66293MMc.A01(new C66293MMc(this, 33), 0eO.A02, 34);
        this.A02 = DbS.A0I(new C66293MMc(A012, 35), mMc, C66304MMn.A01(A012, (Object) null, 29), DbS.A0z(C62305Kdd.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView.getChildCount() == 0 || recyclerView.computeVerticalScrollOffset() == 0) {
            return true;
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(819791452);
        K8F.super.onCreate(bundle);
        requireArguments().getString("live_header_broadcast_id", "0");
        AnonymousClass0fD.A09(-1933593368, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-85564495);
        super.onDestroy();
        ((C62305Kdd) this.A02.getValue()).A08();
        AnonymousClass0fD.A09(-1835214366, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-773395625);
        K8F.super.onPause();
        ((C62305Kdd) this.A02.getValue()).A08();
        AnonymousClass0fD.A09(2121285512, A022);
    }
}
