package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.Lyc  reason: case insensitive filesystem */
public final class C65722Lyc implements C295005nO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C65722Lyc(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public final void onFinish() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            Animation animation = (Animation) obj;
            View view = (View) this.A03;
            animation.setAnimationListener(new C11520Sbh(6, this.A02, view));
            view.startAnimation(animation);
            return;
        }
        C294975nL r4 = (C294975nL) obj;
        View view2 = (View) this.A03;
        r4.A0P(0.0f, AnonymousClass7TE.A02(view2) / 2.0f);
        r4.A0Q(0.0f, AnonymousClass7TE.A03(view2));
        r4.A0I(0.0f);
        r4.A05 = new C65724Lye((C62320sa) this.A02, 2);
        r4.A0H();
    }
}
