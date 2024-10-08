package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class PJB implements G6H {
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("hash");
        if (queryParameter != null) {
            DbW.A0T(this.A02).A02(this.A00, C71045OaN.A01(C69318NjJ.QUICK_PROMOTION, (C74469PvP) null, queryParameter, (String) null));
        }
    }

    public PJB(Activity activity, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
