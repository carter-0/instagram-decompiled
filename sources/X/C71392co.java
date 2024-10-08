package X;

/* renamed from: X.2co  reason: invalid class name and case insensitive filesystem */
public final class C71392co {
    public static C71392co A02 = A04(40.0d, 7.0d);
    public double A00;
    public double A01;

    public static C71392co A00() {
        return A03(2.0d, 10.0d);
    }

    public static C71392co A01() {
        return A04(40.0d, 7.0d);
    }

    public static C71392co A02(double d) {
        return A03(d, 20.0d);
    }

    public static C71392co A04(double d, double d2) {
        double d3 = 0.0d;
        if (d != 0.0d) {
            d3 = 194.0d + ((d - 30.0d) * 3.62d);
        }
        double d4 = 0.0d;
        if (d2 != 0.0d) {
            d4 = 25.0d + ((d2 - 8.0d) * 3.0d);
        }
        return new C71392co(d3, d4);
    }

    public C71392co(double d, double d2) {
        this.A01 = d;
        this.A00 = d2;
    }

    public static C71392co A03(double d, double d2) {
        double d3;
        double pow;
        double d4;
        double d5 = 20.0d - 0.0d;
        double d6 = 0.0d + ((((d / 1.7d) - 0.0d) / d5) * (0.8d - 0.0d));
        double d7 = 0.5d + ((((d2 / 1.7d) - 0.0d) / d5) * (200.0d - 0.5d));
        if (d7 <= 18.0d) {
            pow = ((Math.pow(d7, 3.0d) * 7.0E-4d) - (Math.pow(d7, 2.0d) * 0.031d)) + (d7 * 0.64d);
            d4 = 1.28d;
        } else if (d7 > 18.0d && d7 <= 44.0d) {
            d3 = ((Math.pow(d7, 3.0d) * 4.4E-5d) - (Math.pow(d7, 2.0d) * 0.006d)) + (d7 * 0.36d) + 2.0d;
            double d8 = (2.0d * d6) - (d6 * d6);
            return A04(d7, (0.01d * d8) + ((1.0d - d8) * d3));
        } else if (d7 > 44.0d) {
            pow = ((Math.pow(d7, 3.0d) * 4.5E-7d) - (Math.pow(d7, 2.0d) * 3.32E-4d)) + (d7 * 0.1078d);
            d4 = 5.84d;
        } else {
            d3 = 0.0d;
            double d82 = (2.0d * d6) - (d6 * d6);
            return A04(d7, (0.01d * d82) + ((1.0d - d82) * d3));
        }
        d3 = pow + d4;
        double d822 = (2.0d * d6) - (d6 * d6);
        return A04(d7, (0.01d * d822) + ((1.0d - d822) * d3));
    }
}
