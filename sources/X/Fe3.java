package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class Fe3 implements C51882G5u {
    public final int A00;

    public Fe3(int i) {
        this.A00 = i;
    }

    public final void E2Z(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession) {
        switch (this.A00) {
            case 0:
                Uri A03 = 0cp.A03(bundle.getString("uri_string"));
                String A0h = DbZ.A0h(A03);
                String queryParameter = A03.getQueryParameter("challenge_id");
                String queryParameter2 = A03.getQueryParameter("achievement_id");
                String queryParameter3 = A03.getQueryParameter("show_earned");
                C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
                A0M.A0E(C54928HYk.A00(Boolean.valueOf(queryParameter3), A0h, queryParameter, 0sr.A1N(queryParameter2)));
                A0M.A04();
                return;
            case 1:
                Object obj = bundle.get("bloks_screen_query_uri_key");
                obj.getClass();
                C48720Ej5.A00(fragmentActivity, (Uri) obj, userSession);
                return;
            case 2:
                FHB.A0C(bundle, fragmentActivity, userSession);
                return;
            case 3:
                FHB.A0B(bundle, fragmentActivity, userSession);
                return;
            default:
                OX7.A01(fragmentActivity, userSession, bundle.getLong("BUNDLE_OTC_NOTIF_START_TIME", -1), true);
                return;
        }
    }
}
