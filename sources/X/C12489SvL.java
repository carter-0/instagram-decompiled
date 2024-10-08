package X;

/* renamed from: X.SvL  reason: case insensitive filesystem */
public final class C12489SvL implements C13617Tdj {
    public final /* synthetic */ C8292QnY A00;

    public C12489SvL(C8292QnY qnY) {
        this.A00 = qnY;
    }

    public final void DfB(Object obj, String str, Throwable th) {
        S21 A01;
        C8292QnY qnY = this.A00;
        if (obj != null) {
            A01 = C11097S9y.A00(new C10450RsR(obj, th));
        } else {
            A01 = C11097S9y.A01(th);
        }
        qnY.A03.set(A01);
        qnY.A02(A01);
    }
}
