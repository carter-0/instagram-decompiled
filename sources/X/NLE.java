package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NLE extends C231632rz {
    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1350332749);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.common.ShoppingMenuRowViewBinder.Holder");
        OEZ oez = (OEZ) tag;
        N4Q n4q = (N4Q) obj;
        AnonymousClass7TG.A1N(oez, n4q);
        oez.A02.setText(n4q.A02);
        oez.A01.setText(String.valueOf(n4q.A00));
        AnonymousClass0fU.A00((View.OnClickListener) n4q.A01, oez.A00);
        AnonymousClass0fD.A0A(2033886156, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -875826001);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.shopping_menu_row, false);
        A0A.setTag(new OEZ(A0A));
        AnonymousClass0fD.A0A(114163574, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
