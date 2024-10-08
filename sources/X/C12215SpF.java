package X;

import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.SpF  reason: case insensitive filesystem */
public final class C12215SpF implements C13773Tgo {
    public final /* synthetic */ IntentModule A00;

    public final void onHostDestroy() {
    }

    public final void onHostPause() {
    }

    public C12215SpF(IntentModule intentModule) {
        this.A00 = intentModule;
    }

    public final void onHostResume() {
        IntentModule intentModule = this.A00;
        Pxe.A0T(intentModule).A0A(this);
        synchronized (intentModule) {
            for (C13904TjR initialURL : intentModule.mPendingOpenURLPromises) {
                intentModule.getInitialURL(initialURL);
            }
            intentModule.mInitialURLListener = null;
            intentModule.mPendingOpenURLPromises.clear();
        }
    }
}
