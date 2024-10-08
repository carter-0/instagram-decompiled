package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class EQc extends H4J {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQc(Activity activity, 0hq r2, UserSession userSession, AnonymousClass4DU r4, Runnable runnable, String str, String str2, String str3) {
        super(r2);
        this.A06 = str;
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = r4;
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = runnable;
    }

    public final void onFail(C268654dm r9) {
        int A032 = AnonymousClass0fD.A03(-1629617615);
        C22031Xty.A0H(this.A02, this.A01, this.A04, this.A05, "user_sms", r9.A01());
        this.A03.run();
        AnonymousClass0fD.A0A(-41831283, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-593343113);
        int A033 = AnonymousClass0fD.A03(-1740623691);
        String str = ((DvD) obj).A00;
        AnonymousClass7TE.A0a().putString("android.intent.extra.TEXT", str);
        C49899FCc.A02(this.A00, this.A06, str);
        C22031Xty.A0I(this.A02, this.A01, this.A04, this.A05, "user_sms", str);
        this.A03.run();
        AnonymousClass0fD.A0A(255876746, A033);
        AnonymousClass0fD.A0A(596477349, A032);
    }
}
