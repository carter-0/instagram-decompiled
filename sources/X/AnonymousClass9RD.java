package X;

import java.util.Iterator;

/* renamed from: X.9RD  reason: invalid class name */
public final class AnonymousClass9RD extends 0ng {
    public final /* synthetic */ 0rJ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9RD(0rJ r4) {
        super(409, 4, false, false);
        this.A00 = r4;
    }

    public final void run() {
        Iterator it = AnonymousClass7TE.A1D(this.A00.A04.values()).iterator();
        while (it.hasNext()) {
            ((0px) it.next()).A0J();
        }
    }
}
