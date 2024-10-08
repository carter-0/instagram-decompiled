package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.List;

public final class NK4 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "GenAiAccountsFragment";
    public RecyclerView A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "gen_ai_account_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0F = DbZ.A0F(view, R.id.recycler_view);
        this.A00 = A0F;
        if (A0F != null) {
            DbV.A1B(view.getContext(), A0F);
            UserSession session = getSession();
            String A002 = AnonymousClass000.A00(2);
            0qQ.A0C(session, A002);
            C67798Mv2 mv2 = new C67798Mv2(this, this, session);
            AnonymousClass0wW session2 = getSession();
            0qQ.A0C(session2, A002);
            0qQ.A0B(session2, 0);
            C70671OFs oFs = (C70671OFs) session2.A01(C70671OFs.class, C73710PiX.A00);
            synchronized (oFs.A03) {
                try {
                    list = oFs.A01;
                    if (list == null) {
                        WeakReference weakReference = oFs.A00;
                        if (weakReference != null) {
                            list = (List) weakReference.get();
                        } else {
                            list = null;
                        }
                    }
                    oFs.A01 = null;
                    oFs.A00 = null;
                    oFs.A02.removeCallbacks(oFs.A04);
                } catch (Throwable th) {
                    oFs.A01 = null;
                    oFs.A00 = null;
                    oFs.A02.removeCallbacks(oFs.A04);
                    throw th;
                }
            }
            mv2.A00 = list;
            mv2.notifyDataSetChanged();
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.setAdapter(mv2);
                return;
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
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
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            return Dba.A1U(recyclerView.computeVerticalScrollOffset());
        }
        C66580MXl.A19();
        throw AnonymousClass00P.createAndThrow();
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
        int A02 = AnonymousClass0fD.A02(505171722);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.gen_ai_accounts_fragment, viewGroup, false);
        AnonymousClass0fD.A09(496649179, A02);
        return inflate;
    }
}
