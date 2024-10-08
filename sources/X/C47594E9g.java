package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.E9g  reason: case insensitive filesystem */
public final class C47594E9g extends C231632rz {
    public final UserSession A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C47594E9g(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1506755289);
        AnonymousClass7TG.A1O(view, obj);
        if (i == 0) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.shippingandreturns.PurchaseProtectionFooterBinderGroup.Holder");
            C49522Ex1 ex1 = (C49522Ex1) obj;
            TextView textView = ((C49404Ev6) tag).A00;
            textView.setText(ex1.A00);
            FP7.A00(textView, 6, ex1, this);
            AnonymousClass0fD.A0A(-1165076593, A03);
            return;
        }
        IllegalStateException A0b = DbW.A0b(AnonymousClass000.A00(235), i);
        AnonymousClass0fD.A0A(-441202265, A03);
        throw A0b;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 555101240);
        if (i == 0) {
            View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.purchase_protection_footer_row);
            0qQ.A0C(A0C, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) A0C;
            textView.setTag(new C49404Ev6(textView));
            AnonymousClass0fD.A0A(-1371351841, A04);
            return textView;
        }
        IllegalStateException A0b = DbW.A0b(AnonymousClass000.A00(235), i);
        AnonymousClass0fD.A0A(-1306705052, A04);
        throw A0b;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
