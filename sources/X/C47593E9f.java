package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.E9f  reason: case insensitive filesystem */
public final class C47593E9f extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C47593E9f(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1612705095);
        AnonymousClass7TG.A1O(view, obj);
        if (view.getTag() != null) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productcollection.ProductCollectionSectionTitleBinderGroup.Holder");
            ((C48225Eb6) tag).A00.setText((String) obj);
        }
        AnonymousClass0fD.A0A(-1662203712, A03);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.Eb6] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-388434478);
        0qQ.A0B(viewGroup, 1);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.product_collection_section_title);
        0qQ.A0A(A0C);
        0qQ.A0B(A0C, 1);
        ? obj = new Object();
        obj.A00 = (TextView) A0C;
        A0C.setTag(obj);
        AnonymousClass0fD.A0A(-1606559398, A03);
        return A0C;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
