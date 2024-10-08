package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DlX  reason: case insensitive filesystem */
public final class C46796DlX extends 2YL implements G5z {
    public final 2ah A00;

    public C46796DlX(2ah r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final 2Fk AD7(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        List A17 = DbV.A17(userSession);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A17) {
            DbV.A1U(next, A1C, 0qQ.A0K(next, A0Q) ? 1 : 0);
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            A0r.add(new MC0(8, A0k, this.A00.A00(new AnonymousClass4DE((2aD) null, A0k.getId()))));
        }
        return DbT.A0G(new C51623FxC((AnonymousClass0r6[]) 00k.A0a(A0r).toArray(new AnonymousClass0r6[0]), 11));
    }
}
