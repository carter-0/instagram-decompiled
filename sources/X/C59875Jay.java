package X;

import java.util.Iterator;

/* renamed from: X.Jay  reason: case insensitive filesystem */
public final class C59875Jay implements Iterator, AnonymousClass0s4 {
    public Object A00;
    public Iterator A01;
    public final /* synthetic */ C59873Jaw A02;

    public C59875Jay(C59873Jaw jaw) {
        this.A02 = jaw;
        this.A01 = AnonymousClass7TE.A1G(jaw.A01);
    }

    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    public final Object next() {
        Object next = this.A01.next();
        this.A00 = next;
        if (next != null) {
            return next;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void remove() {
        this.A01.remove();
        C59874Jax jax = this.A02.A00;
        Object obj = this.A00;
        if (obj != null && jax != null) {
            jax.A00(obj);
        }
    }
}
