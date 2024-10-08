package X;

public abstract class AAH {
    public static C343047pa A01(C343047pa r9, C343047pa r10) {
        int i = r9.A02;
        int i2 = r9.A01;
        double A00 = A00(i, i2);
        int i3 = r10.A02;
        int i4 = r10.A01;
        if (Math.abs(A00 - A00(i3, i4)) <= 0.019999999552965164d) {
            return null;
        }
        if ((i - i2) * (i3 - i4) < 0) {
            r10 = new C343047pa(i4, i3);
        }
        float f = (float) r10.A01;
        float f2 = (float) r10.A02;
        int i5 = (int) (((float) i) * (f / f2));
        if (i5 <= i2) {
            return new C343047pa(i, i5);
        }
        return new C343047pa((int) (((float) i2) * (f2 / f)), i2);
    }

    public static double A00(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0.0d;
        }
        return ((double) Math.max(i, i2)) / ((double) Math.min(i, i2));
    }
}
