package com.instagram.video.player.common;

import X.0qQ;
import X.0tS;
import X.AnonymousClass000;
import X.DbT;
import X.SR1;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PhujiClientDebugDialog$lifecycleCallbacks$1 implements Application.ActivityLifecycleCallbacks {
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
        View view = SR1.A01;
        if (view != null) {
            WindowManager windowManager = SR1.A02;
            if (windowManager != null) {
                windowManager.removeView(view);
            }
            SR1.A05.set(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = SR1.A05;
        if (!atomicBoolean.get() && 0tS.A4E.A00().A0X()) {
            Context context = SR1.A00;
            if (context != null) {
                Object systemService = context.getSystemService("window");
                0qQ.A0C(systemService, AnonymousClass000.A00(14));
                SR1.A02 = (WindowManager) systemService;
                Object systemService2 = context.getSystemService("layout_inflater");
                0qQ.A0C(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                SR1.A01 = DbT.A0C((LayoutInflater) systemService2, (ViewGroup) null, R.layout.watch_time_debug_view);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(IgNetworkConsentStorage.MAX_ENTRIES);
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.type = 2038;
                layoutParams.flags = 16777240;
                layoutParams.format = -3;
                layoutParams.alpha = 0.8f;
                WindowManager windowManager = SR1.A02;
                if (windowManager != null) {
                    windowManager.addView(SR1.A01, layoutParams);
                }
            }
            SR1.A00();
            atomicBoolean.set(true);
        }
    }
}
