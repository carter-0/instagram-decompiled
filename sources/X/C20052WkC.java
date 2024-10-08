package X;

import android.app.Activity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;

/* renamed from: X.WkC  reason: case insensitive filesystem */
public final class C20052WkC implements Runnable {
    public final /* synthetic */ C14695U1u A00;

    public C20052WkC(C14695U1u u1u) {
        this.A00 = u1u;
    }

    public final void run() {
        C14695U1u u1u = this.A00;
        AnonymousClass4DH r2 = u1u.A01;
        if (r2.isResumed() && C16715V2y.A01 != null) {
            Activity activity = u1u.A00;
            if (activity instanceof BaseFragmentActivity) {
                C8779R9f r9f = C16715V2y.A01;
                0qQ.A0A(r9f);
                ((IgFragmentActivity) activity).registerOnActivityResultListener(r9f);
                return;
            }
            r2.registerLifecycleListener(C16715V2y.A01);
        }
    }
}
