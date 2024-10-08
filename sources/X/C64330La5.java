package X;

import androidx.paging.PageFetcher;
import androidx.paging.PageFetcherSnapshot;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.La5  reason: case insensitive filesystem */
public final class C64330La5 implements MRP {
    public final PageFetcherSnapshot A00;
    public final /* synthetic */ PageFetcher A01;

    public C64330La5(PageFetcher pageFetcher, PageFetcherSnapshot pageFetcherSnapshot) {
        0qQ.A0B(pageFetcherSnapshot, 2);
        this.A01 = pageFetcher;
        this.A00 = pageFetcherSnapshot;
    }

    public final void A78(C64124LOv lOv) {
        C60351Jjz jjz;
        C63828L8j l8j = this.A00.A00.A00;
        if (lOv instanceof C60351Jjz) {
            jjz = (C60351Jjz) lOv;
        } else {
            jjz = null;
        }
        C59344JFw jFw = new C59344JFw(lOv, 16);
        ReentrantLock reentrantLock = l8j.A03;
        reentrantLock.lock();
        if (jjz != null) {
            try {
                l8j.A00 = jjz;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        jFw.invoke(l8j.A02, l8j.A01);
        reentrantLock.unlock();
    }
}
