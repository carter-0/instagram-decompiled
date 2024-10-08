package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7b3  reason: invalid class name and case insensitive filesystem */
public final class C334307b3 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C54219H3o A01;

    public C334307b3(View view, C54219H3o h3o) {
        this.A01 = h3o;
        this.A00 = view;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return C54219H3o.A02(this.A00, this.A01);
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return C54219H3o.A02(this.A00, this.A01);
    }
}
