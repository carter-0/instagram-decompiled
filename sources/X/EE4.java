package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.nux.cal.model.ConnectContent;

public final class EE4 extends C252233om {
    public final /* synthetic */ C47491E4v A00;

    public EE4(C47491E4v e4v) {
        this.A00 = e4v;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47491E4v e4v = this.A00;
        CallerContext callerContext = C47491E4v.A0B;
        if (e4v.A01 == null) {
            0qQ.A0F("calHelper");
            throw AnonymousClass00P.createAndThrow();
        } else if (i2 == -1 && intent != null && i == intent.getIntExtra("argument_requested_code", -1)) {
            boolean booleanExtra = intent.getBooleanExtra("result_action_positive", false);
            String stringExtra = intent.getStringExtra("argument_access_token");
            if (booleanExtra) {
                if (stringExtra != null) {
                    Bundle bundleExtra = intent.getBundleExtra("argument_client_extras_bundle");
                    if (bundleExtra != null) {
                        String str = ((ConnectContent) C320236s2.A00(bundleExtra, ConnectContent.class, "extra_cal_nux_content")).A04;
                        if (str != null) {
                            1OC A0C = FHA.A0C(DbT.A0X(e4v.A06), stringExtra, str, intent.getStringExtra("argument_selected_age_account_id"), intent.getStringExtra("argument_selected_age_account_type"), (String) null);
                            A0C.A00 = new EBZ(e4v);
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
            } else if (intent.getBundleExtra("argument_client_extras_bundle") != null) {
                C47491E4v.A01(e4v);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }
}
