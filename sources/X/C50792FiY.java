package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.FiY  reason: case insensitive filesystem */
public final class C50792FiY implements G6H {
    public final UserSession A00;
    public final WeakReference A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        Activity activity = (Activity) this.A01.get();
        2bg r1 = 2bg.A1L;
        String obj = uri.toString();
        UserSession userSession = this.A00;
        if (r1.A01(userSession, obj) && activity != null) {
            String queryParameter = uri.getQueryParameter("loggingSurface");
            String queryParameter2 = uri.getQueryParameter("loggingMechanism");
            C52480GUi gUi = C63556Kz5.A01;
            if (queryParameter == null) {
                queryParameter = "ig_direct";
            }
            if (queryParameter2 == null) {
                queryParameter2 = "ig_direct_avatar_qp_button";
            }
            gUi.A05(activity, userSession, queryParameter, queryParameter2);
        }
    }

    public C50792FiY(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = new WeakReference(fragmentActivity);
    }
}
