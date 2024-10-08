package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Ok9  reason: case insensitive filesystem */
public final class C71410Ok9 implements View.OnDragListener {
    public static int A07;
    public float A00;
    public float A01;
    public final View A02;
    public final AtomicBoolean A03 = JTQ.A0k();
    public final float A04;
    public final Context A05;
    public final UserSession A06;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00be, code lost:
        r0.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        r0 = r11.A02.animate().translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(r2).withEndAction(new X.C73231PZA(r11, r4));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onDrag(android.view.View r12, android.view.DragEvent r13) {
        /*
            r11 = this;
            r8 = 1
            X.0qQ.A0B(r13, r8)
            int r0 = r13.getAction()
            r2 = 0
            switch(r0) {
                case 1: goto L_0x00c2;
                case 2: goto L_0x0041;
                case 3: goto L_0x0014;
                case 4: goto L_0x00ee;
                case 5: goto L_0x00ee;
                case 6: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            return r2
        L_0x000d:
            A07 = r2
            r2 = 180(0xb4, double:8.9E-322)
            X.PkA r4 = X.C73811PkA.A00
            goto L_0x001c
        L_0x0014:
            r2 = 50
            r0 = 39
            X.Pm1 r4 = X.C73921Pm1.A00(r11, r0)
        L_0x001c:
            X.0sa r4 = (X.C62320sa) r4
            android.view.View r0 = r11.A02
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r0 = r1.translationY(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r1 = r0.setDuration(r2)
            X.PZA r0 = new X.PZA
            r0.<init>(r11, r4)
            android.view.ViewPropertyAnimator r0 = r1.withEndAction(r0)
            goto L_0x00be
        L_0x0041:
            float r0 = r11.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00f0
            float r0 = r11.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00f0
            java.util.concurrent.atomic.AtomicBoolean r7 = r11.A03
            boolean r0 = r7.get()
            if (r0 != 0) goto L_0x00ee
            float r1 = r13.getX()
            float r0 = r11.A00
            float r10 = X.AnonymousClass7TE.A00(r1, r0)
            float r1 = r13.getY()
            float r0 = r11.A01
            float r9 = X.AnonymousClass7TE.A00(r1, r0)
            int r0 = A07
            double r5 = (double) r0
            com.instagram.common.session.UserSession r4 = r11.A06
            X.0Tu r3 = X.0Tu.A05
            r0 = 37171082226369057(0x840ee700050221, double:3.5704803036655346E-306)
            double r0 = X.182.A00(r3, r4, r0)
            double r5 = r5 * r0
            double r3 = (double) r10
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0085
            double r3 = (double) r9
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ee
        L_0x0085:
            boolean r0 = r7.compareAndSet(r2, r8)
            if (r0 == 0) goto L_0x00ee
            android.view.View r3 = r11.A02
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x009a
            android.view.ViewGroup r0 = X.C3019160o.A00(r3)
            X.C70140Nxu.A00(r0)
        L_0x009a:
            r0 = 6
            r3.performHapticFeedback(r0)
            android.view.ViewPropertyAnimator r2 = r3.animate()
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r1
            android.view.ViewPropertyAnimator r0 = r2.translationY(r0)
            float r1 = r11.A04
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            android.view.ViewPropertyAnimator r2 = r0.scaleX(r1)
            r0 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
        L_0x00be:
            r0.start()
            goto L_0x00ee
        L_0x00c2:
            android.content.Context r0 = r11.A05
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            A07 = r0
            android.content.ClipDescription r1 = r13.getClipDescription()
            java.lang.String r0 = "text/plain"
            boolean r0 = r1.hasMimeType(r0)
            if (r0 == 0) goto L_0x000c
            android.content.ClipDescription r0 = r13.getClipDescription()
            java.lang.CharSequence r1 = r0.getLabel()
            r0 = 3027(0xbd3, float:4.242E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x000c
        L_0x00ee:
            r2 = 1
            return r2
        L_0x00f0:
            float r0 = r13.getX()
            r11.A00 = r0
            float r0 = r13.getY()
            r11.A01 = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71410Ok9.onDrag(android.view.View, android.view.DragEvent):boolean");
    }

    public C71410Ok9(Context context, View view, UserSession userSession, float f) {
        this.A06 = userSession;
        this.A05 = context;
        this.A02 = view;
        this.A04 = f;
    }
}
