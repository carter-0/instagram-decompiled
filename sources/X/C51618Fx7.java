package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.Fx7  reason: case insensitive filesystem */
public final class C51618Fx7 implements 0w6 {
    public final int A00;
    public final Object A01;

    public C51618Fx7(WeakReference weakReference, int i) {
        this.A00 = i;
        this.A01 = weakReference;
    }

    public final /* bridge */ /* synthetic */ Object CDM(Object obj, AnonymousClass0YZ r3) {
        return ((Reference) this.A01).get();
    }
}
