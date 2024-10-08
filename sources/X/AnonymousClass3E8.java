package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.3E8  reason: invalid class name */
public final class AnonymousClass3E8 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass3E5 A01;

    public final void onViewDetachedFromWindow(View view) {
    }

    public AnonymousClass3E8(Activity activity, AnonymousClass3E5 r2) {
        this.A01 = r2;
        this.A00 = activity;
    }

    public final void onViewAttachedToWindow(View view) {
        AnonymousClass3E5.A02(this.A00, this.A01);
    }
}
