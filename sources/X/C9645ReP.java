package X;

/* renamed from: X.ReP  reason: case insensitive filesystem */
public abstract class C9645ReP {
    public static final Integer A00(XRB xrb) {
        if (xrb == null) {
            return null;
        }
        int ordinal = xrb.ordinal();
        int i = 0;
        if (ordinal != 7) {
            i = 3;
            if (ordinal != 10) {
                if (ordinal == 13) {
                    i = 5;
                } else if (ordinal == 5) {
                    return 1;
                } else {
                    return null;
                }
            }
        }
        return Integer.valueOf(i);
    }
}
