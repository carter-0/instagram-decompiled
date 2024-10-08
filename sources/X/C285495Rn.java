package X;

/* renamed from: X.5Rn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C285495Rn implements C285405Re {
    public final double CNq(double d) {
        double d2;
        double d3;
        C285375Rb r0 = AnonymousClass5RX.A03;
        if (d < 0.0d) {
            d2 = -d;
        } else {
            d2 = d;
        }
        if (d2 >= 0.04045d) {
            d3 = Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d);
        } else {
            d3 = d2 * 0.07739938080495357d;
        }
        return Math.copySign(d3, d);
    }
}
