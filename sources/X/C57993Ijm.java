package X;

/* renamed from: X.Ijm  reason: case insensitive filesystem */
public final class C57993Ijm implements Runnable, Comparable {
    public final int A00;
    public final Runnable A01;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        C57993Ijm ijm = (C57993Ijm) obj;
        int i2 = this.A00;
        if (ijm != null) {
            i = ijm.A00;
        } else {
            i = 0;
        }
        return i2 - i;
    }

    public final void run() {
        this.A01.run();
    }

    public final String toString() {
        return 002.A02(this.A00, 0, "vertical ", " horizontal ");
    }

    public C57993Ijm(int i, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = i;
    }
}
