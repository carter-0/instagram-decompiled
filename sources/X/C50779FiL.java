package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiL  reason: case insensitive filesystem */
public final class C50779FiL implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        2bg r1 = 2bg.A11;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r1.A01(userSession, obj)) {
            C47449E2v e2v = new C47449E2v();
            Bundle A0a = AnonymousClass7TE.A0a();
            DbU.A1B(uri, A0a, "trigger");
            DbU.A1B(uri, A0a, "event");
            e2v.setArguments(A0a);
            DbY.A14(e2v, this.A00, userSession);
        }
    }

    public C50779FiL(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
