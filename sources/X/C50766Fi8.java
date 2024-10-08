package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fi8  reason: case insensitive filesystem */
public final class C50766Fi8 implements G6H {
    public final Activity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        0BQ A002 = AnonymousClass0BO.A00(userSession);
        Activity activity = this.A00;
        0B7 AEO = A002.AEO(activity, (Uri) null, userSession, (String) null, true);
        if (AEO.A01) {
            FFQ.A00().A01(activity, AEO.A00, userSession, false);
        }
    }

    public C50766Fi8(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }
}
