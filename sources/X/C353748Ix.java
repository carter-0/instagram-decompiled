package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;

/* renamed from: X.8Ix  reason: invalid class name and case insensitive filesystem */
public final class C353748Ix implements AnonymousClass84Q {
    public final /* synthetic */ C353738Iw A00;

    public C353748Ix(C353738Iw r1) {
        this.A00 = r1;
    }

    public final void D51(AnonymousClass8LL r4, Exception exc) {
        if (r4 != null) {
            C353738Iw r2 = this.A00;
            ModelPathsHolder modelPathsHolder = (ModelPathsHolder) r4.A00.get(VersionedCapability.SceneUnderstanding);
            if (modelPathsHolder != null) {
                r2.A02 = modelPathsHolder.getModelPath(AnonymousClass8LN.PytorchModel);
            }
        }
    }
}
