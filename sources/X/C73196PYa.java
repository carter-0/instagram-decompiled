package X;

import com.google.common.collect.EvictingQueue;

/* renamed from: X.PYa  reason: case insensitive filesystem */
public final class C73196PYa implements Runnable {
    public final /* synthetic */ C70678OFz A00;
    public final /* synthetic */ MZH A01;

    public C73196PYa(C70678OFz oFz, MZH mzh) {
        this.A00 = oFz;
        this.A01 = mzh;
    }

    public final void run() {
        C70678OFz oFz = this.A00;
        EvictingQueue evictingQueue = oFz.A02;
        evictingQueue.offer(this.A01);
        oFz.A03.A00(evictingQueue);
    }
}
