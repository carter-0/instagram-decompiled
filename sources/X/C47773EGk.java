package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EGk  reason: case insensitive filesystem */
public final class C47773EGk extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46903DnJ(DbT.A0D(layoutInflater, viewGroup, R.layout.partial_ci_select_all_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C46903DnJ dnJ = (C46903DnJ) r4;
        AnonymousClass7TG.A1N(r3, dnJ);
        FP5.A01(dnJ.A00, 46, r3);
    }

    public final Class modelClass() {
        return FY0.class;
    }
}
