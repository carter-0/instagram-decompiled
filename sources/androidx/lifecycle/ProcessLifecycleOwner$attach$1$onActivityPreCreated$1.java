package androidx.lifecycle;

import X.Pxm;
import android.app.Activity;

public final class ProcessLifecycleOwner$attach$1$onActivityPreCreated$1 extends EmptyActivityLifecycleCallbacks {
    public final /* synthetic */ Pxm this$0;

    public ProcessLifecycleOwner$attach$1$onActivityPreCreated$1(Pxm pxm) {
        this.this$0 = pxm;
    }

    public void onActivityPostResumed(Activity activity) {
        this.this$0.A01();
    }

    public void onActivityPostStarted(Activity activity) {
        this.this$0.A02();
    }
}
