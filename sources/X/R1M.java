package X;

import com.google.common.collect.ImmutableEntry;
import java.util.Iterator;
import java.util.Map;

public final class R1M extends AnonymousClass5GD {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R1M(Object obj, Iterator it, int i) {
        super(it);
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object A00(Object obj) {
        switch (this.A00) {
            case 0:
                return ((AnonymousClass2hV) this.A01).apply(obj);
            case 1:
                return new ImmutableEntry(obj, ((AnonymousClass2hV) this.A01).apply(obj));
            default:
                return new Qzt(this, (Map.Entry) obj);
        }
    }
}
