package X;

/* renamed from: X.VpL  reason: case insensitive filesystem */
public abstract class C18297VpL {
    public static final char[] A00 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static char A00(int i) {
        char[] cArr = A00;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw R7F.A00();
    }
}
