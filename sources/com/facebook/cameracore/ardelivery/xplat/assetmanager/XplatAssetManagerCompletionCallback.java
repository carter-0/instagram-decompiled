package com.facebook.cameracore.ardelivery.xplat.assetmanager;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C371478yM;
import X.C40929Alb;
import X.C40930Alc;
import java.util.List;
import java.util.concurrent.Executor;

public final class XplatAssetManagerCompletionCallback {
    public final Executor backgroundExecutor;
    public final C371478yM stateListener;

    public final void onFail(String str) {
        0qQ.A0B(str, 0);
        this.backgroundExecutor.execute(new C40929Alb(this, str));
    }

    public final void onSuccess(List list) {
        0qQ.A0B(list, 0);
        this.backgroundExecutor.execute(new C40930Alc(this, list));
    }

    public XplatAssetManagerCompletionCallback(C371478yM r1, Executor executor) {
        AnonymousClass7TG.A1O(r1, executor);
        this.stateListener = r1;
        this.backgroundExecutor = executor;
    }
}
