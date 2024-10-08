package X;

import android.animation.Animator;

/* renamed from: X.7i7  reason: invalid class name and case insensitive filesystem */
public final class C338537i7 implements Animator.AnimatorListener {
    public final /* synthetic */ C338517i5 A00;
    public final /* synthetic */ C338507i4 A01;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public C338537i7(C338517i5 r1, C338507i4 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onAnimationRepeat(Animator animator) {
        C338507i4 r4 = this.A01;
        C338517i5 r3 = this.A00;
        r4.A04(r3, 1.0f, true);
        r3.A07 = r3.A04;
        r3.A05 = r3.A01;
        r3.A06 = r3.A03;
        int[] iArr = r3.A0G;
        int length = (r3.A0C + 1) % iArr.length;
        r3.A0C = length;
        r3.A0D = iArr[length];
        if (r4.A04) {
            r4.A04 = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            if (r3.A0F) {
                r3.A0F = false;
                return;
            }
            return;
        }
        r4.A01 += 1.0f;
    }

    public final void onAnimationStart(Animator animator) {
        this.A01.A01 = 0.0f;
    }
}
