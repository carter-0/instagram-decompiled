package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiN  reason: case insensitive filesystem */
public final class C50781FiN implements G6H {
    public final Context A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        Context context = this.A00;
        if (1CI.A00(this.A01)) {
            FH7.A03(context, DbT.A10(uri));
        }
    }

    public C50781FiN(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
