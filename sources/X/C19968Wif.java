package X;

/* renamed from: X.Wif  reason: case insensitive filesystem */
public final class C19968Wif implements Runnable {
    public final /* synthetic */ W1m A00;

    public C19968Wif(W1m w1m) {
        this.A00 = w1m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: android.animation.ValueAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            X.W1m r3 = r6.A00
            X.U4W r4 = r3.A09
            if (r4 == 0) goto L_0x0061
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0010
            r0 = 0
            r4.setVisibility(r0)
        L_0x0010:
            int r1 = r4.A00
            r0 = 1
            if (r1 != r0) goto L_0x0062
            r2 = 2
            float[] r0 = new float[r2]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r0)
            android.animation.TimeInterpolator r0 = X.AnonymousClass6Y2.A03
            r5.setInterpolator(r0)
            r1 = 4
            X.W4Q r0 = new X.W4Q
            r0.<init>((X.W1m) r3, (int) r1)
            r5.addUpdateListener(r0)
            float[] r0 = new float[r2]
            r0 = {1061997773, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            android.animation.TimeInterpolator r0 = X.AnonymousClass6Y2.A04
            r2.setInterpolator(r0)
            r1 = 6
            X.SUp r0 = new X.SUp
            r0.<init>((X.W1m) r3, (int) r1)
            r2.addUpdateListener(r0)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[]{r5, r2}
            r4.playTogether(r0)
            r0 = 150(0x96, double:7.4E-322)
            r4.setDuration(r0)
            r1 = 5
            X.Q4x r0 = new X.Q4x
            r0.<init>(r3, r1)
            r4.addListener(r0)
        L_0x005e:
            r4.start()
        L_0x0061:
            return
        L_0x0062:
            int r2 = r4.getHeight()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0073
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.bottomMargin
            int r2 = r2 + r0
        L_0x0073:
            float r0 = (float) r2
            r4.setTranslationY(r0)
            android.animation.ValueAnimator r4 = new android.animation.ValueAnimator
            r4.<init>()
            r0 = 0
            int[] r0 = new int[]{r2, r0}
            r4.setIntValues(r0)
            android.animation.TimeInterpolator r0 = X.AnonymousClass6Y2.A02
            r4.setInterpolator(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r4.setDuration(r0)
            r0 = 10
            X.U0N.A00(r4, r3, r0)
            r1 = 7
            X.SUp r0 = new X.SUp
            r0.<init>((X.W1m) r3, (int) r1)
            r4.addUpdateListener(r0)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19968Wif.run():void");
    }
}
