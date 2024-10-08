package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class NNJ extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final Integer A02;
    public final C62320sa A03;
    public final C62320sa A04;

    public /* synthetic */ NNJ(Application application, UserSession userSession, Integer num) {
        C67485Mof mof = new C67485Mof(userSession, 14);
        C67485Mof mof2 = new C67485Mof(userSession, 15);
        AnonymousClass7TG.A1P(userSession, num);
        this.A01 = userSession;
        this.A00 = application;
        this.A02 = num;
        this.A03 = mof;
        this.A04 = mof2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        Application application = this.A00;
        Integer num = this.A02;
        return new C67713MtS(application, (1aU) this.A04.invoke(), userSession, (NUN) this.A03.invoke(), C69901Nu3.A00(userSession, num), num);
    }
}
