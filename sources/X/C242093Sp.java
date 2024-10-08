package X;

import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Sp  reason: invalid class name and case insensitive filesystem */
public final class C242093Sp {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;

    public C242093Sp(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        0Tu r2 = 0Tu.A05;
        this.A02 = 182.A06(r2, userSession, 36311156758938050L);
        this.A01 = 182.A06(r2, userSession, 36311156759003587L);
    }

    public final boolean A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return this.A02;
    }

    public final boolean A01() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return this.A01;
    }
}
