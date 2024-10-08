package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class NNO extends C228042kh {
    public final Application A00;
    public final AnonymousClass12V A01;
    public final UserSession A02;
    public final C68714NUa A03;
    public final Integer A04;
    public final C62320sa A05;

    public /* synthetic */ NNO(Application application, UserSession userSession, C68714NUa nUa, Integer num) {
        AnonymousClass12T r2 = AnonymousClass12T.A00;
        C73663Phc phc = new C73663Phc(userSession, 0);
        AnonymousClass7TG.A1O(userSession, num);
        0qQ.A0B(r2, 5);
        this.A02 = userSession;
        this.A04 = num;
        this.A00 = application;
        this.A03 = nUa;
        this.A01 = r2;
        this.A05 = phc;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        C68714NUa nUa = this.A03;
        Integer num = this.A04;
        C72203OyT A002 = C69901Nu3.A00(userSession, num);
        AnonymousClass12V r2 = this.A01;
        return new C67712MtR(this.A00, r2, (1aU) this.A05.invoke(), userSession, nUa, A002, num);
    }
}
