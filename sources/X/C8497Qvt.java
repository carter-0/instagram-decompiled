package X;

/* renamed from: X.Qvt  reason: case insensitive filesystem */
public final class C8497Qvt extends C8499Qvv {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ C8499Qvv A02;

    public final int size() {
        return this.A01;
    }

    public C8497Qvt(C8499Qvv qvv, int i, int i2) {
        this.A02 = qvv;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object get(int i) {
        C11305SKq.A01(i, this.A01);
        return this.A02.get(i + this.A00);
    }
}
