package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.EPw  reason: case insensitive filesystem */
public final class C47990EPw extends AnonymousClass3PS {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ ENK A01;

    public final void A01(Map map) {
        1Xj A1c;
        0qQ.A0B(map, 0);
        List<Reel> A0a = 00k.A0a(map.values());
        HashMap A1E = AnonymousClass7TE.A1E();
        for (Reel reel : A0a) {
            if (reel.A1A(this.A00)) {
                Set A0Q = reel.A0Q();
                0qQ.A07(A0Q);
                if (!A0Q.isEmpty()) {
                    A1E.put(reel.getId(), A0Q);
                }
            }
        }
        AnonymousClass3PY r0 = AnonymousClass3PX.A02;
        UserSession userSession = this.A00;
        r0.A01(userSession, A1E);
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Reel A0O : A0a) {
            List A0O2 = A0O.A0O(userSession);
            0qQ.A07(A0O2);
            int size = A0O2.size();
            for (int i = 0; i < size; i++) {
                1Xj r1 = ((C255773uh) A0O2.get(i)).A0b;
                if (r1 != null) {
                    ExtendedImageUrl A1n = r1.A1n(userSession.A03.A06());
                    if (A1n != null) {
                        1OO A0J = 1NK.A00().A0J(A1n, "notification_prefetch");
                        A0J.A0I = true;
                        r1.A17();
                        A0J.A0F = false;
                        A1C.add(A0J.A00());
                    }
                    if ((r1.CeS() || (r1.A5D() && (A1c = r1.A1c(r1.A0w())) != null && A1c.CeS())) && (!r1.A5D() || (r1 = r1.A1c(r1.A0w())) != null)) {
                        A1C2.add(new C256203vO(r1.CEL(), "notification_prefetch"));
                    }
                }
            }
        }
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            1NK.A00().A0N((C226952iF) it.next());
        }
        Iterator it2 = A1C2.iterator();
        while (it2.hasNext()) {
            C255593uO.A00(userSession).A01((C256203vO) it2.next());
        }
    }

    public C47990EPw(UserSession userSession, ENK enk) {
        this.A00 = userSession;
        this.A01 = enk;
    }
}
