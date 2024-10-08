package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class GXE extends C232222tE {
    public final XBv A00 = new GXF(this);
    public final C14327Tu5 A01;
    public final WW4 A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r12, C249703kE r13) {
        C297035r4 r4 = (C297035r4) r12;
        C53119Gir gir = (C53119Gir) r13;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, gir);
        C298785u1 r1 = r4.A01;
        1Xj A002 = C44742CkB.A00(r1.A00);
        if (A002 != null) {
            this.A01.A00(this.A00, r4, A002, gir.A01, A1U);
        } else {
            C14327Tu5 tu5 = this.A01;
            IgImageView igImageView = gir.A01;
            XBv xBv = this.A00;
            AnonymousClass7TF.A1B(igImageView, A1U ? 1 : 0, xBv);
            C296995qz B9n = tu5.A00.B9n(r4);
            tu5.A01.ECL(igImageView, B9n, r4.A02, r4, false);
            igImageView.setPlaceHolderColor(-16777216);
            igImageView.A0B();
            ID0.A00(igImageView, xBv, B9n, r4, 8);
        }
        gir.A00.setText(r1.A08);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C53119Gir(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_grid_item_guides, false));
    }

    public final Class modelClass() {
        return C297035r4.class;
    }

    public GXE(C14327Tu5 tu5, WW4 ww4) {
        this.A01 = tu5;
        this.A02 = ww4;
    }
}
