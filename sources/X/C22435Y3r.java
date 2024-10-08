package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.Y3r  reason: case insensitive filesystem */
public final class C22435Y3r implements Iterator, C62650uo {
    public int A00;
    public final int A01;
    public final C286505Wq A02;
    public final int A03;

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A03);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C286505Wq r4 = this.A02;
        int i = r4.A03;
        int i2 = this.A01;
        if (i == i2) {
            int i3 = this.A00;
            this.A00 = r4.A08[(i3 * 5) + 3] + i3;
            return new Y1X(r4, i3, i2);
        }
        throw new ConcurrentModificationException();
    }

    public C22435Y3r(C286505Wq r2, int i, int i2) {
        this.A02 = r2;
        this.A03 = i2;
        this.A00 = i;
        this.A01 = r2.A03;
        if (r2.A07) {
            throw new ConcurrentModificationException();
        }
    }

    public final void remove() {
        throw Pxh.A0s();
    }
}
