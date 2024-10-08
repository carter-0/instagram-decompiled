package com.instagram.process.asyncinit;

import X.0qQ;
import X.0sP;
import X.C272164kF;
import X.C272204kJ;
import X.C272794lP;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;

public final class IgSplashHelper$ActivityRecreateLifecycleListener implements Application.ActivityLifecycleCallbacks {
    public final 0sP A00;
    public final /* synthetic */ C272164kF A01;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        0qQ.A0B(activity, 0);
        boolean booleanValue = ((Boolean) this.A00.invoke(activity)).booleanValue();
        int i = Build.VERSION.SDK_INT;
        if (!booleanValue) {
            if (i >= 30) {
                C272794lP.A00(activity);
            }
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        } else if (i >= 31) {
            C272164kF.A01(activity, this.A01);
        } else {
            C272164kF r0 = this.A01;
            C272204kJ.A00(activity, C272164kF.A00(r0), r0.A01);
        }
    }

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

    public IgSplashHelper$ActivityRecreateLifecycleListener(C272164kF r1, 0sP r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
