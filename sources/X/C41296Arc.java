package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Arc  reason: case insensitive filesystem */
public final class C41296Arc implements Iterator, C62650uo {
    public int A00;
    public final short[] A01;

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A01.length);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        short[] sArr = this.A01;
        if (i < sArr.length) {
            this.A00 = i + 1;
            return new C360378eU(sArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(i));
    }

    public final void remove() {
        throw AnonymousClass7TE.A1B("Operation is not supported for read-only collection");
    }

    public C41296Arc(short[] sArr) {
        this.A01 = sArr;
    }
}
