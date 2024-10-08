package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wyp  reason: case insensitive filesystem */
public final class C20778Wyp extends 0Yg implements 0sP {
    public static final C20778Wyp A00 = new C20778Wyp();

    public C20778Wyp() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass2YQ r8 = (AnonymousClass2YQ) obj;
        0qQ.A0B(r8, 0);
        UserSession userSession = (UserSession) r8.A00(WEL.A00);
        if (userSession != null) {
            C311716d8 r3 = (C311716d8) r8.A00(WEI.A00);
            if (r3 != null) {
                C17647Vbd vbd = (C17647Vbd) r8.A00(WEK.A00);
                if (vbd != null) {
                    OAL oal = new OAL(userSession);
                    return new C67745Mty(AnonymousClass12T.A00, userSession, r3, vbd.A01, vbd.A02, oal);
                }
                throw new IllegalStateException("No use case provider found");
            }
            throw new IllegalStateException("No viewer parameters found");
        }
        throw new IllegalStateException(AnonymousClass000.A00(2385));
    }
}
