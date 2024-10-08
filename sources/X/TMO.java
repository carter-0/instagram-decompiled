package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.Iterators$EmptyModifiableIterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public abstract class TMO implements Iterator {
    public Object A00 = null;
    public Collection A01 = null;
    public Iterator A02 = Iterators$EmptyModifiableIterator.A01;
    public final Iterator A03;
    public final /* synthetic */ AbstractMapBasedMultimap A04;

    public TMO(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        this.A04 = abstractMapBasedMultimap;
        this.A03 = AnonymousClass7TF.A0u(abstractMapBasedMultimap.A01);
    }

    public final boolean hasNext() {
        if (this.A03.hasNext() || this.A02.hasNext()) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (!this.A02.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(this.A03);
            this.A00 = A1J.getKey();
            Collection A18 = Pxe.A18(A1J);
            this.A01 = A18;
            this.A02 = A18.iterator();
        }
        return new ImmutableEntry(this.A00, this.A02.next());
    }

    public final void remove() {
        this.A02.remove();
        Collection collection = this.A01;
        collection.getClass();
        if (collection.isEmpty()) {
            this.A03.remove();
        }
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A04;
        abstractMapBasedMultimap.A00--;
    }
}
