package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.HcA  reason: case insensitive filesystem */
public abstract class C55101HcA {
    public static final C54141H0l A00(UserSession userSession, boolean z, boolean z2) {
        Bundle A0B = DbV.A0B(userSession, 0);
        C227642jf.A04(A0B, userSession);
        A0B.putBoolean("com.instagram.release.lockout.disable_back_press", z);
        A0B.putBoolean("com.instagram.release.lockout.expired_build", z2);
        C54141H0l h0l = new C54141H0l();
        h0l.setArguments(A0B);
        return h0l;
    }
}
