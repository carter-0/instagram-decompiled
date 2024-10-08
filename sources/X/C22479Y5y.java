package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Y5y  reason: case insensitive filesystem */
public final class C22479Y5y extends 0sz implements Collection, C62650uo {
    public final AnonymousClass6G6 A00;

    public final int A08() {
        return this.A00.size();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public final Iterator iterator() {
        return new C22433Y3p(this.A00);
    }

    public C22479Y5y(AnonymousClass6G6 r1) {
        this.A00 = r1;
    }
}
