package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FnX  reason: case insensitive filesystem */
public final class C51041FnX implements AnonymousClass71G {
    public final /* synthetic */ C47519E6d A00;

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        AnonymousClass7TG.A1N(reel, gradientSpinnerAvatarView);
        List A1I = AnonymousClass7TE.A1I(reel);
        C47519E6d e6d = this.A00;
        AnonymousClass32A r4 = (AnonymousClass32A) e6d.A06.getValue();
        r4.A0C = (String) AnonymousClass7TE.A14(e6d.A05);
        C50896Fkb.A00(e6d.getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), r4, e6d, 15);
        r4.A09(reel, AnonymousClass3BQ.COMMENTS, gradientSpinnerAvatarView, A1I, A1I, A1I);
    }

    public final void DGM(User user, int i) {
    }

    public final void DRX(User user) {
    }

    public final void DwV(User user, int i) {
        0qQ.A0B(user, 0);
        C47519E6d e6d = this.A00;
        DbZ.A15(e6d);
        AnonymousClass0eM r4 = e6d.A07;
        C46474Dfc A01 = C46548Dgp.A01(AnonymousClass7TE.A0l(r4), user.getId(), "comment_likes_user_row", e6d.getModuleName());
        C309516Yo A0P = DbZ.A0P(e6d, r4);
        A0P.A0F = true;
        C46474Dfc.A03(A0P, AnonymousClass7TE.A0l(r4), C46447Df9.A02(), A01);
    }

    public final void DwW(View view, User user, int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C51041FnX(C47519E6d e6d) {
        this.A00 = e6d;
    }
}
