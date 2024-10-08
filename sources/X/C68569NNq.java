package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.NNq  reason: case insensitive filesystem */
public final class C68569NNq extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        NPA npa = (NPA) r3;
        C3254972u.A02(npa.A00, (AnonymousClass730) r4, npa.A01);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new AnonymousClass730(C3254972u.A01(layoutInflater, viewGroup));
    }

    public final Class modelClass() {
        return NPA.class;
    }
}
