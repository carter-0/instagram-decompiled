package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;

/* renamed from: X.WQl  reason: case insensitive filesystem */
public final class C19230WQl implements C252243on {
    public final /* synthetic */ AnonymousClass4DH A00;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public C19230WQl(AnonymousClass4DH r1) {
        this.A00 = r1;
    }

    public final void onDestroy() {
        Thread thread;
        Looper looper;
        AnonymousClass4DH r3 = this.A00;
        IgFragmentActivity requireActivity = r3.requireActivity();
        if (C16715V2y.A01 != null) {
            if (requireActivity instanceof BaseFragmentActivity) {
                C8779R9f r9f = C16715V2y.A01;
                0qQ.A0A(r9f);
                requireActivity.unregisterOnActivityResultListener(r9f);
            } else {
                r3.unregisterLifecycleListener(C16715V2y.A01);
            }
            C16715V2y.A01 = null;
        }
        Handler handler = C16715V2y.A00;
        if (handler == null || (looper = handler.getLooper()) == null) {
            thread = null;
        } else {
            thread = looper.getThread();
        }
        HandlerThread handlerThread = (HandlerThread) thread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        C16715V2y.A00 = null;
    }
}
