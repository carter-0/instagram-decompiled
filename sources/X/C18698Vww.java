package X;

import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Vww  reason: case insensitive filesystem */
public abstract class C18698Vww {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r14 == r13) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.RectF A00(android.text.Layout r6, float r7, float r8, float r9, float r10, float r11, float r12, int r13, int r14, int r15, int r16, int r17, boolean r18, boolean r19) {
        /*
            r3 = r16
            r1 = r17
            if (r19 == 0) goto L_0x004d
            if (r15 != r13) goto L_0x0048
            java.lang.CharSequence r0 = r6.getText()
            int r0 = r0.length()
            if (r1 <= r0) goto L_0x0013
            r1 = r0
        L_0x0013:
            float r2 = r6.getPrimaryHorizontal(r1)
        L_0x0017:
            if (r14 != r13) goto L_0x0067
        L_0x0019:
            float r5 = r6.getPrimaryHorizontal(r3)
        L_0x001d:
            int r0 = r6.getLineTop(r13)
            float r4 = (float) r0
            int r0 = r6.getLineBaseline(r13)
            float r3 = (float) r0
            int r0 = r6.getLineBottom(r13)
            float r1 = (float) r0
            int r0 = r6.getLineCount()
            int r0 = r0 + -1
            if (r13 >= r0) goto L_0x0037
            float r1 = r1 - r4
            float r1 = r1 / r12
            float r1 = r1 + r4
        L_0x0037:
            float r2 = r2 - r7
            float r4 = r4 - r8
            float r5 = r5 + r9
            if (r18 != 0) goto L_0x003e
            float r3 = r1 + r10
        L_0x003e:
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r2, r4, r5, r3)
            float r0 = -r11
            r1.offset(r0, r0)
            return r1
        L_0x0048:
            float r2 = r6.getLineLeft(r13)
            goto L_0x0017
        L_0x004d:
            if (r14 != r13) goto L_0x0062
            float r2 = r6.getPrimaryHorizontal(r3)
        L_0x0053:
            if (r15 != r13) goto L_0x0067
            java.lang.CharSequence r0 = r6.getText()
            int r0 = r0.length()
            r3 = r1
            if (r1 <= r0) goto L_0x0019
            r3 = r0
            goto L_0x0019
        L_0x0062:
            float r2 = r6.getLineLeft(r13)
            goto L_0x0053
        L_0x0067:
            float r5 = r6.getLineRight(r13)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18698Vww.A00(android.text.Layout, float, float, float, float, float, float, int, int, int, int, int, boolean, boolean):android.graphics.RectF");
    }

    public static final ArrayList A01(Layout layout, float f, float f2, float f3, float f4, float f5, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = A02(layout, f2, f3, f4, f5, 1.0f, i, i2).iterator();
        while (it.hasNext()) {
            RectF rectF = (RectF) it.next();
            C306506Mk r4 = new C306506Mk();
            r4.A02(rectF.left, rectF.top);
            float f6 = rectF.right;
            float tan = (float) Math.tan(Math.toRadians(0.0d));
            r4.A01(f6 + (f * tan), rectF.top);
            r4.A01(rectF.right, rectF.bottom);
            r4.A01(rectF.left + (f * -1.0f * tan), rectF.bottom);
            r4.A00();
            arrayList.add(r4);
        }
        return arrayList;
    }

    public static final ArrayList A02(Layout layout, float f, float f2, float f3, float f4, float f5, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Layout layout2 = layout;
        int lineCount = layout2.getLineCount();
        for (int i3 = 0; i3 < lineCount; i3++) {
            int i4 = i;
            int lineForOffset = layout2.getLineForOffset(i4);
            int i5 = i2;
            int lineForOffset2 = layout2.getLineForOffset(i5);
            if (lineForOffset <= i3 && i3 <= lineForOffset2 && !TextUtils.isEmpty(00p.A0g(C13990Tnq.A0a(layout2, i3), "\n", "", false))) {
                int i6 = lineForOffset2;
                int i7 = i4;
                int i8 = i3;
                int i9 = lineForOffset;
                RectF A00 = A00(layout2, f, f2, f3, f4, 0.0f, f5, i8, i9, i6, i7, i5, false, 0mk.A03(layout2.getText().toString()));
                if (A00.width() > f + f3) {
                    arrayList.add(A00);
                }
            }
        }
        return arrayList;
    }
}
