package X;

/* renamed from: X.XxO  reason: case insensitive filesystem */
public final class C22210XxO implements C64981Zs {
    public final int BXZ(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 0) {
            return 3;
        }
        int i2 = i % 100;
        if (i2 >= 2) {
            if (i2 <= 10) {
                return 3;
            }
            if (i2 > 19) {
                return 5;
            }
            return 4;
        }
        return 5;
    }
}
