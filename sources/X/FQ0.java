package X;

import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;

public final class FQ0 implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public FQ0(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.A00) {
            case 0:
                R8N r8n = (R8N) this.A01;
                R8N.A00(r8n).A00(Pxd.A00(64), z);
                R8N.A09(r8n, this.A02, z);
                R8N.A05(r8n);
                return;
            case 1:
                if (this.A02 == z) {
                    return;
                }
                if (z) {
                    ESP esp = (ESP) this.A01;
                    Bundle bundle = esp.A00;
                    if (bundle != null) {
                        if (bundle.getBoolean("is_two_factor_enabled")) {
                            0lg A0X = DbT.A0X(esp.A05);
                            Bundle bundle2 = esp.A00;
                            if (bundle2 != null) {
                                C48001EQk.A00(esp.getParentFragmentManager(), esp, C49930FFj.A00(A0X, Dbb.A0Z(bundle2), Dbb.A0a(esp)), 4);
                                return;
                            }
                        } else {
                            FFR.A03();
                            Bundle bundle3 = esp.A00;
                            if (bundle3 != null) {
                                bundle3.putBoolean("ARG_IS_ENABLING_WHATSAPP", true);
                                E3L e3l = new E3L();
                                Dbc.A0S(e3l, DbU.A0I(bundle3, e3l, esp), esp.A05);
                                return;
                            }
                        }
                    }
                    0qQ.A0F("twoFacResponseBundle");
                    throw AnonymousClass00P.createAndThrow();
                }
                Fragment fragment = (Fragment) this.A01;
                0qQ.A0A(compoundButton);
                C358248ab A0U = DbW.A0U(fragment);
                A0U.A09(2131975803);
                A0U.A08(2131975802);
                A0U.A0K(C50020FJf.A00(fragment, 19), 2131975787);
                DbX.A16(C50020FJf.A00(compoundButton, 20), A0U);
                return;
            default:
                if (this.A02) {
                    NMJ nmj = (NMJ) this.A01;
                    OVB ovb = nmj.A08;
                    0Aj A0e = AnonymousClass7TE.A0e(ovb.A00, C66579MXk.A00(919));
                    DbS.A1I(A0e, C66579MXk.A00(1158));
                    DbS.A1N(A0e, ovb.A01);
                    A0e.AAJ("component", "toggle");
                    DbS.A1H(A0e, C66579MXk.A00(893));
                    A0e.A7p(C66579MXk.A00(671), Boolean.valueOf(z));
                    A0e.AAJ(C66579MXk.A00(959), "v2");
                    A0e.Cgf();
                    C72197OyI oyI = nmj.A0D;
                    oyI.A00 = C59689JTv.A01(nmj.A05, (String) null, 2131966270, 1);
                    oyI.A01(ovb, z);
                    nmj.A02 = false;
                    nmj.A0E.A00();
                    return;
                }
                return;
        }
    }
}
