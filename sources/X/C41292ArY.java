package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.ArY  reason: case insensitive filesystem */
public final class C41292ArY implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ AnonymousClass97R A02;

    public C41292ArY(AnonymousClass97R r2) {
        this.A02 = r2;
        this.A00 = 0;
        this.A01 = r2.A02();
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        byte b;
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            AnonymousClass97V r2 = (AnonymousClass97V) this.A02;
            if (r2 instanceof AnonymousClass9CJ) {
                AnonymousClass9CJ r22 = (AnonymousClass9CJ) r2;
                b = r22.A00[r22.A01 + i];
            } else {
                b = r2.A00[i];
            }
            return Byte.valueOf(b);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public C41292ArY() {
    }
}
