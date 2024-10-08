package X;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.List;

public final class VVX {
    public C17944ViZ A00;
    public List A01 = new ArrayList();
    public final int A02;

    public VVX(Layout.Alignment alignment, Spannable spannable, StaticLayout staticLayout, TextPaint textPaint, 0rN r28, int i, int i2, boolean z) {
        int lineEnd;
        float lineLeft;
        float lineRight;
        int i3 = i2;
        this.A02 = i3;
        int i4 = i;
        if (i > 0) {
            int i5 = i - 1;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            StaticLayout staticLayout2 = staticLayout;
            int lineForOffset = staticLayout2.getLineForOffset(i5);
            int lineCount = staticLayout2.getLineCount();
            int i6 = lineForOffset + 1;
            lineCount = lineCount > i6 ? i6 : lineCount;
            int i7 = 0;
            while (true) {
                TextPaint textPaint2 = textPaint;
                if (i7 < lineCount) {
                    int lineStart = staticLayout2.getLineStart(i7);
                    if (i7 == lineForOffset) {
                        lineEnd = i5 + 1;
                    } else {
                        lineEnd = staticLayout2.getLineEnd(i7);
                    }
                    String A0g = 00p.A0g(C13988Tno.A0c(staticLayout2.getText(), lineStart, lineEnd), "\n", "", false);
                    float lineTop = (float) staticLayout2.getLineTop(i7);
                    float lineBottom = (float) staticLayout2.getLineBottom(i7);
                    if (i7 == lineForOffset && z) {
                        lineRight = staticLayout2.getLineRight(i7);
                        lineLeft = lineRight - textPaint2.measureText(A0g);
                    } else if (i7 != lineForOffset || z) {
                        lineLeft = staticLayout2.getLineLeft(i7);
                        lineRight = staticLayout2.getLineRight(i7);
                    } else {
                        lineLeft = staticLayout2.getLineLeft(i7);
                        lineRight = textPaint2.measureText(A0g) + lineLeft;
                    }
                    RectF rectF = new RectF(lineLeft, lineTop, lineRight, lineBottom);
                    if (rectF.width() > 0.0f && A0g.length() > 0) {
                        arrayList2.add(rectF);
                    } else if (DbT.A1b(arrayList2)) {
                        arrayList.add(arrayList2);
                        arrayList2 = new ArrayList();
                    }
                    i7++;
                } else {
                    DbV.A1U(arrayList2, arrayList, arrayList2.isEmpty() ? 1 : 0);
                    this.A01 = arrayList;
                    this.A00 = new C17944ViZ(alignment, spannable, textPaint2, r28, (float) staticLayout2.getLineBottom(i3), (float) staticLayout2.getLineTop(i3), staticLayout2.getLineLeft(i3), staticLayout2.getLineRight(i3), (float) staticLayout2.getLineBaseline(i3), staticLayout2.getLineStart(i3), i4, 0);
                    return;
                }
            }
        }
    }
}
