package X;

public abstract class RV8 {
    public static String A00(double d, double d2, int i) {
        if (d < -85.05112878d || d > 85.05112878d || d2 < -180.0d || d2 > 180.0d) {
            return null;
        }
        double radians = Math.toRadians(d);
        double pow = Math.pow(2.0d, (double) i);
        int floor = (int) Math.floor(((d2 + 180.0d) / 360.0d) * pow);
        int floor2 = (int) Math.floor(((1.0d - (Math.log(Math.tan(radians) + (1.0d / Math.cos(radians))) / 3.141592653589793d)) / 2.0d) * pow);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        while (i > 0) {
            int i2 = 1;
            int i3 = 1 << (i - 1);
            int i4 = 0;
            if ((floor & i3) <= 0) {
                i2 = 0;
            }
            if ((i3 & floor2) > 0) {
                i4 = 2;
            }
            A1A.append(i2 + i4);
            i--;
        }
        String obj = A1A.toString();
        if (obj != null) {
            return Long.toString(Long.parseLong(obj, 4), 36);
        }
        return null;
    }
}
