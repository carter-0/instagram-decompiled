package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* renamed from: X.AvT  reason: case insensitive filesystem */
public class C41525AvT extends SoftReference implements C367718rS {
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
        if (this instanceof C383899gR) {
            return new C383899gR(r3, obj, referenceQueue, ((C383899gR) this).A00);
        }
        return new C41525AvT(r3, obj, referenceQueue);
    }

    public final C367948rp B1w() {
        return this.A00;
    }

    public final int CGN() {
        if (this instanceof C383899gR) {
            return ((C383899gR) this).A00;
        }
        return 1;
    }

    public C41525AvT(C367948rp r1, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = r1;
    }

    public final Object FNF() {
        return get();
    }
}
