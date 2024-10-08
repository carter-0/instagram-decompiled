package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjY  reason: case insensitive filesystem */
public final class C50854FjY implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        UserSession userSession = this.A01;
        if (182.A06(0Tu.A05, userSession, 36312973530302016L)) {
            C309516Yo A0Q = DbU.A0Q(this.A00, userSession);
            String str = "QP";
            A0Q.A0A = str;
            F3X A002 = FC8.A00();
            String queryParameter = uri.getQueryParameter("origin");
            if (queryParameter != null) {
                str = AnonymousClass7TF.A0k(queryParameter);
            }
            A0Q.A0D(A002.A02(str));
            A0Q.A04();
        }
    }

    public C50854FjY(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
