package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class KFQ extends C232222tE {
    public final K89 A00;
    public final AnonymousClass0iw A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60580Jnp(DbT.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_horizontal_scroll_item, false), this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C64753LhV lhV = (C64753LhV) r3;
        C60580Jnp jnp = (C60580Jnp) r4;
        AnonymousClass7TG.A1N(lhV, jnp);
        JTR.A1L(jnp.A00, 00k.A0T(new Object(), lhV.A00));
    }

    public final Class modelClass() {
        return C64753LhV.class;
    }

    public KFQ(K89 k89, AnonymousClass0iw r2) {
        this.A00 = k89;
        this.A01 = r2;
    }
}
