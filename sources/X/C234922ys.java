package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2ys  reason: invalid class name and case insensitive filesystem */
public final class C234922ys implements C234932yt {
    public final UserSession A00;
    public final 1Ua A01;

    public final void A7J(C254353sL r7, AnonymousClass30Y r8, C252093oY r9) {
        List<C254303sG> list = r7.A06;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (C254303sG r0 : list) {
            arrayList.add(r0.A00);
        }
        if (!arrayList.isEmpty() && C292955jn.A00((C254323sI) arrayList.get(0)) >= 250) {
            UserSession userSession = this.A00;
            1Xv r02 = 1Xj.A0h;
            this.A01.A02(((1Xj) r8.A03).A36(userSession, false));
        }
    }

    public C234922ys(UserSession userSession, 1Ua r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }
}
