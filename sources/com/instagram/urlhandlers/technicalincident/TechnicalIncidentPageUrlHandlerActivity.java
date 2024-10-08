package com.instagram.urlhandlers.technicalincident;

import X.0bY;
import X.0cp;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C49250Ert;
import X.DbS;
import X.DbU;
import X.DbW;
import X.DbX;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class TechnicalIncidentPageUrlHandlerActivity extends BaseFragmentActivity {
    public final 0bY A00 = DbW.A0G();

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.technicalincident.TechnicalIncidentPageUrlHandlerActivity, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(-849631348);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -1907382549;
        } else {
            String A0m = DbS.A0m(A0A);
            if (A0m == null) {
                finish();
                i = -1003927167;
            } else {
                Uri A01 = 0cp.A01(this.A00, A0m);
                if (A01 != null) {
                    String scheme = A01.getScheme();
                    String host = A01.getHost();
                    if ("instagram".equalsIgnoreCase(scheme) && "technical_incident".equalsIgnoreCase(host)) {
                        Bundle A0a = AnonymousClass7TE.A0a();
                        DbU.A1B(A01, A0a, "timestamp");
                        if (!A0a.containsKey("timestamp")) {
                            finish();
                        } else {
                            String string = A0a.getString("timestamp");
                            AnonymousClass0wW A0S = DbS.A0S(this);
                            if (string == null) {
                                string = "";
                            }
                            C49250Ert.A00(this, A0S, string);
                        }
                        i = 1793851966;
                    }
                }
                finish();
                i = -1321389846;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
