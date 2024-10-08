package X;

/* renamed from: X.WDi  reason: case insensitive filesystem */
public abstract class C18930WDi implements XAM {
    public int A00(int i) {
        return ((U6h) this).A00.following(i);
    }

    public int A01(int i) {
        return ((U6h) this).A00.preceding(i);
    }

    public final int Cra(int i) {
        return A00(i);
    }

    public final int Cre(int i) {
        int A00 = A00(i);
        if (A00 == -1 || A00(A00) == -1) {
            return -1;
        }
        return A00;
    }

    public final int E4N(int i) {
        int A01 = A01(i);
        if (A01 == -1 || A01(A01) == -1) {
            return -1;
        }
        return A01;
    }

    public final int E4P(int i) {
        return A01(i);
    }
}
