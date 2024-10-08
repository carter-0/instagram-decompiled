package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class KFH extends C232222tE {
    public final 0sP A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60558JnT(DbU.A09(layoutInflater, viewGroup, R.layout.muted_word_list_item, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C61209Jz2 jz2 = (C61209Jz2) r3;
        AnonymousClass7TG.A1N(jz2, r4);
        View view = r4.itemView;
        0qQ.A0C(view, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) view).setText(jz2.A01);
    }

    public final Class modelClass() {
        return C61209Jz2.class;
    }

    public KFH(0sP r1) {
        this.A00 = r1;
    }
}
