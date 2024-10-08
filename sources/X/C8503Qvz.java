package X;

/* renamed from: X.Qvz  reason: case insensitive filesystem */
public final class C8503Qvz extends C8499Qvv {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;

    public final int size() {
        return this.A01;
    }

    public final Object get(int i) {
        C11305SKq.A01(i, this.A01);
        return Pxe.A0t(this.A02, i + i + this.A00);
    }

    public C8503Qvz(Object[] objArr, int i, int i2) {
        this.A02 = objArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
