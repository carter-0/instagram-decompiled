package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.MnH  reason: case insensitive filesystem */
public final class C67400MnH extends C232222tE {
    public final C74428Pui A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0A = DbU.A0A(DbX.A0F(viewGroup, 0), viewGroup, R.layout.search_section, false);
        A0A.setTag(new C67446Mo1(A0A));
        C249703kE r1 = new C249703kE(A0A);
        if (A0A.getTag() instanceof C67446Mo1) {
            return r1;
        }
        throw DbT.A0m();
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C67443Mny mny = (C67443Mny) r5;
        AnonymousClass7TG.A1N(mny, r6);
        Object tag = r6.itemView.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.SearchSectionTitleViewBinder.Holder");
        C67445Mo0.A00(mny.A00, mny.A01, this.A00, (C67446Mo1) tag);
    }

    public final Class modelClass() {
        return C67443Mny.class;
    }

    public C67400MnH(C74428Pui pui) {
        this.A00 = pui;
    }
}
