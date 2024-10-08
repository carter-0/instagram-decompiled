package X;

/* renamed from: X.SvK  reason: case insensitive filesystem */
public final class C12488SvK implements C13617Tdj {
    public final /* synthetic */ C8291QnX A00;

    public C12488SvK(C8291QnX qnX) {
        this.A00 = qnX;
    }

    public final void DfB(Object obj, String str, Throwable th) {
        S21 A01;
        C8291QnX qnX = this.A00;
        if (obj != null) {
            A01 = C11097S9y.A00(new C10450RsR(obj, th));
        } else {
            A01 = C11097S9y.A01(th);
        }
        qnX.A03.set(A01);
        qnX.A02(A01);
    }
}
