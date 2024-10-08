package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* renamed from: X.85j  reason: invalid class name and case insensitive filesystem */
public final class C3506085j extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ReboundHorizontalScrollView A01;

    public C3506085j(View view, ReboundHorizontalScrollView reboundHorizontalScrollView) {
        this.A01 = reboundHorizontalScrollView;
        this.A00 = view;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ReboundHorizontalScrollView.A04(this.A00, this.A01);
        return false;
    }
}
