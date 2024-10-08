package X;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public final class TLC implements Runnable, C13689Tf6 {
    public STX A00;
    public final SPQ A01;
    public final C12179SoU A02;
    public final ConcurrentLinkedQueue A03;
    public final Semaphore A04 = new Semaphore(1);

    public TLC(STX stx, SPQ spq, C12179SoU soU, ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.A00 = stx;
        this.A02 = soU;
        this.A03 = concurrentLinkedQueue;
        this.A01 = spq;
    }

    public final void Cy1(C11230SGo sGo) {
        0qQ.A0B(sGo, 0);
        this.A04.release();
        int i = sGo.A00;
        SPQ spq = this.A01;
        if (i == 0) {
            spq.A00.Cgp((Map) null, (Map) null, "client_init_iap_store_connection_success");
        } else {
            C13888TjB tjB = spq.A00;
            LinkedHashMap A032 = 0Yt.A03(0Yt.A0E());
            SKS.A00(sGo, A032);
            tjB.Cgp(A032, (Map) null, "client_init_iap_store_connection_fail");
        }
        A00(sGo);
    }

    private final void A00(C11230SGo sGo) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A03;
        LinkedList A1A = Pxe.A1A();
        for (Object poll = concurrentLinkedQueue.poll(); poll != null; poll = concurrentLinkedQueue.poll()) {
            A1A.add(poll);
        }
        while (true) {
            S6Q s6q = (S6Q) A1A.poll();
            if (s6q == null) {
                return;
            }
            if (s6q instanceof QY8) {
                s6q.A01(sGo, new TY5(sGo, 42));
            } else {
                s6q.A00();
            }
        }
    }

    public final void Cy0() {
        this.A01.A00.Cgp((Map) null, (Map) null, "client_init_iap_store_connection_stopped");
        this.A02.Ewn(new C11827ShD(this, 1), false);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.SGo] */
    public final void run() {
        STX stx = this.A00;
        if (!stx.A0F()) {
            Semaphore semaphore = this.A04;
            if (!semaphore.tryAcquire()) {
                return;
            }
            if (stx.A0F()) {
                semaphore.release();
            } else {
                this.A01.A00.Cgp((Map) null, (Map) null, "client_init_iap_store_connection_init");
                0KC.A0C("DCP", "Starting in-app billing connection.");
                stx.A09(this);
                return;
            }
        }
        ? obj = new Object();
        obj.A00 = 0;
        obj.A01 = "";
        A00(obj);
    }
}
