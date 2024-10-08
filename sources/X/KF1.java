package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class KF1 extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60641Joo(DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_section_type_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C64799LiJ liJ = (C64799LiJ) r3;
        C60641Joo joo = (C60641Joo) r4;
        AnonymousClass7TG.A1N(liJ, joo);
        JTO.A0I(joo.A03).setText(liJ.A03);
        JTO.A0I(joo.A01).setText(liJ.A02);
        LY6.A01(AnonymousClass7TE.A0c(joo.A02), 48, liJ);
    }

    public final Class modelClass() {
        return C64799LiJ.class;
    }
}
