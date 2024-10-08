package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wyr  reason: case insensitive filesystem */
public final class C20780Wyr extends 0Yg implements 0sP {
    public static final C20780Wyr A00 = new C20780Wyr();

    public C20780Wyr() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass2YQ r1 = (AnonymousClass2YQ) obj;
        0qQ.A0B(r1, 0);
        UserSession userSession = (UserSession) r1.A00(WEL.A00);
        if (userSession != null) {
            C17647Vbd vbd = (C17647Vbd) r1.A00(WEK.A00);
            if (vbd != null) {
                C311716d8 r2 = (C311716d8) r1.A00(WEI.A00);
                if (r2 != null) {
                    C376579In r12 = (C376579In) r1.A00(WEJ.A00);
                    if (r12 != null) {
                        L2Z l2z = new L2Z(userSession);
                        AnonymousClass0iw r5 = vbd.A00.A00;
                        String str = r2.A02;
                        String str2 = r12.A00;
                        AnonymousClass7TG.A0w(1, r5, str, str2);
                        C62028KWc kWc = new C62028KWc(r5, userSession, AnonymousClass2fR.A00(userSession), l2z, str, str2);
                        return new C60203JhM(userSession, vbd.A01, vbd.A03, l2z, kWc);
                    }
                    throw new IllegalStateException("No viewer session found");
                }
                throw new IllegalStateException("No viewer parameters found");
            }
            throw new IllegalStateException("No use case provider found");
        }
        throw new IllegalStateException("No UserSession set");
    }
}
