package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GtQ  reason: case insensitive filesystem */
public final class C53735GtQ extends C251343mx {
    public final UserSession A00;
    public final C242813Wa A01;
    public final User A02;
    public final String A03;

    public C53735GtQ(UserSession userSession, C242813Wa r3, User user, String str) {
        0qQ.A0B(user, 4);
        this.A03 = str;
        this.A01 = r3;
        this.A00 = userSession;
        this.A02 = user;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r10) {
        boolean A1Z = C51966G9m.A1Z(r10);
        2WX A0X = C51965G9l.A0X((2WX) null, G9t.A14());
        Drawable drawable = C243803a8.A00(r10).getDrawable(R.drawable.clips_close_friends_badge_background);
        Integer num = AnonymousClass05K.A00;
        2WX A0Z = C51971G9r.A0Z(C51971G9r.A0Y(C51972G9s.A0V(C51971G9r.A0Y(A0X, num, drawable, 4), new J6K(this, 32)), AnonymousClass05K.A0D, Integer.valueOf(R.id.feed_close_friends_indicator_component), 4), AnonymousClass05K.A0Y, J6S.A00(r10, this, 32), (String) null);
        2Wb A0Q = C51972G9s.A0Q(r10);
        Drawable A0K = C51968G9o.A0K(A0Q, R.drawable.instagram_star_pano_filled_12);
        2V1 r3 = A0Q.A00;
        Context context = r3.A0C;
        C51972G9s.A0w(A0K, A0Q, 2Yu.A0E(context));
        C247393gG A0a = C51971G9r.A0a(A0K, r3);
        A0a.A0C();
        A0Q.A00(A0a.A0A());
        2WX A0R = C51972G9s.A0R(C51972G9s.A0T(AnonymousClass9JR.A00((2WX) null, num, A1Z ? 1 : 0, C244013aV.A0B(A0Q)), A1Z, C244013aV.A0B(A0Q)), A1Z, C244013aV.A09(A0Q));
        Drawable A0K2 = C51968G9o.A0K(A0Q, R.drawable.instagram_chevron_down_pano_filled_12);
        C51972G9s.A0w(A0K2, A0Q, 2Yu.A0E(context));
        C51974G9v.A0h(A0K2, r3, A0Q, A0R);
        return C243563Zg.A0G(A0Q, r10, A0Z);
    }
}
