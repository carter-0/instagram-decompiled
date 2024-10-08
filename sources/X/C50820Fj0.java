package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fj0  reason: case insensitive filesystem */
public final class C50820Fj0 implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("email");
        if (queryParameter != null) {
            C309516Yo A0M = DbS.A0M(this.A00.requireActivity(), this.A01);
            A0M.A0D(C46447Df9.A02().A03(queryParameter, "profile_qp"));
            A0M.A04();
        }
    }

    public C50820Fj0(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
