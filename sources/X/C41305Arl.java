package X;

import java.util.concurrent.Callable;

/* renamed from: X.Arl  reason: case insensitive filesystem */
public final class C41305Arl implements Callable {
    public final /* synthetic */ C340837lu A00;

    public C41305Arl(C340837lu r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C340837lu r1;
        try {
            r1 = this.A00;
            C343297pz r0 = r1.A09;
            if (r0 != null) {
                r0.close();
                r1.A09 = null;
            } else {
                r1.A0M.A01.A01();
            }
        } catch (Exception unused) {
            r1 = this.A00;
            r1.A0M.A01.A01();
        }
        return r1.A0M;
    }
}
