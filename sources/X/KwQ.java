package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

public abstract class KwQ {
    public static final void A00(AnonymousClass0iw r8, UserSession userSession, Reel reel, MU7 mu7, C60644Jor jor, boolean z) {
        AnonymousClass7TG.A1P(jor, reel);
        User A0D = reel.A0D();
        if (A0D != null) {
            TextView textView = jor.A01;
            DbU.A1H(textView, A0D);
            C244273av.A0B(textView, A0D.isVerified());
            GradientSpinnerAvatarView gradientSpinnerAvatarView = jor.A02;
            gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r8, A0D.Bh3());
            gradientSpinnerAvatarView.setGradientSpinnerActivated(AnonymousClass7TF.A1Q((2O0.A00(userSession).A02(reel) > 0 ? 1 : (2O0.A00(userSession).A02(reel) == 0 ? 0 : -1))));
            View view = jor.A00;
            LYA.A01(view, reel, mu7, jor, 31);
            if (reel.A1E) {
                gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
                LY7.A00(view, 40, mu7, A0D);
            }
            if (z) {
                AnonymousClass0eM r6 = jor.A03;
                Context context = AnonymousClass7TG.A0Q(r6).getContext();
                0qQ.A0A(context);
                ((ImageView) AnonymousClass7TG.A0Q(r6)).setImageDrawable(new C339187jC(context, AnonymousClass05K.A0C, -1, R.drawable.instagram_templates_pano_filled_24));
                ((C252063oV) r6.getValue()).setVisibility(0);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
