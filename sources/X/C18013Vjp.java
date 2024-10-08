package X;

import android.os.Handler;
import java.util.Comparator;
import java.util.PriorityQueue;

/* renamed from: X.Vjp  reason: case insensitive filesystem */
public final class C18013Vjp {
    public C17291VPs A00;
    public C17293VPu A01;
    public long A02 = Long.MIN_VALUE;
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final C313566ge A04;
    public final PriorityQueue A05;
    public final Comparator A06;

    public C18013Vjp(C313566ge r4) {
        this.A04 = r4;
        C20380WqL wqL = C20380WqL.A00;
        this.A06 = wqL;
        this.A05 = new PriorityQueue(1, wqL);
    }

    public final void A00() {
        long Aug = this.A04.Aug();
        while (true) {
            PriorityQueue priorityQueue = this.A05;
            if (!priorityQueue.isEmpty()) {
                X5K x5k = (X5K) priorityQueue.poll();
                if (x5k.BdB() <= Aug) {
                    C17293VPu vPu = this.A01;
                    if (vPu != null) {
                        C19830WgB wgB = (C19830WgB) x5k;
                        0qQ.A0B(wgB, 0);
                        C45891D9u.A01(vPu.A00, wgB.A00);
                    }
                } else {
                    A01(x5k);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void A01(X5K x5k) {
        long BdB = x5k.BdB();
        C313566ge r9 = this.A04;
        long Aug = BdB - r9.Aug();
        if (Aug < 0) {
            if (BdB >= this.A02) {
                this.A02 = BdB;
            } else {
                return;
            }
        }
        this.A05.add(x5k);
        this.A03.postDelayed(new C20096Wku(this), Math.max(0, Aug));
        if (this.A00 == null) {
            C17291VPs vPs = new C17291VPs(this);
            this.A00 = vPs;
            r9.EqI(vPs);
        }
    }
}
