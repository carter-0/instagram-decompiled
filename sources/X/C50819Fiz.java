package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fiz  reason: case insensitive filesystem */
public final class C50819Fiz implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public C50819Fiz(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        DbU.A0v();
        Bundle A0a = AnonymousClass7TE.A0a();
        E4H e4h = new E4H();
        DbS.A1B(A0a, "deep_link");
        e4h.setArguments(A0a);
        Bundle requireArguments = e4h.requireArguments();
        UserSession userSession = this.A01;
        DbU.A1D(requireArguments, userSession);
        C309516Yo A0H = DbW.A0H(this.A00, userSession);
        A0H.A0A = "BusinessObjectives";
        A0H.A0D(e4h);
        A0H.A04();
    }
}
