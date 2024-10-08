package X;

import java.util.Iterator;

/* renamed from: X.LkN  reason: case insensitive filesystem */
public final /* synthetic */ class C64922LkN implements C66436MRq {
    public final /* synthetic */ LE9 A00;

    public /* synthetic */ C64922LkN(LE9 le9) {
        this.A00 = le9;
    }

    public final void EF1(L66 l66) {
        LE9 le9 = this.A00;
        synchronized (le9) {
            if (!l66.A02.get()) {
                Iterator it = le9.A07.iterator();
                while (it.hasNext()) {
                    C63804L7k l7k = (C63804L7k) it.next();
                    if (l66.A00 == l7k.A00) {
                        C66436MRq mRq = l7k.A01;
                        if (mRq != null && !l7k.A03.get()) {
                            le9.A03.post(new M68(l66, mRq));
                        }
                        it.remove();
                    }
                }
            }
        }
    }
}
