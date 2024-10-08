package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EFo  reason: case insensitive filesystem */
public final class C47754EFo extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46930Dnk(DbT.A0D(layoutInflater, viewGroup, R.layout.suggested_blocks_header_text, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        EGZ egz = (EGZ) r3;
        C46930Dnk dnk = (C46930Dnk) r4;
        AnonymousClass7TG.A1N(egz, dnk);
        dnk.A00.setText(egz.A00);
    }

    public final Class modelClass() {
        return EGZ.class;
    }
}
