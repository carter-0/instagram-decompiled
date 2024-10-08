package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiM  reason: case insensitive filesystem */
public final class C50780FiM implements G6H {
    public final Context A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        14D A002;
        0qQ.A0B(uri, 0);
        Context context = this.A00;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (!FGU.A03(context, userSession, obj, "ExternalUrlActionHandler") && (A002 = 14D.A04.A00()) != null && A002.A00(userSession, uri.toString()) != null) {
            0kR.A0B(context, DbT.A0e().A04(context, uri));
        }
    }

    public C50780FiM(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
