package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ffu  reason: case insensitive filesystem */
public final class C50635Ffu implements G6A {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ EXD A03;

    public C50635Ffu(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, EXD exd) {
        this.A02 = userSession;
        this.A03 = exd;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void onFinished() {
        UserSession userSession = this.A02;
        C49213ErI.A00(userSession, this.A03);
        C46413Dea.A08(this.A00, this.A01, userSession);
    }
}
