package com.facebook.cameracore.ardelivery.effectmetadatamanager.models;

import X.AnonymousClass00P;
import java.util.List;

public abstract class EffectMetadataCompletionCallback {
    public abstract void onFail(String str);

    public abstract void onSuccess(List list);

    public EffectMetadataCompletionCallback() {
        throw AnonymousClass00P.createAndThrow();
    }
}
