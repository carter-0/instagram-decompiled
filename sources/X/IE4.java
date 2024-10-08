package X;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;

public final class IE4 implements Animation.AnimationListener {
    public final /* synthetic */ AnonymousClass6PV A00;

    public final void onAnimationRepeat(Animation animation) {
    }

    public IE4(AnonymousClass6PV r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animation animation) {
        String str;
        AnonymousClass6PV r3 = this.A00;
        ConstraintLayout constraintLayout = r3.A07;
        if (constraintLayout != null) {
            DbU.A11(r3.A00().getContext(), constraintLayout, R.drawable.reel_lead_gen_card_rounded_top_corner_background);
            ConstraintLayout constraintLayout2 = r3.A08;
            if (constraintLayout2 != null) {
                constraintLayout2.startAnimation(AnimationUtils.loadAnimation(r3.A00().getContext(), R.anim.button_slide_down_20_to_0));
                return;
            }
            str = "ctaButtonLayout";
        } else {
            str = "cardViewWithoutCta";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onAnimationStart(Animation animation) {
        AnonymousClass6PV r2 = this.A00;
        r2.A01().setAlpha(0.0f);
        C51976G9y.A0R(DbY.A0G(r2.A01()));
    }
}
