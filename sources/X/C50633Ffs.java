package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ffs  reason: case insensitive filesystem */
public final class C50633Ffs implements G6A {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 0rm A02;

    public C50633Ffs(FragmentActivity fragmentActivity, UserSession userSession, 0rm r3) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = fragmentActivity;
    }

    public final void onFinished() {
        UserSession userSession = this.A01;
        C49213ErI.A00(userSession, (EXD) this.A02.A00);
        C46413Dea.A08(this.A00, DbS.A0O("caa_registration"), userSession);
    }
}
