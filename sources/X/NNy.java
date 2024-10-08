package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NNy extends C232222tE {
    public final C70424O6b A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.direct_unified_ai_sticker_entrypoint_item, false);
        C67896Mwe mwe = new C67896Mwe(A09);
        NQx.A01(AnonymousClass7TE.A0m(A09), this, 5);
        return mwe;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C67896Mwe mwe = (C67896Mwe) r5;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, mwe);
        AnonymousClass7L0 r1 = this.A00.A00.A03.A0A;
        if (r1 != null) {
            C66584MXp.A0j(mwe.A00, r1);
        }
        if (!NPR.A00) {
            NPR.A00 = A1U;
        }
    }

    public final Class modelClass() {
        return NPR.class;
    }

    public NNy(C70424O6b o6b) {
        this.A00 = o6b;
    }
}
