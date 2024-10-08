package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.Wr7  reason: case insensitive filesystem */
public final class C20422Wr7 implements 0w6, 0s0 {
    public Object A00 = new WeakReference((Object) null);
    public final int A01;

    public C20422Wr7(int i) {
        this.A01 = i;
    }

    public final Object CDM(Object obj, AnonymousClass0YZ r3) {
        return ((Reference) this.A00).get();
    }

    public final void Epx(Object obj, Object obj2, AnonymousClass0YZ r4) {
        this.A00 = new WeakReference(obj2);
    }
}
