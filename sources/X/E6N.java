package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.Set;

public final class E6N extends AnonymousClass32G implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "QuickPromotionDebugListFragment";
    public UserSession A00;
    public FQS A01;
    public C49388Euq A02;
    public C231992sk A03;
    public RefreshableListView A04;
    public final Set A05 = AnonymousClass7TE.A1F();

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FQS fqs = new FQS(requireContext());
        this.A01 = fqs;
        A0V(fqs);
        0S7.A00(this);
        RefreshableListView refreshableListView = (RefreshableListView) this.A04;
        this.A04 = refreshableListView;
        if (refreshableListView != null) {
            refreshableListView.setOnItemClickListener(new C50126FPq(this, 2));
            refreshableListView.setupAndEnableRefresh(FPC.A00(this, 58));
        }
        FKk.A00(AnonymousClass7TG.A0R(view, R.id.slot_search_edit_text), this, 20);
        A01(this);
    }

    public static final void A01(E6N e6n) {
        int i;
        Set set = e6n.A05;
        if (!(!set.isEmpty())) {
            for (QuickPromotionSlot quickPromotionSlot : QuickPromotionSlot.values()) {
                if (!set.contains(quickPromotionSlot) && QuickPromotionSlot.A1A != quickPromotionSlot) {
                    set.add(quickPromotionSlot);
                    Context context = e6n.getContext();
                    if (context != null) {
                        i = (int) Math.ceil((double) AnonymousClass7TF.A0E(context).density);
                    } else {
                        i = 1;
                    }
                    UserSession userSession = e6n.A00;
                    if (userSession == null) {
                        DbS.A17();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    1OC A002 = C49842F9h.A00(userSession, quickPromotionSlot, AnonymousClass05K.A01, i);
                    EDV.A00(A002, quickPromotionSlot, e6n, 31);
                    e6n.schedule(A002);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "qp_debug_list";
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle(getString(2131958431));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-140694980);
        E6N.super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        this.A02 = new C49388Euq();
        this.A03 = new C231992sk();
        AnonymousClass0fD.A09(-67619032, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1925060376);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_slot_list_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1943228566, A022);
        return inflate;
    }
}
