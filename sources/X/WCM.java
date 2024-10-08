package X;

import android.view.ViewTreeObserver;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

public final class WCM implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ IUM A03;

    public WCM(UserSession userSession, ImageUrl imageUrl, 1Xj r3, IUM ium) {
        this.A03 = ium;
        this.A02 = r3;
        this.A00 = userSession;
        this.A01 = imageUrl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
            r10 = this;
            X.IUM r0 = r10.A03
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r0.A0P
            X.C13988Tno.A12(r2, r10)
            X.1Xj r4 = r10.A02
            X.1Xy r0 = r4.A0C
            X.3lZ r0 = r0.getInjected()
            r7 = 0
            if (r0 == 0) goto L_0x00f2
            X.3xr r0 = r0.BEi()
            if (r0 == 0) goto L_0x00f2
            java.lang.Float r1 = r0.AhU()
            java.lang.Float r3 = r0.AhS()
        L_0x0020:
            X.1Xy r0 = r4.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x00ef
            X.3xs r0 = r0.BEj()
            if (r0 == 0) goto L_0x00ef
            java.lang.Float r7 = r0.AhU()
            java.lang.Float r6 = r0.AhS()
        L_0x0036:
            if (r1 == 0) goto L_0x009b
            if (r3 == 0) goto L_0x009b
            int r8 = r2.getHeight()
            float r1 = r1.floatValue()
            float r0 = r3.floatValue()
        L_0x0046:
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            double r4 = (double) r1
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r6 - r4
            float r3 = (float) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            double r4 = r4 - r6
            float r3 = (float) r4
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r0
        L_0x0059:
            r1 = -1110651699(0xffffffffbdcccccd, float:-0.1)
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r5 = X.C229632nm.A02(r3, r1, r0)
            float r0 = (float) r8
        L_0x0064:
            float r5 = r5 * r0
        L_0x0065:
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            if (r1 == 0) goto L_0x0099
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r2.setScaleType(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r10.A01
            int r4 = r0.getWidth()
            int r5 = r0.getHeight()
            int r6 = r2.getWidth()
            int r7 = r2.getHeight()
            r8 = 0
            boolean r0 = X.1MF.A02
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r9 = r8
            X.1MF.A0J(r3, r4, r5, r6, r7, r8, r9)
            float r1 = r1.floatValue()
            r0 = 0
            r3.postTranslate(r1, r0)
            r2.setImageMatrix(r3)
        L_0x0099:
            r0 = 1
            return r0
        L_0x009b:
            if (r7 == 0) goto L_0x0099
            if (r6 == 0) goto L_0x0099
            com.instagram.common.session.UserSession r4 = r10.A00
            X.0Tu r3 = X.0Tu.A06
            r0 = 36312887644063233(0x81026100cb0601, double:3.027754594143121E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00bb
            int r8 = r2.getHeight()
            float r1 = r7.floatValue()
            float r0 = r6.floatValue()
            goto L_0x0046
        L_0x00bb:
            int r1 = r2.getHeight()
            int r0 = r2.getWidth()
            int r1 = r1 - r0
            float r5 = X.C13988Tno.A01(r1)
            float r4 = r7.floatValue()
            r3 = 1063675494(0x3f666666, float:0.9)
            r1 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00df
            float r0 = r6.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00df
            goto L_0x0065
        L_0x00df:
            float r0 = r6.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0099
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0099
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0064
        L_0x00ef:
            r6 = r7
            goto L_0x0036
        L_0x00f2:
            r1 = r7
            r3 = r7
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WCM.onPreDraw():boolean");
    }
}
