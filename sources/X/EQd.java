package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EQd extends H4J {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQd(Activity activity, 0hq r2, AnonymousClass0iw r3, UserSession userSession, User user, Runnable runnable, String str, String str2) {
        super(r2);
        this.A06 = str;
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = user;
        this.A05 = str2;
        this.A04 = runnable;
    }

    public final void onFail(C268654dm r13) {
        int A032 = AnonymousClass0fD.A03(-271924186);
        User user = this.A03;
        Activity activity = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass0iw r6 = this.A01;
        String str = this.A05;
        String str2 = this.A06;
        Runnable runnable = this.A04;
        C49899FCc.A02(activity, str2, DbY.A0i(user));
        C22031Xty.A0H(r6, userSession, user.getId(), str, "user_sms", DbZ.A0o(user));
        runnable.run();
        AnonymousClass0fD.A0A(356189763, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1958142686);
        int A033 = AnonymousClass0fD.A03(1431258307);
        String str = ((DvK) obj).A00;
        C49899FCc.A02(this.A00, this.A06, str);
        C22031Xty.A0I(this.A01, this.A02, this.A03.getId(), this.A05, "user_sms", str);
        this.A04.run();
        AnonymousClass0fD.A0A(-1663814952, A033);
        AnonymousClass0fD.A0A(-818021575, A032);
    }
}
