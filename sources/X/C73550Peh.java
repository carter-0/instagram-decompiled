package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Peh  reason: case insensitive filesystem */
public final class C73550Peh extends AbstractSet<Map.Entry<C299305uu, T>> {
    public final /* synthetic */ C2596942s A00;

    public C73550Peh(C2596942s r1) {
        this.A00 = r1;
    }

    public final Iterator iterator() {
        C2596942s r3 = this.A00;
        return new C73430PcV(r3, AnonymousClass7TF.A0u(r3.A02), AnonymousClass7TF.A0u(r3.A01));
    }

    public final int size() {
        C2596942s r2 = this.A00;
        return r2.A02.size() + r2.A01.size();
    }
}
