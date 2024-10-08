package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;

public final class EFz extends C232222tE {
    public final AnonymousClass0iw A00;
    public final 0sP A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46900DnG(DbT.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_horizontal_scroll_item, false), this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        EGU egu = (EGU) r4;
        C46900DnG dnG = (C46900DnG) r5;
        AnonymousClass7TG.A1N(egu, dnG);
        AnonymousClass2t9 r2 = dnG.A00;
        ViewModelListUpdate A0R = DbS.A0R();
        A0R.A01(egu.A00);
        r2.A05(A0R);
    }

    public final Class modelClass() {
        return EGU.class;
    }

    public EFz(AnonymousClass0iw r1, 0sP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
