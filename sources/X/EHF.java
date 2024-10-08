package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;
import java.util.List;

public final class EHF extends C232232tF {
    public Reel A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final F1l A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C47026DpI(DbT.A0D(layoutInflater, viewGroup, R.layout.recommendation_business_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r19, C249703kE r20) {
        RingSpec ringSpec;
        FYA fya = (FYA) r19;
        C47026DpI dpI = (C47026DpI) r20;
        boolean A1U = AnonymousClass7TF.A1U(0, fya, dpI);
        IgdsPeopleCell igdsPeopleCell = dpI.A03;
        igdsPeopleCell.A01();
        User user = fya.A00;
        igdsPeopleCell.A08(user.getUsername(), false);
        igdsPeopleCell.A07(user.A03.getCategory());
        UserSession userSession = this.A02;
        AnonymousClass4DH r2 = this.A01;
        igdsPeopleCell.A03(userSession, new C49550Exl(r2, user), (User) null);
        FPG.A00(igdsPeopleCell, 28, user, this);
        FollowButton followButton = dpI.A05;
        C267064at r1 = followButton.A0J;
        r1.A07(new EUB(0, fya, this));
        r1.A03(r2, userSession, user);
        igdsPeopleCell.A05(followButton, (AnonymousClass3Z5) null);
        1OP r0 = 1OP.$redex_init_class;
        0qQ.A0B(userSession, 0);
        Reel A032 = AnonymousClass3PQ.A03(userSession, user);
        this.A00 = A032;
        if (A032 != null) {
            boolean A1V = AnonymousClass7TF.A1V(AnonymousClass3PQ.A02(userSession, user));
            Reel A033 = AnonymousClass3PQ.A03(userSession, user);
            if (A033 != null) {
                if (A1V) {
                    ringSpec = AnonymousClass3NW.A00(userSession, A033);
                } else {
                    ringSpec = (RingSpec) AnonymousClass3Mk.A0C.getValue();
                }
                GradientSpinnerAvatarView gradientSpinnerAvatarView = dpI.A04;
                gradientSpinnerAvatarView.setGradientColor(ringSpec);
                AnonymousClass0fU.A00(new FOS(gradientSpinnerAvatarView, A033, this, AnonymousClass7TE.A1I(A033), new AnonymousClass32A(r2, userSession, DbV.A0f(new C49550Exl(r2, user).A01)), AnonymousClass7TG.A0j(), 5), gradientSpinnerAvatarView);
                gradientSpinnerAvatarView.setGradientSpinnerVisible(A1U);
                gradientSpinnerAvatarView.setGradientSpinnerActivated(A1V);
            }
        }
        List list = fya.A01;
        if (AnonymousClass7TE.A1b(list)) {
            dpI.A00.setUrl(((C47212Dsz) ((C51938G8h) list.get(0))).A00, r2);
            dpI.A01.setUrl(((C47212Dsz) ((C51938G8h) list.get(A1U ? 1 : 0))).A00, r2);
            dpI.A02.setUrl(((C47212Dsz) ((C51938G8h) list.get(2))).A00, r2);
        }
        FPG.A00(dpI.A00, 29, fya, this);
        FPG.A00(dpI.A01, 30, fya, this);
        FPG.A00(dpI.A02, 31, fya, this);
    }

    public final Class modelClass() {
        return FYA.class;
    }

    public EHF(AnonymousClass4DH r1, UserSession userSession, F1l f1l) {
        AnonymousClass7TG.A1O(userSession, f1l);
        this.A02 = userSession;
        this.A03 = f1l;
        this.A01 = r1;
    }
}
