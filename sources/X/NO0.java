package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NO0 extends C232222tE {
    public final C70428O6f A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.direct_unified_location_sharing_entrypoint_item, false);
        C67898Mwg mwg = new C67898Mwg(A09);
        NQx.A01(AnonymousClass7TE.A0m(A09), this, 7);
        return mwg;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C67898Mwg mwg = (C67898Mwg) r5;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, mwg);
        AnonymousClass7L0 r1 = this.A00.A00.A03.A0A;
        if (r1 != null) {
            C66584MXp.A0j(mwg.A00, r1);
        }
        if (!NPT.A00) {
            NPT.A00 = A1U;
        }
    }

    public final Class modelClass() {
        return NPT.class;
    }

    public NO0(C70428O6f o6f) {
        this.A00 = o6f;
    }
}
