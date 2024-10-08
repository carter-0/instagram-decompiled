package X;

import android.graphics.Canvas;
import android.view.View;
import java.util.List;

/* renamed from: X.Gda  reason: case insensitive filesystem */
public final class C52844Gda extends View {
    public C59721JVf A00;

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        C59721JVf jVf = this.A00;
        if (jVf != null) {
            List list = (List) jVf.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C59538JNk) list.get(i)).AQK(canvas, (I13) jVf.A00);
            }
        }
    }

    public final C59721JVf getCanvasModel() {
        return this.A00;
    }

    public final void setCanvasModel(C59721JVf jVf) {
        if (!0qQ.A0K(this.A00, jVf)) {
            this.A00 = jVf;
            invalidate();
        }
    }
}
