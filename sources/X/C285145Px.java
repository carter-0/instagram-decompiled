package X;

import android.view.View;
import java.util.concurrent.CancellationException;

/* renamed from: X.5Px  reason: invalid class name and case insensitive filesystem */
public final class C285145Px implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C262204Co A00;

    public final void onViewAttachedToWindow(View view) {
    }

    public C285145Px(C262204Co r1) {
        this.A00 = r1;
    }

    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        this.A00.AG7((CancellationException) null);
    }
}
