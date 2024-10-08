package X;

import com.instagram.common.session.UserSession;

public final class WEH implements AnonymousClass07g, AnonymousClass07P {
    public final C587707f A00;
    public final 2YS A01;
    public final C50142FQz A02 = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [X.FQz, java.lang.Object] */
    public WEH(C587707f r4, C376579In r5, UserSession userSession, C311716d8 r7) {
        0qQ.A0B(r4, 1);
        this.A00 = r4;
        2YS r2 = new 2YS(AnonymousClass2YP.A00);
        r2.A01(WEI.A00, r7);
        r2.A01(WEJ.A00, r5);
        r2.A01(WEK.A00, new C17647Vbd(userSession, r7));
        r2.A01(WEL.A00, userSession);
        this.A01 = r2;
    }

    public final AnonymousClass2YQ getDefaultViewModelCreationExtras() {
        return this.A01;
    }

    public final 2YM getDefaultViewModelProviderFactory() {
        return this.A02;
    }

    public final C587707f getViewModelStore() {
        return this.A00;
    }
}
