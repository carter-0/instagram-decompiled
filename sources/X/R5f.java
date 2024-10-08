package X;

import java.util.Iterator;
import java.util.Map;

public final class R5f extends TS4<FieldDescriptorType, Object> {
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) null, obj2);
    }

    public final void A05() {
        Iterable entrySet;
        if (!this.A02) {
            if (0 < this.A00.size()) {
                ((Map.Entry) this.A00.get(0)).getKey();
                throw AnonymousClass7TE.A11("isRepeated");
            }
            if (this.A01.isEmpty()) {
                entrySet = C10098Rma.A00;
            } else {
                entrySet = this.A01.entrySet();
            }
            Iterator it = entrySet.iterator();
            if (it.hasNext()) {
                AnonymousClass7TE.A1J(it).getKey();
                throw AnonymousClass7TE.A11("isRepeated");
            }
        }
        super.A05();
    }

    public R5f(int i) {
        super(i);
    }
}
