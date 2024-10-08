package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiK  reason: case insensitive filesystem */
public final class C50778FiK implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C50778FiK(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        C46447Df9.A03();
        UserSession userSession = this.A01;
        Bundle A0a = AnonymousClass7TE.A0a();
        E3F e3f = new E3F();
        e3f.setArguments(A0a);
        Dbb.A11(e3f, this.A00, userSession);
    }
}
