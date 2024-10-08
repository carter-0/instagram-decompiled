package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiZ  reason: case insensitive filesystem */
public final class C50793FiZ implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        2bg r1 = 2bg.A1M;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r1.A01(userSession, obj)) {
            C250563lf.A0b(this.A00.requireActivity(), userSession, AnonymousClass05K.A0Y);
        }
    }

    public C50793FiZ(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
