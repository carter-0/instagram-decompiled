package com.instagram.urlhandlers.whatsapp;

import X.002;
import X.08y;
import X.09i;
import X.0b6;
import X.0cp;
import X.0oI;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FFQ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class WhatsAppRedirectUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.app.Activity, com.instagram.urlhandlers.whatsapp.WhatsAppRedirectUrlHandlerActivity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, com.instagram.urlhandlers.whatsapp.WhatsAppRedirectUrlHandlerActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0A;
        int A00 = AnonymousClass0fD.A00(893329252);
        super.onCreate(bundle);
        if (bundle != null) {
            i = 2063146631;
        } else {
            Intent intent = getIntent();
            if (intent == null || (A0A = DbT.A0A(intent)) == null) {
                finish();
                i = -1710782075;
            } else {
                if (!DbT.A1Z(this)) {
                    FFQ.A03(A0A, this);
                } else {
                    String A0m = DbS.A0m(A0A);
                    if (!(A0m == null || A0m.length() == 0)) {
                        try {
                            Uri A03 = 0cp.A03(A0m);
                            String queryParameter = A03.getQueryParameter("campaign");
                            if (queryParameter == null) {
                                queryParameter = "ig_unknown_campaign";
                            }
                            String queryParameter2 = A03.getQueryParameter("source_surface");
                            if (0oI.A0G(this)) {
                                Uri parse = Uri.parse("https://chat.whatsapp.com");
                                if (!(queryParameter2 == null || queryParameter2.length() == 0)) {
                                    parse = Uri.parse(002.A0R("https://chat.whatsapp.com?source_surface=", queryParameter2));
                                }
                                Intent intent2 = new Intent("android.intent.action.VIEW", parse);
                                intent2.setPackage("com.whatsapp");
                                0b6.A00().A06().A0G(this, intent2);
                            } else {
                                0oI.A07(this, "com.whatsapp", 002.A0R("ig4a%26utm_campaign%3D", queryParameter));
                            }
                        } catch (IllegalArgumentException | SecurityException unused) {
                            finish();
                        }
                    }
                    finish();
                }
                i = -2070617190;
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
