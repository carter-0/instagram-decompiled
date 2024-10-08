package com.instagram.urlhandlers.consentflow;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C47273Du1;
import X.C49682F1r;
import X.C69714Nqa;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dbe;
import X.G2S;
import X.OJO;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.HashSet;

public final class ConsentFlowUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.consentflow.ConsentFlowUrlHandlerActivity, java.lang.Object, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        OJO ojo;
        boolean z;
        int A002 = AnonymousClass0fD.A00(1230028072);
        AnonymousClass0wW A0S = DbS.A0S(this);
        0qQ.A0B(A0S, 0);
        this.A00 = A0S;
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 1766739556;
        } else {
            String A0m = DbS.A0m(A0A);
            if (A0m == null || A0m.length() == 0) {
                finish();
                i = 1655808254;
            } else {
                C47273Du1 du1 = null;
                Uri A09 = DbT.A09(A0m);
                String queryParameter = A09.getQueryParameter("trigger_key");
                String A02 = Dbe.A02(0, 9, 4);
                if (queryParameter != null) {
                    C49682F1r f1r = (C49682F1r) getSession().A01(C49682F1r.class, G2S.A00);
                    synchronized (f1r) {
                        HashSet hashSet = f1r.A00;
                        if (hashSet.contains(queryParameter)) {
                            z = false;
                        } else {
                            hashSet.add(queryParameter);
                            z = true;
                        }
                    }
                    if (z) {
                        du1 = new C47273Du1(queryParameter, f1r, 1);
                        ojo = C69714Nqa.A00(getSession());
                        str = A09.getQueryParameter("flow_name");
                        if (str == null) {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    finish();
                    i = 1868679772;
                } else {
                    ojo = C69714Nqa.A00(getSession());
                    str = A09.getQueryParameter("flow_name");
                    if (str == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                ojo.A00(this, du1, str, A09.getQueryParameter("source"), A09.getQueryParameter(A02), A09.getQueryParameter("app_id"), A09.getQueryParameter("extra_params"));
                finish();
                i = 1868679772;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }
}
