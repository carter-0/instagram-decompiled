package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.MjY  reason: case insensitive filesystem */
public final class C67176MjY extends C232232tF {
    public final C74433Pun A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.disclaimer_title_row, viewGroup, false);
        return new C67990MyI(inflate, DbX.A0Y(inflate, R.id.disclaimer), DbX.A0Z(inflate, R.id.title), DbX.A0Z(inflate, R.id.header_action_button));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        String str;
        C67119Mid mid = (C67119Mid) r6;
        C67990MyI myI = (C67990MyI) r7;
        AnonymousClass7TF.A1H(mid, myI);
        Context A07 = DbS.A07(myI);
        DbT.A18(A07, myI.A02, mid.A00);
        IgTextView igTextView = myI.A01;
        Integer num = mid.A01;
        if (num != null) {
            str = A07.getString(num.intValue());
        } else {
            str = null;
        }
        igTextView.setText(str);
        DbT.A17(A07, igTextView, 1QE.A01(A07));
        igTextView.setVisibility(DbW.A01(mid.A04 ? 1 : 0));
        boolean z = mid.A05;
        IgSimpleImageView igSimpleImageView = myI.A00;
        if (z) {
            igSimpleImageView.setVisibility(0);
            C71396Ojv.A00(igSimpleImageView, 70, this);
        } else {
            igSimpleImageView.setVisibility(8);
        }
        C71409Ok8.A01(igTextView, 37, this, mid);
    }

    public final Class modelClass() {
        return C67119Mid.class;
    }

    public C67176MjY(UserSession userSession, C74433Pun pun) {
        AnonymousClass7TG.A1O(userSession, pun);
        this.A01 = userSession;
        this.A00 = pun;
    }
}
