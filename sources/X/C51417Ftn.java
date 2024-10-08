package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ftn  reason: case insensitive filesystem */
public final class C51417Ftn implements Runnable {
    public final /* synthetic */ 2Aq A00;
    public final /* synthetic */ String A01;

    public final void run() {
        FragmentActivity fragmentActivity = null;
        try {
            fragmentActivity = 2MD.A01().A06();
        } catch (ClassCastException | IndexOutOfBoundsException unused) {
        }
        if (fragmentActivity == null) {
            FragmentActivity A002 = C71172bH.A00();
            if (A002 instanceof FragmentActivity) {
                fragmentActivity = A002;
            }
        }
        UserSession userSession = this.A00.A05;
        AnonymousClass3FV.A06(fragmentActivity, userSession);
        String str = this.A01;
        2B1 r1 = 2B0.A01;
        0qQ.A0B(userSession, 0);
        DbX.A1T(DbV.A0c(userSession, r1), "TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", str, true);
    }

    public C51417Ftn(2Aq r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
