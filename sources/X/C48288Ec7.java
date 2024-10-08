package X;

/* renamed from: X.Ec7  reason: case insensitive filesystem */
public abstract class C48288Ec7 {
    public static final Object A00(AnonymousClass6Tm r6) {
        int A05 = DbZ.A05(r6);
        String str = (String) DbW.A0d(r6);
        Object A00 = r6.A00();
        0qQ.A0C(A00, AnonymousClass000.A00(17));
        long A0R = AnonymousClass7TE.A0R(A00);
        C276894u5 r1 = C64361Kj.A00().A01;
        if (str == null) {
            return null;
        }
        try {
            r1.Exe((String) null, A05, Integer.parseInt(str), A0R);
            return null;
        } catch (NumberFormatException e) {
            1Kn.A03("BloksTTRCFunctionsUtil", e);
            return null;
        }
    }
}
