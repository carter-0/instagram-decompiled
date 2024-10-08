package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fi9  reason: case insensitive filesystem */
public final class C50767Fi9 implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        if (C375479Ds.A01(userSession)) {
            C309516Yo A0Q = DbU.A0Q(this.A00, userSession);
            A0Q.A0A = "QP";
            A0Q.A0D(new E2F());
            A0Q.A04();
        }
    }

    public C50767Fi9(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
