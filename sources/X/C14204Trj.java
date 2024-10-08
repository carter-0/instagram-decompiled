package X;

/* renamed from: X.Trj  reason: case insensitive filesystem */
public abstract class C14204Trj {
    public static final C294265mA A00(int i) {
        for (C294265mA r1 : C294265mA.values()) {
            if (r1.A00 == i) {
                return r1;
            }
        }
        throw new IllegalArgumentException(002.A0O("No Profile Feed Source with Id", i));
    }
}
