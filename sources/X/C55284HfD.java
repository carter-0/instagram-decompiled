package X;

/* renamed from: X.HfD  reason: case insensitive filesystem */
public abstract class C55284HfD {
    public static final boolean A00(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (0qQ.A00(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }
}
