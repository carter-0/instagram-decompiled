package X;

/* renamed from: X.5Rm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C285485Rm implements C285405Re {
    public final double CNq(double d) {
        double d2;
        double d3;
        C285375Rb r0 = AnonymousClass5RX.A03;
        double d4 = d;
        if (d < 0.0d) {
            d2 = -d4;
        } else {
            d2 = d4;
        }
        if (d2 >= 0.04045d * 0.07739938080495357d) {
            d3 = (Math.pow(d2, 1.0d / 2.4d) - 0.05213270142180095d) / 0.9478672985781991d;
        } else {
            d3 = d2 / 0.07739938080495357d;
        }
        return Math.copySign(d3, d4);
    }
}
