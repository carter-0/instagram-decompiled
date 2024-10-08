package X;

/* renamed from: X.Qw4  reason: case insensitive filesystem */
public final class C8508Qw4 extends C8509Qw5 {
    public int A00;
    public final int A01;
    public final C8518QwE A02;

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

    public C8508Qw4(C8518QwE qwE, int i) {
        int size = qwE.size();
        if (i <= size) {
            this.A01 = size;
            this.A00 = i;
            this.A02 = qwE;
            return;
        }
        throw Pxe.A0k(SKr.A00("index", i, size));
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
