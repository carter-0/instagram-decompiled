package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class NNI extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final C68714NUa A02;
    public final Integer A03;
    public final C62320sa A04;

    public /* synthetic */ NNI(Application application, UserSession userSession, C68714NUa nUa, Integer num) {
        C67485Mof mof = new C67485Mof(userSession, 13);
        AnonymousClass7TG.A1P(userSession, num);
        this.A01 = userSession;
        this.A00 = application;
        this.A03 = num;
        this.A02 = nUa;
        this.A04 = mof;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        Application application = this.A00;
        Integer num = this.A03;
        C72203OyT A002 = C69901Nu3.A00(userSession, num);
        return new C67715MtU(application, userSession, this.A02, A002, num, (AnonymousClass0r6) this.A04.invoke());
    }
}
