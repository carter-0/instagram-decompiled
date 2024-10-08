package X;

/* renamed from: X.9DQ  reason: invalid class name */
public abstract class AnonymousClass9DQ {
    public static C3740497y A00(C3743299a r2, Integer num) {
        AnonymousClass99Y r22 = r2.A03;
        if (r22 == AnonymousClass99Y.A02) {
            return C375109Ch.A00;
        }
        if (r22 == AnonymousClass99Y.A01) {
            return C375109Ch.A00(num.intValue());
        }
        if (r22 == AnonymousClass99Y.A03) {
            return C375109Ch.A01(num.intValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown AesGcmParameters.Variant: ");
        sb.append(r22);
        throw new IllegalStateException(sb.toString());
    }
}
