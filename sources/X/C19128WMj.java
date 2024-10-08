package X;

import android.animation.PropertyValuesHolder;
import android.util.Property;

/* renamed from: X.WMj  reason: case insensitive filesystem */
public final class C19128WMj implements X6D {
    public int A00;

    public static PropertyValuesHolder[] A00(Property property, float f, float f2) {
        return new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(property, new float[]{f, f2})};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r8.getLayoutDirection() == 1) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r8.getLayoutDirection() == 1) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator ALV(android.view.View r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            int r5 = r6.A00
            android.content.res.Resources r1 = X.DbU.A05(r7)
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            int r2 = r1.getDimensionPixelSize(r0)
            float r4 = r7.getTranslationX()
            float r3 = r7.getTranslationY()
            r0 = 3
            if (r5 == r0) goto L_0x0069
            r0 = 5
            if (r5 == r0) goto L_0x0034
            r0 = 48
            if (r5 == r0) goto L_0x004e
            r0 = 80
            if (r5 == r0) goto L_0x004b
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r0) goto L_0x0062
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r5 != r0) goto L_0x006c
            int r1 = r8.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0069
        L_0x0034:
            float r0 = (float) r2
            float r0 = r4 - r0
        L_0x0037:
            android.util.Property r1 = android.view.View.TRANSLATION_X
            r3 = 2
            android.animation.PropertyValuesHolder[] r0 = A00(r1, r0, r4)
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r0)
            X.U0D r1 = new X.U0D
            r1.<init>(r7, r4, r3)
        L_0x0047:
            r2.addListener(r1)
            return r2
        L_0x004b:
            float r1 = (float) r2
            float r1 = r1 + r3
            goto L_0x0051
        L_0x004e:
            float r0 = (float) r2
            float r1 = r3 - r0
        L_0x0051:
            android.util.Property r0 = android.view.View.TRANSLATION_Y
            android.animation.PropertyValuesHolder[] r0 = A00(r0, r1, r3)
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r0)
            r0 = 3
            X.U0D r1 = new X.U0D
            r1.<init>(r7, r3, r0)
            goto L_0x0047
        L_0x0062:
            int r1 = r8.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0034
        L_0x0069:
            float r0 = (float) r2
            float r0 = r0 + r4
            goto L_0x0037
        L_0x006c:
            java.lang.String r0 = "Invalid slide direction: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19128WMj.ALV(android.view.View, android.view.ViewGroup):android.animation.Animator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r8.getLayoutDirection() == 1) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r8.getLayoutDirection() == 1) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator ALu(android.view.View r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            int r5 = r6.A00
            android.content.res.Resources r1 = X.DbU.A05(r7)
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            int r2 = r1.getDimensionPixelSize(r0)
            float r4 = r7.getTranslationX()
            float r3 = r7.getTranslationY()
            r0 = 3
            if (r5 == r0) goto L_0x0068
            r0 = 5
            if (r5 == r0) goto L_0x0034
            r0 = 48
            if (r5 == r0) goto L_0x004e
            r0 = 80
            if (r5 == r0) goto L_0x004a
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r0) goto L_0x0061
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r5 != r0) goto L_0x006c
            int r1 = r8.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0068
        L_0x0034:
            float r1 = (float) r2
            float r1 = r1 + r4
        L_0x0036:
            android.util.Property r0 = android.view.View.TRANSLATION_X
            r3 = 2
            android.animation.PropertyValuesHolder[] r0 = A00(r0, r4, r1)
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r0)
            X.U0D r1 = new X.U0D
            r1.<init>(r7, r4, r3)
        L_0x0046:
            r2.addListener(r1)
            return r2
        L_0x004a:
            float r0 = (float) r2
            float r1 = r3 - r0
            goto L_0x0050
        L_0x004e:
            float r1 = (float) r2
            float r1 = r1 + r3
        L_0x0050:
            android.util.Property r0 = android.view.View.TRANSLATION_Y
            android.animation.PropertyValuesHolder[] r0 = A00(r0, r3, r1)
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r0)
            r0 = 3
            X.U0D r1 = new X.U0D
            r1.<init>(r7, r3, r0)
            goto L_0x0046
        L_0x0061:
            int r1 = r8.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0034
        L_0x0068:
            float r0 = (float) r2
            float r1 = r4 - r0
            goto L_0x0036
        L_0x006c:
            java.lang.String r0 = "Invalid slide direction: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19128WMj.ALu(android.view.View, android.view.ViewGroup):android.animation.Animator");
    }
}
