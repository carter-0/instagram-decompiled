package X;

import android.view.View;
import android.view.animation.Animation;
import com.instagram.user.model.User;

public final class LZC implements Animation.AnimationListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ LBM A02;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public LZC(View view, User user, LBM lbm) {
        this.A02 = lbm;
        this.A01 = user;
        this.A00 = view;
    }

    public final void onAnimationEnd(Animation animation) {
        LBM lbm = this.A02;
        2YL A0H = DbS.A0H(lbm.A09);
        C66169MGg.A01(this.A01, A0H, C318116oQ.A00(A0H), 49);
        C294975nL A0A = JTP.A0b(this.A00).A0E(C64179LSh.A00).A0A();
        A0A.A0U(1.0f, 0.0f, -1.0f);
        A0A.A0V(1.0f, 0.0f, -1.0f);
        A0A.A0I(0.0f);
        A0A.A03 = 8;
        C65718LyY lyY = new C65718LyY(7, A0A, lbm);
        lbm.A01.add(A0A);
        A0A.A05 = lyY;
        A0A.A0H();
    }
}
