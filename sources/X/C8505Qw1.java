package X;

/* renamed from: X.Qw1  reason: case insensitive filesystem */
public final class C8505Qw1 extends C8506Qw2 {
    public int A00;
    public final int A01;
    public final C8499Qvv A02;

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A01);
    }

    public final boolean hasPrevious() {
        return AnonymousClass7TF.A1R(this.A00);
    }

    public C8505Qw1(C8499Qvv qvv, int i) {
        int size = qvv.size();
        if (i <= size) {
            this.A01 = size;
            this.A00 = i;
            this.A02 = qvv;
            return;
        }
        throw Pxe.A0k(C11305SKq.A00("index", i, size));
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            this.A00 = i + 1;
            return this.A02.get(i);
        }
        throw Pxe.A1C();
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            return this.A02.get(i);
        }
        throw Pxe.A1C();
    }
}
