package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class H7N extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C53123Giv(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_profile_edit_bottom_message_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        IOR ior = (IOR) r3;
        C53123Giv giv = (C53123Giv) r4;
        AnonymousClass7TG.A1N(ior, giv);
        DbX.A1G(giv.A00, ior.A00);
    }

    public final Class modelClass() {
        return IOR.class;
    }
}
