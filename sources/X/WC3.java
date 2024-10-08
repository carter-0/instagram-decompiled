package X;

import android.view.GestureDetector;
import android.view.View;

public final class WC3 implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public WC3(View view, C305836Jt r5, boolean z) {
        this.A00 = 12;
        this.A01 = new GestureDetector(view.getContext(), new C14977UHv(r5, z));
    }

    public static void A00(View view, int i, Object obj) {
        view.setOnTouchListener(new WC3(obj, i));
    }

    /* JADX WARNING: type inference failed for: r0v172, types: [X.8TZ, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x022b, code lost:
        if (r3 != 3) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0355, code lost:
        if (java.lang.Float.isNaN(r2.A01) != false) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0481, code lost:
        return ((android.view.GestureDetector) r10.A01).onTouchEvent(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f9, code lost:
        if (r1 == 0) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0173, code lost:
        if (r0 == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x03db;
                case 1: goto L_0x0370;
                case 2: goto L_0x020a;
                case 3: goto L_0x01bf;
                case 4: goto L_0x04be;
                case 5: goto L_0x0177;
                case 6: goto L_0x0139;
                case 7: goto L_0x00b5;
                case 8: goto L_0x0005;
                case 9: goto L_0x0053;
                case 10: goto L_0x048c;
                case 11: goto L_0x0482;
                case 12: goto L_0x0475;
                case 13: goto L_0x0467;
                case 14: goto L_0x042d;
                case 15: goto L_0x0007;
                case 16: goto L_0x0450;
                case 17: goto L_0x0005;
                case 18: goto L_0x0479;
                case 19: goto L_0x0443;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 1
        L_0x0006:
            return r1
        L_0x0007:
            java.lang.Object r3 = r10.A01
            X.Vjm r3 = (X.C18010Vjm) r3
            java.util.ArrayList r0 = r3.A03
            java.util.Iterator r2 = r0.iterator()
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0036
            android.view.View r1 = X.JTO.A0H(r2)
            boolean r0 = r1 instanceof com.instagram.shopping.widget.clickabletext.ClickableTextContainer
            if (r0 == 0) goto L_0x002a
            com.instagram.shopping.widget.clickabletext.ClickableTextContainer r1 = (com.instagram.shopping.widget.clickabletext.ClickableTextContainer) r1
            X.JTQ.A1K(r12)
            X.5nl r0 = r1.A01
        L_0x0026:
            r0.A02(r12)
            goto L_0x0011
        L_0x002a:
            boolean r0 = r1 instanceof com.instagram.common.ui.touch.TouchOverlayView
            if (r0 == 0) goto L_0x0011
            com.instagram.common.ui.touch.TouchOverlayView r1 = (com.instagram.common.ui.touch.TouchOverlayView) r1
            X.JTQ.A1K(r12)
            X.5nl r0 = r1.A00
            goto L_0x0026
        L_0x0036:
            android.view.GestureDetector r0 = r3.A02
            boolean r0 = r0.onTouchEvent(r12)
            r1 = 0
            if (r0 != 0) goto L_0x0005
            X.0sL r0 = r3.A01
            if (r0 == 0) goto L_0x0006
            X.0qQ.A0A(r11)
            X.0qQ.A0A(r12)
            java.lang.Object r0 = r0.invoke(r11, r12)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            goto L_0x0173
        L_0x0053:
            java.lang.Object r4 = r10.A01
            X.WBN r4 = (X.WBN) r4
            boolean r0 = X.WBN.A06(r4)
            if (r0 == 0) goto L_0x006d
            X.8MF r1 = r4.A0H
            r0 = 0
            r1.D0n(r0)
            android.view.ViewGroup r1 = r4.A04
            r1.getClass()
            r0 = 0
            r1.setOnTouchListener(r0)
            goto L_0x0005
        L_0x006d:
            android.view.View r0 = r4.A03
            X.C18708VyZ.A00(r0)
            X.87F r0 = r4.A0I
            X.8Z5 r1 = r0.A03
            int r0 = r1.A01
            X.AnonymousClass8Z5.A00(r1, r0)
            java.util.List r0 = r4.A0J
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
            r1 = 0
        L_0x0083:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r3.next()
            X.W0K r0 = (X.W0K) r0
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0083
            int r1 = r1 + 1
            goto L_0x0083
        L_0x0098:
            r0 = 2
            if (r1 < r0) goto L_0x009c
            r2 = 1
        L_0x009c:
            android.widget.TextView r1 = r4.A07
            r0 = 2131971250(0x7f134cb2, float:1.9579474E38)
            if (r2 != 0) goto L_0x00a6
            r0 = 2131971244(0x7f134cac, float:1.9579462E38)
        L_0x00a6:
            r1.setText(r0)
            r1 = 1
            android.widget.TextView r0 = r4.A07
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A09(r0, r1)
            goto L_0x0005
        L_0x00b5:
            java.lang.Object r4 = r10.A01
            X.WUv r4 = (X.C19339WUv) r4
            boolean r0 = X.C19339WUv.A04(r4)
            r5 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00dc
            X.80U r2 = r4.A0M
            r1 = 0
            X.8TZ r0 = new X.8TZ
            r0.<init>()
            r0.A00 = r1
            r2.E3H(r0)
            android.view.View r0 = r4.A05
            if (r0 != 0) goto L_0x0134
            java.lang.String r3 = "stickerEditorContainer"
        L_0x00d4:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00dc:
            android.view.View r0 = r4.A06
            if (r0 != 0) goto L_0x00e3
            java.lang.String r3 = "stickerView"
            goto L_0x00d4
        L_0x00e3:
            X.C18708VyZ.A00(r0)
            android.widget.EditText r0 = r4.A07
            if (r0 != 0) goto L_0x00ed
            java.lang.String r3 = "stickerTitleView"
            goto L_0x00d4
        L_0x00ed:
            android.text.Editable r0 = r0.getText()
            r2 = 0
            if (r0 == 0) goto L_0x00fb
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x00fc
        L_0x00fb:
            r0 = 1
        L_0x00fc:
            java.lang.String r3 = "incompleteStickerErrorView"
            if (r0 == 0) goto L_0x0120
            boolean r0 = X.C19339WUv.A05(r4)
            if (r0 == 0) goto L_0x0120
            android.widget.TextView r1 = r4.A08
            if (r1 == 0) goto L_0x00d4
            r0 = 2131956785(0x7f131431, float:1.9550136E38)
        L_0x010d:
            r1.setText(r0)
            android.widget.TextView r0 = r4.A08
            if (r0 == 0) goto L_0x00d4
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A09(r0, r5)
            X.C19339WUv.A02(r4, r2)
            goto L_0x0005
        L_0x0120:
            boolean r0 = X.C19339WUv.A05(r4)
            android.widget.TextView r1 = r4.A08
            if (r0 == 0) goto L_0x012e
            if (r1 == 0) goto L_0x00d4
            r0 = 2131956782(0x7f13142e, float:1.955013E38)
            goto L_0x010d
        L_0x012e:
            if (r1 == 0) goto L_0x00d4
            r0 = 2131956784(0x7f131430, float:1.9550133E38)
            goto L_0x010d
        L_0x0134:
            r0.setOnTouchListener(r3)
            goto L_0x0005
        L_0x0139:
            r0 = 1
            X.0qQ.A0B(r12, r0)
            java.lang.Object r4 = r10.A01
            X.Uh2 r4 = (X.C15696Uh2) r4
            androidx.recyclerview.widget.RecyclerView r2 = r4.A04
            java.lang.String r3 = "Required value was null."
            if (r2 == 0) goto L_0x04dc
            X.3pI r0 = r2.A0D
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            if (r0 == 0) goto L_0x04d6
            int r0 = r0.A1a()
            r1 = 0
            if (r0 > 0) goto L_0x0006
            X.3kE r0 = r2.A0W(r1)
            if (r0 == 0) goto L_0x0006
            android.view.View r0 = r0.itemView
            int r0 = r0.getTop()
            float r2 = r12.getY()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0006
            X.WXB r0 = r4.A05
            if (r0 == 0) goto L_0x04d0
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r0.A06
            boolean r0 = r0.dispatchTouchEvent(r12)
        L_0x0173:
            if (r0 == 0) goto L_0x0006
            goto L_0x0005
        L_0x0177:
            java.lang.Object r5 = r10.A01
            X.WGq r5 = (X.C19015WGq) r5
            X.0qQ.A0A(r12)
            r2 = 1
            r5.A02 = r2
            android.view.GestureDetector r1 = r5.A05
            android.view.MotionEvent r0 = X.C13989Tnp.A0N(r12)
            r1.onTouchEvent(r0)
            int r1 = r12.getActionMasked()
            if (r1 == r2) goto L_0x0195
            r0 = 3
            if (r1 == r0) goto L_0x0195
            goto L_0x0005
        L_0x0195:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0005
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x01ba
            java.util.List r4 = r5.A06
            java.util.Iterator r3 = r4.iterator()
        L_0x01a3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r2 = r3.next()
            X.X7j r2 = (X.X7j) r2
            float r1 = r5.A00
            float r0 = r5.A01
            r2.DAY(r5, r1, r0)
            goto L_0x01a3
        L_0x01b7:
            r4.clear()
        L_0x01ba:
            r0 = 0
            r5.A04 = r0
            goto L_0x0005
        L_0x01bf:
            java.lang.Object r6 = r10.A01
            X.VcK r6 = (X.C17689VcK) r6
            android.widget.LinearLayout r5 = r6.A05
            if (r5 == 0) goto L_0x04e2
            X.0qQ.A0A(r12)
            float r4 = r12.getRawX()
            float r3 = r12.getRawY()
            int r2 = r12.getAction()
            r1 = 1
            if (r2 == 0) goto L_0x01f7
            r0 = 0
            if (r2 == r1) goto L_0x0204
            r1 = 2
            if (r2 != r1) goto L_0x0005
            float r2 = r6.A00
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 == 0) goto L_0x0005
            float r1 = r6.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0005
            float r4 = r4 + r2
            r5.setX(r4)
            float r0 = r6.A01
            float r3 = r3 + r0
            r5.setY(r3)
            goto L_0x0005
        L_0x01f7:
            float r0 = r5.getX()
            float r0 = r0 - r4
            r6.A00 = r0
            float r0 = r5.getY()
            float r0 = r0 - r3
            goto L_0x0206
        L_0x0204:
            r6.A00 = r0
        L_0x0206:
            r6.A01 = r0
            goto L_0x0005
        L_0x020a:
            java.lang.Object r2 = r10.A01
            X.Vcj r2 = (X.C17714Vcj) r2
            int r0 = r12.getAction()
            r1 = 1
            if (r0 != 0) goto L_0x0218
            r0 = 0
            r2.A07 = r0
        L_0x0218:
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x022d
            int r3 = r12.getAction()
            if (r3 == 0) goto L_0x0357
            r7 = 2143289344(0x7fc00000, float:NaN)
            r6 = 0
            if (r3 == r1) goto L_0x02a8
            r0 = 2
            r5 = 3
            if (r3 == r0) goto L_0x023f
            if (r3 == r5) goto L_0x02a8
        L_0x022d:
            android.view.View r2 = r2.A0D
            float r0 = r2.getTranslationY()
            int r0 = (int) r0
            int r0 = java.lang.Math.abs(r0)
            if (r0 != 0) goto L_0x0006
            boolean r1 = r2.dispatchTouchEvent(r12)
            return r1
        L_0x023f:
            float r0 = r2.A01
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x034f
            float r0 = r2.A00
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x034f
            android.view.VelocityTracker r0 = r2.A0B
            r0.addMovement(r12)
            float r3 = r12.getRawY()
            float r0 = r2.A01
            float r3 = r3 - r0
            int r3 = (int) r3
            r12.getRawX()
            java.lang.Integer r9 = r2.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r9 != r0) goto L_0x0266
            int r3 = -r3
        L_0x0266:
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0270
            int r0 = r2.A09
            if (r3 < r0) goto L_0x022d
            r2.A06 = r1
        L_0x0270:
            int r0 = java.lang.Math.max(r6, r3)
            float r3 = (float) r0
            float r0 = r2.A02
            float r3 = r3 / r0
            int r3 = (int) r3
            android.view.View r4 = r2.A0D
            int r0 = r4.getHeight()
            int r0 = r0 / r5
            if (r3 < r0) goto L_0x0335
            float r8 = r12.getY()
            android.view.View r0 = r2.A0C
            int r0 = r0.getTop()
            float r0 = (float) r0
            float r8 = r8 + r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r9 != r0) goto L_0x02a2
            int r0 = r4.getHeight()
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0335
        L_0x029b:
            r2.A06 = r6
            r2.A01 = r7
            r2.A00 = r7
            goto L_0x02e9
        L_0x02a2:
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0335
            goto L_0x029b
        L_0x02a8:
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x022d
            r2.A06 = r6
            r2.A01 = r7
            r2.A00 = r7
            android.view.VelocityTracker r3 = r2.A0B
            r0 = 1000(0x3e8, float:1.401E-42)
            r3.computeCurrentVelocity(r0)
            float r7 = r3.getYVelocity()
            java.lang.Integer r3 = r2.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 != r0) goto L_0x02c4
            float r7 = -r7
        L_0x02c4:
            android.view.View r4 = r2.A0D
            float r0 = r4.getTranslationY()
            int r0 = (int) r0
            int r5 = java.lang.Math.abs(r0)
            int r0 = r4.getHeight()
            int r3 = r0 / 5
            java.lang.Float r0 = r2.A04
            if (r0 == 0) goto L_0x02e1
            float r0 = r0.floatValue()
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02e9
        L_0x02e1:
            if (r5 < r3) goto L_0x0311
            float r0 = r2.A08
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0311
        L_0x02e9:
            r2.A07 = r1
            float[] r3 = new float[r1]
            int r0 = r4.getHeight()
            float r0 = (float) r0
            r3[r6] = r0
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r4, r0, r3)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r5.setInterpolator(r0)
            r3 = 250(0xfa, double:1.235E-321)
            r5.setDuration(r3)
            android.animation.Animator$AnimatorListener r0 = r2.A0A
            r5.addListener(r0)
        L_0x030c:
            r5.start()
            goto L_0x022d
        L_0x0311:
            float r0 = r4.getTranslationY()
            int r0 = (int) r0
            int r0 = java.lang.Math.abs(r0)
            if (r0 == 0) goto L_0x022d
            float[] r3 = new float[r1]
            r0 = 0
            r3[r6] = r0
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r4, r0, r3)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r5.setInterpolator(r0)
            r3 = 250(0xfa, double:1.235E-321)
            r5.setDuration(r3)
            goto L_0x030c
        L_0x0335:
            float r0 = r4.getTranslationY()
            int r0 = (int) r0
            int r0 = java.lang.Math.abs(r0)
            if (r3 <= 0) goto L_0x034b
            if (r0 != 0) goto L_0x034b
            r4.dispatchTouchEvent(r12)
            r12.setAction(r5)
            r4.dispatchTouchEvent(r12)
        L_0x034b:
            float r0 = (float) r3
            r4.setTranslationY(r0)
        L_0x034f:
            float r0 = r2.A01
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x022d
        L_0x0357:
            r0 = 0
            r2.A06 = r0
            float r0 = r12.getRawY()
            r2.A01 = r0
            float r0 = r12.getRawX()
            r2.A00 = r0
            android.view.VelocityTracker r0 = r2.A0B
            r0.clear()
            r0.addMovement(r12)
            goto L_0x022d
        L_0x0370:
            int r0 = r12.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x0006
            java.lang.Object r6 = r10.A01
            com.instagram.maps.ui.IgStaticMapView r6 = (com.instagram.maps.ui.IgStaticMapView) r6
            float r4 = r12.getX()
            float r3 = r12.getY()
            android.graphics.Rect r2 = r6.A0H
            int r0 = r2.left
            float r0 = (float) r0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0006
            int r0 = r2.right
            float r0 = (float) r0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0006
            int r0 = r2.top
            float r0 = (float) r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0006
            int r0 = r2.bottom
            float r0 = (float) r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0006
            android.net.Uri r0 = r6.A05
            if (r0 == 0) goto L_0x0006
            X.1yR r0 = X.1yR.A0P
            r5 = 0
            r0.A05(r5)
            X.Vv1 r4 = r6.A08
            if (r4 != 0) goto L_0x03d0
            android.content.Context r3 = r6.getContext()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131965862(0x7f1337a6, float:1.9568546E38)
            java.lang.String r2 = r1.getString(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131965864(0x7f1337a8, float:1.956855E38)
            java.lang.String r0 = r1.getString(r0)
            X.Vv1 r4 = new X.Vv1
            r4.<init>(r3, r5, r2, r0)
            r6.A08 = r4
        L_0x03d0:
            android.content.Context r1 = r11.getContext()
            android.net.Uri r0 = r6.A05
            r4.A01(r1, r0)
            r1 = 1
            return r1
        L_0x03db:
            boolean r0 = r11 instanceof com.instagram.ui.widget.searchedittext.SearchEditText
            r1 = 1
            if (r0 == 0) goto L_0x0005
            int r0 = r12.getAction()
            if (r0 != r1) goto L_0x0005
            com.instagram.ui.widget.searchedittext.SearchEditText r11 = (com.instagram.ui.widget.searchedittext.SearchEditText) r11
            float r0 = r12.getX()
            boolean r0 = r11.A0A(r0)
            if (r0 != 0) goto L_0x0406
            float r0 = r12.getX()
            boolean r0 = r11.A0B(r0)
            if (r0 == 0) goto L_0x0411
            java.lang.String r0 = r11.getSearchString()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0411
        L_0x0406:
            java.lang.Object r1 = r10.A01
            X.Uga r1 = (X.C15669Uga) r1
            java.lang.String r0 = ""
        L_0x040c:
            X.C15669Uga.A00(r1, r0)
            goto L_0x0005
        L_0x0411:
            float r0 = r12.getX()
            boolean r0 = r11.A0B(r0)
            if (r0 == 0) goto L_0x0428
            java.lang.Object r1 = r10.A01
            X.Uga r1 = (X.C15669Uga) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0005
            java.lang.String r0 = r11.getSearchString()
            goto L_0x040c
        L_0x0428:
            r11.onTouchEvent(r12)
            goto L_0x0005
        L_0x042d:
            java.lang.Object r1 = r10.A01
            X.UEO r1 = (X.UEO) r1
            com.instagram.shopping.widget.clickabletext.ClickableTextContainer r0 = r1.A09
            X.JTQ.A1K(r12)
            X.5nl r0 = r0.A01
            r0.A02(r12)
            com.instagram.common.ui.touch.TouchOverlayView r0 = r1.A06
            X.5nl r0 = r0.A00
            r0.A02(r12)
            goto L_0x0499
        L_0x0443:
            java.lang.Object r0 = r10.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r0
            android.view.GestureDetector r0 = r0.A02
            if (r0 == 0) goto L_0x0499
            boolean r1 = r0.onTouchEvent(r12)
            return r1
        L_0x0450:
            java.lang.Object r1 = r10.A01
            X.WMw r1 = (X.C19140WMw) r1
            X.2it r0 = r1.A0G
            boolean r0 = r0.EsU(r12)
            if (r0 != 0) goto L_0x0499
            X.We4 r1 = r1.A0F
            r0 = 0
            X.0qQ.A0B(r12, r0)
            boolean r1 = X.C19702We4.A00(r12, r1, r0)
            return r1
        L_0x0467:
            java.lang.Object r0 = r10.A01
            X.VZo r0 = (X.C17535VZo) r0
            X.7HQ r0 = r0.A04
            X.0qQ.A0A(r12)
            boolean r1 = r0.A01(r12)
            return r1
        L_0x0475:
            r0 = 1
            X.0qQ.A0B(r12, r0)
        L_0x0479:
            java.lang.Object r0 = r10.A01
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
            boolean r1 = r0.onTouchEvent(r12)
            return r1
        L_0x0482:
            java.lang.Object r0 = r10.A01
            X.UEh r0 = (X.C14902UEh) r0
            X.U10 r0 = r0.A0D
            r0.A00(r12)
            goto L_0x0499
        L_0x048c:
            int r1 = r12.getActionMasked()
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L_0x04ab
            if (r1 == r0) goto L_0x049b
            r0 = 3
            if (r1 == r0) goto L_0x049b
        L_0x0499:
            r1 = 0
            return r1
        L_0x049b:
            java.lang.Object r1 = r10.A01
            X.Wan r1 = (X.C19501Wan) r1
            r1.A04 = r2
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0499
            X.8a5 r0 = r1.A0F
            r0.DhZ(r1)
            goto L_0x0499
        L_0x04ab:
            X.JTP.A15(r11, r0)
            java.lang.Object r1 = r10.A01
            X.Wan r1 = (X.C19501Wan) r1
            r1.A04 = r0
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0499
            X.8a5 r0 = r1.A0F
            r0.Dha(r1)
            goto L_0x0499
        L_0x04be:
            java.lang.Object r0 = r10.A01
            X.WGq r0 = (X.C19015WGq) r0
            X.0qQ.A0A(r12)
            android.view.GestureDetector r1 = r0.A05
            android.view.MotionEvent r0 = X.C13989Tnp.A0N(r12)
            boolean r1 = r1.onTouchEvent(r0)
            return r1
        L_0x04d0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x04d6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x04dc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x04e2:
            java.lang.String r0 = "overlayDisplay"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WC3.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public WC3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
