package X;

import android.view.View;
import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;

public final class IE5 implements Animation.AnimationListener {
    public final int A00;
    public final Object A01;

    public final void onAnimationRepeat(Animation animation) {
    }

    public IE5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAnimationEnd(Animation animation) {
        View view;
        String str;
        switch (this.A00) {
            case 0:
            case 1:
            case 6:
                view = (View) this.A01;
                break;
            case 2:
                view = ((AE5) this.A01).A02();
                break;
            case 5:
                AnonymousClass6PV r3 = (AnonymousClass6PV) this.A01;
                r3.A01().setVisibility(4);
                ConstraintLayout constraintLayout = r3.A08;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(4);
                    ConstraintLayout constraintLayout2 = r3.A07;
                    if (constraintLayout2 != null) {
                        DbU.A11(r3.A00().getContext(), constraintLayout2, R.drawable.reel_ctwa_story_messaging_card_rounded_corner_background);
                        return;
                    }
                    str = "cardViewWithoutCta";
                } else {
                    str = "ctaButtonLayout";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 8:
                C64179LSh.A03((View) this.A01, IZU.A00);
                return;
            default:
                return;
        }
        view.setVisibility(8);
    }

    public final void onAnimationStart(Animation animation) {
        switch (this.A00) {
            case 3:
            case 4:
                ((View) this.A01).setVisibility(0);
                return;
            case 5:
                C51976G9y.A0R(C51972G9s.A0I(((AnonymousClass6PV) this.A01).A01()));
                return;
            case 7:
                View view = (View) this.A01;
                if (view != null) {
                    view.setTranslationZ(1.0f);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
