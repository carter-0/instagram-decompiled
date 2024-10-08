package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.AvU  reason: case insensitive filesystem */
public class C41526AvU extends WeakReference implements C367718rS {
    public final C367948rp A00;

    public final void CsB(Object obj) {
    }

    public final boolean isActive() {
        return true;
    }

    public final boolean isLoading() {
        return false;
    }

    public final C367718rS AKj(C367948rp r3, Object obj, ReferenceQueue referenceQueue) {
        if (this instanceof C383959gX) {
            return new C383959gX(r3, obj, referenceQueue, ((C383959gX) this).A00);
        }
        return new C41526AvU(r3, obj, referenceQueue);
    }

    public final C367948rp B1w() {
        return this.A00;
    }

    public final int CGN() {
        if (this instanceof C383959gX) {
            return ((C383959gX) this).A00;
        }
        return 1;
    }

    public C41526AvU(C367948rp r1, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = r1;
    }

    public final Object FNF() {
        return get();
    }
}
