package X;

import android.graphics.RectF;
import java.util.Iterator;

public abstract class AEJ {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r14.A0R != true) goto L_0x0008;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Point A00(com.instagram.common.session.UserSession r12, X.C366688pV r13, X.AnonymousClass8PW r14, X.C349307zv r15) {
        /*
            r2 = 1
            if (r14 == 0) goto L_0x0008
            boolean r1 = r14.A0R
            r0 = 1
            if (r1 == r2) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            r4 = 0
            if (r0 != 0) goto L_0x001a
            if (r13 == 0) goto L_0x001b
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r13.A01
            if (r0 == 0) goto L_0x001b
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r0.A08
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            return r4
        L_0x001b:
            int r1 = r15.A0B
            if (r1 <= 0) goto L_0x012a
            int r0 = r15.A0A
            if (r0 <= 0) goto L_0x012a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x002b:
            int r5 = r1.intValue()
            int r3 = r0.intValue()
            float r6 = (float) r5
            float r0 = (float) r3
            float r6 = r6 / r0
            r2 = 0
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x004a
            X.0Tu r7 = X.0Tu.A05
            r0 = 36328761830096460(0x8110d100033e4c, double:3.03779349331075E-306)
            boolean r0 = X.182.A06(r7, r12, r0)
            if (r0 == 0) goto L_0x0080
        L_0x004a:
            if (r14 == 0) goto L_0x011d
            int r1 = r14.A01
            if (r1 <= 0) goto L_0x011d
            int r0 = r14.A00
            if (r0 <= 0) goto L_0x011d
            float r7 = (float) r1
            float r0 = (float) r0
            float r7 = r7 / r0
        L_0x0057:
            float r7 = r7 / r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = r6 - r7
            r13 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r13
            r0 = 0
            float r7 = r7 + r1
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r0, r1, r6, r7)
            android.graphics.RectF r7 = X.AnonymousClass7TE.A0Y()
            if (r14 == 0) goto L_0x0156
            java.util.List r0 = r14.A0F
            if (r0 == 0) goto L_0x0081
            java.util.Iterator r1 = r0.iterator()
        L_0x0074:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0081
            boolean r0 = A02(r7, r4, r1)
            if (r0 == 0) goto L_0x0074
        L_0x0080:
            return r2
        L_0x0081:
            java.util.LinkedHashMap r0 = r14.A09
            if (r0 == 0) goto L_0x00cf
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L_0x00cf
            java.util.Iterator r12 = r0.iterator()
        L_0x008f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r12.next()
            java.util.NavigableSet r0 = (java.util.NavigableSet) r0
            java.util.Iterator r11 = r0.iterator()
            X.0qQ.A07(r11)
        L_0x00a2:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r10 = r11.next()
            X.5Eq r10 = (X.C282765Eq) r10
            float r9 = r10.A03
            float r8 = r10.A08
            float r8 = r8 / r13
            float r0 = r9 - r8
            r7.left = r0
            float r6 = r10.A05
            float r1 = r10.A07
            float r1 = r1 / r13
            float r0 = r6 - r1
            r7.top = r0
            float r9 = r9 + r8
            r7.right = r9
            float r6 = r6 + r1
            r7.bottom = r6
            float r0 = r10.A09
            boolean r0 = A01(r7, r4, r0)
            if (r0 == 0) goto L_0x00a2
            return r2
        L_0x00cf:
            java.util.List r0 = r14.A0E
            if (r0 == 0) goto L_0x00e4
            java.util.Iterator r1 = r0.iterator()
        L_0x00d7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e4
            boolean r0 = A02(r7, r4, r1)
            if (r0 == 0) goto L_0x00d7
            return r2
        L_0x00e4:
            boolean r0 = r14.A00()
            if (r0 == 0) goto L_0x0118
            X.8Oe r0 = r14.A07
            r0.getClass()
            java.util.List r0 = r0.A00
        L_0x00f1:
            java.util.Iterator r6 = r0.iterator()
        L_0x00f5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r0 = r6.next()
            X.VZx r0 = (X.C17544VZx) r0
            X.VzF r0 = r0.A02
            android.graphics.PointF r0 = r0.A04
            float r1 = r0.y
            int r0 = r14.A00
            float r0 = (float) r0
            float r1 = r1 / r0
            float r0 = r4.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0080
            float r0 = r4.bottom
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f5
            return r2
        L_0x0118:
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00f1
        L_0x011d:
            r7 = 1058013184(0x3f100000, float:0.5625)
            java.lang.String r1 = "VideoDimensionsUtil#createCustomVideoDimensions_visual_info_is_null"
            X.0sm r0 = X.0Yt.A0E()
            X.0kD.A0I(r1, r4, r0)
            goto L_0x0057
        L_0x012a:
            int r3 = r15.A0K
            int r2 = r15.A08
            android.graphics.Rect r1 = r15.A01()
            if (r1 == 0) goto L_0x013e
            int r3 = r1.right
            int r0 = r1.left
            int r3 = r3 - r0
            int r2 = r1.bottom
            int r0 = r1.top
            int r2 = r2 - r0
        L_0x013e:
            int r1 = r15.A09
            r0 = 90
            if (r1 == r0) goto L_0x0154
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 == r0) goto L_0x0154
            r0 = r3
            r3 = r2
        L_0x014a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x002b
        L_0x0154:
            r0 = r2
            goto L_0x014a
        L_0x0156:
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r5, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEJ.A00(com.instagram.common.session.UserSession, X.8pV, X.8PW, X.7zv):android.graphics.Point");
    }

    public static boolean A02(RectF rectF, RectF rectF2, Iterator it) {
        C255783ui r5 = (C255783ui) it.next();
        float f = r5.A03;
        float f2 = r5.A02 / 2.0f;
        rectF.left = f - f2;
        float f3 = r5.A04;
        float f4 = r5.A00 / 2.0f;
        rectF.top = f3 - f4;
        rectF.right = f + f2;
        rectF.bottom = f3 + f4;
        return A01(rectF, rectF2, r5.A01);
    }

    public static final boolean A01(RectF rectF, RectF rectF2, float f) {
        double d = (double) f;
        float centerY = rectF.centerY();
        float abs = (Math.abs(rectF.height() * ((float) Math.cos(d))) + Math.abs(rectF.width() * ((float) Math.sin(d)))) / 2.0f;
        float f2 = centerY - abs;
        float f3 = centerY + abs;
        if (f2 < rectF2.top || f3 > rectF2.bottom) {
            return true;
        }
        return false;
    }
}
