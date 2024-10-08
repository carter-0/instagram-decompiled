package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class H73 extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C53136Gj8(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.empty_recon_section_title, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C53136Gj8 gj8 = (C53136Gj8) r5;
        AnonymousClass7TG.A1N(r4, gj8);
        IgTextView igTextView = gj8.A02;
        DbU.A1A(igTextView.getResources(), igTextView, 2131973818);
        IgTextView igTextView2 = gj8.A01;
        DbU.A1A(igTextView2.getResources(), igTextView2, 2131973817);
        IgImageView igImageView = gj8.A03;
        DbU.A13(igImageView.getContext(), igImageView, R.drawable.ufi_save_icon);
    }

    public final Class modelClass() {
        return C64768Lhk.class;
    }
}
