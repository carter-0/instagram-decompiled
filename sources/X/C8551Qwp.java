package X;

/* renamed from: X.Qwp  reason: case insensitive filesystem */
public final class C8551Qwp extends C8553Qwr {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ C8553Qwr A02;

    public final Object[] A06() {
        return this.A02.A06();
    }

    public final boolean A07() {
        return true;
    }

    public final int size() {
        return this.A01;
    }

    public C8551Qwp(C8553Qwr qwr, int i, int i2) {
        this.A02 = qwr;
        this.A00 = i;
        this.A01 = i2;
    }

    public final int A04() {
        return this.A02.A05() + this.A00 + this.A01;
    }

    public final int A05() {
        return this.A02.A05() + this.A00;
    }

    public final C8553Qwr A0A(int i, int i2) {
        C11396SRp.A03(i, i2, this.A01);
        int i3 = this.A00;
        return this.A02.subList(i + i3, i2 + i3);
    }

    public final Object get(int i) {
        C11396SRp.A01(i, this.A01);
        return this.A02.get(i + this.A00);
    }
}
