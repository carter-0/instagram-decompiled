package X;

import java.lang.ref.WeakReference;

/* renamed from: X.IhN  reason: case insensitive filesystem */
public final class C57844IhN implements Runnable {
    public final /* synthetic */ C57248IUj A00;
    public final /* synthetic */ C55691Hlo A01;

    public C57844IhN(C57248IUj iUj, C55691Hlo hlo) {
        this.A01 = hlo;
        this.A00 = iUj;
    }

    public final void run() {
        C57248IUj iUj = this.A00;
        if (!iUj.A01) {
            iUj.A01 = true;
            WeakReference weakReference = iUj.A00;
            if (!(weakReference == null || weakReference.get() == null)) {
                C17003VEd.A00((C17522VZb) weakReference.get(), true);
            }
        }
        this.A01.A01.remove(C51969G9p.A0q(iUj));
    }
}
