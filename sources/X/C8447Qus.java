package X;

/* renamed from: X.Qus  reason: case insensitive filesystem */
public final class C8447Qus extends C8448Qut {
    public static final C8448Qut A02 = new C8447Qus(new Object[0], 0);
    public final transient int A00;
    public final transient Object[] A01;

    public final int size() {
        return this.A00;
    }

    public final Object get(int i) {
        SKo.A01(i, this.A00);
        return Pxe.A0t(this.A01, i);
    }

    public C8447Qus(Object[] objArr, int i) {
        this.A01 = objArr;
        this.A00 = i;
    }
}
