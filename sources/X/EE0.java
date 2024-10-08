package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.nux.cal.model.ConnectContent;
import java.util.Locale;

public final class EE0 extends C252233om {
    public final /* synthetic */ C47490E4u A00;

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && i == intent.getIntExtra("argument_requested_code", -1)) {
            boolean booleanExtra = intent.getBooleanExtra("result_action_positive", false);
            String stringExtra = intent.getStringExtra("argument_access_token");
            if (booleanExtra) {
                if (stringExtra != null) {
                    Bundle bundleExtra = intent.getBundleExtra("argument_client_extras_bundle");
                    if (bundleExtra != null) {
                        Parcelable parcelable = bundleExtra.getParcelable("extra_cal_nux_content");
                        parcelable.getClass();
                        String str = ((ConnectContent) parcelable).A04;
                        if (str != null) {
                            C47490E4u e4u = this.A00;
                            1OC A0C = FHA.A0C(e4u.A02, stringExtra, str, intent.getStringExtra("argument_selected_age_account_id"), intent.getStringExtra("argument_selected_age_account_type"), EXN.PROFILE_PIC_REG.A01().toUpperCase(Locale.US));
                            A0C.A00 = new C47677ECm(e4u);
                            1ES.A03(A0C);
                            return;
                        }
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (stringExtra == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (intent.getBundleExtra("argument_client_extras_bundle") == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    public EE0(C47490E4u e4u) {
        this.A00 = e4u;
    }
}
