package X;

import java.util.Iterator;

/* renamed from: X.Sjw  reason: case insensitive filesystem */
public final class C11981Sjw implements C13539TcB {
    public final C10925S1d A00;
    public final /* synthetic */ Sk4 A01;

    public C11981Sjw(Sk4 sk4, C10925S1d s1d) {
        this.A01 = sk4;
        this.A00 = s1d;
    }

    public final void D5r(boolean z) {
        if (z) {
            synchronized (this.A01) {
                C10925S1d s1d = this.A00;
                Iterator A0m = Pxi.A0m(s1d.A02);
                while (A0m.hasNext()) {
                    C13837TiC tiC = (C13837TiC) A0m.next();
                    if (!tiC.isComplete() && !tiC.CQ9()) {
                        tiC.clear();
                        if (!s1d.A00) {
                            tiC.ADE();
                        } else {
                            s1d.A01.add(tiC);
                        }
                    }
                }
            }
        }
    }
}
