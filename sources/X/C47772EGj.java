package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EGj  reason: case insensitive filesystem */
public final class C47772EGj extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46902DnI(DbT.A0D(layoutInflater, viewGroup, R.layout.alphabetical_letter_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C47230DtH dtH = (C47230DtH) r3;
        C46902DnI dnI = (C46902DnI) r4;
        AnonymousClass7TG.A1N(dtH, dnI);
        dnI.A00.setText(String.valueOf(dtH.A00));
    }

    public final Class modelClass() {
        return C47230DtH.class;
    }
}
