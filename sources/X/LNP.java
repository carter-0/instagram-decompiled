package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class LNP {
    public static final LNP A00 = new Object();

    public final Integer A00(UserSession userSession, AnonymousClass3Q2 r6, String str, boolean z, boolean z2) {
        if (z2) {
            return AnonymousClass05K.A06;
        }
        if (z) {
            return AnonymousClass05K.A02;
        }
        if (0qQ.A0K(r6.A13.A03, "com.instagram.barcelona")) {
            return AnonymousClass05K.A0C;
        }
        if (r6.A5i) {
            return AnonymousClass05K.A0N;
        }
        AnonymousClass3QO r1 = r6.A1F;
        if (r1 == AnonymousClass3QO.CLOSE_FRIENDS) {
            return AnonymousClass05K.A0j;
        }
        if (r1 == AnonymousClass3QO.OPAL) {
            return AnonymousClass05K.A1I;
        }
        if (r6.A5f) {
            return AnonymousClass05K.A0u;
        }
        if (r6.A67) {
            return AnonymousClass05K.A15;
        }
        if (r6.A1p != null) {
            return AnonymousClass05K.A05;
        }
        if (str.length() > 500) {
            return AnonymousClass05K.A0Y;
        }
        C272044k0 r0 = r6.A0u;
        if (r0 != null && r0.A01 != null) {
            return AnonymousClass05K.A1F;
        }
        if (r6.A0u() && r6.A0L().size() > DbS.A04(0Tu.A05, userSession, 36605576767673620L)) {
            return AnonymousClass05K.A04;
        }
        if (r6.A0y() || r6.A0u()) {
            if (r6.A0u()) {
                List A0L = r6.A0L();
                if (!(A0L instanceof Collection) || !A0L.isEmpty()) {
                    Iterator it = A0L.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!JTO.A0m(it).A0y()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        } else if (!182.A06(0Tu.A05, userSession, 36324101790641959L)) {
            return AnonymousClass05K.A03;
        }
        if (C324536zU.A00(userSession)) {
            return AnonymousClass05K.A07;
        }
        if (r6.A1F != AnonymousClass3QO.DEFAULT) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A00;
    }
}
