package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.91W  reason: invalid class name */
public abstract class AnonymousClass91W {
    public static final TextPaint A00 = new TextPaint();

    public static final float A00(TextPaint textPaint, String str, int i, int i2, int i3) {
        String str2 = str;
        0qQ.A0B(str, 0);
        TextPaint textPaint2 = textPaint;
        0qQ.A0B(textPaint, 4);
        int length = str.length() - 1;
        int i4 = 0;
        boolean z = false;
        while (i4 <= length) {
            int i5 = length;
            if (!z) {
                i5 = i4;
            }
            int A002 = 0qQ.A00(str2.charAt(i5), 32);
            boolean z2 = false;
            if (A002 <= 0) {
                z2 = true;
            }
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i4++;
            }
        }
        if (str2.subSequence(i4, length + 1).toString().length() == 0) {
            return (float) i;
        }
        int i6 = (int) (((float) i) * 2.0f);
        int i7 = (int) (((float) i2) * 2.0f);
        while (true) {
            int floor = ((int) Math.floor((double) (((float) (i7 - i6)) / 2.0f))) + i6;
            float f = ((float) floor) / 2.0f;
            if (i6 >= floor) {
                return f;
            }
            textPaint2.setTextSize(f);
            int i8 = i3;
            if (((float) i8) <= textPaint2.measureText(str2) || new StaticLayout(str2, textPaint2, i8, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true).getLineCount() != 1) {
                i7 = floor;
            } else {
                i6 = floor;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [X.91X, android.text.style.MetricAffectingSpan, java.lang.Object] */
    public static final void A01(Context context, Paint paint, Editable editable, C358868bb r18) {
        float A002;
        Editable editable2 = editable;
        0qQ.A0B(editable2, 1);
        C263324Kh.A05(editable2, AnonymousClass91X.class);
        C358938bi r7 = r18.A06;
        Integer num = r7.A09;
        if (num != null && num.intValue() == 0) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(r7.A08);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(r7.A07);
            int A003 = r7.A00(context);
            String obj = editable2.toString();
            TextPaint textPaint = A00;
            textPaint.set(paint);
            for (MetricAffectingSpan updateMeasureState : (MetricAffectingSpan[]) C263324Kh.A06(editable2, MetricAffectingSpan.class)) {
                updateMeasureState.updateMeasureState(textPaint);
            }
            textPaint.setLinearText(true);
            textPaint.setSubpixelText(true);
            textPaint.setTextSize((float) dimensionPixelSize);
            StaticLayout staticLayout = new StaticLayout(obj, textPaint, A003, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            int lineCount = staticLayout.getLineCount();
            for (int i = 0; i < lineCount; i++) {
                int lineStart = staticLayout.getLineStart(i);
                int lineEnd = staticLayout.getLineEnd(i);
                String substring = obj.substring(lineStart, lineEnd);
                0qQ.A07(substring);
                String A0g = 00p.A0g(substring, "\n", "", false);
                if (0mp.A0A(A0g)) {
                    A002 = A00(textPaint, A0g, dimensionPixelSize, 0mi.A03(dimensionPixelSize2, dimensionPixelSize, 160), A003);
                } else {
                    A002 = A00(textPaint, A0g, dimensionPixelSize, dimensionPixelSize2, A003);
                }
                ? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.A00 = A002;
                editable2.setSpan(metricAffectingSpan, lineStart, lineEnd, 17);
            }
        }
    }
}
