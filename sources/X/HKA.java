package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

public final class HKA extends C52050GCw implements AnonymousClass32U {
    public View A00;
    public TextView A01;
    public TextView A02;
    public GradientSpinnerAvatarView A03;
    public FollowButton A04;
    public final Context A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final User A08;
    public final C59593JPn A09;
    public final GD9 A0A;

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void DW8(int i, int i2) {
        Integer valueOf;
        C52012GBj gBj = this.A02;
        if (gBj == null || (valueOf = Integer.valueOf(gBj.A06())) == null || valueOf.intValue() != 0) {
            AnonymousClass7TH.A0R(this.A00);
        } else {
            AnonymousClass7TF.A16(this.A00);
        }
    }

    public HKA(Context context, AnonymousClass0iw r3, UserSession userSession, User user, C59593JPn jPn, GD9 gd9) {
        AnonymousClass7TG.A1U(context, userSession, gd9);
        0qQ.A0B(r3, 5);
        this.A05 = context;
        this.A07 = userSession;
        this.A0A = gd9;
        this.A09 = jPn;
        this.A06 = r3;
        this.A08 = user;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
    }
}
