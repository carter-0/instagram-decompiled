package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class GDN implements 27S {
    public final /* synthetic */ GBE A00;
    public final /* synthetic */ GD6 A01;

    public GDN(GBE gbe, GD6 gd6) {
        this.A01 = gd6;
        this.A00 = gbe;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C2370836g r7 = (C2370836g) obj;
        0qQ.A0B(r7, 0);
        GD6 gd6 = this.A01;
        User user = r7.A00;
        Iterator A07 = C52009GBg.A07(gd6.A0A);
        while (true) {
            if (!A07.hasNext()) {
                break;
            }
            Object next = A07.next();
            if (0qQ.A0K(((C267324bN) next).A08(gd6.A09), user)) {
                if (next == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(205501712);
        C2370836g r12 = (C2370836g) obj;
        int A032 = AnonymousClass0fD.A03(1762076765);
        0qQ.A0B(r12, 0);
        User user = r12.A00;
        boolean CPV = user.CPV();
        GBE gbe = this.A00;
        if (CPV) {
            GD6 gd6 = this.A01;
            List A0I = gd6.A0A.A0I();
            ArrayList<C267324bN> A1C = AnonymousClass7TE.A1C();
            for (Object next : A0I) {
                if (0qQ.A0K(((C267324bN) next).A08(gd6.A09), user)) {
                    A1C.add(next);
                }
            }
            for (C267324bN r4 : A1C) {
                C54575HJk hJk = gbe.A0q;
                UserSession userSession = gbe.A0a;
                0qQ.A0B(r4, 0);
                0qQ.A0B(hJk, 1);
                0qQ.A0B(userSession, 2);
                1Xj r1 = r4.A02;
                if (r1 != null) {
                    1sd.A00(userSession).A02(r1, false);
                    hJk.Eie(r4, AnonymousClass3WA.A0F);
                }
                GBE.A02(r4, gbe);
            }
        }
        C227232is r0 = gbe.A07;
        if (r0 == null || r0.A0C != null) {
            AnonymousClass0fD.A0A(1543448704, A032);
            AnonymousClass0fD.A0A(-1935632533, A03);
            return;
        }
        0qQ.A0F("viewerAdapter");
        throw AnonymousClass00P.createAndThrow();
    }
}
