package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;

public final class FXC implements 1wn {
    public final /* synthetic */ E3X A00;

    public FXC(E3X e3x) {
        this.A00 = e3x;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        RegFlowExtras regFlowExtras;
        C309516Yo A0M;
        Bundle A0a;
        Fragment e58;
        int A03 = AnonymousClass0fD.A03(-2081279229);
        C50263FVu fVu = (C50263FVu) obj;
        int A032 = AnonymousClass0fD.A03(1319395224);
        E3X e3x = this.A00;
        String A002 = C49958FGq.A00(e3x.A09, e3x.A0B);
        String str = fVu.A02;
        if (!A002.equals(str)) {
            0wb.A03("PhoneConfirmationFragment.PhoneConfirmedSuccessfullyEventListener", 0mp.A06("Unexpected phone number got confirmed. Expected: %s Actual: %s", new Object[]{C49958FGq.A00(e3x.A09, e3x.A0B), str}));
            i = 620349918;
        } else {
            if (e3x.A0E && (regFlowExtras = e3x.A06) != null) {
                regFlowExtras.A0Q = str;
                regFlowExtras.A05 = fVu.A01;
                if (!regFlowExtras.A0u) {
                    C49839F9e.A01(e3x, e3x.A01, fVu, regFlowExtras, e3x.BzS());
                }
                if (e3x.getActivity() != null) {
                    EXD exd = EXD.SAC;
                    RegFlowExtras regFlowExtras2 = e3x.A06;
                    if (exd == regFlowExtras2.A01()) {
                        if (regFlowExtras2.A0t) {
                            regFlowExtras2.A0u = false;
                            A0M = DbS.A0M(e3x.requireActivity(), e3x.A01);
                            RegFlowExtras regFlowExtras3 = e3x.A06;
                            A0a = AnonymousClass7TE.A0a();
                            A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras3);
                            e58 = new AnonymousClass4DH();
                        } else if (regFlowExtras2.A0u) {
                            regFlowExtras2.A0u = false;
                            e3x.A0G = true;
                            E3X e3x2 = e3x;
                            E3X e3x3 = e3x;
                            C50144FRb.A02(AnonymousClass7TF.A0D(), e3x, e3x2, e3x.A01, (G67) null, e3x3, regFlowExtras2, e3x.A07, e3x.BzS(), regFlowExtras2.A0Z, (String) null, false);
                        } else {
                            A0M = DbS.A0M(e3x.requireActivity(), e3x.A01);
                            RegFlowExtras regFlowExtras4 = e3x.A06;
                            A0a = AnonymousClass7TE.A0a();
                            A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras4);
                            e58 = new E58();
                        }
                        e58.setArguments(A0a);
                        Dba.A13(e58, A0M);
                    }
                }
                AnonymousClass7TF.A0D().post(new C51475Fuj(e3x, e3x.A01, e3x.A06));
            }
            i = -2016232001;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(1648641595, A03);
    }
}
