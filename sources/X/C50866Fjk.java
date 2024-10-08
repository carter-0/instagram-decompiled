package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjk  reason: case insensitive filesystem */
public final class C50866Fjk implements G6H {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
        A0Q.A0A = "QP";
        A0Q.A0D(F9Y.A00().A04(fragmentActivity, this.A01, userSession, uri.getQueryParameter("fbid_of_incentive"), "QP"));
        A0Q.A04();
    }

    public C50866Fjk(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
