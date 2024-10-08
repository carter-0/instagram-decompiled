package X;

/* renamed from: X.Hu1  reason: case insensitive filesystem */
public abstract class C56172Hu1 {
    public static final C286025Tq A00(C285975Tl r4, int i) {
        C286025Tq r3 = r4.A01;
        int A00 = C285965Tk.A00(r4.A00);
        return r3.subSequence(A00, Math.min(A00 + i, r3.A00.length()));
    }

    public static final C286025Tq A01(C285975Tl r4, int i) {
        C286025Tq r3 = r4.A01;
        int A01 = C285965Tk.A01(r4.A00);
        return r3.subSequence(Math.max(0, A01 - i), A01);
    }
}
