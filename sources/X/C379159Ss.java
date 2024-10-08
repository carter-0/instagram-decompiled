package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;

/* renamed from: X.9Ss  reason: invalid class name and case insensitive filesystem */
public final class C379159Ss implements AnonymousClass84Q {
    public final int A00;
    public final Object A01;

    public C379159Ss(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D51(AnonymousClass8LL r4, Exception exc) {
        if (this.A00 != 0) {
            if (r4 != null) {
                C378519Qc r2 = (C378519Qc) this.A01;
                ModelPathsHolder modelPathsHolder = (ModelPathsHolder) r4.A00.get(VersionedCapability.HandGesture);
                if (modelPathsHolder != null) {
                    r2.A02 = modelPathsHolder.getModelPath(AnonymousClass8LN.PytorchModel);
                }
            }
        } else if (r4 != null) {
            A7P a7p = (A7P) this.A01;
            ModelPathsHolder modelPathsHolder2 = (ModelPathsHolder) r4.A00.get(VersionedCapability.VideoHighlights);
            if (modelPathsHolder2 != null) {
                a7p.A02 = modelPathsHolder2.getModelPath(AnonymousClass8LN.PytorchModel);
            }
        }
    }
}
