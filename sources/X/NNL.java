package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class NNL extends C228042kh {
    public final Application A00;
    public final AnonymousClass12V A01;
    public final UserSession A02;
    public final MVB A03;
    public final Integer A04;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        0qQ.A0B(userSession, 0);
        AnonymousClass65D.A00(userSession);
        1aU A002 = C72120Owf.A00(OP5.A00(userSession, "EBApiProvider"), userSession, 1);
        Integer num = this.A04;
        C72203OyT A003 = C69901Nu3.A00(userSession, num);
        return new C67714MtT(this.A00, this.A01, A002, userSession, C69896Nty.A00(userSession), A003, this.A03, num);
    }

    public NNL(Application application, AnonymousClass12V r2, UserSession userSession, MVB mvb, Integer num) {
        C51974G9v.A1L(userSession, num, r2);
        this.A02 = userSession;
        this.A04 = num;
        this.A03 = mvb;
        this.A01 = r2;
        this.A00 = application;
    }
}
