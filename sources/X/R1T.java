package X;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.ImmutableMultimap;
import java.util.Iterator;
import java.util.Map;

public final class R1T extends C249803kO {
    public Object A00 = null;
    public Iterator A01 = Qz1.A01;
    public final Iterator A02;
    public final /* synthetic */ ImmutableMultimap A03;

    public R1T(ImmutableMultimap immutableMultimap) {
        this.A03 = immutableMultimap;
        this.A02 = immutableMultimap.A01.entrySet().iterator();
    }

    public final boolean hasNext() {
        if (this.A01.hasNext() || this.A02.hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.A01.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(this.A02);
            this.A00 = A1J.getKey();
            this.A01 = ((ImmutableCollection) A1J.getValue()).iterator();
        }
        Object obj = this.A00;
        obj.getClass();
        return new ImmutableEntry(obj, this.A01.next());
    }
}
