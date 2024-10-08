package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;

/* renamed from: X.84P  reason: invalid class name */
public final class AnonymousClass84P implements AnonymousClass84Q {
    public final /* synthetic */ AnonymousClass84M A00;

    public AnonymousClass84P(AnonymousClass84M r1) {
        this.A00 = r1;
    }

    public final void D51(AnonymousClass8LL r4, Exception exc) {
        if (r4 != null) {
            AnonymousClass84M r2 = this.A00;
            ModelPathsHolder modelPathsHolder = (ModelPathsHolder) r4.A00.get(VersionedCapability.Saliency);
            if (modelPathsHolder != null) {
                r2.A03 = modelPathsHolder.getModelPath(AnonymousClass8LN.PytorchModel);
            }
        }
    }
}
