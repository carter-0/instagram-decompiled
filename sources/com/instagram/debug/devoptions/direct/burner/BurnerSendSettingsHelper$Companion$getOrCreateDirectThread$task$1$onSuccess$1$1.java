package com.instagram.debug.devoptions.direct.burner;

import X.0sP;
import X.AnonymousClass1XT;
import X.AnonymousClass2Ep;
import X.C74484Pve;

public final class BurnerSendSettingsHelper$Companion$getOrCreateDirectThread$task$1$onSuccess$1$1 implements C74484Pve {
    public final /* synthetic */ 0sP $callback;

    public /* synthetic */ void onFailureInBackground(AnonymousClass1XT r1) {
    }

    public /* synthetic */ void onStart() {
    }

    public /* synthetic */ void onSuccessInBackground(AnonymousClass2Ep r1) {
    }

    public BurnerSendSettingsHelper$Companion$getOrCreateDirectThread$task$1$onSuccess$1$1(0sP r1) {
        this.$callback = r1;
    }

    public void onFailure() {
        this.$callback.invoke((Object) null);
    }

    public void onSuccess(AnonymousClass2Ep r2) {
        this.$callback.invoke(r2);
    }
}
