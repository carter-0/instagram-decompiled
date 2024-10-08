package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.FjX  reason: case insensitive filesystem */
public final class C50853FjX implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        UserSession userSession = this.A01;
        if (AnonymousClass2o2.A03(userSession)) {
            String queryParameter = uri.getQueryParameter("origin");
            if (queryParameter == null) {
                Set set = C49280EsP.A00;
                queryParameter = "fan_qp_upsell";
            }
            String queryParameter2 = uri.getQueryParameter(AnonymousClass000.A00(3576));
            if (queryParameter2 != null) {
                FC8.A01().A04(this.A00, userSession, (Boolean) null, (Boolean) null, queryParameter2, queryParameter);
            }
        }
    }

    public C50853FjX(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
