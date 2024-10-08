package X;

import android.view.View;
import com.instagram.ui.widget.drawing.gl.GLDrawingView;

/* renamed from: X.8OK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8OK implements C2365734g {
    public final /* synthetic */ AnonymousClass8O4 A00;

    public /* synthetic */ AnonymousClass8OK(AnonymousClass8O4 r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        AnonymousClass8O4 r1 = this.A00;
        GLDrawingView gLDrawingView = (GLDrawingView) view;
        synchronized (r1) {
            if (r1.A0i == null) {
                r1.A0i = new A56(r1, gLDrawingView);
            }
        }
    }
}
