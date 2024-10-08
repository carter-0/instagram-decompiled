package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.UbK  reason: case insensitive filesystem */
public final class C15367UbK extends AnonymousClass4DH implements C268594df, C273494mf {
    public static final String __redex_internal_original_name = "ClipsInteractiveDashboardFragment";
    public C267324bN A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final boolean A02 = true;
    public final boolean A03 = true;

    public final int AqL() {
        return -1;
    }

    public final float CMx() {
        return 1.0f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "clips_interactive_dashboard";
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return this.A02;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
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
        return DbS.A0T(this.A01);
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
        return this.A03;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1222587579);
        C15367UbK.super.onCreate(bundle);
        if (bundle == null) {
            requireArguments();
        }
        AnonymousClass0fD.A09(1450942733, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0fD.A02(1942272245);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_interactive_dashboard, viewGroup, false);
        View A0b = AnonymousClass7TE.A0b(inflate, R.id.results_container);
        C267324bN r10 = this.A00;
        if (r10 != null) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A01);
            0qQ.A0B(A0l, 2);
            boolean z2 = true;
            if (C297825sP.A00(r10) != null) {
                View A0V = JTR.A0V(inflate, R.id.poll_result);
                0qQ.A07(A0V);
                new C17859VhC(A0V).A00(A0l, r10);
                z = true;
            } else {
                z = false;
            }
            if (C265894Ws.A01(r10) != null) {
                if (z) {
                    DbX.A1D(A0b, R.id.divider_1, 0);
                }
                View A0V2 = JTR.A0V(inflate, R.id.quiz_result);
                0qQ.A07(A0V2);
                new C17860VhD(A0V2, (ReelDashboardFragment) null).A00(r10);
            } else {
                z2 = z;
            }
            1Xj BPf = r10.BPf();
            if (!(AnonymousClass6UJ.A00(BPf) == null || BPf == null)) {
                if (z2) {
                    DbX.A1D(A0b, R.id.divider_2, 0);
                }
                View A0V3 = JTR.A0V(inflate, R.id.slider_result);
                0qQ.A07(A0V3);
                new C17861VhE(A0V3).A00(A0l, BPf);
            }
            AnonymousClass0fD.A09(2044420371, A022);
            return inflate;
        }
        0qQ.A0F("clipsItem");
        throw AnonymousClass00P.createAndThrow();
    }
}
