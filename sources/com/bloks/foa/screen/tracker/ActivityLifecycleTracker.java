package com.bloks.foa.screen.tracker;

import X.0qQ;
import X.0sP;
import X.C16502Uvy;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class ActivityLifecycleTracker implements Application.ActivityLifecycleCallbacks {
    public boolean A00;
    public final Activity A01;
    public final 0sP A02;

    public final void onActivityDestroyed(Activity activity) {
        0qQ.A0B(activity, 0);
        if (0qQ.A0K(this.A01, activity)) {
            this.A02.invoke(C16502Uvy.EXIT_BACKWARD);
        }
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

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.A02.invoke(C16502Uvy.EXIT_FORWARD);
    }

    public ActivityLifecycleTracker(Activity activity, 0sP r2) {
        this.A01 = activity;
        this.A02 = r2;
    }
}
