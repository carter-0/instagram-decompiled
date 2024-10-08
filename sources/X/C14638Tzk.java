package X;

import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.smartcapture.ui.view.FaceCaptureProgressView;

/* renamed from: X.Tzk  reason: case insensitive filesystem */
public final class C14638Tzk extends Property {
    public final int A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: X.UWM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: X.UWN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: X.UWM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: X.UWM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: X.UWM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: X.UWM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: X.UWM} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a3, code lost:
        X.C17158VKk.A02.A05(r1, r2, r3, r4, r5);
        r6.A05 = 0;
        r6.A01 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0169, code lost:
        X.C17158VKk.A02.A05(r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x016e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
        r6.A00.invalidateSelf();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void set(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            r6 = r12
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0113;
                case 1: goto L_0x005a;
                case 2: goto L_0x007f;
                case 3: goto L_0x011d;
                case 4: goto L_0x0136;
                case 5: goto L_0x014f;
                case 6: goto L_0x016f;
                case 7: goto L_0x017b;
                case 8: goto L_0x0183;
                case 9: goto L_0x00ae;
                default: goto L_0x0006;
            }
        L_0x0006:
            X.UWN r6 = (X.UWN) r6
            float r1 = X.AnonymousClass7TE.A04(r13)
            r6.A00 = r1
            r0 = 1155596288(0x44e10000, float:1800.0)
            float r1 = r1 * r0
            int r5 = (int) r1
            r4 = 0
        L_0x0013:
            int[] r0 = X.UWN.A09
            r1 = r0[r4]
            int[] r0 = X.UWN.A0A
            r2 = r0[r4]
            int r0 = r5 - r1
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
            android.view.animation.Interpolator[] r0 = r6.A07
            r0 = r0[r4]
            float r3 = r0.getInterpolation(r1)
            float[] r2 = r6.A01
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.Pxi.A01(r0, r3, r1)
            r2[r4] = r0
            int r4 = r4 + 1
            r0 = 4
            if (r4 < r0) goto L_0x0013
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0054
            int[] r2 = r6.A02
            X.6Xq r0 = r6.A06
            int[] r1 = r0.A05
            int r0 = r6.A01
            r1 = r1[r0]
            X.6Y1 r0 = r6.A00
            int r0 = r0.A01
            int r0 = X.C18108Vlc.A01(r1, r0)
            java.util.Arrays.fill(r2, r0)
            r0 = 0
            r6.A05 = r0
        L_0x0054:
            X.6Y1 r0 = r6.A00
            r0.invalidateSelf()
        L_0x0059:
            return
        L_0x005a:
            X.Vax r6 = (X.C17605Vax) r6
            android.graphics.PointF r13 = (android.graphics.PointF) r13
            float r0 = r13.x
            int r2 = java.lang.Math.round(r0)
            r6.A02 = r2
            float r0 = r13.y
            int r3 = java.lang.Math.round(r0)
            r6.A04 = r3
            int r0 = r6.A05
            int r1 = r0 + 1
            r6.A05 = r1
            int r0 = r6.A01
            if (r1 != r0) goto L_0x0059
            android.view.View r1 = r6.A06
            int r4 = r6.A03
            int r5 = r6.A00
            goto L_0x00a3
        L_0x007f:
            X.Vax r6 = (X.C17605Vax) r6
            android.graphics.PointF r13 = (android.graphics.PointF) r13
            float r0 = r13.x
            int r4 = java.lang.Math.round(r0)
            r6.A03 = r4
            float r0 = r13.y
            int r5 = java.lang.Math.round(r0)
            r6.A00 = r5
            int r0 = r6.A01
            int r1 = r0 + 1
            r6.A01 = r1
            int r0 = r6.A05
            if (r0 != r1) goto L_0x0059
            android.view.View r1 = r6.A06
            int r2 = r6.A02
            int r3 = r6.A04
        L_0x00a3:
            X.V4c r0 = X.C17158VKk.A02
            r0.A05(r1, r2, r3, r4, r5)
            r0 = 0
            r6.A05 = r0
            r6.A01 = r0
            return
        L_0x00ae:
            X.UWM r6 = (X.UWM) r6
            float r1 = X.AnonymousClass7TE.A04(r13)
            r6.A00 = r1
            r0 = 1134985216(0x43a68000, float:333.0)
            float r1 = r1 * r0
            int r2 = (int) r1
            float[] r3 = r6.A01
            r1 = 0
            r0 = 0
            r3[r0] = r1
            float r4 = (float) r2
            r0 = 1143390208(0x4426c000, float:667.0)
            float r4 = r4 / r0
            X.61i r2 = r6.A03
            float r1 = r2.getInterpolation(r4)
            r0 = 2
            r3[r0] = r1
            r0 = 1
            r3[r0] = r1
            r0 = 1056939455(0x3eff9dbf, float:0.49925038)
            float r4 = r4 + r0
            float r1 = r2.getInterpolation(r4)
            r0 = 4
            r3[r0] = r1
            r0 = 3
            r3[r0] = r1
            r0 = 5
            r1 = 1065353216(0x3f800000, float:1.0)
            r3[r0] = r1
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x0054
            r0 = 3
            r0 = r3[r0]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0054
            int[] r3 = r6.A02
            r2 = 2
            r1 = 1
            r0 = r3[r1]
            r3[r2] = r0
            r2 = 0
            r0 = r3[r2]
            r3[r1] = r0
            X.6Xq r0 = r6.A05
            int[] r1 = r0.A05
            int r0 = r6.A01
            r1 = r1[r0]
            X.6Y1 r0 = r6.A00
            int r0 = r0.A01
            int r0 = X.C18108Vlc.A01(r1, r0)
            r3[r2] = r0
            r6.A04 = r2
            goto L_0x0054
        L_0x0113:
            androidx.appcompat.widget.SwitchCompat r6 = (androidx.appcompat.widget.SwitchCompat) r6
            float r0 = X.AnonymousClass7TE.A04(r13)
            r6.setThumbPosition(r0)
            return
        L_0x011d:
            android.view.View r6 = (android.view.View) r6
            android.graphics.PointF r13 = (android.graphics.PointF) r13
            int r7 = r6.getLeft()
            int r8 = r6.getTop()
            float r0 = r13.x
            int r9 = java.lang.Math.round(r0)
            float r0 = r13.y
            int r10 = java.lang.Math.round(r0)
            goto L_0x0169
        L_0x0136:
            android.view.View r6 = (android.view.View) r6
            android.graphics.PointF r13 = (android.graphics.PointF) r13
            float r0 = r13.x
            int r7 = java.lang.Math.round(r0)
            float r0 = r13.y
            int r8 = java.lang.Math.round(r0)
            int r9 = r6.getRight()
            int r10 = r6.getBottom()
            goto L_0x0169
        L_0x014f:
            android.view.View r6 = (android.view.View) r6
            android.graphics.PointF r13 = (android.graphics.PointF) r13
            float r0 = r13.x
            int r7 = java.lang.Math.round(r0)
            float r0 = r13.y
            int r8 = java.lang.Math.round(r0)
            int r9 = r6.getWidth()
            int r9 = r9 + r7
            int r10 = r6.getHeight()
            int r10 = r10 + r8
        L_0x0169:
            X.V4c r5 = X.C17158VKk.A02
            r5.A05(r6, r7, r8, r9, r10)
            return
        L_0x016f:
            android.view.View r6 = (android.view.View) r6
            float r1 = X.AnonymousClass7TE.A04(r13)
            X.V4c r0 = X.C17158VKk.A02
            r0.A03(r6, r1)
            return
        L_0x017b:
            android.view.View r6 = (android.view.View) r6
            android.graphics.Rect r13 = (android.graphics.Rect) r13
            r6.setClipBounds(r13)
            return
        L_0x0183:
            com.facebook.smartcapture.ui.view.FaceCaptureProgressView r6 = (com.facebook.smartcapture.ui.view.FaceCaptureProgressView) r6
            float r1 = X.AnonymousClass7TE.A04(r13)
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r6.setDrawingAlpha(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14638Tzk.set(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14638Tzk(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0012;
                case 2: goto L_0x0017;
                case 3: goto L_0x0017;
                case 4: goto L_0x0012;
                case 5: goto L_0x001c;
                case 6: goto L_0x0021;
                case 7: goto L_0x0026;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "animationFraction"
        L_0x0009:
            r2.<init>(r1, r0)
            return
        L_0x000d:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "thumbPos"
            goto L_0x0009
        L_0x0012:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "topLeft"
            goto L_0x0009
        L_0x0017:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "bottomRight"
            goto L_0x0009
        L_0x001c:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "position"
            goto L_0x0009
        L_0x0021:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "translationAlpha"
            goto L_0x0009
        L_0x0026:
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            java.lang.String r0 = "clipBounds"
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14638Tzk.<init>(int):void");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        float f;
        switch (this.A00) {
            case 0:
                f = ((SwitchCompat) obj).A00;
                break;
            case 6:
                f = C17158VKk.A02.A00((View) obj);
                break;
            case 7:
                return ((View) obj).getClipBounds();
            case 8:
                FaceCaptureProgressView faceCaptureProgressView = (FaceCaptureProgressView) obj;
                0qQ.A0B(faceCaptureProgressView, 0);
                f = faceCaptureProgressView.A00;
                break;
            case 9:
                Property property = UWM.A06;
                f = ((UWM) obj).A00;
                break;
            case 10:
                Property property2 = UWN.A08;
                f = ((UWN) obj).A00;
                break;
            default:
                return null;
        }
        return Float.valueOf(f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14638Tzk(Class cls) {
        super(cls, "drawingAlpha");
        this.A00 = 8;
    }
}
