package X;

import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* renamed from: X.Vtb  reason: case insensitive filesystem */
public final class C18525Vtb {
    public final ArrayList A01(Layout layout, Integer num, float f, int i, int i2) {
        RectF rectF;
        float lineLeft;
        float f2;
        float lineRight;
        Layout layout2 = layout;
        int i3 = i;
        int lineForOffset = layout2.getLineForOffset(i3);
        int i4 = i2;
        int lineForOffset2 = layout2.getLineForOffset(i4);
        ArrayList arrayList = new ArrayList();
        boolean A03 = 0mk.A03(layout2.getText().toString());
        C306506Mk r5 = new C306506Mk();
        RectF rectF2 = new RectF();
        float f3 = f;
        float f4 = f * 0.8f;
        float f5 = f * 0.15f;
        float f6 = f * 0.25f;
        Integer num2 = num;
        if (lineForOffset <= lineForOffset2) {
            int i5 = lineForOffset;
            rectF = null;
            while (true) {
                if (A03) {
                    if (lineForOffset2 == i5) {
                        int length = layout2.getText().length();
                        int i6 = i4;
                        if (i4 > length) {
                            i6 = length;
                        }
                        f2 = layout2.getPrimaryHorizontal(i6);
                    } else {
                        f2 = layout2.getLineLeft(i5);
                    }
                    if (lineForOffset == i5) {
                        lineRight = layout2.getPrimaryHorizontal(i3);
                    } else {
                        lineRight = layout2.getLineRight(i5);
                    }
                } else {
                    if (lineForOffset == i5) {
                        lineLeft = layout2.getPrimaryHorizontal(i3);
                    } else {
                        lineLeft = layout2.getLineLeft(i5);
                    }
                    if (lineForOffset2 == i5) {
                        int length2 = layout2.getText().length();
                        int i7 = i4;
                        if (i4 > length2) {
                            i7 = length2;
                        }
                        lineRight = layout2.getPrimaryHorizontal(i7);
                    } else {
                        lineRight = layout2.getLineRight(i5);
                    }
                }
                RectF rectF3 = new RectF(f2, (float) layout2.getLineTop(i5), lineRight, (float) layout2.getLineBottom(i5));
                int lineStart = layout2.getLineStart(i5);
                int lineEnd = layout2.getLineEnd(i5);
                CharSequence text = layout2.getText();
                0qQ.A07(text);
                String A0c = C13988Tno.A0c(text, lineStart, lineEnd);
                if (rectF3.width() <= 0.0f || 00p.A0g(A0c, "\n", "", false).length() <= 0) {
                    if (rectF != null) {
                        r5.A03(C19713WeF.A07.A00(rectF2, rectF, num2, f3, A03), Path.Direction.CW);
                    }
                    arrayList.add(r5);
                    r5 = new C306506Mk();
                    rectF = null;
                } else {
                    if (num2 != AnonymousClass05K.A0C || lineEnd <= i4) {
                        rectF = rectF3;
                    }
                    if (r5.A00.isEmpty()) {
                        rectF2 = rectF3;
                    }
                    rectF3.set(rectF3.left - f4, rectF3.top - f5, rectF3.right + f4, rectF3.bottom + f6);
                    r5.A03(rectF3, Path.Direction.CW);
                }
                if (i5 == lineForOffset2) {
                    break;
                }
                i5++;
            }
        } else {
            rectF = null;
        }
        if (!r5.A00.isEmpty()) {
            if (rectF != null) {
                r5.A03(C19713WeF.A07.A00(rectF2, rectF, num2, f3, A03), Path.Direction.CW);
            }
            arrayList.add(r5);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r3 = r6.right;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return new android.graphics.RectF(r3, r6.top, r3 - (r9 * 2.0f), r7.bottom);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r10 == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r10 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.RectF A00(android.graphics.RectF r6, android.graphics.RectF r7, java.lang.Integer r8, float r9, boolean r10) {
        /*
            r5 = this;
            int r1 = r8.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0010
            r0 = 2
            if (r1 == r0) goto L_0x001e
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            return r4
        L_0x0010:
            if (r10 != 0) goto L_0x0020
        L_0x0012:
            float r2 = r6.left
            float r1 = r6.top
            float r0 = r7.bottom
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r2, r1, r9, r0)
            return r4
        L_0x001e:
            if (r10 != 0) goto L_0x0012
        L_0x0020:
            float r3 = r6.right
            float r2 = r6.top
            r0 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r0
            float r1 = r3 - r9
            float r0 = r7.bottom
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r3, r2, r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18525Vtb.A00(android.graphics.RectF, android.graphics.RectF, java.lang.Integer, float, boolean):android.graphics.RectF");
    }
}
