package X;

import com.instagram.ui.widget.drawing.StrokeWidthTool;

/* renamed from: X.9S0  reason: invalid class name */
public final class AnonymousClass9S0 implements Runnable {
    public final /* synthetic */ StrokeWidthTool A00;

    public AnonymousClass9S0(StrokeWidthTool strokeWidthTool) {
        this.A00 = strokeWidthTool;
    }

    public final void run() {
        StrokeWidthTool strokeWidthTool = this.A00;
        strokeWidthTool.A0L = true;
        strokeWidthTool.invalidate();
    }
}
