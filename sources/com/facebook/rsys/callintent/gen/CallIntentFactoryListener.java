package com.facebook.rsys.callintent.gen;

import X.AnonymousClass00P;
import com.facebook.djinni.msys.infra.McfReference;

public abstract class CallIntentFactoryListener {
    public abstract void onCallIntentDismissed(CallIntent callIntent);

    public abstract void onIncomingCallIntent(CallIntent callIntent);

    public abstract void onIncomingCollision(CallIntent callIntent);

    public abstract void onMessageError(int i, McfReference mcfReference, String str);

    public CallIntentFactoryListener() {
        throw AnonymousClass00P.createAndThrow();
    }
}
