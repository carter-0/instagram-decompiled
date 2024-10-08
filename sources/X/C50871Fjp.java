package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.Fjp  reason: case insensitive filesystem */
public final class C50871Fjp implements G6H {
    public final Context A00;
    public final AnonymousClass07i A01;
    public final UserSession A02;

    public final void CI0(Uri uri, Bundle bundle) {
        String str;
        0qQ.A0B(uri, 0);
        String path = uri.getPath();
        if (path != null) {
            if (00p.A0k(path, "/", false)) {
                path = path.substring(1);
                0qQ.A07(path);
            }
            if (!00p.A0i(path, "/", false)) {
                path = 002.A0C(path, '/');
            }
            0qv r5 = 0qv.A02;
            0qQ.A07(r5);
            C60820jg r0 = 0jh.A04;
            UserSession userSession = this.A02;
            19i A012 = r0.A01(userSession).A01(19f.A2H);
            1NY A0M = DbU.A0M(userSession);
            A0M.A0A(path);
            A0M.A06 = 1CE.A02;
            A0M.A04();
            Context context = this.A00;
            A0M.A9m("device", 0qv.A00(context));
            DbX.A1M(A0M, "guid", r5.A05(context));
            if (A012 != null) {
                str = A012.A01;
            } else {
                str = "";
            }
            A0M.A9m("phone_id", str);
            Iterator<String> it = uri.getQueryParameterNames().iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                if (A18 != null) {
                    A0M.A9m(A18, uri.getQueryParameter(A18));
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            1OC A0K = DbW.A0K(A0M);
            C47696EDf.A01(A0K, this, 16);
            1ES.A00(context, this.A01, A0K);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public C50871Fjp(Context context, AnonymousClass07i r2, UserSession userSession) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = userSession;
    }
}
