package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class EQL extends C47647EBh {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass4DU A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQL(Activity activity, Context context, 0hq r3, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, Runnable runnable, String str, String str2) {
        super(context, r3);
        this.A02 = r5;
        this.A01 = userSession;
        this.A06 = str;
        this.A00 = activity;
        this.A03 = r6;
        this.A05 = str2;
        this.A04 = runnable;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1622668168);
        int A033 = AnonymousClass0fD.A03(-1066488412);
        String str = ((DvJ) obj).A00;
        1Xj r5 = this.A02;
        UserSession userSession = this.A01;
        String A012 = C46395DeI.A01(userSession, r5, str);
        C49899FCc.A02(this.A00, this.A06, A012);
        AnonymousClass4DU r6 = this.A03;
        String id = r5.getId();
        String str2 = this.A05;
        String A0x = DbT.A0x(r5);
        DbY.A1S(userSession, id);
        C22031Xty.A0K(r6, userSession, id, str2, "user_sms", str, (String) null, A0x, (String) null);
        this.A04.run();
        AnonymousClass0fD.A0A(948928684, A033);
        AnonymousClass0fD.A0A(1248436470, A032);
    }

    public final void onFail(C268654dm r10) {
        int A032 = AnonymousClass0fD.A03(-1832450537);
        super.onFail(r10);
        UserSession userSession = this.A01;
        AnonymousClass4DU r3 = this.A03;
        1Xj r1 = this.A02;
        String str = this.A05;
        Throwable A012 = r10.A01();
        Runnable runnable = this.A04;
        String id = r1.getId();
        id.getClass();
        C22031Xty.A0H(r3, userSession, id, str, "user_sms", A012);
        runnable.run();
        AnonymousClass0fD.A0A(-396465814, A032);
    }
}
