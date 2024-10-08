package androidx.lifecycle;

import X.07T;
import X.0qQ;
import X.AnonymousClass11m;
import X.C633711i;
import X.Pxm;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

public final class ProcessLifecycleOwner$attach$1 extends EmptyActivityLifecycleCallbacks {
    public final /* synthetic */ Pxm this$0;

    public void onActivityCreated(Activity activity, Bundle bundle) {
        0qQ.A0B(activity, 0);
        if (Build.VERSION.SDK_INT < 29) {
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            0qQ.A0C(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            Pxm pxm = this.this$0;
            Pxm pxm2 = Pxm.A08;
            ((AnonymousClass11m) findFragmentByTag).A00 = pxm.A06;
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        0qQ.A0B(activity, 0);
        C633711i.A00(activity, new ProcessLifecycleOwner$attach$1$onActivityPreCreated$1(this.this$0));
    }

    public ProcessLifecycleOwner$attach$1(Pxm pxm) {
        this.this$0 = pxm;
    }

    public void onActivityPaused(Activity activity) {
        Pxm pxm = this.this$0;
        int i = pxm.A00 - 1;
        pxm.A00 = i;
        if (i == 0) {
            Handler handler = pxm.A02;
            0qQ.A0A(handler);
            handler.postDelayed(pxm.A07, 700);
        }
    }

    public void onActivityStopped(Activity activity) {
        Pxm pxm = this.this$0;
        int i = pxm.A01 - 1;
        pxm.A01 = i;
        if (i == 0 && pxm.A03) {
            pxm.A05.A0B(07T.ON_STOP);
            pxm.A04 = true;
        }
    }
}
