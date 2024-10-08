package X;

/* renamed from: X.SQm  reason: case insensitive filesystem */
public final class C11376SQm {
    public final T9D A00;
    public final T9D A01;
    public final T9D A02;
    public final T9D A03;
    public final T9D A04;
    public final boolean A05;

    public C11376SQm(C2596142j r5, Q8K q8k) {
        T9D qbl;
        T9D t9d = C7860Qbk.A00;
        T9D t9d2 = t9d;
        t9d = !r5.equals(C2596142j.A00) ? new C7861Qbl(r5) : t9d;
        if (Q8K.A01.equals(q8k)) {
            qbl = t9d2;
        } else {
            qbl = new C7861Qbl(q8k);
        }
        this.A05 = true;
        this.A04 = t9d2;
        this.A01 = t9d2;
        this.A00 = t9d2;
        this.A02 = t9d;
        this.A03 = qbl;
    }

    public C11376SQm(C8901REt rEt, byte b) {
        C7861Qbl qbl = new C7861Qbl(rEt);
        C7860Qbk qbk = C7860Qbk.A00;
        C7861Qbl A002 = C7861Qbl.A00(Byte.valueOf(b));
        this.A05 = false;
        this.A04 = qbl;
        this.A01 = qbk;
        this.A00 = A002;
        this.A02 = qbk;
        this.A03 = qbk;
    }

    public C11376SQm(C8901REt rEt) {
        C7861Qbl qbl = new C7861Qbl(rEt);
        C7860Qbk qbk = C7860Qbk.A00;
        this.A05 = false;
        this.A04 = qbl;
        this.A01 = qbk;
        this.A00 = qbk;
        this.A02 = qbk;
        this.A03 = qbk;
    }

    public C11376SQm(C8901REt rEt, Exception exc) {
        C7861Qbl qbl = new C7861Qbl(rEt);
        C7861Qbl qbl2 = new C7861Qbl(exc);
        C7860Qbk qbk = C7860Qbk.A00;
        this.A05 = false;
        this.A04 = qbl;
        this.A01 = qbl2;
        this.A00 = qbk;
        this.A02 = qbk;
        this.A03 = qbk;
    }
}
