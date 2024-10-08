package X;

/* renamed from: X.9w9  reason: invalid class name and case insensitive filesystem */
public abstract class C393259w9 {
    public static C3740497y A00(AnonymousClass994 r2, Integer num) {
        AnonymousClass992 r22 = r2.A02;
        if (r22 == AnonymousClass992.A03) {
            return C375109Ch.A00;
        }
        if (r22 == AnonymousClass992.A02 || r22 == AnonymousClass992.A01) {
            return C375109Ch.A00(num.intValue());
        }
        if (r22 == AnonymousClass992.A04) {
            return C375109Ch.A01(num.intValue());
        }
        throw AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(r22, "Unknown AesCmacParametersParameters.Variant: ", AnonymousClass7TE.A1A()));
    }
}
