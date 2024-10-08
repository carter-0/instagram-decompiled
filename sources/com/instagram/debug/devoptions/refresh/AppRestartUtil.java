package com.instagram.debug.devoptions.refresh;

import X.0b6;
import X.0qQ;
import X.AnonymousClass7TE;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public final class AppRestartUtil {
    public static final AppRestartUtil INSTANCE = new Object();

    public static final void restartApp(Context context) {
        ComponentName component;
        Intent makeRestartActivityTask;
        0qQ.A0B(context, 0);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null || (component = launchIntentForPackage.getComponent()) == null || (makeRestartActivityTask = Intent.makeRestartActivityTask(component)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        0b6.A00().A07().A0G(context, makeRestartActivityTask);
    }

    public static final void restartAppHard(Context context) {
        ComponentName component;
        Intent makeRestartActivityTask;
        0qQ.A0B(context, 0);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null || (component = launchIntentForPackage.getComponent()) == null || (makeRestartActivityTask = Intent.makeRestartActivityTask(component)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        0b6.A00().A07().A0G(context, makeRestartActivityTask);
        Runtime.getRuntime().exit(0);
    }
}
