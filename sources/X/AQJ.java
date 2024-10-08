package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class AQJ implements AnonymousClass84Q {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AQJ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void D51(AnonymousClass8LL r8, Exception exc) {
        ModelPathsHolder modelPathsHolder;
        AtomicReference atomicReference;
        C39677A4t a4t;
        if (this.A00 != 0) {
            if (r8 != null) {
                ModelPathsHolder modelPathsHolder2 = (ModelPathsHolder) r8.A00.get(VersionedCapability.IiFaceTracker);
                if (modelPathsHolder2 != null) {
                    atomicReference = (AtomicReference) this.A02;
                    a4t = new C39677A4t((Exception) null, C372228zz.A00(modelPathsHolder2));
                    atomicReference.set(a4t);
                    ((CountDownLatch) this.A01).countDown();
                }
            }
            try {
                atomicReference = (AtomicReference) this.A02;
                a4t = new C39677A4t(exc, (Map) null);
                atomicReference.set(a4t);
                ((CountDownLatch) this.A01).countDown();
            } catch (Throwable th) {
                ((CountDownLatch) this.A01).countDown();
                throw th;
            }
        } else {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : ((AQ6) this.A02).A00) {
                if (!(r8 == null || (modelPathsHolder = (ModelPathsHolder) r8.A00.get(next)) == null)) {
                    String modelPath = modelPathsHolder.getModelPath(AnonymousClass8LN.PytorchModel);
                    int i = modelPathsHolder.mVersion;
                    if (modelPath != null) {
                        A1C.add(new AnonymousClass8K5(Integer.valueOf(i), modelPath, "", 0Yt.A0E()));
                    }
                }
            }
            ((AnonymousClass8CQ) this.A01).D5A(exc, A1C);
        }
    }
}
