package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class F3J {
    public final Context A00;
    public final UserSession A01;
    public final Fragment A02;

    public F3J(Fragment fragment, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A02 = fragment;
        this.A00 = fragment.requireContext();
        this.A01 = userSession;
    }

    public final void A00(Context context, User user, String str, boolean z) {
        String str2;
        int i;
        User user2 = user;
        boolean A1w = user.A1w();
        user.A0z(!A1w);
        UserSession userSession = this.A01;
        user.A0d(userSession);
        String id = user.getId();
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        Object[] objArr = {id};
        if (A1w) {
            str2 = "friendships/unblock_friend_reel/%s/";
        } else {
            str2 = "friendships/block_friend_reel/%s/";
        }
        DbU.A1P(A0a, str2, objArr);
        A0a.A9m("source", str);
        A0a.A0O((15p) null, DwR.class, C49810F7x.class, false);
        1OC A0U = DbT.A0U(A0a, true);
        A0U.A00 = new C61497KAc(1, user2, context, this, A1w);
        1ES.A01().schedule(A0U);
        Context context2 = this.A00;
        boolean A1w2 = user.A1w();
        if (z) {
            i = 2131976226;
            if (A1w2) {
                i = 2131976225;
            }
        } else {
            i = 2131976346;
            if (A1w2) {
                i = 2131976345;
            }
        }
        String A0b = DbY.A0b(context2, user, i);
        0qQ.A0A(A0b);
        C59689JTv.A03(context, A0b, (String) null, 0);
    }

    public final void A01(G7P g7p, User user, String str, boolean z, boolean z2) {
        C358248ab r4;
        String username;
        User user2 = user;
        0qQ.A0B(user2, 0);
        G7P g7p2 = g7p;
        String str2 = str;
        boolean z3 = z2;
        if (!user2.A1w()) {
            Context context = this.A00;
            int i = 2131953898;
            if (z2) {
                i = 2131966694;
            }
            String A0b = DbY.A0b(context, user2, i);
            0qQ.A0A(A0b);
            int i2 = 2131953896;
            if (AnonymousClass0Ke.A00(context) >= 2011) {
                i2 = 2131953897;
            }
            String A0b2 = DbY.A0b(context, user2, i2);
            0qQ.A0A(A0b2);
            r4 = DbX.A0g(context, A0b2, A0b);
            r4.A0C(new C49969FHc(15));
            r4.A0I(new C49998FIj(g7p2, this, user2, str2, 1, z3), 2131963365);
        } else if (z) {
            A00(this.A00, user2, str2, z3);
            if (g7p != null) {
                g7p2.Dc4();
                return;
            }
            return;
        } else {
            int i3 = 2131966165;
            if (z2) {
                i3 = 2131966162;
            }
            Context context2 = this.A00;
            if (user2.BIW() == 1) {
                username = user2.getFullName();
            } else {
                username = user2.getUsername();
            }
            CharSequence[] charSequenceArr = {DbW.A0h(context2, username, i3)};
            r4 = DbS.A0Y(context2);
            r4.A0l(this.A02, this.A01);
            r4.A0e(new C49998FIj(g7p2, this, user2, str2, 0, z3), charSequenceArr);
        }
        AnonymousClass7TH.A0a(r4, true);
    }
}
