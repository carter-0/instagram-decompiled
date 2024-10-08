package X;

/* renamed from: X.XxG  reason: case insensitive filesystem */
public final class C22202XxG implements C64981Zs {
    public final int BXZ(int i) {
        int i2 = i % 10;
        if (i2 == 1) {
            if (i % 100 != 11) {
                return 1;
            }
            return 5;
        } else if (i2 < 2 || i2 > 4) {
            return 5;
        } else {
            int i3 = i % 100;
            if (i3 < 12 || i3 > 14) {
                return 3;
            }
            return 5;
        }
    }
}
