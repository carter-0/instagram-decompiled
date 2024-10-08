package X;

/* renamed from: X.QwC  reason: case insensitive filesystem */
public final class C8516QwC extends C8518QwE {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;

    public final int size() {
        return this.A01;
    }

    public final Object get(int i) {
        SKr.A01(i, this.A01);
        return Pxe.A0t(this.A02, i + i + this.A00);
    }

    public C8516QwC(Object[] objArr, int i, int i2) {
        this.A02 = objArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
