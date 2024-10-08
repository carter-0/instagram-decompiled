package X;

import android.animation.Animator;

/* renamed from: X.AZb  reason: case insensitive filesystem */
public final class C40286AZb implements C59552JNy {
    public final /* synthetic */ Animator A00;
    public final /* synthetic */ Animator A01;
    public final /* synthetic */ 2Wa A02;
    public final /* synthetic */ C248453hz A03;
    public final /* synthetic */ 1Xj A04;

    public C40286AZb(Animator animator, Animator animator2, 2Wa r3, C248453hz r4, 1Xj r5) {
        this.A02 = r3;
        this.A00 = animator;
        this.A01 = animator2;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void ABN() {
        2Wa r0 = this.A02;
        if (r0 != null) {
            r0.A00();
        }
        Animator animator = this.A00;
        if (animator != null) {
            animator.start();
        }
        this.A01.start();
        C248453hz r1 = this.A03;
        C247383gF A002 = C247323g9.A00(r1.A00);
        String moduleName = r1.A02.getModuleName();
        String id = this.A04.getId();
        if (id != null) {
            A002.A03(moduleName, id);
        }
    }
}
