package X;

public abstract class V5L {
    public static final Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        C276544tV A0P = DbY.A0P(r6, 0);
        float A04 = C51970G9q.A04(r6.A02(), "null cannot be cast to non-null type kotlin.Number");
        boolean A01 = Q0A.A01(r6.A00());
        Ty7 A0P2 = C13989Tnp.A0P(r5, A0P, r6, 3);
        if (A0P2 == null) {
            return null;
        }
        int A00 = (int) C18183Vmx.A00(C64361Kj.A00().A00, A04);
        if (!C245983dn.A03()) {
            throw new RuntimeException("setXOffset cannot be called from a background thread.");
        } else if (C245983dn.A03()) {
            A0P2.A00(A00 - A0P2.A02.A04, 0, A01);
            return null;
        } else {
            throw new RuntimeException("Cannot getScroll off the main thread!");
        }
    }
}
