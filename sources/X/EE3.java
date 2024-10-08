package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.nux.cal.model.ConnectContent;

public final class EE3 extends C252233om {
    public final /* synthetic */ EEL A00;

    public EE3(EEL eel) {
        this.A00 = eel;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        EEL eel = this.A00;
        if (eel.A02 != null) {
            if (i2 == -1 && intent != null) {
                if (i == intent.getIntExtra("argument_requested_code", -1)) {
                    boolean booleanExtra = intent.getBooleanExtra("result_action_positive", false);
                    String stringExtra = intent.getStringExtra("argument_access_token");
                    if (booleanExtra) {
                        if (stringExtra != null) {
                            Bundle bundleExtra = intent.getBundleExtra("argument_client_extras_bundle");
                            if (bundleExtra != null) {
                                Parcelable parcelable = bundleExtra.getParcelable("extra_cal_nux_content");
                                if (parcelable != null) {
                                    String str = ((ConnectContent) parcelable).A04;
                                    if (str != null) {
                                        1OC A0C = FHA.A0C(eel.A01, stringExtra, str, (String) null, (String) null, (String) null);
                                        A0C.A00 = new EBY(eel);
                                        1ES.A03(A0C);
                                        return;
                                    }
                                    UserSession userSession = eel.A01;
                                    CallerContext callerContext = 1KM.A00;
                                    0qQ.A0B(userSession, 0);
                                    1KM.A02(userSession, false);
                                    return;
                                }
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    } else if (stringExtra == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    } else if (intent.getBundleExtra("argument_client_extras_bundle") == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    return;
                }
            }
            UserSession userSession2 = eel.A01;
            CallerContext callerContext2 = 1KM.A00;
            0qQ.A0B(userSession2, 0);
            1KM.A02(userSession2, false);
        }
    }
}
