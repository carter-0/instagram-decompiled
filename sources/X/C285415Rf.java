package X;

/* renamed from: X.5Rf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C285415Rf implements C285405Re {
    public final /* synthetic */ AnonymousClass5RY A00;

    public /* synthetic */ C285415Rf(AnonymousClass5RY r1) {
        this.A00 = r1;
    }

    public final double CNq(double d) {
        AnonymousClass5RY r2 = this.A00;
        double d2 = r2.A00;
        double d3 = r2.A01;
        double d4 = r2.A02;
        double d5 = r2.A03;
        double d6 = r2.A04;
        if (d >= d5 * d4) {
            return (Math.pow(d, 1.0d / d6) - d3) / d2;
        }
        return d / d4;
    }
}
