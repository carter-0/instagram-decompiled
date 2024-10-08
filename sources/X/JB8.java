package X;

import android.content.Context;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

public final class JB8 extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ ImageView A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C255773uh A04;
    public final /* synthetic */ C255783ui A05;
    public final /* synthetic */ C309426Yf A06;
    public final /* synthetic */ C309736Zk A07;
    public final /* synthetic */ 0sL A08;
    public final /* synthetic */ 0rm A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JB8(Context context, ImageView imageView, UserSession userSession, C255773uh r5, C255783ui r6, C309426Yf r7, C309736Zk r8, 0sL r9, 0rm r10, int i) {
        super(2);
        this.A03 = userSession;
        this.A06 = r7;
        this.A00 = i;
        this.A07 = r8;
        this.A05 = r6;
        this.A01 = context;
        this.A02 = imageView;
        this.A09 = r10;
        this.A08 = r9;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0097, code lost:
        if (new android.graphics.RectF(java.lang.Math.max((float) r3.left, ((float) r3.centerX()) - (X.C51965G9l.A00(r8, r4, 37158334765662284L) * r11)), (float) r3.top, java.lang.Math.min((float) r3.right, ((float) r3.centerX()) + (r11 * X.C51965G9l.A00(r8, r4, 37158334765924431L))), (float) r3.bottom).contains(r13, r12) != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0101, code lost:
        if (X.AnonymousClass000.A00(4621).equals(r3.CHl()) == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0128, code lost:
        if (r3 != false) goto L_0x012a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20) {
        /*
            r18 = this;
            r9 = r20
            r5 = r19
            android.view.View r5 = (android.view.View) r5
            android.view.MotionEvent r9 = (android.view.MotionEvent) r9
            r7 = 0
            X.0qQ.A0B(r5, r7)
            r6 = r18
            com.instagram.common.session.UserSession r4 = r6.A03
            X.6Yf r10 = r6.A06
            boolean r0 = X.C309506Yn.A0C(r4, r10)
            if (r0 != 0) goto L_0x0099
            int r11 = r6.A00
            r14 = 1
            if (r9 == 0) goto L_0x00e2
            X.0Tu r8 = X.0Tu.A05
            r0 = 36313909835729202(0x81034f002a0932, double:3.028401032268715E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r0 == 0) goto L_0x00e2
            long r2 = r10.A0O
            double r0 = (double) r2
            r15 = 0
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r12 <= 0) goto L_0x00e2
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r2
            double r2 = (double) r0
            r0 = 36595384812832908(0x82034f0030088c, double:3.2064069411978577E-306)
            int r0 = X.DbS.A04(r8, r4, r0)
            double r0 = (double) r0
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 < 0) goto L_0x00e2
            float r13 = r9.getX()
            float r12 = r9.getY()
            android.graphics.Rect r3 = X.AnonymousClass7TE.A0W()
            r5.getHitRect(r3)
            r3.offsetTo(r7, r7)
            int r0 = r3.centerX()
            float r2 = (float) r0
            float r11 = (float) r11
            r0 = 37158334765662284(0x84034f0027004c, double:3.562418758184667E-306)
            float r0 = X.C51965G9l.A00(r8, r4, r0)
            float r0 = r0 * r11
            float r2 = r2 - r0
            int r0 = r3.centerX()
            float r15 = (float) r0
            r0 = 37158334765924431(0x84034f002b004f, double:3.56241875835045E-306)
            float r0 = X.C51965G9l.A00(r8, r4, r0)
            float r11 = r11 * r0
            float r15 = r15 + r11
            int r0 = r3.left
            float r0 = (float) r0
            float r8 = java.lang.Math.max(r0, r2)
            int r0 = r3.top
            float r2 = (float) r0
            int r0 = r3.right
            float r0 = (float) r0
            float r11 = java.lang.Math.min(r0, r15)
            int r0 = r3.bottom
            float r1 = (float) r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r8, r2, r11, r1)
            boolean r0 = r0.contains(r13, r12)
            if (r0 == 0) goto L_0x00e2
        L_0x0099:
            X.6Zk r1 = r6.A07
            X.3ui r0 = r6.A05
            boolean r8 = r1.DJ9(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313909835335984(0x81034f00240930, double:3.0284010320200425E-306)
            boolean r1 = X.182.A06(r2, r4, r0)
            r0 = 0
            if (r1 == 0) goto L_0x00de
            r5.setOnTouchListener(r0)
        L_0x00b2:
            android.content.Context r11 = r6.A01
            X.0qQ.A0A(r11)
            android.widget.ImageView r7 = r6.A02
            X.0qQ.A0A(r7)
            X.0rm r0 = r6.A09
            java.lang.Object r3 = r0.A00
            android.view.View r3 = (android.view.View) r3
            X.0sL r2 = r6.A08
            r1 = 21
            X.JFv r0 = new X.JFv
            r0.<init>(r2, r1)
            r16 = r10
            r17 = r0
            r13 = r7
            r14 = r3
            r15 = r4
            r12 = r5
            X.AnonymousClass6MZ.A00(r11, r12, r13, r14, r15, r16, r17)
            if (r8 != 0) goto L_0x00db
            r2.invoke(r5, r9)
        L_0x00db:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00de:
            r5.setOnClickListener(r0)
            goto L_0x00b2
        L_0x00e2:
            X.3uh r0 = r6.A04
            X.1Xj r2 = r0.A0b
            android.content.Context r5 = r6.A01
            X.0qQ.A0A(r5)
            r8 = 0
            com.instagram.model.androidlink.AndroidLink r3 = X.AnonymousClass47K.A02(r5, r4, r2, r7, r7)
            if (r3 == 0) goto L_0x0103
            java.lang.String r1 = r3.CHl()
            r0 = 4621(0x120d, float:6.475E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r1)
            r11 = 1
            if (r0 != 0) goto L_0x0104
        L_0x0103:
            r11 = 0
        L_0x0104:
            boolean r10 = X.C270804hK.A02(r3)
            if (r3 == 0) goto L_0x019b
            X.47L r1 = X.C271714jT.A01(r3)
        L_0x010e:
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_DIRECT_MESSAGE
            boolean r7 = X.AnonymousClass7TF.A1W(r1, r0)
            if (r3 == 0) goto L_0x0199
            X.47L r1 = X.C271714jT.A01(r3)
        L_0x011a:
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_JOIN_CHANNEL
            boolean r3 = X.AnonymousClass7TF.A1W(r1, r0)
            r1 = 0
            if (r11 != 0) goto L_0x012a
            if (r10 != 0) goto L_0x012a
            if (r7 != 0) goto L_0x012a
            r0 = 0
            if (r3 == 0) goto L_0x012b
        L_0x012a:
            r0 = 1
        L_0x012b:
            if (r2 == 0) goto L_0x0131
            boolean r1 = r2.A5n()
        L_0x0131:
            if (r0 == 0) goto L_0x0155
            if (r1 != 0) goto L_0x0155
            X.0Tu r2 = X.0Tu.A05
            r0 = 36602488685597320(0x8209c500001288, double:3.2108994589390714E-306)
            int r0 = X.DbS.A04(r2, r4, r0)
            if (r0 != r14) goto L_0x0155
            if (r3 != 0) goto L_0x0148
            X.3ui r0 = r6.A05
            r0.A1N = r8
        L_0x0148:
            if (r11 == 0) goto L_0x0184
            r0 = 2131971727(0x7f134e8f, float:1.9580441E38)
        L_0x014d:
            java.lang.String r1 = X.C51967G9n.A0p(r5, r0)
            X.3ui r0 = r6.A05
            r0.A1R = r1
        L_0x0155:
            if (r9 == 0) goto L_0x017d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313909835204910(0x81034f0022092e, double:3.028401031937151E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x016c
            X.3ui r1 = r6.A05
            float r0 = r9.getRawX()
            r1.A03 = r0
        L_0x016c:
            float r1 = r9.getRawX()
            float r0 = r9.getRawY()
        L_0x0174:
            X.6Zk r3 = r6.A07
            X.3ui r2 = r6.A05
            r3.D7L(r2, r1, r0)
            goto L_0x00db
        L_0x017d:
            X.3ui r0 = r6.A05
            float r1 = r0.A03
            float r0 = r0.A04
            goto L_0x0174
        L_0x0184:
            if (r10 == 0) goto L_0x018a
            r0 = 2131971728(0x7f134e90, float:1.9580444E38)
            goto L_0x014d
        L_0x018a:
            if (r7 == 0) goto L_0x0190
            r0 = 2131971726(0x7f134e8e, float:1.958044E38)
            goto L_0x014d
        L_0x0190:
            r0 = 2131971771(0x7f134ebb, float:1.958053E38)
            if (r3 == 0) goto L_0x014d
            r0 = 2131971729(0x7f134e91, float:1.9580446E38)
            goto L_0x014d
        L_0x0199:
            r1 = 0
            goto L_0x011a
        L_0x019b:
            r1 = 0
            goto L_0x010e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JB8.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
