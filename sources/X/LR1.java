package X;

import java.util.concurrent.atomic.AtomicInteger;

public final class LR1 {
    public static LOU A00;
    public static C64108LNn A01;
    public static String A02;
    public static C262204Co A03;
    public static boolean A04;
    public static final LR1 A05 = new Object();
    public static final AtomicInteger A06 = new AtomicInteger(0);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.LR1] */
    static {
        C64108LNn lNn = C64108LNn.A01;
        A01 = lNn;
        A00 = new LOU(lNn);
    }

    public static final void A00(String str) {
        C363058j1.A02.A01("sup:EventRepository", 002.A1D("Maybe Post Model Engagement Status Event -- is posting enabled: ", A04));
        if (A04) {
            A01.A00(C62998Kpo.A00(new MYK(str, 6)));
        }
    }

    public final void A01(MTN mtn) {
        C262204Co r0;
        C363068j2 r2 = C363058j1.A02;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Maybe Post Event: ");
        A1A.append(mtn);
        A1A.append(" -- is posting enabled: ");
        A1A.append(A04);
        r2.A01("sup:EventRepository", A1A.toString());
        if (A04) {
            C66374MPg CAH = mtn.CAH();
            if (CAH == C62676Kkc.LAST_PERSON_LEAVES) {
                AnonymousClass4D7 A0t = C51975G9x.A0t(A03);
                AnonymousClass4CZ r02 = AnonymousClass12W.A00;
                A03 = C51966G9m.A1L(new C59676JTh((Object) mtn, A0t, 37), 19E.A02(AnonymousClass12y.A00));
            } else if (CAH == C62676Kkc.FIRST_PERSON_JOINS && (r0 = A03) != null && r0.isActive()) {
                C51970G9q.A1S(A03);
            } else {
                A01.A00(mtn);
            }
        }
    }
}
