package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Mjj  reason: case insensitive filesystem */
public final class C67187Mjj extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67903Mwl(C66582MXn.A0E(layoutInflater, viewGroup, R.layout.direct_row_limit_disclaimer, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C67115MiZ miZ = (C67115MiZ) r3;
        C67903Mwl mwl = (C67903Mwl) r4;
        AnonymousClass7TG.A1N(miZ, mwl);
        mwl.A00.setText(miZ.A00);
    }

    public final Class modelClass() {
        return C67115MiZ.class;
    }
}
