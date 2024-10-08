package com.facebook.cameracore.ardelivery.xplat.models;

import X.0qQ;
import X.AnonymousClass8LL;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;

public final class XplatModelPaths {
    public final AnonymousClass8LL aRModelPaths = new AnonymousClass8LL();

    public final void setSparkVisionModelPath(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        this.aRModelPaths.A01.put(str, str2);
    }

    public final AnonymousClass8LL getARModelPaths() {
        return this.aRModelPaths;
    }

    public final void setModelPaths(int i, ModelPathsHolder modelPathsHolder) {
        VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(i);
        if (fromXplatValue != null) {
            AnonymousClass8LL r0 = this.aRModelPaths;
            if (modelPathsHolder != null) {
                r0.A00.put(fromXplatValue, modelPathsHolder);
            }
        }
    }
}
