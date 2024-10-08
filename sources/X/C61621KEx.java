package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.KEx  reason: case insensitive filesystem */
public final class C61621KEx extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60554JnP(DbU.A09(layoutInflater, viewGroup, R.layout.direct_sticker_tab_header_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C61154Jy6 jy6 = (C61154Jy6) r3;
        C60554JnP jnP = (C60554JnP) r4;
        AnonymousClass7TG.A1N(jy6, jnP);
        jnP.A00.setText(jy6.A00);
    }

    public final Class modelClass() {
        return C61154Jy6.class;
    }
}
