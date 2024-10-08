package X;

/* renamed from: X.Qwo  reason: case insensitive filesystem */
public final class C8550Qwo extends C8553Qwr {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;

    public final boolean A07() {
        return true;
    }

    public final int size() {
        return this.A01;
    }

    public final Object get(int i) {
        C11396SRp.A01(i, this.A01);
        return Pxe.A0t(this.A02, i + i + this.A00);
    }

    public C8550Qwo(Object[] objArr, int i, int i2) {
        this.A02 = objArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
