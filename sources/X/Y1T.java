package X;

import java.util.Deque;
import java.util.Iterator;

public final class Y1T implements Cloneable {
    public C21988Xp1 A00;
    public boolean A01;
    public final Y1U A02;
    public final C21464Xbw A03;
    public final boolean A04;

    public final void A00(YAG yag) {
        Y7K y7k;
        synchronized (this) {
            if (!this.A01) {
                this.A01 = true;
            } else {
                throw AnonymousClass7TE.A0z("Already Executed");
            }
        }
        this.A00.A00 = SPU.A00.A03();
        Xnv xnv = this.A02.A0J;
        Y7K y7k2 = new Y7K(yag, this);
        synchronized (xnv) {
            Deque deque = xnv.A01;
            deque.add(y7k2);
            Y1T y1t = y7k2.A02;
            if (!y1t.A04) {
                String str = y1t.A03.A03.A02;
                Iterator it = xnv.A02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = deque.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            y7k = (Y7K) it2.next();
                            if (y7k.A02.A03.A03.A02.equals(str)) {
                                break;
                            }
                        }
                    } else {
                        y7k = (Y7K) it.next();
                        if (y7k.A02.A03.A03.A02.equals(str)) {
                            break;
                        }
                    }
                }
                y7k2.A01 = y7k.A01;
            }
        }
        Xnv.A00(xnv);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        Y1U y1u = this.A02;
        Y1T y1t = new Y1T(y1u, this.A03, this.A04);
        y1t.A00 = new C21988Xp1(y1u, y1t);
        return y1t;
    }

    public Y1T(Y1U y1u, C21464Xbw xbw, boolean z) {
        this.A02 = y1u;
        this.A03 = xbw;
        this.A04 = z;
    }
}
