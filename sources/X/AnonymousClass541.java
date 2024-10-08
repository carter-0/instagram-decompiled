package X;

import java.util.AbstractCollection;
import java.util.TimerTask;

/* renamed from: X.541  reason: invalid class name */
public final class AnonymousClass541 extends TimerTask {
    public final /* synthetic */ C2807753z A00;
    public final /* synthetic */ C278724xQ A01;

    public AnonymousClass541(C2807753z r1, C278724xQ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C2807753z r1 = this.A00;
        C278724xQ r3 = r1.A04;
        r3.A08.clear();
        r1.A01.DFq(AnonymousClass05K.A00, true);
        C2807553x r12 = r3.A00;
        if (r12 != null) {
            Object obj = C2807553x.A01.get();
            obj.getClass();
            ((AbstractCollection) obj).remove(r12);
        }
    }
}
