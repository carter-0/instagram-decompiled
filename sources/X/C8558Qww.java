package X;

/* renamed from: X.Qww  reason: case insensitive filesystem */
public final class C8558Qww extends C8559Qwx {
    public int A00;
    public final int A01;
    public final C8553Qwr A02;

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public final Object A00(int i) {
        return this.A02.get(i);
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A01);
    }

    public final boolean hasPrevious() {
        return AnonymousClass7TF.A1R(this.A00);
    }

    public C8558Qww(int i, int i2) {
        C11396SRp.A02(i2, i);
        this.A01 = i;
        this.A00 = i2;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            this.A00 = i + 1;
            return A00(i);
        }
        throw Pxe.A1C();
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            return A00(i);
        }
        throw Pxe.A1C();
    }

    public C8558Qww(C8553Qwr qwr, int i) {
        this(qwr.size(), i);
        this.A02 = qwr;
    }
}
