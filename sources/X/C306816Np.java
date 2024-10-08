package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.6Np  reason: invalid class name and case insensitive filesystem */
public abstract class C306816Np extends WeakReference implements AnonymousClass17x {
    public final int A00;

    public AnonymousClass17x BW3() {
        return null;
    }

    public final int BCU() {
        return this.A00;
    }

    public C306816Np(Object obj, ReferenceQueue referenceQueue, int i) {
        super(obj, referenceQueue);
        this.A00 = i;
    }

    public final Object getKey() {
        return get();
    }
}
