package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* renamed from: X.Lyd  reason: case insensitive filesystem */
public final class C65723Lyd implements C295005nO {
    public final /* synthetic */ View A00;
    public final /* synthetic */ CircularImageView A01;
    public final /* synthetic */ C294975nL A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ LBM A04;

    public C65723Lyd(View view, CircularImageView circularImageView, C294975nL r3, User user, LBM lbm) {
        this.A04 = lbm;
        this.A03 = user;
        this.A01 = circularImageView;
        this.A00 = view;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onFinish() {
        LBM lbm = this.A04;
        User user = this.A03;
        ? r3 = this.A01;
        View view = this.A00;
        Animation animation = lbm.A00;
        if (animation != null) {
            animation.setAnimationListener((Animation.AnimationListener) null);
        }
        Animation animation2 = lbm.A00;
        if (animation2 != null) {
            animation2.cancel();
        }
        RotateAnimation A002 = C64179LSh.A00();
        A002.setAnimationListener(new LZC(view, user, lbm));
        r3.startAnimation(A002);
        lbm.A00 = A002;
        lbm.A01.remove(this.A02);
    }
}
