package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.KDs  reason: case insensitive filesystem */
public final class C61591KDs extends C228042kh {
    public final FragmentActivity A00;
    public final JWZ A01;
    public final UserSession A02;
    public final JWW A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        FragmentActivity fragmentActivity = this.A00;
        Application A0A = JTP.A0A(fragmentActivity);
        UserSession userSession = this.A02;
        return new C60095Jfb(A0A, this.A01, userSession, AnonymousClass72U.A00(fragmentActivity, userSession), this.A03);
    }

    public C61591KDs(FragmentActivity fragmentActivity, JWZ jwz, UserSession userSession, JWW jww) {
        C51974G9v.A1M(userSession, jwz, jww);
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = jwz;
        this.A03 = jww;
    }
}
