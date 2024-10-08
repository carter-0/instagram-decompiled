package X;

import android.os.Bundle;
import com.instagram.registration.model.RegFlowExtras;

public final class EMQ extends C47500E5f implements AnonymousClass4DR, G69 {
    public static final String __redex_internal_original_name = "RegEmailVerifyFragment";
    public RegFlowExtras A00;
    public C49922FEx A01;

    public final EXD B6Y() {
        EXD exd = EXD.SAC;
        if (exd != this.A00.A01()) {
            return EXD.A03;
        }
        return exd;
    }

    public final C46634DiE BzS() {
        return C46634DiE.A1U;
    }

    public final void EuV(String str, Integer num) {
        FCQ.A00(this, (AnonymousClass0aP) this.A02, this.A00, str);
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A02(this.A02, "sign_up_email_code_confirmation");
        return false;
    }

    public final void onCreate(Bundle bundle) {
        Integer A02;
        int A022 = AnonymousClass0fD.A02(-1006103799);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        17k.A07(bundle2, "Arguments in RegEmailVerifyFragment cannot be null.");
        this.A02 = 09i.A0A.A02(bundle2);
        RegFlowExtras regFlowExtras = (RegFlowExtras) bundle2.getParcelable("RegFlowExtras.EXTRA_KEY");
        this.A00 = regFlowExtras;
        this.A06 = regFlowExtras.A08;
        C49922FEx A002 = C49922FEx.A00(bundle2);
        this.A01 = A002;
        AnonymousClass0wW r4 = this.A02;
        EXD B6Y = B6Y();
        RegFlowExtras regFlowExtras2 = this.A00;
        if (regFlowExtras2 == null) {
            A02 = null;
        } else {
            A02 = regFlowExtras2.A02();
        }
        AnonymousClass7TG.A1N(r4, "sign_up_email_code_confirmation");
        C49938FFr.A00(r4, A002, B6Y, A02, "sign_up_email_code_confirmation", (String) null);
        0Tu r42 = 0Tu.A05;
        if (!Dba.A0Z(r42).contains(__redex_internal_original_name)) {
            if (1AW.A06(r42, 2324147266476448102L)) {
                C49130Ept.A00().A00(requireContext(), this.A02, (B2F) null);
            }
            if (1AW.A06(r42, 2324147266476513639L)) {
                C49130Ept.A00().A01(requireContext(), this.A02, (B2F) null);
            }
        }
        AnonymousClass0fD.A09(1920481764, A022);
    }
}
