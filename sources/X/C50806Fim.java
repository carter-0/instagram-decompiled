package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fim  reason: case insensitive filesystem */
public final class C50806Fim implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("product");
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
        A0Q.A0A = "QP";
        A0Q.A0B((Bundle) null, F6R.A00().A00(C272504kq.A00(queryParameter), userSession, (String) null, false));
        A0Q.A04();
    }

    public C50806Fim(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
