package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.Y3q  reason: case insensitive filesystem */
public final class C22434Y3q implements Iterator, C62650uo {
    public int A00;
    public Object A01;
    public final Map A02;

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A02.size());
    }

    public C22434Y3q(Object obj, Map map) {
        this.A01 = obj;
        this.A02 = map;
    }

    public final Object next() {
        if (hasNext()) {
            Object obj = this.A01;
            this.A00++;
            Object obj2 = this.A02.get(obj);
            if (obj2 != null) {
                this.A01 = ((AnonymousClass5Pt) obj2).A00;
                return obj;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Hash code of an element (");
            A1A.append(obj);
            throw new ConcurrentModificationException(AnonymousClass7TF.A0l(") has changed after it was added to the persistent set.", A1A));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw Pxh.A0s();
    }
}
