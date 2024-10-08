package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fi5  reason: case insensitive filesystem */
public final class C50763Fi5 implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        boolean z;
        0qQ.A0B(uri, 0);
        String A002 = C49002Ene.A00(uri.getQueryParameter("origin"));
        if (A002 == null) {
            A002 = "QP";
        }
        String queryParameter = uri.getQueryParameter("start_onboarding");
        if (queryParameter != null) {
            z = Boolean.parseBoolean(queryParameter);
        } else {
            z = false;
        }
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
        A0Q.A0A = A002;
        A0Q.A0B((Bundle) null, AnonymousClass2BF.A00().A02().A00(userSession, A002, DbT.A0v(uri), (String) null, z));
        A0Q.A04();
    }

    public C50763Fi5(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
