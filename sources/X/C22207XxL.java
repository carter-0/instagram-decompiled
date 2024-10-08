package X;

/* renamed from: X.XxL  reason: case insensitive filesystem */
public final class C22207XxL implements C64981Zs {
    public final int BXZ(int i) {
        if (i == 1) {
            return 1;
        }
        int i2 = i % 10;
        if (i2 < 2 || i2 > 4) {
            return 4;
        }
        int i3 = i % 100;
        return (i3 < 12 || i3 > 14) ? 3 : 4;
    }
}
