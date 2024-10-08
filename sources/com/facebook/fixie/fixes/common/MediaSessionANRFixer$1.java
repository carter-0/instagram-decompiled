package com.facebook.fixie.fixes.common;

import X.C267454ba;
import X.C67336MmC;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class MediaSessionANRFixer$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C267454ba A00;

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public MediaSessionANRFixer$1(C267454ba r1) {
        this.A00 = r1;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.A00.A02.post(new C67336MmC(activity, this));
    }
}
