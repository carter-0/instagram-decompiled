package X;

import com.google.common.collect.LinkedHashMultimap;
import java.util.Iterator;

public final class TMH implements Iterator {
    public LinkedHashMultimap.ValueEntry A00;
    public LinkedHashMultimap.ValueEntry A01;
    public final /* synthetic */ LinkedHashMultimap A02;

    public TMH(LinkedHashMultimap linkedHashMultimap) {
        this.A02 = linkedHashMultimap;
        LinkedHashMultimap.ValueEntry valueEntry = linkedHashMultimap.A00.successorInMultimap;
        valueEntry.getClass();
        this.A00 = valueEntry;
    }

    public final boolean hasNext() {
        return C51969G9p.A1a(this.A00, this.A02.A00);
    }

    public final void remove() {
        Pxh.A1T(AnonymousClass7TF.A1V(this.A01));
        LinkedHashMultimap linkedHashMultimap = this.A02;
        LinkedHashMultimap.ValueEntry valueEntry = this.A01;
        linkedHashMultimap.remove(valueEntry.getKey(), valueEntry.getValue());
        this.A01 = null;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            LinkedHashMultimap.ValueEntry valueEntry = this.A00;
            this.A01 = valueEntry;
            LinkedHashMultimap.ValueEntry valueEntry2 = valueEntry.successorInMultimap;
            valueEntry2.getClass();
            this.A00 = valueEntry2;
            return valueEntry;
        }
        throw Pxe.A1C();
    }
}
