package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;

/* renamed from: X.WZf  reason: case insensitive filesystem */
public final class C19435WZf implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        UserSession userSession = this.A01;
        if (!182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36331033867600762L)) {
            String queryParameter = uri.getQueryParameter("query");
            if (queryParameter == null) {
                queryParameter = "";
            }
            C309516Yo r4 = new C309516Yo(this.A00.requireActivity(), userSession);
            C14398TvR.A00();
            r4.A0B((Bundle) null, C14452Twa.A02(new Keyword(queryParameter, queryParameter), AnonymousClass000.A00(5161), AnonymousClass7TG.A0j(), queryParameter, (String) null));
            r4.A04();
        }
    }

    public C19435WZf(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
