package com.facebook.location.appstate;

import X.C270914hb;
import X.C379539Uh;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

public final class GeoApiLocationAppStateListener$LifecycleCallback implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C270914hb A00;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public GeoApiLocationAppStateListener$LifecycleCallback(C270914hb r1) {
        this.A00 = r1;
    }

    public final void onActivityPaused(Activity activity) {
        C270914hb r1 = this.A00;
        if (!r1.A03.isEmpty()) {
            r1.A00.schedule(new C379539Uh(r1), 250, TimeUnit.MILLISECONDS);
        }
    }
}
