package X;

/* renamed from: X.Ej2  reason: case insensitive filesystem */
public abstract class C48717Ej2 {
    public static C3034368u A00(C307896Rx r2, C276544tV r3) {
        int i;
        if (r3.A04 == 13647) {
            i = 43;
        } else if (C46611Dhr.A0F(r3)) {
            i = 38;
        } else {
            throw AnonymousClass7TE.A0w("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        C276544tV A07 = r3.A07(i);
        if (A07 != null) {
            return C3034368u.A00(r2, A07);
        }
        return null;
    }
}
