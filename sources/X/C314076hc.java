package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.6hc  reason: invalid class name and case insensitive filesystem */
public final class C314076hc extends C255963v0 {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public final float A04;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E3E(android.view.View r11, com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r12, float r13, int r14) {
        /*
            r10 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            double r0 = (double) r13
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = -4587338432941916160(0xc056800000000000, double:-90.0)
            r8 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r0 = X.AnonymousClass37Q.A04(r0, r2, r4, r6, r8)
            float r4 = (float) r0
            float r0 = r11.getCameraDistance()
            float r1 = r10.A04
            r5 = 1
            r2 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002b
            r11.setCameraDistance(r1)
        L_0x002b:
            int r0 = r10.A03
            if (r0 == 0) goto L_0x0033
            int r0 = r10.A02
            if (r0 != 0) goto L_0x0049
        L_0x0033:
            int r0 = r12.getWidth()
            r10.A03 = r0
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r10.A01 = r0
            int r0 = r12.getHeight()
            r10.A02 = r0
            float r0 = (float) r0
            float r0 = r0 / r1
            r10.A00 = r0
        L_0x0049:
            float r0 = java.lang.Math.abs(r13)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bc
            int r0 = r10.A03
            float r0 = (float) r0
            float r0 = r0 * r13
            r11.setTranslationX(r0)
        L_0x005a:
            r1 = 0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0088
            r11.setRotationY(r4)
            r11.setPivotX(r1)
        L_0x0069:
            float r0 = r11.getPivotY()
            float r1 = r10.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            r11.setPivotY(r1)
        L_0x0076:
            r1 = 2
            int r0 = r11.getLayerType()
            if (r0 == r1) goto L_0x0081
            r0 = 0
            r11.setLayerType(r1, r0)
        L_0x0081:
            if (r5 != 0) goto L_0x0084
            r2 = 4
        L_0x0084:
            r11.setVisibility(r2)
            return
        L_0x0088:
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x009c
            r11.setRotationY(r4)
            int r0 = r10.A03
            float r0 = (float) r0
            r11.setPivotX(r0)
            goto L_0x0069
        L_0x009c:
            r11.setRotationY(r1)
            float r0 = r10.A01
            r11.setPivotX(r0)
            float r0 = r11.getPivotY()
            float r1 = r10.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b1
            r11.setPivotY(r1)
        L_0x00b1:
            int r0 = r11.getLayerType()
            if (r0 == r2) goto L_0x0081
            r0 = 0
            r11.setLayerType(r2, r0)
            goto L_0x0081
        L_0x00bc:
            r5 = 0
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314076hc.E3E(android.view.View, com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager, float, int):void");
    }

    public final boolean FHR(ReboundViewPager reboundViewPager, float f, float f2) {
        return true;
    }

    public C314076hc(float f) {
        this.A04 = f;
    }
}
