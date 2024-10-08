package X;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import android.text.style.LineBackgroundSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6OY  reason: invalid class name */
public final class AnonymousClass6OY implements LineBackgroundSpan {
    public final Paint A00;
    public final List A01;

    public AnonymousClass6OY(Layout layout, float f, float f2, float f3, float f4, float f5, int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            Layout layout2 = layout;
            if (i2 >= layout2.getLineCount()) {
                break;
            }
            RectF rectF = new RectF(layout2.getLineLeft(i2), (float) layout2.getLineTop(i2), layout2.getLineRight(i2), (float) layout2.getLineBottom(i2));
            String charSequence = layout2.getText().subSequence(layout2.getLineStart(i2), layout2.getLineEnd(i2)).toString();
            if (rectF.width() > 0.0f && !TextUtils.isEmpty(charSequence.replace("\n", ""))) {
                arrayList2.add(rectF);
            } else if (!arrayList2.isEmpty()) {
                arrayList.add(arrayList2);
                arrayList2 = new ArrayList();
            }
            i2++;
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        int i3 = 0;
        while (true) {
            float f6 = f5;
            if (i3 < arrayList.size()) {
                List list = (List) arrayList.get(i3);
                Path path = new Path();
                arrayList3.add(path);
                int size = list.size();
                int i4 = size * 2;
                PointF[] pointFArr = new PointF[i4];
                PointF[] pointFArr2 = new PointF[i4];
                for (int i5 = 0; i5 <= size - 1; i5++) {
                    RectF rectF2 = (RectF) list.get(i5);
                    int i6 = i5 * 2;
                    int i7 = i6 + 1;
                    pointFArr2[i6] = new PointF(rectF2.right + f2, rectF2.top - f3);
                    pointFArr2[i7] = new PointF(rectF2.right + f2, rectF2.bottom + f4);
                    pointFArr[i6] = new PointF(rectF2.left - f, rectF2.top - f3);
                    pointFArr[i7] = new PointF(rectF2.left - f, rectF2.bottom + f4);
                }
                for (int i8 = 1; i8 < pointFArr2.length; i8++) {
                    PointF pointF = pointFArr2[i8];
                    PointF pointF2 = pointFArr2[i8 - 1];
                    if (pointF.x > pointF2.x) {
                        pointF2.y = pointF.y;
                    } else if (pointF.x < pointF2.x) {
                        pointF.y = pointF2.y;
                    }
                }
                for (int i9 = 1; i9 < pointFArr.length; i9++) {
                    PointF pointF3 = pointFArr[i9];
                    PointF pointF4 = pointFArr[i9 - 1];
                    if (pointF3.x > pointF4.x) {
                        pointF3.y = pointF4.y;
                    } else if (pointF3.x < pointF4.x) {
                        pointF4.y = pointF3.y;
                    }
                }
                ArrayList A002 = A00(pointFArr2, f6, true);
                ArrayList A003 = A00(pointFArr, f6, false);
                path.moveTo(((PointF) A002.get(0)).x, ((PointF) A002.get(0)).y);
                for (int i10 = 1; i10 < A002.size(); i10++) {
                    path.lineTo(((PointF) A002.get(i10)).x, ((PointF) A002.get(i10)).y);
                }
                for (int size2 = A003.size() - 1; size2 >= 0; size2--) {
                    path.lineTo(((PointF) A003.get(size2)).x, ((PointF) A003.get(size2)).y);
                }
                path.close();
                i3++;
            } else {
                this.A01 = arrayList3;
                Paint paint = new Paint(1);
                this.A00 = paint;
                paint.setColor(i);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setPathEffect(new CornerPathEffect(f6));
                return;
            }
        }
    }

    public static ArrayList A00(PointF[] pointFArr, float f, boolean z) {
        float min;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, pointFArr);
        int i = 0;
        while (i < (arrayList.size() / 2) - 1) {
            int i2 = i * 2;
            PointF pointF = (PointF) arrayList.get(i2);
            PointF pointF2 = (PointF) arrayList.get(i2 + 1);
            PointF pointF3 = (PointF) arrayList.get(i2 + 2);
            PointF pointF4 = (PointF) arrayList.get(i2 + 3);
            if (Math.abs(pointF2.x - pointF3.x) < f) {
                arrayList.remove(pointF2);
                arrayList.remove(pointF3);
                float f2 = pointF.x;
                float f3 = pointF4.x;
                if (z) {
                    min = Math.max(f2, f3);
                } else {
                    min = Math.min(f2, f3);
                }
                pointF4.x = min;
                pointF.x = min;
                i--;
            }
            i++;
        }
        return arrayList;
    }

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        for (Path drawPath : this.A01) {
            canvas.drawPath(drawPath, this.A00);
        }
    }
}
