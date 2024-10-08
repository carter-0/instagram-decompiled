package X;

import com.instagram.ui.widget.drawing.gl.GLDrawingView;

public final class A56 {
    public final GLDrawingView A00;
    public final /* synthetic */ AnonymousClass8O4 A01;

    public A56(AnonymousClass8O4 r2, GLDrawingView gLDrawingView) {
        this.A01 = r2;
        this.A00 = gLDrawingView;
        gLDrawingView.setGLThreadListener(r2.A0O);
        gLDrawingView.setBrushList(r2.A0N);
        gLDrawingView.setOnDrawListener(new C19722WeO(this));
    }
}
