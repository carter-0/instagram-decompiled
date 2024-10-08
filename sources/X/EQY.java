package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class EQY extends H4J {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C48145EZn A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Runnable A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQY(Activity activity, 0hq r2, C48145EZn eZn, UserSession userSession, Runnable runnable) {
        super(r2);
        this.A02 = userSession;
        this.A01 = eZn;
        this.A00 = activity;
        this.A03 = runnable;
    }

    public final void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(-1698820647);
        C49947FGb.A01(this.A01, C48142EZk.SMS, this.A02);
        this.A03.run();
        AnonymousClass0fD.A0A(-827942854, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-509386754);
        C47354Dvo dvo = (C47354Dvo) obj;
        int A033 = AnonymousClass0fD.A03(1343300230);
        AnonymousClass7TE.A0a().putString("android.intent.extra.TEXT", dvo.A00);
        UserSession userSession = this.A02;
        C48145EZn eZn = this.A01;
        C48142EZk eZk = C48142EZk.SMS;
        String str = dvo.A00;
        Activity activity = this.A00;
        C49947FGb.A02(eZn, eZk, userSession, str, C267044ar.A01(activity, userSession));
        C49899FCc.A02(activity, "", dvo.A00);
        this.A03.run();
        AnonymousClass0fD.A0A(-322992123, A033);
        AnonymousClass0fD.A0A(-1972980426, A032);
    }
}
