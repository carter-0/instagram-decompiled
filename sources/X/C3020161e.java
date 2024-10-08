package X;

import android.os.Handler;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;

/* renamed from: X.61e  reason: invalid class name and case insensitive filesystem */
public final class C3020161e implements Handler.Callback {
    public final /* synthetic */ AnimatedHintsTextLayout A00;

    public C3020161e(AnimatedHintsTextLayout animatedHintsTextLayout) {
        this.A00 = animatedHintsTextLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a5, code lost:
        if (r1 == 0) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            r6 = 0
            X.0qQ.A0B(r9, r6)
            int r1 = r9.what
            r4 = 1
            if (r1 == 0) goto L_0x0094
            if (r1 == r4) goto L_0x0024
            r0 = 2
            if (r1 != r0) goto L_0x0137
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r3 = r8.A00
            boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x00f1
            r3.A0C = r6
            android.widget.TextView r0 = r3.A09
            if (r0 != 0) goto L_0x00ee
            java.lang.String r2 = "nextHintTextView"
        L_0x001c:
            X.0qQ.A0F(r2)
        L_0x001f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0024:
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r6 = r8.A00
            r6.A04()
            r1 = 0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.A00 = r1
            r6.A01 = r0
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout.A02(r6)
            int r1 = r6.A02
            java.util.List r7 = r6.A0G
            int r0 = r7.size()
            if (r1 < r0) goto L_0x0087
            r0 = 0
        L_0x003e:
            r6.A02 = r0
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            java.lang.String r5 = "currentHintTextView"
            r3 = 0
            android.widget.TextView r1 = r6.A08
            if (r0 == 0) goto L_0x0081
            if (r1 == 0) goto L_0x0090
            int r0 = r6.A02
            java.lang.Object r0 = r7.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setHint(r0)
        L_0x005a:
            int r0 = r7.size()
            java.lang.String r5 = "nextHintTextView"
            android.widget.TextView r2 = r6.A09
            if (r0 <= r4) goto L_0x008a
            if (r2 == 0) goto L_0x0090
            int r0 = r6.A02
            int r1 = r0 + 1
            int r0 = r7.size()
            int r1 = r1 % r0
            java.lang.Object r0 = r7.get(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setHint(r0)
            android.os.Handler r3 = r6.A0F
            r2 = 2
            long r0 = r6.A03
            r3.sendEmptyMessageDelayed(r2, r0)
            return r4
        L_0x0081:
            if (r1 == 0) goto L_0x0090
            r1.setHint(r3)
            goto L_0x005a
        L_0x0087:
            int r0 = r6.A02
            goto L_0x003e
        L_0x008a:
            if (r2 == 0) goto L_0x0090
            r2.setHint(r3)
            return r4
        L_0x0090:
            X.0qQ.A0F(r5)
            goto L_0x001f
        L_0x0094:
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r5 = r8.A00
            android.widget.EditText r0 = r5.getEditText()
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00a7
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x00a8
        L_0x00a7:
            r0 = 1
        L_0x00a8:
            r3 = r0 ^ 1
            java.lang.String r2 = "nextHintTextView"
            java.lang.String r1 = "currentHintTextView"
            android.widget.TextView r0 = r5.A08
            if (r3 == 0) goto L_0x00c4
            if (r0 == 0) goto L_0x012f
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r5.A09
            if (r0 == 0) goto L_0x001c
            r0.setVisibility(r1)
            r5.A04()
            return r4
        L_0x00c4:
            if (r0 == 0) goto L_0x012f
            r0.setVisibility(r6)
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x00d4
            android.widget.TextView r0 = r5.A09
            if (r0 == 0) goto L_0x001c
            r0.setVisibility(r6)
        L_0x00d4:
            java.util.List r2 = r5.A0G
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x012c
            X.X5C r1 = r5.A0A
            if (r1 == 0) goto L_0x012c
            int r0 = r5.A02
            java.lang.Object r0 = r2.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.DJU(r0)
            return r4
        L_0x00ee:
            r0.setVisibility(r6)
        L_0x00f1:
            android.animation.ValueAnimator r0 = r3.A06
            java.lang.String r1 = "translationAnimator"
            if (r0 == 0) goto L_0x012f
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x012d
            android.animation.ValueAnimator r0 = r3.A06
            if (r0 == 0) goto L_0x012f
            r0.start()
            r1 = 1
        L_0x0105:
            android.animation.ValueAnimator r0 = r3.A04
            java.lang.String r2 = "fadeInAnimator"
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x0119
            android.animation.ValueAnimator r0 = r3.A04
            if (r0 == 0) goto L_0x001c
            r0.start()
            r1 = 1
        L_0x0119:
            android.animation.ValueAnimator r0 = r3.A05
            java.lang.String r2 = "fadeOutAnimator"
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x0134
            android.animation.ValueAnimator r0 = r3.A05
            if (r0 == 0) goto L_0x001c
            r0.start()
        L_0x012c:
            return r4
        L_0x012d:
            r1 = 0
            goto L_0x0105
        L_0x012f:
            X.0qQ.A0F(r1)
            goto L_0x001f
        L_0x0134:
            if (r1 == 0) goto L_0x0137
            return r4
        L_0x0137:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3020161e.handleMessage(android.os.Message):boolean");
    }
}
