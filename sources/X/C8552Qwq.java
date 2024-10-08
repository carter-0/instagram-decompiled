package X;

/* renamed from: X.Qwq  reason: case insensitive filesystem */
public final class C8552Qwq extends C8553Qwr {
    public static final C8553Qwr A02 = new C8552Qwq(new Object[0], 0);
    public final transient Object[] A00;
    public final transient int A01;

    public final int A04() {
        return this.A01;
    }

    public final int A05() {
        return 0;
    }

    public final Object[] A06() {
        return this.A00;
    }

    public final boolean A07() {
        return false;
    }

    public final int size() {
        return this.A01;
    }

    public final int A08(Object[] objArr, int i) {
        Object[] objArr2 = this.A00;
        int i2 = this.A01;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    public final Object get(int i) {
        C11396SRp.A01(i, this.A01);
        return Pxe.A0t(this.A00, i);
    }

    public C8552Qwq(Object[] objArr, int i) {
        this.A00 = objArr;
        this.A01 = i;
    }
}
