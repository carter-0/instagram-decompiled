package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NNx  reason: case insensitive filesystem */
public final class C68576NNx extends C232222tE {
    public final C70429O6g A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.direct_unified_add_yours_entrypoint_item, false);
        C67895Mwd mwd = new C67895Mwd(A09);
        NQx.A01(AnonymousClass7TE.A0m(A09), this, 4);
        return mwd;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C67895Mwd mwd = (C67895Mwd) r5;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, mwd);
        AnonymousClass7L0 r1 = this.A00.A00.A03.A0A;
        if (r1 != null) {
            C66584MXp.A0j(mwd.A00, r1);
        }
        if (!NPQ.A00) {
            NPQ.A00 = A1U;
        }
    }

    public final Class modelClass() {
        return NPQ.class;
    }

    public C68576NNx(C70429O6g o6g) {
        this.A00 = o6g;
    }
}
