package X;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class GKT implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ SeekBar A01;
    public final /* synthetic */ C52222GJn A02;

    public GKT(ViewGroup viewGroup, SeekBar seekBar, C52222GJn gJn) {
        this.A01 = seekBar;
        this.A02 = gJn;
        this.A00 = viewGroup;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            SeekBar seekBar = this.A01;
            seekBar.setMaxHeight(DbW.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int"));
            seekBar.setMinHeight(DbW.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int"));
        }
        SeekBar seekBar2 = this.A01;
        seekBar2.getLayoutParams().height = DbW.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        C52222GJn gJn = this.A02;
        ViewGroup viewGroup = this.A00;
        AnonymousClass7TF.A0G(viewGroup, R.id.scrubber_action).getLayoutParams().height = DbW.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        UserSession userSession = gJn.A06;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 2342165642126305589L)) {
            seekBar2.requestLayout();
            AnonymousClass7TF.A0G(viewGroup, R.id.video_countdown).requestLayout();
        }
    }
}
