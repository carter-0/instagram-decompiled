package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bwpclientauthmanager.AuthenticationActivity;
import com.instagram.igoauthaccountlinking.IgOAuthAccountLinkingActivity;

public final class QYL extends C69678Nq0 {
    public final int A00;
    public final Object A01;

    public QYL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A01() {
        if (this.A00 != 0) {
            ((C12048Sla) this.A01).A03.A00(RDE.A04);
            return;
        }
        SlZ slZ = (SlZ) this.A01;
        slZ.A02(AnonymousClass05K.A00);
        slZ.A01();
    }

    public final void A03() {
        S3I s3i;
        boolean A06;
        if (this.A00 != 0) {
            C12048Sla sla = (C12048Sla) this.A01;
            if (sla.A09) {
                s3i = sla.A08;
            } else {
                S34 s34 = sla.A07;
                FragmentActivity fragmentActivity = s34.A04;
                Intent A0A = C66580MXl.A0A(fragmentActivity, AuthenticationActivity.class);
                Bundle bundle = s34.A02;
                A0A.putExtra("iab_session_params", bundle);
                Bundle A062 = DbU.A06(fragmentActivity);
                if (A062 != null) {
                    if (182.A06(0Tu.A05, DbS.A0U(A062), 36324690200965363L)) {
                        s34.A01.putExtra("BrowserLiteIntent.IAB_EXTERNAL_INTERSTITIAL_ENABLED", false);
                    }
                    A0A.putExtra("iab_browser_intent", s34.A01);
                    s34.A03.A02(A0A);
                    SRE.A00.A02(bundle, s34.A00, AnonymousClass05K.A00, (String) null);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        } else {
            s3i = ((SlZ) this.A01).A00;
            if (s3i == null) {
                0qQ.A0F("accountLinkingManager");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        00Y r5 = s3i.A03;
        FragmentActivity fragmentActivity2 = s3i.A05;
        T9K t9k = s3i.A06;
        Intent A0A2 = C66580MXl.A0A(fragmentActivity2, IgOAuthAccountLinkingActivity.class);
        A0A2.putExtra("oauth_account_linking_provider", t9k);
        A0A2.putExtra("oauth_integration_id", s3i.A07);
        Bundle A063 = DbU.A06(s3i.A04);
        if (A063 == null) {
            A06 = true;
        } else {
            A06 = 182.A06(0Tu.A05, DbS.A0U(A063), 36327834117290737L);
        }
        A0A2.putExtra("is_app2app_enabled", A06);
        Intent intent = s3i.A00;
        intent.putExtra("BrowserLiteIntent.IAB_EXTERNAL_INTERSTITIAL_ENABLED", false);
        A0A2.putExtra("iab_intent", intent);
        A0A2.putExtra("session_parameters", s3i.A01);
        r5.A02(A0A2);
    }
}
