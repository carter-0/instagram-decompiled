package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class EQN extends C47647EBh {
    public final /* synthetic */ 0hq A00;
    public final /* synthetic */ AnonymousClass2hV A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ AnonymousClass4DU A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Runnable A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQN(Context context, 0hq r2, 0hq r3, AnonymousClass2hV r4, UserSession userSession, 1Xj r6, AnonymousClass4DU r7, Boolean bool, Runnable runnable, String str, String str2) {
        super(context, r2);
        this.A08 = str;
        this.A03 = r6;
        this.A07 = str2;
        this.A04 = r7;
        this.A02 = userSession;
        this.A05 = bool;
        this.A06 = runnable;
        this.A01 = r4;
        this.A00 = r3;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-2013835951);
        int A033 = AnonymousClass0fD.A03(1830933541);
        String str = ((DvJ) obj).A00;
        String str2 = this.A08;
        1Xj r5 = this.A03;
        String str3 = this.A07;
        AnonymousClass4DU r6 = this.A04;
        UserSession userSession = this.A02;
        Boolean bool = this.A05;
        Runnable runnable = this.A06;
        this.A01.apply(str);
        if (bool.booleanValue()) {
            String id = r5.getId();
            id.getClass();
            C22031Xty.A0K(r6, userSession, id, str3, str2, str, DbT.A0x(r5), (String) null, (String) null);
        }
        if (runnable != null) {
            runnable.run();
        }
        AnonymousClass0fD.A0A(1794247075, A033);
        AnonymousClass0fD.A0A(-248580840, A032);
    }

    public final void onFail(C268654dm r10) {
        int A032 = AnonymousClass0fD.A03(-528364937);
        super.onFail(r10);
        UserSession userSession = this.A02;
        AnonymousClass4DU r3 = this.A04;
        1Xj r1 = this.A03;
        String str = this.A07;
        String str2 = this.A08;
        Throwable A012 = r10.A01();
        Runnable runnable = this.A06;
        String id = r1.getId();
        id.getClass();
        C22031Xty.A0H(r3, userSession, id, str, str2, A012);
        if (runnable != null) {
            runnable.run();
        }
        AnonymousClass0fD.A0A(1514726257, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-1190415713);
        11Z.A03(new C51313Fs6(this.A00));
        AnonymousClass0fD.A0A(1321732522, A032);
    }
}
