package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.KDr  reason: case insensitive filesystem */
public final class C61590KDr extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C3507185x A02;
    public final String A03;

    public C61590KDr(FragmentActivity fragmentActivity, UserSession userSession, C3507185x r4, String str) {
        AnonymousClass7TG.A0w(1, userSession, str, r4);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = str;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        FragmentActivity fragmentActivity = this.A00;
        Application A0A = JTP.A0A(fragmentActivity);
        UserSession userSession = this.A01;
        AnonymousClass835 A002 = C3500382y.A00(A0A, userSession).A00(this.A03);
        return new C60090JfW(JTP.A0A(fragmentActivity), userSession, A002.A01, A002.A05, this.A02);
    }
}
