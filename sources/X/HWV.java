package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

public abstract class HWV {
    public static final void A00(Context context, C55890HpB hpB, UserSession userSession, AnonymousClass4DU r15, User user, String str, 0sL r18, 0sJ r19, long j) {
        UserSession userSession2 = userSession;
        C51972G9s.A1E(userSession, r15);
        hpB.A00.setVisibility(0);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = hpB.A0D;
        0qQ.A0B(gradientSpinnerAvatarView, 1);
        User user2 = user;
        if (user == null) {
            gradientSpinnerAvatarView.setVisibility(4);
        } else {
            1OP r0 = 1OP.$redex_init_class;
            Reel A02 = AnonymousClass3PQ.A02(userSession, user2);
            boolean A1V = AnonymousClass7TF.A1V(A02);
            gradientSpinnerAvatarView.setVisibility(0);
            gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r15, user2.Bh3());
            gradientSpinnerAvatarView.setGradientSpinnerVisible(A1V);
            Context context2 = gradientSpinnerAvatarView.getContext();
            int i = 2131963112;
            if (A1V) {
                i = 2131976678;
            }
            gradientSpinnerAvatarView.setContentDescription(DbY.A0b(context2, user2, i));
            if (!user2.A2Q()) {
                AnonymousClass0fU.A00(new ICZ(0, r18, userSession2, gradientSpinnerAvatarView, user2, r19, A02), gradientSpinnerAvatarView);
            } else {
                gradientSpinnerAvatarView.setOnClickListener((View.OnClickListener) null);
            }
            2eS.A01(gradientSpinnerAvatarView);
            if (A02 != null) {
                AnonymousClass3NW.A02(userSession, A02, gradientSpinnerAvatarView.A0O);
                GradientSpinner gradientSpinner = gradientSpinnerAvatarView.A0P;
                if (gradientSpinner != null) {
                    AnonymousClass3NW.A02(userSession, A02, gradientSpinner);
                }
                gradientSpinnerAvatarView.setGradientSpinnerActivated(!A02.A16(userSession));
            }
        }
        hpB.A0B.setText(C51971G9r.A0t(user2));
        hpB.A0A.setText(1G0.A07(context, j));
        String str2 = str;
        if (str == null || str2.length() == 0) {
            hpB.A08.setVisibility(8);
            return;
        }
        IgTextView igTextView = hpB.A08;
        igTextView.setVisibility(0);
        igTextView.setText(str2);
    }
}
