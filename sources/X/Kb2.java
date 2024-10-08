package X;

import android.animation.Animator;
import android.os.Handler;

public final class Kb2 extends AnonymousClass4HM {
    public final int A00;
    public final Object A01;

    public Kb2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAnimationEnd(Animator animator) {
        Handler A0D;
        Runnable m4m;
        switch (this.A00) {
            case 0:
                LE0 le0 = (LE0) this.A01;
                le0.A00();
                le0.A00 = true;
                return;
            case 1:
                A0D = AnonymousClass7TF.A0D();
                m4m = new C65923M4m((K7b) this.A01);
                break;
            default:
                A0D = AnonymousClass7TF.A0D();
                m4m = new C65924M4n((C61427K7c) this.A01);
                break;
        }
        A0D.postDelayed(m4m, 50);
    }
}
