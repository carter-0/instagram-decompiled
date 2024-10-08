package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class GDP implements 27S {
    public final /* synthetic */ C227232is A00;

    public GDP(C227232is r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C2370736f r7 = (C2370736f) obj;
        0qQ.A0B(r7, 0);
        GD6 gd6 = this.A00.A0C;
        if (gd6 == null) {
            0qQ.A0F("viewerAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        User user = r7.A00;
        List A0I = gd6.A0A.A0I();
        if (!(A0I instanceof Collection) || !A0I.isEmpty()) {
            Iterator it = A0I.iterator();
            while (it.hasNext()) {
                C267324bN A0m = C51966G9m.A0m(it);
                UserSession userSession = gd6.A09;
                AnonymousClass4JJ.A00(userSession);
                1Xj r0 = A0m.A02;
                if (r0 != null && AnonymousClass4JK.A01(userSession, r0, user)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(1566116452);
        C2370736f r12 = (C2370736f) obj;
        int A0D = AnonymousClass7TG.A0D(r12, 1815179902);
        C227232is r5 = this.A00;
        GD6 gd6 = r5.A0C;
        if (gd6 != null) {
            User user = r12.A00;
            List A0I = gd6.A0A.A0I();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : A0I) {
                UserSession userSession = gd6.A09;
                AnonymousClass4JJ.A00(userSession);
                1Xj r0 = ((C267324bN) next).A02;
                if (r0 != null && AnonymousClass4JK.A01(userSession, r0, user)) {
                    A1C.add(next);
                }
            }
            AnonymousClass4JJ.A00(C227232is.A01(r5));
            Iterator it = A1C.iterator();
            while (true) {
                if (it.hasNext()) {
                    1Xj A0n = C51968G9o.A0n(it);
                    if (A0n == null) {
                        i = -1062054768;
                        break;
                    }
                    AnonymousClass4JK.A00(C227232is.A01(r5), A0n, user);
                } else if (r5.A0C != null) {
                    i = -1813680612;
                }
            }
            AnonymousClass0fD.A0A(i, A0D);
            AnonymousClass0fD.A0A(-2049801149, A03);
            return;
        }
        0qQ.A0F("viewerAdapter");
        throw AnonymousClass00P.createAndThrow();
    }
}
