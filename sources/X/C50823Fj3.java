package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fj3  reason: case insensitive filesystem */
public final class C50823Fj3 implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("email");
        C309516Yo A0M = DbS.A0M(this.A00, this.A01);
        1a1 A02 = C46447Df9.A02();
        0qQ.A0A(queryParameter);
        A0M.A0D(A02.A03(queryParameter, "profile_qp"));
        A0M.A04();
    }

    public C50823Fj3(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
