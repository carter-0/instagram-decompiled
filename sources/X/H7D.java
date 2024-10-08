package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.Achievement;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class H7D extends C232222tE {
    public final AnonymousClass0iw A00;
    public final JO1 A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        String str;
        IOP iop = (IOP) r7;
        C53126Giy giy = (C53126Giy) r8;
        AnonymousClass7TG.A1N(iop, giy);
        AnonymousClass0iw r4 = this.A00;
        JO1 jo1 = this.A01;
        AnonymousClass7TG.A1Q(r4, jo1);
        IgTextView igTextView = giy.A01;
        Achievement achievement = iop.A00;
        igTextView.setText(achievement.A0A);
        IgImageView igImageView = giy.A02;
        ID2.A02(igImageView, 12, jo1, iop);
        if (achievement.C7F() != null) {
            Integer num = achievement.A05;
            if (num != null) {
                giy.A00.setText(HZ7.A00(num.intValue()));
            }
            str = achievement.A09;
        } else {
            giy.A00.setVisibility(8);
            str = achievement.A0B;
        }
        DbV.A1P(r4, igImageView, str);
    }

    public final Class modelClass() {
        return IOP.class;
    }

    public H7D(AnonymousClass0iw r1, UserSession userSession, JO1 jo1) {
        this.A00 = r1;
        this.A01 = jo1;
        this.A02 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.achievement_list_item, false);
        A09.setTag(new C53126Giy(A09));
        Object tag = A09.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creator.achievements.modules.adapter.AchievementsItemViewBinder.Holder");
        return (C249703kE) tag;
    }
}
