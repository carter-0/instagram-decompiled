package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6Mj  reason: invalid class name and case insensitive filesystem */
public abstract class C306496Mj {
    public static final Integer A00(C306386Ly r1) {
        AnonymousClass6MO r0;
        0qQ.A0B(r1, 0);
        Spannable spannable = r1.A0F;
        0qQ.A07(spannable);
        if (spannable.length() <= 0 || (r0 = (AnonymousClass6MO) C263324Kh.A00(spannable, AnonymousClass6MO.class)) == null) {
            return AnonymousClass05K.A00;
        }
        if (r0.A09) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A01;
    }

    public static final ArrayList A03(List list, float f, float f2, float f3, float f4, boolean z) {
        List list2 = list;
        0qQ.A0B(list2, 0);
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            List list3 = (List) list2.get(i);
            C306506Mk r9 = new C306506Mk();
            arrayList.add(r9);
            int size2 = list3.size();
            if (size2 != 0) {
                int i2 = size2 * 2;
                PointF[] pointFArr = new PointF[i2];
                PointF[] pointFArr2 = new PointF[i2];
                for (int i3 = 0; i3 < size2; i3++) {
                    RectF rectF = (RectF) list3.get(i3);
                    int i4 = i3 * 2;
                    int i5 = i4 + 1;
                    pointFArr2[i4] = new PointF(rectF.right + f, rectF.top - f2);
                    pointFArr2[i5] = new PointF(rectF.right + f, rectF.bottom + f3);
                    pointFArr[i4] = new PointF(rectF.left - f, rectF.top - f2);
                    pointFArr[i5] = new PointF(rectF.left - f, rectF.bottom + f3);
                }
                03t.A0N(pointFArr);
                03t.A0N(pointFArr2);
                int length = pointFArr2.length;
                for (int i6 = 1; i6 < length; i6++) {
                    PointF pointF = pointFArr2[i6];
                    PointF pointF2 = pointFArr2[i6 - 1];
                    if (pointF.x > pointF2.x) {
                        pointF2.y = pointF.y;
                    } else if (pointF.x < pointF2.x) {
                        pointF.y = pointF2.y;
                    }
                }
                int length2 = pointFArr.length;
                for (int i7 = 1; i7 < length2; i7++) {
                    PointF pointF3 = pointFArr[i7];
                    PointF pointF4 = pointFArr[i7 - 1];
                    if (pointF3.x > pointF4.x) {
                        pointF3.y = pointF4.y;
                    } else if (pointF3.x < pointF4.x) {
                        pointF4.y = pointF3.y;
                    }
                }
                float f5 = f4;
                boolean z2 = z;
                ArrayList A04 = A04(pointFArr2, f5, true, z2);
                ArrayList A042 = A04(pointFArr, f5, false, z2);
                r9.A02(((PointF) A04.get(0)).x, ((PointF) A04.get(0)).y);
                int size3 = A04.size();
                for (int i8 = 1; i8 < size3; i8++) {
                    r9.A01(((PointF) A04.get(i8)).x, ((PointF) A04.get(i8)).y);
                }
                int size4 = A042.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i9 = size4 - 1;
                        r9.A01(((PointF) A042.get(size4)).x, ((PointF) A042.get(size4)).y);
                        if (i9 < 0) {
                            break;
                        }
                        size4 = i9;
                    }
                }
                r9.A00();
            }
        }
        return arrayList;
    }

    public static final void A05(Spannable spannable, TextView textView, float f, int i, boolean z) {
        float paddingLeft = (float) textView.getPaddingLeft();
        C306486Mi.A00(textView, paddingLeft, false);
        textView.setText(spannable);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new APG(spannable, textView, paddingLeft, (float) textView.getPaddingTop(), textView.getTextSize() / 4.0f, f, i, z));
    }

    public static final ArrayList A01(Layout layout, float f) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            float lineLeft = layout.getLineLeft(i);
            float lineTop = (float) layout.getLineTop(i);
            float lineRight = layout.getLineRight(i);
            float lineBottom = (float) layout.getLineBottom(i);
            if (i < layout.getLineCount() - 1) {
                lineBottom = ((lineBottom - lineTop) / f) + lineTop;
            }
            RectF rectF = new RectF(lineLeft, lineTop, lineRight, lineBottom);
            String obj = layout.getText().subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString();
            if (rectF.width() > 0.0f && 00p.A0g(obj, "\n", "", false).length() > 0) {
                arrayList2.add(rectF);
            } else if (!arrayList2.isEmpty()) {
                arrayList.add(arrayList2);
                arrayList2 = new ArrayList();
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public static final ArrayList A04(PointF[] pointFArr, float f, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, Arrays.copyOf(pointFArr, pointFArr.length));
        int i = 0;
        while (i < (arrayList.size() / 2) - 1) {
            int i2 = i * 2;
            PointF pointF = (PointF) arrayList.get(i2);
            PointF pointF2 = (PointF) arrayList.get(i2 + 1);
            PointF pointF3 = (PointF) arrayList.get(i2 + 2);
            PointF pointF4 = (PointF) arrayList.get(i2 + 3);
            float abs = Math.abs(pointF2.x - pointF3.x);
            if ((z2 || i != (arrayList.size() / 2) - 2) && abs < f) {
                arrayList.remove(pointF2);
                arrayList.remove(pointF3);
                float f2 = pointF.x;
                float f3 = pointF4.x;
                if (!z ? f2 > f3 : f2 < f3) {
                    f2 = f3;
                }
                pointF4.x = f2;
                pointF.x = f2;
                i--;
            }
            i++;
        }
        return arrayList;
    }

    public static final ArrayList A02(Layout layout, float f, float f2, float f3, float f4, float f5) {
        return A03(A01(layout, f5), f, f2, f3, f4, true);
    }
}
