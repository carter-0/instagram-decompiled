package com.instagram.urlhandlers.schools;

import X.0cp;
import X.182;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TF;
import X.C3250070r;
import X.DbS;
import X.DbW;
import X.DbX;
import X.Dbc;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

public final class SchoolUrlHandlerActivity extends ModalActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.modal.ModalActivity, android.content.Context, java.lang.Object, com.instagram.urlhandlers.schools.SchoolUrlHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        String string;
        String str;
        int A00 = AnonymousClass0fD.A00(1317374239);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (!(A0A == null || A0A.getString("original_url") == null)) {
            AnonymousClass0wW A0S = DbS.A0S(this);
            if (A0S instanceof UserSession) {
                C3250070r.A00();
                if (!(!182.A06(AnonymousClass7TF.A0H(A0S), A0S, 36324750330573142L) || (string = A0A.getString("original_url")) == null || string.length() == 0)) {
                    Uri A01 = 0cp.A01(DbW.A0G(), string);
                    if (A01 == null || (str = A01.getQueryParameter("source")) == null) {
                        str = "deeplink";
                    }
                    Dbc.A0I(this, DbW.A07("instagram://add_school").appendQueryParameter("source", str));
                }
            } else {
                FFQ.A01(this, A0A, A0S);
                AnonymousClass0fD.A07(1660022415, A00);
            }
        }
        finish();
        AnonymousClass0fD.A07(1660022415, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
