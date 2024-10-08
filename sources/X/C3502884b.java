package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;

/* renamed from: X.84b  reason: invalid class name and case insensitive filesystem */
public final class C3502884b implements AnonymousClass84Q {
    public final /* synthetic */ C3502784a A00;

    public C3502884b(C3502784a r1) {
        this.A00 = r1;
    }

    public final void D51(AnonymousClass8LL r5, Exception exc) {
        if (r5 != null) {
            C3502784a r3 = this.A00;
            ModelPathsHolder modelPathsHolder = (ModelPathsHolder) r5.A00.get(VersionedCapability.BodyTracking);
            if (modelPathsHolder != null) {
                String modelPath = modelPathsHolder.getModelPath(AnonymousClass8LN.Caffe2InitNet);
                String modelPath2 = modelPathsHolder.getModelPath(AnonymousClass8LN.Caffe2PredictNet);
                if (modelPath != null && modelPath2 != null) {
                    r3.A03 = modelPath;
                    r3.A04 = modelPath2;
                }
            }
        }
    }
}
