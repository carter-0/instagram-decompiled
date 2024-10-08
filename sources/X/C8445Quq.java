package X;

/* renamed from: X.Quq  reason: case insensitive filesystem */
public final class C8445Quq extends C8448Qut {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ C8448Qut A02;

    public final int size() {
        return this.A01;
    }

    public C8445Quq(C8448Qut qut, int i, int i2) {
        this.A02 = qut;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object get(int i) {
        SKo.A01(i, this.A01);
        return this.A02.get(i + this.A00);
    }
}
