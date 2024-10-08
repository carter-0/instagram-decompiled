package X;

import android.view.animation.Animation;
import com.instagram.creation.video.ui.FilmstripScrollView;

public final class LZA implements Animation.AnimationListener {
    public final /* synthetic */ double A00;
    public final /* synthetic */ C61870KPj A01;

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public LZA(C61870KPj kPj, double d) {
        this.A01 = kPj;
        this.A00 = d;
    }

    public final void onAnimationStart(Animation animation) {
        FilmstripScrollView filmstripScrollView = this.A01.A0F;
        if (filmstripScrollView != null) {
            filmstripScrollView.setScrollX((int) this.A00);
        }
    }
}
