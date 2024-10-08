package X;

/* renamed from: X.HRl  reason: case insensitive filesystem */
public abstract class C54753HRl {
    public static final long A00(long j, long j2) {
        int i;
        int A01 = C285965Tk.A01(j);
        int A00 = C285965Tk.A00(j);
        int A012 = C285965Tk.A01(j2);
        if (A012 < A00 && A01 < (i = C285965Tk.A00(j2))) {
            if (A012 > A01 || A00 > i) {
                if (A01 > A012 || i > A00) {
                    if (A012 <= A01) {
                        A01 = A012;
                    }
                }
                A00 -= i - A012;
            } else {
                A01 = A012;
            }
            A00 = A012;
        } else if (A00 > A012) {
            i = C285965Tk.A00(j2);
            A01 -= i - A012;
            A00 -= i - A012;
        }
        return C3026964x.A00(A01, A00);
    }
}
