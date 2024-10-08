package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.E9d  reason: case insensitive filesystem */
public final class C47591E9d extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C47591E9d(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, -1730638220);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.PlaceholderRowViewBinder.Holder");
        C46567Dh9 dh9 = (C46567Dh9) tag;
        0qQ.A0B(dh9, 0);
        dh9.A02.A02();
        AnonymousClass0fD.A0A(972813616, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -67611417);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_search_placeholder);
        0qQ.A0A(A0C);
        A0C.setTag(new C46567Dh9(A0C));
        AnonymousClass0fD.A0A(-1957718049, A04);
        return A0C;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
