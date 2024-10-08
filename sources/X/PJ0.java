package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class PJ0 implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        AnonymousClass7JY r4;
        0qQ.A0B(uri, 0);
        if (0qQ.A0K(uri.getQueryParameter("command"), "imagine")) {
            r4 = AnonymousClass7JY.IMAGINE;
        } else {
            r4 = AnonymousClass7JY.AI;
        }
        AnonymousClass9B9.A00().A01(this.A00, C69503Nml.A0E, this.A01, r4, false, false);
    }

    public PJ0(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
