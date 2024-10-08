package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.ui.widget.drawing.gl.GLDrawingView;

/* renamed from: X.U2o  reason: case insensitive filesystem */
public final class C14704U2o extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ GLDrawingView A00;

    public C14704U2o(GLDrawingView gLDrawingView) {
        this.A00 = gLDrawingView;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        GLDrawingView gLDrawingView = this.A00;
        gLDrawingView.A0E.A0B = true;
        gLDrawingView.A03();
    }
}
