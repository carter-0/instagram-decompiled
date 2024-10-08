package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Sjv  reason: case insensitive filesystem */
public final class C11980Sjv implements C13539TcB {
    public final /* synthetic */ C11192SEs A00;

    public C11980Sjv(C11192SEs sEs) {
        this.A00 = sEs;
    }

    public final void D5r(boolean z) {
        ArrayList A1D;
        C11424STg.A04();
        C11192SEs sEs = this.A00;
        synchronized (sEs) {
            A1D = AnonymousClass7TE.A1D(sEs.A02);
        }
        Iterator it = A1D.iterator();
        while (it.hasNext()) {
            ((C13539TcB) it.next()).D5r(z);
        }
    }
}
