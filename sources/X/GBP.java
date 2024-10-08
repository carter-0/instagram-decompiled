package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class GBP extends C228042kh {
    public final int A00;
    public final Application A01;
    public final AnonymousClass07i A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new GDR(this.A01, this.A02, this.A03, this.A04, this.A00);
    }

    public GBP(Application application, AnonymousClass07i r2, UserSession userSession, AnonymousClass4DU r4, int i) {
        AnonymousClass7TG.A1Q(userSession, r4);
        this.A01 = application;
        this.A03 = userSession;
        this.A04 = r4;
        this.A00 = i;
        this.A02 = r2;
    }
}
