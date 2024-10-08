package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EQa  reason: case insensitive filesystem */
public final class C47994EQa extends H4J {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47994EQa(Fragment fragment, 0hq r2, AnonymousClass0iw r3, UserSession userSession, User user, Runnable runnable, String str) {
        super(r2);
        this.A00 = fragment;
        this.A03 = user;
        this.A02 = userSession;
        this.A01 = r3;
        this.A05 = str;
        this.A04 = runnable;
    }

    public final void onFail(C268654dm r17) {
        int A032 = AnonymousClass0fD.A03(-607518020);
        User user = this.A03;
        UserSession userSession = this.A02;
        AnonymousClass0iw r4 = this.A01;
        String str = this.A05;
        Fragment fragment = this.A00;
        Throwable A012 = r17.A01();
        Runnable runnable = this.A04;
        C22031Xty.A0H(r4, userSession, user.getId(), str, "system_share_sheet", A012);
        C46395DeI.A0R(AnonymousClass7TE.A0a(), fragment, r4, userSession, user, runnable, DbY.A0i(user), str);
        AnonymousClass0fD.A0A(1886790630, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1478456557);
        DvK dvK = (DvK) obj;
        int A033 = AnonymousClass0fD.A03(1907058225);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("android.intent.extra.TEXT", dvK.A00);
        String str = dvK.A00;
        Fragment fragment = this.A00;
        User user = this.A03;
        UserSession userSession = this.A02;
        C46395DeI.A0R(A0a, fragment, this.A01, userSession, user, this.A04, str, this.A05);
        AnonymousClass0fD.A0A(-2103022934, A033);
        AnonymousClass0fD.A0A(-939839015, A032);
    }
}
