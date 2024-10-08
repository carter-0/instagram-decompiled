package com.instagram.urlhandlers.directquickreplysettings;

import X.0qQ;
import X.1WK;
import X.1as;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C66778McO;
import X.DbS;
import X.DbT;
import X.Dba;
import X.DcI;
import X.ESS;
import X.FFQ;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class DirectQuickReplySettingsUriHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.urlhandlers.directquickreplysettings.DirectQuickReplySettingsUriHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        C309516Yo A0B;
        int i;
        int A002 = AnonymousClass0fD.A00(-828914345);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            i = -55011619;
        } else {
            UserSession A0W = DbT.A0W(bundleExtra);
            this.A00 = A0W;
            if (A0W == null) {
                i = 1402296090;
            } else {
                if (!(A0W instanceof UserSession)) {
                    1WK A003 = FFQ.A00();
                    AnonymousClass0wW r1 = this.A00;
                    if (r1 != null) {
                        A003.A00(this, getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE"), r1);
                    } else {
                        IllegalStateException A0y = AnonymousClass7TE.A0y();
                        AnonymousClass0fD.A07(-236152466, A002);
                        throw A0y;
                    }
                } else {
                    DbS.A1Z(A0W);
                    String stringExtra = intent.getStringExtra("entrypoint");
                    if (DcI.A00(A0W)) {
                        if ("business_hub".equals(stringExtra) || "pro_home".equals(stringExtra) || "inbox_tool".equals(stringExtra)) {
                            UserSession userSession = this.A00;
                            0qQ.A0A(userSession);
                            C66778McO.A00(userSession).A05();
                            A0B = Dba.A0B(this, this.A00);
                        } else {
                            C309516Yo A0B2 = Dba.A0B(this, this.A00);
                            A0B2.A0F = true;
                            A0B2.A0D(new ESS());
                            A0B2.A04();
                            A0B = DbS.A0M(this, this.A00);
                        }
                        A0B.A0F = true;
                        A0B.A0D(1as.A04.A02.A02(stringExtra));
                        A0B.A04();
                    }
                }
                i = 329114205;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
