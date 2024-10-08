package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjJ  reason: case insensitive filesystem */
public final class C50839FjJ implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("order");
        C46443Df5 df5 = C46443Df5.FOLLOWING;
        UserSession userSession = this.A01;
        F8I.A00(this.A00.getActivity(), userSession, C46451DfE.A00(df5, userSession.A06, queryParameter, false), false).A04();
    }

    public C50839FjJ(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
