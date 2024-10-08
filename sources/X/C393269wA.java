package X;

/* renamed from: X.9wA  reason: invalid class name and case insensitive filesystem */
public abstract class C393269wA {
    public static C3740497y A00(C3742798v r2, Integer num) {
        C3742298q r22 = r2.A03;
        if (r22 == C3742298q.A03) {
            return C375109Ch.A00;
        }
        if (r22 == C3742298q.A02 || r22 == C3742298q.A01) {
            return C375109Ch.A00(num.intValue());
        }
        if (r22 == C3742298q.A04) {
            return C375109Ch.A01(num.intValue());
        }
        throw AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(r22, "Unknown HmacParameters.Variant: ", AnonymousClass7TE.A1A()));
    }
}
