package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.common.session.UserSession;

public final class E3T extends AnonymousClass4DH implements AnonymousClass0iw, C273494mf {
    public static final String __redex_internal_original_name = "ProfileMenuFragment";
    public FmF A00;
    public boolean A01 = true;
    public final C284945Oz A02 = new ParcelableSnapshotMutableState(C289465dd.A00(), 0);
    public final C284945Oz A03;
    public final AnonymousClass0eM A04 = C51795G2e.A00(this, 26);
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06 = C51795G2e.A00(this, 27);
    public final AnonymousClass0eM A07 = C51795G2e.A00(this, 28);

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4mX, X.FmF, java.lang.Object] */
    public final /* synthetic */ void A00(Activity activity, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        ? obj = new Object();
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0U = obj;
        A0W.A0T = this;
        C331157Pu A002 = A0W.A00();
        obj.A00 = A002;
        A002.A02(activity, this);
        C71342cb.A00(userSession).A0E("unknown", this);
        this.A00 = obj;
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "bottom_sheet_profile";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
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
        return this.A01;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public E3T() {
        0sn r2 = 0sn.A00;
        C284885Or A002 = C289465dd.A00();
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A03 = new ParcelableSnapshotMutableState(A002, r2);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-83267318);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 13), -722855712);
        AnonymousClass0fD.A09(1793452021, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1366271164);
        super.onResume();
        AnonymousClass0eM r5 = this.A05;
        0lg A0X = DbT.A0X(r5);
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, A0X, 36324526992339079L)) {
            FCS.A02(AnonymousClass7TE.A0l(r5), requireActivity());
        }
        Context requireContext = requireContext();
        0lg A0X2 = DbT.A0X(r5);
        0qQ.A0B(A0X2, 1);
        if (182.A06(r4, A0X2, 36317775303742979L)) {
            long A012 = 182.A01(r4, A0X2, 36599250280320468L);
            C359638dF.A04(requireContext, new C359618dD(A0X2), C273654mx.A00(132), AnonymousClass7TE.A1E(), A012);
        }
        AnonymousClass0fD.A09(-131438596, A022);
    }
}
