package com.facebook.common.util.lifecycle;

import X.06N;
import X.0hq;
import X.0qQ;
import X.C263624Ms;
import X.WKW;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public final class ViewOwnerTracker extends 06N implements Application.ActivityLifecycleCallbacks {
    public final Activity A00;
    public final Fragment A01;
    public final WKW A02;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        0qQ.A0B(activity, 0);
        if (activity.equals(this.A00)) {
            A0A();
        }
    }

    public final void onActivityPaused(Activity activity) {
        0qQ.A0B(activity, 0);
        if (activity.equals(this.A00)) {
            this.A02.A01();
        }
    }

    public final void onActivityResumed(Activity activity) {
        C263624Ms r0;
        0qQ.A0B(activity, 0);
        if (activity.equals(this.A00)) {
            WKW wkw = this.A02;
            if (wkw.A08 && (r0 = wkw.A03) != null) {
                r0.A07();
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void A04(Fragment fragment, 0hq r3) {
        if (fragment.equals(this.A01)) {
            A0A();
        }
    }

    public final void A06(Fragment fragment, 0hq r3) {
        if (fragment.equals(this.A01)) {
            this.A02.A01();
        }
    }

    public final void A07(Fragment fragment, 0hq r4) {
        C263624Ms r0;
        if (fragment.equals(this.A01)) {
            WKW wkw = this.A02;
            if (wkw.A08 && (r0 = wkw.A03) != null) {
                r0.A07();
            }
        }
    }

    public final void A0A() {
        Application application;
        Fragment fragment = this.A01;
        if (fragment != null) {
            fragment.getParentFragmentManager().A0q(this);
        }
        Activity activity = this.A00;
        if (activity != null && (application = activity.getApplication()) != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
    }

    public ViewOwnerTracker(Activity activity, Fragment fragment, WKW wkw) {
        Application application;
        this.A01 = fragment;
        this.A00 = activity;
        this.A02 = wkw;
        if (fragment != null) {
            fragment.getParentFragmentManager().A0r(this, false);
        }
        if (activity != null && (application = activity.getApplication()) != null) {
            application.registerActivityLifecycleCallbacks(this);
        }
    }
}
