package X;

/* renamed from: X.QwB  reason: case insensitive filesystem */
public final class C8515QwB extends C8518QwE {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ C8518QwE A02;

    public final int size() {
        return this.A01;
    }

    public C8515QwB(C8518QwE qwE, int i, int i2) {
        this.A02 = qwE;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object get(int i) {
        SKr.A01(i, this.A01);
        return this.A02.get(i + this.A00);
    }
}
