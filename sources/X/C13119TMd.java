package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TMd  reason: case insensitive filesystem */
public class C13119TMd implements Iterator {
    public final Collection A00;
    public final Iterator A01;
    public final /* synthetic */ C13240TRg A02;

    public C13119TMd(C13240TRg tRg, Iterator it) {
        this.A02 = tRg;
        this.A00 = tRg.A00;
        this.A01 = it;
    }

    public final void A00() {
        C13240TRg tRg = this.A02;
        tRg.A01();
        if (tRg.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    public final void remove() {
        this.A01.remove();
        C13240TRg tRg = this.A02;
        AbstractMapBasedMultimap abstractMapBasedMultimap = tRg.A04;
        abstractMapBasedMultimap.A00--;
        tRg.A02();
    }

    public final boolean hasNext() {
        A00();
        return this.A01.hasNext();
    }

    public final Object next() {
        A00();
        return this.A01.next();
    }

    public C13119TMd(C13240TRg tRg) {
        Iterator it;
        this.A02 = tRg;
        Collection collection = tRg.A00;
        this.A00 = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.A01 = it;
    }
}
