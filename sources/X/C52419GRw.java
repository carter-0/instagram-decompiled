package X;

/* renamed from: X.GRw  reason: case insensitive filesystem */
public abstract class C52419GRw {
    public static final C267794cD A00(C267804cE r3, int i) {
        C267794cD r32 = ((C267794cD) r3).A03.A02;
        if (r32 != null && (r32.A00 & i) != 0) {
            do {
                int i2 = r32.A01;
                if ((i2 & 2) != 0) {
                    break;
                } else if ((i2 & i) != 0) {
                    return r32;
                } else {
                    r32 = r32.A02;
                }
            } while (r32 != null);
        }
        return null;
    }
}
