package com.instagram.process.asyncinit;

import X.C62320sa;
import X.C66588MXu;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.List;

public final class AsyncColdStart$onApplicationInited$1$callback$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ Context A00;

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

    public AsyncColdStart$onApplicationInited$1$callback$1(Context context) {
        this.A00 = context;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        List<C62320sa> list = C66588MXu.A04;
        for (C62320sa invoke : list) {
            invoke.invoke();
        }
        list.clear();
        ((Application) this.A00).unregisterActivityLifecycleCallbacks(this);
    }
}
