package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* renamed from: X.I9o  reason: case insensitive filesystem */
public final class C56728I9o implements LeadingMarginSpan {
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        Layout layout2 = layout;
        if (layout != null && paint != null && (lineForOffset = layout2.getLineForOffset(i6)) == layout2.getLineCount() - 1) {
            C291985iC r0 = C291975iB.A01;
            if (layout2.getEllipsisCount(lineForOffset) > 0) {
                float A00 = C292155iU.A00(paint, layout2, lineForOffset) + C292155iU.A01(paint, layout2, lineForOffset);
                if (A00 != 0.0f) {
                    0qQ.A0A(canvas);
                    canvas.translate(A00, 0.0f);
                }
            }
        }
    }
}
