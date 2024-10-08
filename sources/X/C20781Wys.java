package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wys  reason: case insensitive filesystem */
public final class C20781Wys extends 0Yg implements 0sP {
    public static final C20781Wys A00 = new C20781Wys();

    public C20781Wys() {
        super(1);
    }

    /* JADX WARNING: type inference failed for: r16v1, types: [java.lang.Object, X.VHy] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass2YQ r1 = (AnonymousClass2YQ) obj;
        0qQ.A0B(r1, 0);
        C17647Vbd vbd = (C17647Vbd) r1.A00(WEK.A00);
        if (vbd != null) {
            UserSession userSession = (UserSession) r1.A00(WEL.A00);
            if (userSession != null) {
                C311716d8 r4 = (C311716d8) r1.A00(WEI.A00);
                if (r4 != null) {
                    C376579In r12 = (C376579In) r1.A00(WEJ.A00);
                    if (r12 != null) {
                        C17648Vbe vbe = new C17648Vbe(vbd.A00.A00, userSession, r4.A02, r12.A00, r4.A01);
                        VX8 vx8 = vbd.A01;
                        L8S l8s = vbd.A03;
                        C17970Vj6 vj6 = vbd.A04;
                        C18389Vqp vqp = C18389Vqp.A00;
                        1as r5 = 1as.A04;
                        0qQ.A07(r5);
                        C17278VPf vPf = new C17278VPf(new C17510VYo(userSession, C18371VqX.A00, r5, vqp));
                        L5D l5d = vbd.A05;
                        1as r10 = 1as.A04;
                        0qQ.A07(r10);
                        C17277VPe vPe = new C17277VPe(userSession);
                        AnonymousClass7VU A002 = AnonymousClass7VT.A00(userSession);
                        ? obj2 = new Object();
                        AnonymousClass6W7 A003 = AnonymousClass6W6.A00(userSession);
                        C18513VtC vtC = new C18513VtC(userSession, r10, A002, C66832MdQ.A00, 1Au.A00(userSession), A003, vbe, obj2, vqp, vPe);
                        return new U91(new C52369GPq(userSession, (String) null), r4, vx8, l8s, vj6, l5d, vbe, vtC, vPf, new C17805VgI(userSession));
                    }
                    throw new IllegalStateException("No viewer session found");
                }
                throw new IllegalStateException("No viewer parameters found");
            }
            throw new IllegalStateException(AnonymousClass000.A00(2385));
        }
        throw new IllegalStateException("No use case provider found");
    }
}
