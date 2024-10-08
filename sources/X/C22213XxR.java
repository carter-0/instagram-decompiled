package X;

/* renamed from: X.XxR  reason: case insensitive filesystem */
public final class C22213XxR implements C64981Zs {
    public final int BXZ(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        int i2 = i % 100;
        if (i2 < 3) {
            return 5;
        }
        if (i2 <= 10) {
            return 3;
        }
        if (i2 > 99) {
            return 5;
        }
        return 4;
    }
}
