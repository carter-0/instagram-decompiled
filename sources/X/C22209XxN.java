package X;

/* renamed from: X.XxN  reason: case insensitive filesystem */
public final class C22209XxN implements C64981Zs {
    public final int BXZ(int i) {
        int i2 = i % 10;
        if (i2 == 1) {
            int i3 = i % 100;
            if (i3 < 11 || i3 > 19) {
                return 1;
            }
            return 5;
        } else if (i2 < 2 || i2 > 9) {
            return 5;
        } else {
            int i4 = i % 100;
            if (i4 < 11 || i4 > 19) {
                return 3;
            }
            return 5;
        }
    }
}
