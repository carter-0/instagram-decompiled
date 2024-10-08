package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Ljw  reason: case insensitive filesystem */
public final class C64896Ljw implements C250603lj {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ WeakReference A02;

    public C64896Ljw(String str, String str2, WeakReference weakReference) {
        this.A02 = weakReference;
        this.A00 = str;
        this.A01 = str2;
    }

    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        Object obj = this.A02.get();
        if (obj != null) {
            Integer CEk = r6.CEk(r5);
            0qQ.A07(CEk);
            if (CEk == AnonymousClass05K.A00) {
                1Jk.A08.A0L(AnonymousClass7TF.A0h(obj), this.A00, this.A01);
            }
        }
    }
}
