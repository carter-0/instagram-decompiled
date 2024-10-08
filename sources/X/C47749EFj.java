package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.EFj  reason: case insensitive filesystem */
public final class C47749EFj extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.edit_channels_label_item, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        return new C46920Dna((TextView) inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C47233DtK dtK = (C47233DtK) r3;
        C46920Dna dna = (C46920Dna) r4;
        AnonymousClass7TG.A1N(dtK, dna);
        dna.A00.setText(dtK.A00);
    }

    public final Class modelClass() {
        return C47233DtK.class;
    }
}
