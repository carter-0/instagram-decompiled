package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Ara  reason: case insensitive filesystem */
public final class C41294Ara implements Iterator, C62650uo {
    public int A00;
    public final int[] A01;

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A01.length);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        int[] iArr = this.A01;
        if (i < iArr.length) {
            this.A00 = i + 1;
            return new C360308eN(iArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(i));
    }

    public final void remove() {
        throw AnonymousClass7TE.A1B("Operation is not supported for read-only collection");
    }

    public C41294Ara(int[] iArr) {
        this.A01 = iArr;
    }
}
