package X;

import android.app.Activity;
import com.facebook.common.callercontext.CallerContext;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6K0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6K0 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ AnonymousClass6K0(Activity activity, Runnable runnable) {
        this.A00 = activity;
        this.A01 = runnable;
    }

    public final void run() {
        Activity activity = this.A00;
        Runnable runnable = this.A01;
        CallerContext callerContext = ReelViewerFragment.A3S;
        activity.onBackPressed();
        runnable.run();
    }
}
