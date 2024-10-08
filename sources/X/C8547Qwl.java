package X;

/* renamed from: X.Qwl  reason: case insensitive filesystem */
public final class C8547Qwl extends C8548Qwm {
    public int A00;
    public final int A01;
    public final C8535QwZ A02;

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

    public C8547Qwl(C8535QwZ qwZ, int i) {
        int size = qwZ.size();
        if (i <= size) {
            this.A01 = size;
            this.A00 = i;
            this.A02 = qwZ;
            return;
        }
        throw Pxe.A0k(C11306SKs.A00("index", i, size));
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
