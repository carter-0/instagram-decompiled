package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class E6v extends C273374mT implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "QuickPromotionDebugItemFragment";
    public F3N A00;
    public C46839DmF A01;

    public final String getModuleName() {
        return "quick_promotion_item";
    }

    public final void configureActionBar(2da r3) {
        String str;
        Dbb.A1I(r3);
        F3N f3n = this.A00;
        if (f3n != null) {
            str = f3n.A00.name();
        } else {
            str = "Slot";
        }
        r3.setTitle(DbV.A0z(this, str, 2131958430));
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.KH7, X.11X] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1044080801);
        0qQ.A0B(layoutInflater, 0);
        E6v.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_slot_details_fragment, viewGroup, false);
        F3N f3n = this.A00;
        if (f3n != null) {
            TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.qp_slot_info_tv);
            1YN A002 = AnonymousClass2bO.A00();
            UserSession session = getSession();
            QuickPromotionSlot quickPromotionSlot = f3n.A00;
            1Av A003 = 1Au.A00(getSession());
            String name = quickPromotionSlot.name();
            0qQ.A0B(name, 0);
            boolean A08 = A002.A08(session, quickPromotionSlot, new 2bw(A003.A01.getString(002.A0R(name, "_qp_slot_impression_data"), (String) null)));
            int i = 2131958408;
            if (A08) {
                i = 2131958411;
            }
            A0R.setText(i);
            RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(inflate, R.id.qp_slot_details_rv);
            ArrayList A1C = AnonymousClass7TE.A1C();
            Map map = f3n.A02;
            Map map2 = f3n.A03;
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                C227972ka r8 = (C227972ka) A1J.getKey();
                List<C283795Ji> list = (List) A1J.getValue();
                if (list != null && AnonymousClass7TE.A1b(list)) {
                    for (C283795Ji r2 : list) {
                        Object obj = map2.get(r2.A02.A05);
                        if (obj != null) {
                            A1C.add(new Ey9((FEW) obj, r8, r2));
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                    continue;
                }
            }
            this.A01 = new C46839DmF(this, A1C);
            DbY.A15(this, recyclerView);
            recyclerView.A11(new C275824s0(requireContext(), 1));
            C46839DmF dmF = this.A01;
            if (dmF == null) {
                DbS.A13();
                throw AnonymousClass00P.createAndThrow();
            }
            recyclerView.setAdapter(dmF);
            schedule(new KH7(2, f3n, this));
            AnonymousClass0fD.A09(-1459710673, A02);
            return inflate;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(533966296, A02);
        throw A0y;
    }
}
