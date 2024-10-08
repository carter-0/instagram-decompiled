package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class KFX extends C232222tE {
    public final 0sP A00;
    public final 0sP A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new UDO(DbU.A09(layoutInflater, viewGroup, R.layout.muted_word_list_item_editable, false), this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C61208Jz1 jz1 = (C61208Jz1) r3;
        UDO udo = (UDO) r4;
        AnonymousClass7TG.A1N(jz1, udo);
        udo.A00.setText(jz1.A01);
    }

    public final Class modelClass() {
        return C61208Jz1.class;
    }

    public KFX(0sP r1, 0sP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
