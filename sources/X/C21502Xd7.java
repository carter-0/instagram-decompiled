package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Xd7  reason: case insensitive filesystem */
public abstract class C21502Xd7 {
    public int A00;
    public Map.Entry A01;
    public Map.Entry A02;
    public final Y43 A03;
    public final Iterator A04;

    public final void A00() {
        Map.Entry entry;
        this.A01 = this.A02;
        Iterator it = this.A04;
        if (it.hasNext()) {
            entry = AnonymousClass7TE.A1J(it);
        } else {
            entry = null;
        }
        this.A02 = entry;
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1V(this.A02);
    }

    public final void remove() {
        Y43 y43 = this.A03;
        if (y43.A00().A00 == this.A00) {
            Map.Entry entry = this.A01;
            if (entry != null) {
                y43.remove(entry.getKey());
                this.A01 = null;
                this.A00 = y43.A00().A00;
                return;
            }
            throw Pxe.A0i();
        }
        throw new ConcurrentModificationException();
    }

    public C21502Xd7(Y43 y43, Iterator it) {
        this.A03 = y43;
        this.A04 = it;
        this.A00 = y43.A00().A00;
        A00();
    }
}
