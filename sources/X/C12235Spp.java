package X;

import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Spp  reason: case insensitive filesystem */
public final /* synthetic */ class C12235Spp implements C13574Tcz {
    public final /* synthetic */ CountDownLatch A00;
    public final /* synthetic */ AtomicInteger A01;

    public /* synthetic */ C12235Spp(CountDownLatch countDownLatch, AtomicInteger atomicInteger) {
        this.A01 = atomicInteger;
        this.A00 = countDownLatch;
    }

    public final void onResult(Object obj) {
        AtomicInteger atomicInteger = this.A01;
        CountDownLatch countDownLatch = this.A00;
        FbnsServiceDelegate fbnsServiceDelegate = FbnsServiceDelegate.A0D;
        atomicInteger.set(((Number) obj).intValue());
        countDownLatch.countDown();
    }
}
