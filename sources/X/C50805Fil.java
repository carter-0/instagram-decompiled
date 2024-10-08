package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fil  reason: case insensitive filesystem */
public final class C50805Fil implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("monetization_type");
        String A0h = DbZ.A0h(uri);
        String queryParameter2 = uri.getQueryParameter("upl_session_id");
        C309516Yo A0M = DbS.A0M(this.A00, this.A01);
        A0M.A0B((Bundle) null, C48892Els.A00(C272504kq.A00(queryParameter), C49055EoZ.A00(A0h), (String) null, queryParameter2));
        A0M.A04();
    }

    public C50805Fil(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
