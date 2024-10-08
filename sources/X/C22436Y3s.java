package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.Y3s  reason: case insensitive filesystem */
public final class C22436Y3s implements Iterator, C62650uo {
    public Object A00;
    public int A01;
    public final Map A02;

    public C22436Y3s(Object obj, Map map) {
        0qQ.A0B(map, 2);
        this.A00 = obj;
        this.A02 = map;
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A01, this.A02.size());
    }

    /* renamed from: A00 */
    public final C21086XDz next() {
        if (hasNext()) {
            Object obj = this.A02.get(this.A00);
            if (obj != null) {
                C21086XDz xDz = (C21086XDz) obj;
                this.A01++;
                this.A00 = xDz.A00;
                return xDz;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Hash code of a key (");
            A1A.append(this.A00);
            throw new ConcurrentModificationException(AnonymousClass7TF.A0l(") has changed after it was added to the persistent map.", A1A));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw Pxh.A0s();
    }
}
