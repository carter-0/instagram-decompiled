package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fia  reason: case insensitive filesystem */
public final class C50794Fia implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        2bg r2 = 2bg.A1N;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r2.A01(userSession, obj)) {
            C49037EoH.A00(this.A00, DbX.A0q(userSession), true);
        }
    }

    public C50794Fia(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
