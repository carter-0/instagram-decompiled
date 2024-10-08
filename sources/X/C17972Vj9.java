package X;

import java.util.Iterator;

/* renamed from: X.Vj9  reason: case insensitive filesystem */
public final class C17972Vj9 {
    public Object A00;
    public boolean A01;
    public final Iterator A02;

    public final Object A00() {
        if (!this.A01) {
            return this.A02.next();
        }
        Object obj = this.A00;
        this.A01 = false;
        this.A00 = null;
        return obj;
    }

    public final boolean A01() {
        if (this.A01 || this.A02.hasNext()) {
            return true;
        }
        return false;
    }

    public C17972Vj9(Iterator it) {
        this.A02 = it;
    }
}
