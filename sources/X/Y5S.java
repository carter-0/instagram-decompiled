package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public final class Y5S extends PhantomReference {
    public final Y9I A00;

    public Y5S(Y9I y9i, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = y9i;
    }
}
