package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class E6C extends AnonymousClass4DH implements C273494mf, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PurchaseProtectionFragment";
    public E9B A00;
    public F2U A01;
    public SpinnerImageView A02;
    public RecyclerView A03;
    public UserSession A04;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131970976);
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "PurchaseProtection";
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

    public final AnonymousClass0wW getSession() {
        return this.A04;
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
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            return !recyclerView.canScrollVertically(-1);
        }
        throw AnonymousClass7TE.A0y();
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
        UserSession userSession;
        int A022 = AnonymousClass0fD.A02(-786349494);
        E6C.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            userSession = DbS.A0U(bundle2);
        } else {
            userSession = null;
        }
        this.A04 = userSession;
        AnonymousClass0fD.A09(-2017895884, A022);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.E6C, androidx.fragment.app.Fragment, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        E9B e9b;
        UserSession userSession;
        int A022 = AnonymousClass0fD.A02(1299112218);
        0qQ.A0B(layoutInflater, 0);
        View A09 = DbW.A09(layoutInflater, viewGroup, R.layout.purchase_protection, false);
        SpinnerImageView spinnerImageView = (SpinnerImageView) A09.requireViewById(R.id.refresh_spinner);
        this.A02 = spinnerImageView;
        if (spinnerImageView != null) {
            FP4.A01(spinnerImageView, 22, this);
        }
        RecyclerView A0K = DbX.A0K(A09);
        this.A03 = A0K;
        if (A0K != null) {
            DbY.A15(this, A0K);
        }
        UserSession userSession2 = this.A04;
        F2U f2u = null;
        if (userSession2 != null) {
            e9b = new E9B(userSession2);
        } else {
            e9b = null;
        }
        this.A00 = e9b;
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            recyclerView.setAdapter(e9b);
        }
        Context context = getContext();
        if (!(context == null || (userSession = this.A04) == null)) {
            f2u = new F2U(context, AnonymousClass07i.A00(this), userSession, this);
        }
        this.A01 = f2u;
        A09.postDelayed(new C51292Frl(this), 100);
        AnonymousClass0fD.A09(-1752139922, A022);
        return A09;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1483331035);
        super.onDestroyView();
        this.A02 = null;
        this.A03 = null;
        AnonymousClass0fD.A09(-2143478440, A022);
    }
}
