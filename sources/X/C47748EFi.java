package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EFi  reason: case insensitive filesystem */
public final class C47748EFi extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46919DnZ(DbT.A0D(layoutInflater, viewGroup, R.layout.edit_channels_empty_pinned_channels, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C46919DnZ dnZ = (C46919DnZ) r4;
        0qQ.A0B(dnZ, 1);
        dnZ.A00.setVisibility(8);
    }

    public final Class modelClass() {
        return C50318FXx.class;
    }
}
