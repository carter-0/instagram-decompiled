package com.instagram.prefetch;

import X.C67751wZ;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

public class PrefetchDebugView {
    public Context A00;
    public C67751wZ A01;
    public final Application.ActivityLifecycleCallbacks A02 = new Application.ActivityLifecycleCallbacks() {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
            C67751wZ r0 = PrefetchDebugView.this.A01;
            if (r0 != null) {
                r0.FJ7();
            }
        }

        public final void onActivityResumed(Activity activity) {
            PrefetchDebugView.this.A01.FJ7();
        }
    };

    public PrefetchDebugView(Context context, C67751wZ r3) {
        this.A00 = context;
        this.A01 = r3;
        r3.FJ7();
    }
}
