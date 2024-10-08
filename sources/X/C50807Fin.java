package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fin  reason: case insensitive filesystem */
public final class C50807Fin implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        UserSession userSession = this.A01;
        if (DcI.A00(userSession)) {
            FragmentActivity fragmentActivity = this.A00;
            C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
            A0Q.A0D(new ESS());
            A0Q.A04();
            NJP A02 = 1as.A04.A02.A02(uri.getQueryParameter("entrypoint"));
            C309516Yo A0Q2 = DbU.A0Q(fragmentActivity, userSession);
            0qQ.A0A(A02);
            A0Q2.A0D(A02);
            A0Q2.A04();
        }
    }

    public C50807Fin(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
