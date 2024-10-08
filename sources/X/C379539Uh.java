package X;

import java.lang.ref.Reference;
import java.util.Iterator;

/* renamed from: X.9Uh  reason: invalid class name and case insensitive filesystem */
public final class C379539Uh implements Runnable {
    public final /* synthetic */ C270914hb A00;

    public C379539Uh(C270914hb r1) {
        this.A00 = r1;
    }

    public final void run() {
        C270914hb r2 = this.A00;
        Integer A002 = C270914hb.A00(r2);
        if (A002 != AnonymousClass05K.A00) {
            boolean A1W = AnonymousClass7TF.A1W(A002, AnonymousClass05K.A01);
            Iterator it = r2.A03.iterator();
            while (it.hasNext()) {
                AnonymousClass60p r1 = (AnonymousClass60p) ((Reference) it.next()).get();
                if (r1 != null) {
                    synchronized (r1) {
                        AnonymousClass9QC r0 = r1.A02;
                        if (r0 == null || !r0.A08 || !A1W) {
                            r1.A06();
                        }
                    }
                }
            }
        }
    }
}
