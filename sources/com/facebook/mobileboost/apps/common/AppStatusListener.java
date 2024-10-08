package com.facebook.mobileboost.apps.common;

import X.AnonymousClass0Cr;
import X.C375119Ci;
import X.C375129Cj;
import X.C64171Ho;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AppStatusListener implements Application.ActivityLifecycleCallbacks {
    public static AppStatusListener A06;
    public WeakReference A00 = new WeakReference((Object) null);
    public final Handler A01;
    public final Runnable A02 = new C375129Cj(this);
    public final Runnable A03 = new C375119Ci(this);
    public final AtomicBoolean A04;
    public final C64171Ho[] A05;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        Object obj = this.A00.get();
        this.A00 = new WeakReference(activity);
        if (obj == null) {
            Handler handler = this.A01;
            handler.removeCallbacks(this.A02);
            if (this.A04.getAndSet(false)) {
                handler.post(this.A03);
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        Object obj = this.A00.get();
        if (obj == null || obj == activity) {
            this.A01.postDelayed(this.A02, 3000);
            this.A00 = new WeakReference((Object) null);
        }
    }

    public AppStatusListener(Context context, Handler handler, List list) {
        Application application;
        boolean z = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.A04 = atomicBoolean;
        Context applicationContext = context.getApplicationContext();
        this.A05 = (C64171Ho[]) list.toArray(new C64171Ho[list.size()]);
        this.A01 = handler;
        if (((applicationContext instanceof Application) || ((applicationContext = applicationContext.getApplicationContext()) != null && (applicationContext instanceof Application))) && (application = (Application) applicationContext) != null) {
            Activity A002 = AnonymousClass0Cr.A00();
            atomicBoolean.set(A002 == null ? true : z);
            this.A00 = new WeakReference(A002);
            application.registerActivityLifecycleCallbacks(this);
        }
    }
}
