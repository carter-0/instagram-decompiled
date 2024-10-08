package com.instagram.urlhandlers.accountquality;

import X.08y;
import X.09i;
import X.0Yt;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C359608dC;
import X.C46471DfZ;
import X.C46626Di6;
import X.C46627Di7;
import X.C46649DiU;
import X.C49672F1e;
import X.C49940FFt;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dbe;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class AccountQualityIgActorLauncherActivity extends IgFragmentActivity {
    public UserSession A00;

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.urlhandlers.accountquality.AccountQualityIgActorLauncherActivity, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1868505907);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 1623971508;
        } else {
            08y r1 = 09i.A0A;
            UserSession A04 = r1.A04(A0A);
            if (A04 == null) {
                finish();
                i = 1867416321;
            } else if (!(A04 instanceof UserSession)) {
                FFQ.A01(this, A0A, A04);
                i = -771244655;
            } else {
                this.A00 = r1.A06(A0A);
                String A0m = DbS.A0m(A0A);
                if (A0m == null) {
                    finish();
                    i = 1175508842;
                } else {
                    Uri A09 = DbT.A09(A0m);
                    HashMap A1E = AnonymousClass7TE.A1E();
                    A1E.put("actor_id", A09.getQueryParameter("actor_id"));
                    A1E.put("source", A09.getQueryParameter("source"));
                    UserSession userSession = A04;
                    A1E.put(Dbe.A00(), userSession.A05);
                    HashMap A01 = C359608dC.A01(A1E);
                    C49940FFt fFt = new C49940FFt();
                    fFt.A02 = C46627Di7.DISABLED;
                    fFt.A03 = C46626Di6.FULL_SHEET;
                    C46471DfZ A012 = C49940FFt.A01(fFt, this, 5);
                    C49672F1e f1e = new C49672F1e(userSession);
                    IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
                    igBloksScreenConfig.A0R = "com.bloks.www.accountquality.xmds.actor";
                    f1e.A00(A012);
                    C46649DiU.A08(this, igBloksScreenConfig, "com.bloks.www.accountquality.xmds.actor", A01, 0Yt.A0E());
                    i = 899710593;
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }
}
