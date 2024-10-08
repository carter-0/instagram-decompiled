package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class EIF extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EDT A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EIF(EDT edt, String str, String str2, int i) {
        super(1929956249, 3, false, false);
        this.A01 = edt;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
    }

    public final void run() {
        EDT edt = this.A01;
        Context context = edt.A00;
        0qQ.A0A(context);
        UserSession userSession = edt.A02;
        String str = this.A03;
        String str2 = this.A02;
        AnonymousClass7TF.A1H(context, userSession);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("session/flush_session/");
        DbS.A1P(A0a, str);
        A0a.A9m(C46325Dbt.A00(0, 9, 17), 0qv.A00(context));
        DbZ.A0y(context, A0a, "session_flush_nonce", str2);
        1OC A0S = DbU.A0S(A0a, 1XP.class, 1XY.class);
        A0S.A00 = new EBL(edt, str2, str, this.A00);
        A0S.run();
    }
}
