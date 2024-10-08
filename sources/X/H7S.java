package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

public final class H7S extends C232232tF {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C61370K4o A02;
    public final Class A03 = IOT.class;

    public H7S(AnonymousClass0iw r3, UserSession userSession, C61370K4o k4o) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = k4o;
        this.A00 = r3;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        String fullName;
        C267064at r0;
        IOT iot = (IOT) r9;
        C53145GjH gjH = (C53145GjH) r10;
        AnonymousClass7TG.A1N(iot, gjH);
        UserSession userSession = this.A01;
        User user = iot.A00;
        AnonymousClass0iw r3 = this.A00;
        C20614Wvv wvv = new C20614Wvv(23, iot, this);
        AnonymousClass7TF.A1C(userSession, 0, r3);
        gjH.A04.A0F((AnonymousClass9IV) null, r3, user.Bh3());
        TextView textView = gjH.A03;
        DbU.A1H(textView, user);
        Context context = textView.getContext();
        DbT.A17(context, textView, 2Yu.A0H(context, R.attr.igds_color_primary_text));
        String B3O = user.A03.B3O();
        if (B3O == null || B3O.length() == 0) {
            fullName = user.getFullName();
        } else {
            fullName = user.A03.B3O();
        }
        if (fullName == null || fullName.length() == 0) {
            gjH.A02.setVisibility(8);
        } else {
            TextView textView2 = gjH.A02;
            textView2.setVisibility(0);
            textView2.setText(fullName);
        }
        FollowButton followButton = gjH.A00;
        if (!(followButton == null || (r0 = followButton.A0J) == null)) {
            r0.A03(r3, userSession, user);
        }
        ID1.A01(gjH.A01, 39, wvv);
    }

    public final Class modelClass() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C53145GjH(DbT.A0D(layoutInflater, viewGroup, R.layout.follow_list_row, false));
    }
}
