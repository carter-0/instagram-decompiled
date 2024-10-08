package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Fjq  reason: case insensitive filesystem */
public final class C50872Fjq implements G6H {
    public final Context A00;
    public final AnonymousClass07i A01;
    public final UserSession A02;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("email");
        UserSession userSession = this.A02;
        Integer num = AnonymousClass05K.A01;
        Context context = this.A00;
        1OC A03 = C318486p2.A03(context, userSession, num, queryParameter, (String) null, (List) null);
        C47696EDf.A01(A03, this, 17);
        1ES.A00(context, this.A01, A03);
    }

    public C50872Fjq(Context context, AnonymousClass07i r2, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
