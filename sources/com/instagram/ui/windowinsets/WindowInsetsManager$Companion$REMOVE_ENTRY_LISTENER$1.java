package com.instagram.ui.windowinsets;

import X.002;
import X.0qQ;
import X.0wb;
import X.AnonymousClass03Q;
import X.AnonymousClass03j;
import X.C226112fe;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;

public final class WindowInsetsManager$Companion$REMOVE_ENTRY_LISTENER$1 implements Application.ActivityLifecycleCallbacks {
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        0qQ.A0B(activity, 0);
        C226112fe r2 = (C226112fe) C226112fe.A0C.remove(activity);
        if (r2 != null) {
            r2.A01.clear();
            if (true == C226112fe.A09) {
                r2.A02.clear();
                Window window = activity.getWindow();
                if (window != null) {
                    AnonymousClass03j.A00(window.getDecorView(), (AnonymousClass03Q) null);
                } else {
                    0wb.A03(002.A0R("WindowInsetsManager", "_null_activity_window"), "onActivityDestroyed: The activity's window is null and unable to remove the window insets listener, potential memory leak");
                }
            }
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
}
