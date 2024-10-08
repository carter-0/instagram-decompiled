package com.facebook.cameracore.ardelivery.effectmetadatamanager.models;

import X.AnonymousClass00P;

public abstract class EffectAssetMetadataCompletionCallback {
    public abstract void onFail(String str);

    public abstract void onSuccess(EffectAssetMetadata effectAssetMetadata);

    public EffectAssetMetadataCompletionCallback() {
        throw AnonymousClass00P.createAndThrow();
    }
}
