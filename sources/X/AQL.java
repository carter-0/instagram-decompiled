package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class AQL implements AnonymousClass84W {
    public final /* synthetic */ CountDownLatch A00;
    public final /* synthetic */ AtomicReference A01;

    public AQL(CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.A01 = atomicReference;
        this.A00 = countDownLatch;
    }

    public final void DSG(C314366i5 r7) {
        0qQ.A0B(r7, 0);
        r7.A03(new AQJ(1, this.A01, this.A00), AnonymousClass7TE.A1I(VersionedCapability.IiFaceTracker), false);
    }
}
