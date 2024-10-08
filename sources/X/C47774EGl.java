package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EGl  reason: case insensitive filesystem */
public final class C47774EGl extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46963DoH(DbT.A0D(layoutInflater, viewGroup, R.layout.fan_club_empty_results, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        EGW egw = (EGW) r4;
        C46963DoH doH = (C46963DoH) r5;
        AnonymousClass7TG.A1N(egw, doH);
        C266444Yx r2 = egw.A00;
        0qQ.A0B(r2, 0);
        doH.A02.setText(C66909Mes.A00(AnonymousClass7TE.A0S(doH.A01), r2));
        doH.A00 = r2;
    }

    public final Class modelClass() {
        return EGW.class;
    }
}
