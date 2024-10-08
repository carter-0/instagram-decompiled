package X;

import android.animation.Animator;

/* renamed from: X.AZa  reason: case insensitive filesystem */
public final class C40285AZa implements C59552JNy {
    public final /* synthetic */ Animator A00;
    public final /* synthetic */ Animator A01;
    public final /* synthetic */ 2Wa A02;
    public final /* synthetic */ 2Wa A03;

    public C40285AZa(Animator animator, Animator animator2, 2Wa r3, 2Wa r4) {
        this.A03 = r3;
        this.A00 = animator;
        this.A01 = animator2;
        this.A02 = r4;
    }

    public final void ABN() {
        this.A03.A00();
        this.A00.start();
        Animator animator = this.A01;
        animator.start();
        C56678I7i.A00(animator, this.A02, 2);
    }
}
