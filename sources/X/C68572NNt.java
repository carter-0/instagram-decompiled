package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.NNt  reason: case insensitive filesystem */
public final class C68572NNt extends C232222tE {
    public final 0sP A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        N5M n5m = (N5M) r3;
        C67885MwT mwT = (C67885MwT) r4;
        AnonymousClass7TG.A1N(n5m, mwT);
        mwT.A00.setText(n5m.A00);
    }

    public final Class modelClass() {
        return N5M.class;
    }

    public C68572NNt(0sP r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        DbS.A1W(viewGroup);
        return new C67885MwT(AnonymousClass7TE.A0S(viewGroup), this.A00);
    }
}
