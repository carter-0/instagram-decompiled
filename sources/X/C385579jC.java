package X;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: X.9jC  reason: invalid class name and case insensitive filesystem */
public final class C385579jC extends 0wY {
    public final /* synthetic */ AnonymousClass3E5 A00;

    public final void Ctf(Activity activity) {
        0qQ.A0B(activity, 0);
        AnonymousClass3E5 r1 = this.A00;
        WeakReference weakReference = r1.A08;
        if (weakReference != null) {
            Object obj = weakReference.get();
            if (obj == null || activity.equals(obj)) {
                r1.onDestroy();
            }
        }
    }

    public final void Cth(Activity activity) {
        0qQ.A0B(activity, 0);
        AnonymousClass3E5 r1 = this.A00;
        WeakReference weakReference = r1.A08;
        if (weakReference != null) {
            Object obj = weakReference.get();
            if (obj == null || activity.equals(obj)) {
                r1.onStop();
            }
        }
    }

    public final void Ctm(Activity activity) {
        0qQ.A0B(activity, 0);
        AnonymousClass3E5 r2 = this.A00;
        WeakReference weakReference = r2.A08;
        if (weakReference != null) {
            Activity activity2 = (Activity) weakReference.get();
            if (activity.equals(activity2)) {
                r2.DmJ(activity2);
            }
        }
    }

    public C385579jC(AnonymousClass3E5 r1) {
        this.A00 = r1;
    }
}
