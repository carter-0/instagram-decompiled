package X;

import java.lang.ref.WeakReference;

/* renamed from: X.3MN  reason: invalid class name */
public final class AnonymousClass3MN implements C250603lj {
    public final /* synthetic */ WeakReference A00;
    public final /* synthetic */ C62320sa A01;

    public AnonymousClass3MN(WeakReference weakReference, C62320sa r2) {
        this.A00 = weakReference;
        this.A01 = r2;
    }

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        String str;
        Object obj = this.A00.get();
        if (obj != null) {
            Integer CEk = r7.CEk(r6);
            0qQ.A07(CEk);
            if (CEk == AnonymousClass05K.A00 && (str = (String) this.A01.invoke()) != null) {
                1Jk.A08.A0L(String.valueOf(obj.hashCode()), str, 1Jk.A00().A01);
            }
        }
    }
}
