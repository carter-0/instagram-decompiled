package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NNz  reason: case insensitive filesystem */
public final class C68577NNz extends C232222tE {
    public final C70426O6d A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.direct_unified_imagine_entrypoint_item, false);
        C67897Mwf mwf = new C67897Mwf(A09);
        NQx.A01(AnonymousClass7TE.A0m(A09), this, 6);
        return mwf;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C67897Mwf mwf = (C67897Mwf) r6;
        boolean A1U = AnonymousClass7TF.A1U(0, r5, mwf);
        P3E p3e = this.A00.A00.A03;
        AnonymousClass7L0 r1 = p3e.A0A;
        if (r1 != null) {
            C66584MXp.A0j(mwf.A00, r1);
        }
        String A0n = C51972G9s.A0n();
        C70983OUx oUx = p3e.A0J.A00.A00;
        if (oUx != null) {
            O6V o6v = oUx.A00.A07;
            o6v.getClass();
            C74511Pw6 pw6 = o6v.A00.A02;
            if (pw6 != null) {
                pw6.Duk(A0n);
            }
        }
        if (!NPS.A00) {
            NPS.A00 = A1U;
        }
    }

    public final Class modelClass() {
        return NPS.class;
    }

    public C68577NNz(C70426O6d o6d) {
        this.A00 = o6d;
    }
}
