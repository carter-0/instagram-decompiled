package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.XDw  reason: case insensitive filesystem */
public class C21083XDw implements Iterator, C62650uo {
    public int A00;
    public Object A01;
    public final Map A02;

    public C21083XDw(Object obj, Map map) {
        0qQ.A0B(map, 2);
        this.A01 = obj;
        this.A02 = map;
    }

    public final boolean hasNext() {
        if (this.A00 < this.A02.size()) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this instanceof Y79) {
            Y79 y79 = (Y79) this;
            if (y79.A02) {
                XE5 xe5 = y79.A03;
                0u4.A00(xe5).remove(y79.A01);
                y79.A01 = null;
                y79.A02 = false;
                y79.A00 = xe5.A03.A00;
                y79.A00--;
                return;
            }
            throw Pxe.A0i();
        }
        throw Pxh.A0s();
    }

    public Object next() {
        if (hasNext()) {
            Object obj = this.A01;
            this.A00++;
            Object obj2 = this.A02.get(obj);
            if (obj2 != null) {
                this.A01 = ((XFI) obj2).A00;
                return obj;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Hash code of an element (");
            A1A.append(obj);
            throw new ConcurrentModificationException(AnonymousClass7TF.A0l(") has changed after it was added to the persistent set.", A1A));
        }
        throw new NoSuchElementException();
    }
}
