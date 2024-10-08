package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

@Deprecated
/* renamed from: X.030  reason: invalid class name */
public final class AnonymousClass030 {
    public final GestureDetector A00;

    public AnonymousClass030(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (Handler) null);
    }

    public AnonymousClass030(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.A00 = new GestureDetector(context, onGestureListener, handler);
    }
}
