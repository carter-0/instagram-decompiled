package X;

import android.content.Context;
import android.view.animation.Animation;
import android.widget.TextView;
import com.instagram.android.R;

public final class LZB implements Animation.AnimationListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ TextView A01;

    public final void onAnimationRepeat(Animation animation) {
    }

    public LZB(TextView textView, Context context) {
        this.A01 = textView;
        this.A00 = context;
    }

    public final void onAnimationEnd(Animation animation) {
        this.A01.setVisibility(8);
    }

    public final void onAnimationStart(Animation animation) {
        C51972G9s.A0I(this.A01).setDuration((long) this.A00.getResources().getInteger(R.integer.config_activityLongDur));
    }
}
