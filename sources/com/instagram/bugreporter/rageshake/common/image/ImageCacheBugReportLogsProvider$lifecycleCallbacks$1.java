package com.instagram.bugreporter.rageshake.common.image;

import X.0qQ;
import X.C51965G9l;
import X.C71843Ork;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class ImageCacheBugReportLogsProvider$lifecycleCallbacks$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C71843Ork A00;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        0qQ.A0B(activity, 0);
        this.A00.A00 = C51965G9l.A0v(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public ImageCacheBugReportLogsProvider$lifecycleCallbacks$1(C71843Ork ork) {
        this.A00 = ork;
    }
}
