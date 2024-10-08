package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class NL1 extends C331047Ph {
    public final int A00;
    public final User A01;
    public final C68512NLj A02;
    public final C68513NLk A03;
    public final boolean A04;
    public final Context A05;
    public final UserSession A06;
    public final C68511NLi A07;

    public NL1(Context context, UserSession userSession, User user, C69230Nhk nhk, C74435Pup pup, int i, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A05 = context;
        this.A06 = userSession;
        this.A01 = user;
        this.A00 = i;
        this.A04 = z;
        C68513NLk nLk = new C68513NLk(context, userSession, pup);
        this.A03 = nLk;
        C68512NLj nLj = new C68512NLj(context, userSession, nhk);
        this.A02 = nLj;
        C68511NLi nLi = new C68511NLi(context, (UserSession) null);
        this.A07 = nLi;
        A0B(nLk, nLj, nLi);
    }
}
