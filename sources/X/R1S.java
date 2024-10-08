package X;

import java.util.Iterator;

public final class R1S extends C249803kO {
    public int A00;
    public Object A01;
    public final /* synthetic */ Iterator A02;

    public R1S(Iterator it) {
        this.A02 = it;
    }

    public final boolean hasNext() {
        if (this.A00 > 0 || this.A02.hasNext()) {
            return true;
        }
        return false;
    }

    public final Object next() {
        int i = this.A00;
        if (i <= 0) {
            S79 s79 = (S79) this.A02.next();
            this.A01 = s79.A01();
            i = s79.A00();
            this.A00 = i;
        }
        this.A00 = i - 1;
        Object obj = this.A01;
        obj.getClass();
        return obj;
    }
}
