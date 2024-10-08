package X;

import com.facebook.react.LazyReactPackage;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class TAK implements Iterable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public TAK(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
    }

    public final Iterator iterator() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            return new TMZ((LazyReactPackage) obj, (List) this.A02, (Map) this.A03);
        }
        return new TMW((Sp1) obj, (QZK) this.A03, (Iterator) this.A02);
    }
}
