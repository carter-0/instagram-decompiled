package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Dh1  reason: case insensitive filesystem */
public final class C46559Dh1 extends C232222tE {
    public final G6V A00;

    public C46559Dh1(G6V g6v) {
        0qQ.A0B(g6v, 1);
        this.A00 = g6v;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C16197UqM uqM = (C16197UqM) r8;
        AnonymousClass7TG.A1N(uqM, r9);
        Context A0S = AnonymousClass7TE.A0S(r9.itemView);
        Object tag = r9.itemView.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.search.SearchFooterViewBinder.Holder");
        TwD twD = uqM.A00;
        String str = twD.A01;
        int i = twD.A00;
        boolean z = uqM.A01.A00;
        C49163EqU.A00(A0S, this.A00, (EyR) tag, str, i, z);
    }

    public final Class modelClass() {
        return C16197UqM.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.row_search_for_x);
        A0C.setTag(new EyR(A0C));
        C249703kE r1 = new C249703kE(A0C);
        if (A0C.getTag() instanceof EyR) {
            return r1;
        }
        throw DbT.A0m();
    }
}
