package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NO1 extends C232222tE {
    public final C70425O6c A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.direct_unified_poll_entrypoint_item, false);
        C67899Mwh mwh = new C67899Mwh(A09);
        NQx.A01(AnonymousClass7TE.A0m(A09), this, 8);
        return mwh;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C67899Mwh mwh = (C67899Mwh) r5;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, mwh);
        AnonymousClass7L0 r1 = this.A00.A00.A03.A0A;
        if (r1 != null) {
            C66584MXp.A0j(mwh.A00, r1);
        }
        if (!NPU.A00) {
            NPU.A00 = A1U;
        }
    }

    public final Class modelClass() {
        return NPU.class;
    }

    public NO1(C70425O6c o6c) {
        this.A00 = o6c;
    }
}
