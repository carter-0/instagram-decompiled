package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;

public final class F3M {
    public final Fragment A00;
    public final 0lg A01;
    public final C49913FEl A02;
    public volatile RegFlowExtras A03;

    public F3M(Fragment fragment, 0lg r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = fragment;
        this.A02 = C49913FEl.A00(fragment.requireContext());
    }

    public final void A00() {
        C49913FEl fEl = this.A02;
        fEl.A00.A03(new C50245FVc(new C49372Eua(this), fEl), "reg_flow_extras_serialize_key");
    }

    public final void A01() {
        Bundle A0a;
        Fragment r1;
        Integer num = C49917FEr.A00().A05;
        Integer num2 = AnonymousClass05K.A0C;
        if (num == num2 || C49921FEw.A02.A00().A01() == num2) {
            RegFlowExtras regFlowExtras = this.A03;
            A0a = AnonymousClass7TE.A0a();
            if (regFlowExtras != null) {
                A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            }
            DbT.A15();
            DbW.A0w(A0a, this.A01);
            r1 = new AnonymousClass4DH();
        } else {
            RegFlowExtras regFlowExtras2 = new RegFlowExtras();
            A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
            0lg r0 = this.A01;
            DbW.A0w(A0a, r0);
            DbW.A0X();
            DbS.A1A(A0a, r0.getToken());
            r1 = new E3Y();
        }
        r1.setArguments(A0a);
        Dbc.A0T(r1, this.A00.getParentFragmentManager());
    }
}
