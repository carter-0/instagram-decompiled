package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.MAa  reason: case insensitive filesystem */
public final class C66067MAa implements Iterator, C62650uo {
    public int A00;
    public final List A01;

    public final boolean hasNext() {
        return true;
    }

    public final Object next() {
        List list = this.A01;
        Object obj = list.get(this.A00);
        this.A00 = (this.A00 + 1) % list.size();
        return obj;
    }

    public final void remove() {
        throw AnonymousClass7TE.A1B(AnonymousClass000.A00(462));
    }

    public C66067MAa(List list) {
        this.A01 = list;
    }
}
