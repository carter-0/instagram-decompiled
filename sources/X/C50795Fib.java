package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fib  reason: case insensitive filesystem */
public final class C50795Fib implements G6H {
    public final FragmentActivity A00;
    public final 0lg A01;

    public final void CI0(Uri uri, Bundle bundle) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        Bundle A0a = AnonymousClass7TE.A0a();
        0qQ.A0B(userSession, 1);
        DbU.A1D(A0a, userSession);
        K4i k4i = new K4i();
        k4i.setArguments(A0a);
        Dbb.A13(k4i, fragmentActivity, userSession);
    }

    public C50795Fib(FragmentActivity fragmentActivity, 0lg r2) {
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }
}
