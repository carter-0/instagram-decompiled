package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.user.model.Product;

/* renamed from: X.K9d  reason: case insensitive filesystem */
public final class C61472K9d extends C231632rz {
    public final AnonymousClass0iw A00;
    public final X81 A01;

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1379508528);
        AnonymousClass7TG.A1U(view, obj, obj2);
        C18597Vuo vuo = C18597Vuo.A01;
        AnonymousClass0iw r3 = this.A00;
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.tagging.search.ProductListItemViewBinder.Holder");
        vuo.A00(r3, (C63665L2b) obj2, this.A01, (C17649Vbf) tag, (Product) obj);
        AnonymousClass0fD.A0A(-445289328, A03);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C61472K9d(AnonymousClass0iw r1, X81 x81) {
        this.A00 = r1;
        this.A01 = x81;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1545444979);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.shopping_item, false);
        A0A.setTag(new C17649Vbf(A0A));
        AnonymousClass0fD.A0A(1347963892, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
