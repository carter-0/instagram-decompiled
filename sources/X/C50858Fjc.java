package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjc  reason: case insensitive filesystem */
public final class C50858Fjc implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        C309516Yo A0Q = DbU.A0Q(this.A00, this.A01);
        A0Q.A0A = "QP";
        A0Q.A0D(C49195Er0.A00().A00().A00("QP", DbT.A0v(uri)));
        A0Q.A04();
    }

    public C50858Fjc(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
