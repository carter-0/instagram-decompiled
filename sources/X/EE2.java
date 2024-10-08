package X;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.registration.model.RegFlowExtras;

public final class EE2 extends C252233om {
    public final /* synthetic */ E59 A00;

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && i == intent.getIntExtra("argument_requested_code", -1)) {
            boolean booleanExtra = intent.getBooleanExtra("result_action_positive", false);
            String stringExtra = intent.getStringExtra("argument_access_token");
            if (booleanExtra) {
                if (stringExtra == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else if (intent.getBundleExtra("argument_client_extras_bundle") != null) {
                    E59 e59 = this.A00;
                    RegFlowExtras regFlowExtras = e59.A05;
                    regFlowExtras.A0y = true;
                    if (e59.getActivity() != null) {
                        regFlowExtras.A0V = C49109EpY.A00(AnonymousClass05K.A0j);
                        C309516Yo A0M = DbS.A0M(e59.requireActivity(), e59.A02);
                        RegFlowExtras regFlowExtras2 = e59.A05;
                        Bundle A0a = AnonymousClass7TE.A0a();
                        A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
                        DbX.A18(A0a, new AnonymousClass4DH(), A0M);
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else if (stringExtra == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (intent.getBundleExtra("argument_client_extras_bundle") != null) {
                E59.A02(this.A00);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    public EE2(E59 e59) {
        this.A00 = e59;
    }
}
