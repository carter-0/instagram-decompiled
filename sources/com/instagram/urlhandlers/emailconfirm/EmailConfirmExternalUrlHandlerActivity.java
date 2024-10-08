package com.instagram.urlhandlers.emailconfirm;

import X.0cp;
import X.0kR;
import X.0mp;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass14B;
import X.AnonymousClass7TE;
import X.C49023Enz;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FFQ;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

public class EmailConfirmExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.urlhandlers.emailconfirm.EmailConfirmExternalUrlHandlerActivity, android.content.Context, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(-720378091);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        A0A.getClass();
        this.A00 = DbT.A0W(A0A);
        String A0m = DbS.A0m(A0A);
        if (A0m == null) {
            finish();
            i = -409785126;
        } else {
            List<String> pathSegments = 0cp.A03(A0m).getPathSegments();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("EMAIL_NONCE", AnonymousClass7TE.A19(pathSegments, 2));
            A0a.putString("ENCODED_EMAIL", AnonymousClass7TE.A19(pathSegments, 3));
            A0A.putAll(A0a);
            AnonymousClass0wW r4 = this.A00;
            if (!(r4 instanceof UserSession)) {
                Bundle A0a2 = AnonymousClass7TE.A0a();
                A0a2.putBoolean("allow_confirm_email", true);
                A0a2.putString("confirm_email_nonce", C49023Enz.A00(A0A.getString("EMAIL_NONCE")));
                A0a2.putString("confirm_email_encoded_email", C49023Enz.A00(A0A.getString("ENCODED_EMAIL")));
                FFQ.A01(this, A0a2, r4);
            } else {
                Intent A03 = AnonymousClass14B.A00().A03(this, 0);
                A03.setData(0cp.A03(0mp.A06("https://confirm_email/?nonce=%s&encoded_email=%s", new Object[]{A0A.getString("EMAIL_NONCE"), A0A.getString("ENCODED_EMAIL")})));
                0kR.A0B(this, A03);
                finish();
            }
            i = -637519385;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
