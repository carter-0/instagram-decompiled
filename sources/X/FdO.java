package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.login.twofac.model.TotpSeed;

public final class FdO implements C358618bC {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public FdO(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
        this.A03 = z2;
    }

    public final boolean onToggle(boolean z) {
        Fragment e3v;
        Integer num;
        String str;
        if (this.A00 != 0) {
            ESD esd = (ESD) this.A01;
            if (z) {
                AnonymousClass0eM r3 = esd.A02;
                FCE.A00(AnonymousClass7TE.A0l(r3), AnonymousClass05K.A03);
                boolean A0I = 0oI.A0I(esd.requireContext().getPackageManager(), Dbb.A0U());
                boolean A11 = Dbc.A11(esd.requireContext());
                FFR.A03();
                Bundle requireArguments = esd.requireArguments();
                if (A0I) {
                    if (A11) {
                        num = AnonymousClass05K.A0C;
                    } else {
                        num = AnonymousClass05K.A00;
                    }
                } else if (A11) {
                    num = AnonymousClass05K.A01;
                } else {
                    e3v = new C47471E3v();
                    e3v.setArguments(requireArguments);
                    DbZ.A0P(esd, r3).A0D(e3v);
                    return true;
                }
                switch (num.intValue()) {
                    case 0:
                        str = "Duo Mobile";
                        break;
                    case 1:
                        str = "Google Authenticator";
                        break;
                    default:
                        str = "Authentication App";
                        break;
                }
                requireArguments.putString("arg_two_fac_app_name", str);
                e3v = new C47472E3w();
                e3v.setArguments(requireArguments);
                DbZ.A0P(esd, r3).A0D(e3v);
                return true;
            }
            FCE.A00(AnonymousClass7TE.A0l(esd.A02), AnonymousClass05K.A05);
            ESD.A07(esd, (TotpSeed) null, this.A03, this.A02, false);
            return true;
        }
        C65199Lp3 lp3 = (C65199Lp3) this.A01;
        lp3.A03.Dv2(lp3.A01, this.A02, this.A03);
        return false;
    }
}
