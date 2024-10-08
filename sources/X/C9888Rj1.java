package X;

/* renamed from: X.Rj1  reason: case insensitive filesystem */
public abstract class C9888Rj1 {
    public static final byte[] A00 = new byte[1792];

    static {
        int i = 0;
        do {
            A00[i] = Character.getDirectionality(i);
            i++;
        } while (i < 1792);
    }
}
