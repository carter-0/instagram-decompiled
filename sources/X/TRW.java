package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class TRW extends WeakReference {
    public final int A00;

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this != obj) {
                TRW trw = (TRW) obj;
                if (!(this.A00 == trw.A00 && get() == trw.get())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }

    public TRW(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        this.A00 = System.identityHashCode(th);
    }
}
