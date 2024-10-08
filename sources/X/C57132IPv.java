package X;

import android.animation.Animator;

/* renamed from: X.IPv  reason: case insensitive filesystem */
public final class C57132IPv implements C59552JNy {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C57132IPv(Animator animator, 2Wa r2, C52161GHd gHd, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = r2;
            this.A03 = gHd;
            this.A02 = animator;
        } else {
            this.A03 = gHd;
            this.A02 = animator;
            this.A01 = r2;
        }
    }

    public final void ABN() {
        C52161GHd gHd;
        if (this.A00 != 0) {
            ((2Wa) this.A01).A00();
            gHd = (C52161GHd) this.A03;
            2Wa r0 = gHd.A02;
            if (r0 != null) {
                r0.A00();
            }
            Animator animator = gHd.A00;
            if (animator != null) {
                animator.start();
            }
            ((Animator) this.A02).start();
        } else {
            gHd = (C52161GHd) this.A03;
            2Wa r02 = gHd.A02;
            if (r02 != null) {
                r02.A00();
            }
            Animator animator2 = gHd.A00;
            if (animator2 != null) {
                animator2.start();
            }
            Animator animator3 = (Animator) this.A02;
            animator3.start();
            C56678I7i.A00(animator3, this.A01, 13);
        }
        C247323g9.A00(gHd.A04).A04(gHd.A03.getModuleName(), ((C267324bN) gHd.A01.A01).A0C());
    }
}
