package X;

import com.instagram.ui.widget.drawing.gl.GLDrawingView;

/* renamed from: X.AoE  reason: case insensitive filesystem */
public final /* synthetic */ class C41092AoE implements Runnable {
    public final /* synthetic */ GLDrawingView A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ C41092AoE(GLDrawingView gLDrawingView, Runnable runnable) {
        this.A00 = gLDrawingView;
        this.A01 = runnable;
    }

    public final void run() {
        GLDrawingView gLDrawingView = this.A00;
        Runnable runnable = this.A01;
        gLDrawingView.A0E.A01();
        gLDrawingView.A03();
        if (runnable != null) {
            runnable.run();
        }
    }
}
