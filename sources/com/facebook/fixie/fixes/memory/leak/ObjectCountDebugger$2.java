package com.facebook.fixie.fixes.memory.leak;

import X.AnonymousClass18u;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

public final class ObjectCountDebugger$2 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ AnonymousClass18u A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.fixie.fixes.memory.leak.ObjectCountDebugger$2.onActivityCreated(android.app.Activity, android.os.Bundle):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.fixie.fixes.memory.leak.ObjectCountDebugger$2.onActivityCreated(android.app.Activity, android.os.Bundle):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fixie.fixes.memory.leak.ObjectCountDebugger$2.onActivityCreated(android.app.Activity, android.os.Bundle):void");
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

    public ObjectCountDebugger$2(AnonymousClass18u r1) {
        this.A00 = r1;
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity instanceof FragmentActivity) {
            ((FragmentActivity) activity).getSupportFragmentManager().A0q(this.A00.A02);
        }
    }
}
