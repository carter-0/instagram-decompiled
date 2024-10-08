package X;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TMb  reason: case insensitive filesystem */
public class C13117TMb implements Iterator {
    public final Collection A00;
    public final Iterator A01;
    public final /* synthetic */ C13239TRf A02;

    public C13117TMb(C13239TRf tRf, Iterator it) {
        this.A02 = tRf;
        this.A00 = tRf.A00;
        this.A01 = it;
    }

    public C13117TMb(C13239TRf tRf) {
        Iterator it;
        this.A02 = tRf;
        Collection collection = tRf.A00;
        this.A00 = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.A01 = it;
    }

    public final void A00() {
        C13239TRf tRf = this.A02;
        tRf.A01();
        if (tRf.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    public final void remove() {
        this.A01.remove();
        C13239TRf tRf = this.A02;
        C8528QwS qwS = tRf.A04;
        qwS.A00--;
        tRf.A02();
    }

    public final boolean hasNext() {
        A00();
        return this.A01.hasNext();
    }

    public final Object next() {
        A00();
        return this.A01.next();
    }
}
