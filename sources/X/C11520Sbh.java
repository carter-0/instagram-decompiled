package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.Sbh  reason: case insensitive filesystem */
public final class C11520Sbh implements Animation.AnimationListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C11520Sbh(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static int A00(View view, Animation animation, Object obj, int i) {
        animation.setAnimationListener(new C11520Sbh(i, view, obj));
        view.startAnimation(animation);
        return view.getHeight();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r1 != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationEnd(android.view.animation.Animation r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0050;
                case 1: goto L_0x002a;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0011;
                case 5: goto L_0x0058;
                case 6: goto L_0x0040;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r4.A02
            android.view.animation.Animation r0 = (android.view.animation.Animation) r0
            r1.startAnimation(r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r1 = r4.A02
            X.SlJ r1 = (X.SlJ) r1
            boolean r0 = r1.A03
            java.lang.Object r2 = r4.A01
            android.view.View r2 = (android.view.View) r2
            if (r0 != 0) goto L_0x0066
            r0 = 8
            r2.setVisibility(r0)
            X.Ths r0 = r1.A01
            if (r0 == 0) goto L_0x0010
            r0.DJ7()
            return
        L_0x002a:
            java.lang.Object r1 = r4.A02
            android.view.View r1 = (android.view.View) r1
            android.view.ViewParent r0 = r1.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0010
            android.view.ViewParent r0 = r1.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r1)
            return
        L_0x0040:
            java.lang.Object r3 = r4.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r4.A01
            r1 = 6
            X.WdZ r0 = new X.WdZ
            r0.<init>(r2, r1)
            X.C64179LSh.A03(r3, r0)
            return
        L_0x0050:
            java.lang.Object r0 = r4.A02
            X.Vhj r0 = (X.C17892Vhj) r0
            r0.A00()
            return
        L_0x0058:
            java.lang.Object r0 = r4.A02
            X.SlK r0 = (X.SlK) r0
            boolean r1 = r0.A05
            java.lang.Object r2 = r4.A01
            android.view.View r2 = (android.view.View) r2
            r0 = 8
            if (r1 == 0) goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11520Sbh.onAnimationEnd(android.view.animation.Animation):void");
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
