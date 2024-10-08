package X;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: X.Y5a  reason: case insensitive filesystem */
public final class C22466Y5a extends AbstractSet<K> {
    public final /* synthetic */ C2807854a A00;

    public C22466Y5a(C2807854a r1) {
        this.A00 = r1;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final Iterator iterator() {
        return new XPF(this);
    }

    public final boolean remove(Object obj) {
        C2807854a r2 = this.A00;
        AnonymousClass54c r1 = null;
        if (obj == null) {
            return false;
        }
        try {
            r1 = r2.A04(obj, false);
        } catch (ClassCastException unused) {
        }
        if (r1 == null) {
            return false;
        }
        r2.A05(r1, true);
        return true;
    }

    public final int size() {
        return this.A00.A01;
    }
}
