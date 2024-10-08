package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class NNP extends C228042kh {
    public final Application A00;
    public final AnonymousClass12V A01;
    public final UserSession A02;
    public final MVB A03;
    public final Integer A04;
    public final C62320sa A05;

    public /* synthetic */ NNP(Application application, UserSession userSession, MVB mvb, Integer num) {
        AnonymousClass12T r2 = AnonymousClass12T.A00;
        C73926Pm6 pm6 = new C73926Pm6(userSession, 10);
        AnonymousClass7TG.A1P(userSession, num);
        0qQ.A0B(r2, 5);
        this.A02 = userSession;
        this.A00 = application;
        this.A04 = num;
        this.A03 = mvb;
        this.A01 = r2;
        this.A05 = pm6;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        0qQ.A0B(userSession, 0);
        AnonymousClass65D.A00(userSession);
        1aU A002 = C72120Owf.A00(OP5.A00(userSession, "EBApiProvider"), userSession, 1);
        Application application = this.A00;
        Integer num = this.A04;
        C72203OyT A003 = C69901Nu3.A00(userSession, num);
        NUN A004 = C69898Nu0.A00(userSession);
        MVB mvb = this.A03;
        return new C67716MtV(application, this.A01, (1aU) this.A05.invoke(), A002, userSession, (NUK) userSession.A01(NUK.class, new C67485Mof(userSession, 19)), A004, A003, mvb, num);
    }
}
