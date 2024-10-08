package com.instagram.common.bloks;

import X.C307776Rk;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

public final class BloksContextBindManager$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C307776Rk A00;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public BloksContextBindManager$1(C307776Rk r1) {
        this.A00 = r1;
    }

    public final void onActivityDestroyed(Activity activity) {
        C307776Rk r1 = this.A00;
        if (activity == r1.A01.get()) {
            r1.A00();
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.A00.A00 = null;
    }

    public final void onActivityStarted(Activity activity) {
        this.A00.A00 = new WeakReference(activity);
    }
}
