package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

public final class FED {
    public static final FED A00 = new Object();

    public static final void A00(AnonymousClass0iw r10, UserSession userSession, F0G f0g, G88 g88, AnonymousClass3UM r14, String str, int i, boolean z) {
        String username;
        TextView textView;
        String BxN;
        String fullName;
        AnonymousClass3UM r6 = r14;
        User CCd = r14.CCd();
        F0G f0g2 = f0g;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = f0g.A04;
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r10, CCd.Bh3());
        TextView textView2 = f0g.A02;
        String fullName2 = CCd.getFullName();
        if (fullName2 == null || fullName2.length() == 0) {
            username = CCd.getUsername();
        } else {
            username = CCd.getFullName();
        }
        textView2.setText(username);
        if (r14.BxN().length() != 0 || (fullName = CCd.getFullName()) == null || fullName.length() == 0) {
            textView = f0g.A03;
            BxN = r14.BxN();
        } else {
            textView = f0g.A03;
            BxN = CCd.getUsername();
        }
        textView.setText(BxN);
        FollowButton followButton = f0g.A05;
        followButton.A0A = z;
        C267064at r1 = followButton.A0J;
        G88 g882 = g88;
        int i2 = i;
        r1.A07(new EUD(g882, r6, str, i2, 0));
        UserSession userSession2 = userSession;
        r1.A03(r10, userSession, r14.CCd());
        View view = f0g.A01;
        G88 g883 = g88;
        AnonymousClass3UM r12 = r14;
        String str2 = str;
        int i3 = i2;
        AnonymousClass0fU.A00(new C50103FOt(g883, r12, str2, i3, 0), view);
        View.OnClickListener fOt = new C50103FOt(g883, r12, str2, i3, 1);
        AnonymousClass0fU.A00(fOt, f0g2.A00);
        Reel BkU = r6.BkU(userSession2);
        if (BkU != null) {
            gradientSpinnerAvatarView.setGradientSpinnerVisible(true);
            gradientSpinnerAvatarView.setGradientSpinnerActivated(!BkU.A16(userSession2));
            fOt = new FPH(30, (Object) g882, (Object) BkU, (Object) f0g2);
        } else {
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        }
        AnonymousClass0fU.A00(fOt, gradientSpinnerAvatarView);
    }
}
