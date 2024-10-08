package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class Tw3 extends C232222tE {
    public final C20912X4d A00;

    public Tw3(C20912X4d x4d) {
        0qQ.A0B(x4d, 1);
        this.A00 = x4d;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        0qQ.A0B(r6, 1);
        Object tag = r6.itemView.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.SeeMoreViewBinder.Holder");
        C17263VOq vOq = (C17263VOq) tag;
        C20912X4d x4d = this.A00;
        Dba.A0j(1, vOq, x4d);
        WBC.A00(vOq.A00, 21, x4d);
    }

    public final Class modelClass() {
        return C69164Nfn.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.row_see_more, false);
        A0A.setTag(new C17263VOq(A0A));
        C249703kE r1 = new C249703kE(A0A);
        if (A0A.getTag() instanceof C17263VOq) {
            return r1;
        }
        throw DbT.A0m();
    }
}
