package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import java.util.TimeZone;

/* renamed from: X.NJe  reason: case insensitive filesystem */
public final class C68466NJe extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "AiSubscriptionAllFragment";
    public C67797Mv1 A00;
    public boolean A01;
    public RecyclerView A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "ai_subscription_all_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        A00();
        RecyclerView A0F = DbZ.A0F(view2, R.id.recycler_view);
        this.A02 = A0F;
        if (A0F != null) {
            DbV.A1B(view2.getContext(), A0F);
            C67797Mv1 mv1 = new C67797Mv1(new C70422O5z(this));
            this.A00 = mv1;
            RecyclerView recyclerView = this.A02;
            if (recyclerView != null) {
                recyclerView.setAdapter(mv1);
                Bundle bundle2 = this.mArguments;
                if (bundle2 == null || (string = bundle2.getString("ai_subscription_product_type")) == null || 00l.A0W(string)) {
                    A01(this);
                } else {
                    1vn A0G = Dba.A0G(this.A03);
                    2IS A04 = C41845B3m.A04();
                    2IS A042 = C41845B3m.A04();
                    A04.A04("product_type", string);
                    Integer valueOf = Integer.valueOf((int) (((float) TimeZone.getDefault().getRawOffset()) / 1000.0f));
                    A04.A03("gmt_offset_seconds", valueOf);
                    C71567On2.A00(new C71570On7(this, 2), new PandoGraphQLRequest(C41845B3m.A06(AnonymousClass7TF.A1V(valueOf)), "AiAgentsGetSubscriptions", A04.getParamsCopy(), A042.getParamsCopy(), C42701Bgy.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_genai_thread_subscriptions_query", AnonymousClass7TE.A1C()), A0G, this, 9);
                }
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    AnonymousClass2uJ.A04(activity, AnonymousClass7TF.A03(requireContext(), R.attr.igds_color_secondary_background));
                    return;
                }
                return;
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A00() {
        C331157Pu A002;
        C331137Ps r4;
        AnonymousClass37D A0g = DbV.A0g(this, AnonymousClass37D.A00);
        if (A0g != null && (A002 = C48943Emh.A00(A0g)) != null && 0qQ.A0K(A002.A03.A0M(), this)) {
            boolean z = this.A01;
            C331137Ps r42 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
            Context requireContext = requireContext();
            if (!z) {
                r42.A06 = requireContext.getText(2131961425);
                r42.A05 = new C71403Ok2(this, 37);
                A002.A0J(r42.A00(), true);
                r4 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
            } else {
                r42.A06 = requireContext.getText(2131954722);
                r42.A05 = new C71403Ok2(this, 38);
                A002.A0J(r42.A00(), true);
                r4 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
                r4.A06 = requireContext().getText(2131957531);
                r4.A0A = false;
                r4.A09 = true;
            }
            A002.A0K(r4.A00(), true);
        }
    }

    public static final void A02(C68466NJe nJe, boolean z) {
        if (z != nJe.A01) {
            nJe.A01 = z;
            nJe.A00();
            C67797Mv1 mv1 = nJe.A00;
            if (mv1 == null) {
                0qQ.A0F("itemAdapter");
                throw AnonymousClass00P.createAndThrow();
            } else if (mv1.A01 != z) {
                mv1.A01 = z;
                mv1.A03.clear();
                mv1.notifyDataSetChanged();
            }
        }
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

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            return Dba.A1U(recyclerView.computeVerticalScrollOffset());
        }
        C66580MXl.A19();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        if (!this.A01) {
            return false;
        }
        A02(this, false);
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final void A01(C68466NJe nJe) {
        Context context = nJe.getContext();
        if (context != null) {
            C59689JTv.A0F(context, "AI Subscription item query", 2131952849);
        }
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1887977419);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.ai_subscription_all_items, viewGroup, false);
        AnonymousClass0fD.A09(1728362354, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1735345236);
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass2uJ.A04(activity, 0);
        }
        AnonymousClass0fD.A09(-545391023, A022);
    }
}
