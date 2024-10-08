package X;

/* renamed from: X.9Cg  reason: invalid class name and case insensitive filesystem */
public abstract class C375099Cg {
    public static C3740497y A00(AnonymousClass981 r2, Integer num) {
        AnonymousClass98C r22 = r2.A01;
        if (r22 == AnonymousClass98C.A02) {
            return C375109Ch.A00;
        }
        if (r22 == AnonymousClass98C.A01) {
            return C375109Ch.A00(num.intValue());
        }
        if (r22 == AnonymousClass98C.A03) {
            return C375109Ch.A01(num.intValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown AesSivParameters.Variant: ");
        sb.append(r22);
        throw new IllegalStateException(sb.toString());
    }
}
