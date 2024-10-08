package X;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import java.lang.ref.WeakReference;

public final class ALy implements View.OnAttachStateChangeListener {
    public final AnonymousClass5J3 A00;
    public final WeakReference A01;

    public final void onViewAttachedToWindow(View view) {
        0qQ.A0B(view, 0);
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.A01.get();
        IBinder A002 = AnonymousClass4Vn.A00(activity);
        if (activity != null && A002 != null) {
            this.A00.A02(activity, A002);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public ALy(Activity activity, AnonymousClass5J3 r3) {
        this.A00 = r3;
        this.A01 = new WeakReference(activity);
    }
}
