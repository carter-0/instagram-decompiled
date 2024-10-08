package X;

import android.content.Context;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

public final class LDS {
    public final AnonymousClass2t9 A00;
    public final UserSession A01;
    public final OO7 A02;
    public final C329207Hz A03;

    public final void A00(List list) {
        0qQ.A0B(list, 0);
        ViewModelListUpdate A0R = DbS.A0R();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0R.A00(new C61175JyR(JTO.A0a(it), C318046oG.AVATAR, MO9.A00));
        }
        this.A00.A05(A0R);
    }

    public LDS(Context context, UserSession userSession, OO7 oo7, C329207Hz r9) {
        this.A01 = userSession;
        this.A03 = r9;
        this.A02 = oo7;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        UserSession userSession2 = this.A01;
        C329207Hz r2 = this.A03;
        A002.A01(new C68620NPq(userSession2, r2));
        A002.A01(new C15821Uj4(userSession2, r2));
        this.A00 = DbU.A0U(A002, new KG3(userSession2, this.A02, r2));
    }
}
