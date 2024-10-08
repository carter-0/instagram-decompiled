package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.Dfx  reason: case insensitive filesystem */
public final class C46494Dfx extends C232232tF {
    public final C67165MjN A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C46501Dg4 dg4 = (C46501Dg4) r5;
        C46907DnN dnN = (C46907DnN) r6;
        AnonymousClass7TG.A1N(dg4, dnN);
        U56 u56 = dnN.A00;
        u56.A00();
        u56.A01(dg4.A02);
        u56.A03(dg4.A00, new FPE(61, (Object) dg4, (Object) this));
    }

    public final Class modelClass() {
        return C46501Dg4.class;
    }

    public C46494Dfx(C67165MjN mjN) {
        this.A00 = mjN;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        DbS.A1W(viewGroup);
        return new C46907DnN(new U56(AnonymousClass7TE.A0S(viewGroup)));
    }
}
