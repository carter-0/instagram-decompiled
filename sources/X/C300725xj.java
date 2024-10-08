package X;

import com.instagram.ui.widget.drawing.StrokeWidthTool;

/* renamed from: X.5xj  reason: invalid class name and case insensitive filesystem */
public final class C300725xj extends C232922uf {
    public final /* synthetic */ StrokeWidthTool A00;

    public C300725xj(StrokeWidthTool strokeWidthTool) {
        this.A00 = strokeWidthTool;
    }

    public final void DmE(2cs r6) {
        float f = (float) r6.A09.A00;
        StrokeWidthTool strokeWidthTool = this.A00;
        float f2 = strokeWidthTool.A00;
        strokeWidthTool.A01 = f2 + ((1.0f - f2) * f);
        StrokeWidthTool.A04(strokeWidthTool);
        if (strokeWidthTool.A0O) {
            StrokeWidthTool.A05(strokeWidthTool, 0.0f);
        } else {
            StrokeWidthTool.A05(strokeWidthTool, 1.0f);
        }
        strokeWidthTool.invalidate();
    }
}
