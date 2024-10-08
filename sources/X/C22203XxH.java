package X;

/* renamed from: X.XxH  reason: case insensitive filesystem */
public final class C22203XxH implements C64981Zs {
    public final int BXZ(int i) {
        if (i == 1 || i == 11) {
            return 1;
        }
        if (i == 2 || i == 12) {
            return 2;
        }
        if (i >= 3) {
            return (i <= 10 || (i >= 13 && i <= 19)) ? 3 : 5;
        }
        return 5;
    }
}
