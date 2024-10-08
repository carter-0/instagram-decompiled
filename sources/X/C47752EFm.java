package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.EFm  reason: case insensitive filesystem */
public final class C47752EFm extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C48234EbF ebF = (C48234EbF) DbT.A0o(r5.itemView);
        String str = ((EGY) r4).A00;
        0qQ.A0B(ebF, 0);
        ebF.A01.setText(str);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C249703kE(C49162EqT.A00(layoutInflater, viewGroup));
    }

    public final Class modelClass() {
        return EGY.class;
    }
}
