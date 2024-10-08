package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3P8  reason: invalid class name */
public abstract class AnonymousClass3P8 {
    public static final List A01(UserSession userSession, C239763Ib r5) {
        0qQ.A0B(userSession, 1);
        0sn<AnonymousClass3HY> C9k = r5.C9k();
        if (C9k == null) {
            C9k = 0sn.A00;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(C9k, 10));
        for (AnonymousClass3HY FEr : C9k) {
            arrayList.add(FEr.FEr(1E4.A00(userSession)));
        }
        return arrayList;
    }

    public static final List A00(UserSession userSession, C239763Ib r5) {
        0sn<C239663Hm> Ai9 = r5.Ai9();
        if (Ai9 == null) {
            Ai9 = 0sn.A00;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(Ai9, 10));
        for (C239663Hm F10 : Ai9) {
            C270194gL r1 = new C270194gL(F10.F10(1E4.A00(userSession)));
            r1.A0N = AnonymousClass05K.A00;
            arrayList.add(r1);
        }
        return arrayList;
    }

    public static final boolean A02(C239763Ib r1) {
        return 0qQ.A0K(r1.C03(), true);
    }
}
