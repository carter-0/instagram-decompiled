package X;

import java.util.concurrent.Callable;

/* renamed from: X.Ark  reason: case insensitive filesystem */
public final class C41304Ark implements Callable {
    public final /* synthetic */ C340837lu A00;

    public C41304Ark(C340837lu r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C340837lu r1;
        try {
            r1 = this.A00;
            C343297pz r0 = r1.A09;
            if (r0 != null) {
                r0.A6w();
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
