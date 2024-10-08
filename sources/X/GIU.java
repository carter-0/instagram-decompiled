package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import java.util.ArrayList;
import java.util.List;

public final class GIU implements C228812mN {
    public final /* bridge */ /* synthetic */ C271744jW AMS(Object obj) {
        C376489Ie r2 = (C376489Ie) obj;
        0qQ.A0B(r2, 0);
        return new C271834jf(r2);
    }

    public final /* bridge */ /* synthetic */ int AZx(Object obj) {
        C267324bN r0;
        C57031ILx A03;
        List list;
        C267324bN r02;
        C376489Ie r4 = (C376489Ie) obj;
        boolean z = true;
        if (r4 == null || (r02 = (C267324bN) r4.A03) == null || !r02.A0F()) {
            z = false;
        }
        if (z) {
            if (r4 == null || (r0 = (C267324bN) r4.A03) == null || (A03 = r0.A03()) == null || (list = (List) A03.A01.A00) == null) {
                return 0;
            }
            return list.size();
        } else if (r4 == null) {
            return 0;
        } else {
            C267324bN r03 = (C267324bN) r4.A03;
            0qQ.A0B(r03, 0);
            if (GDZ.A00(r03)) {
                return 1;
            }
            return 0;
        }
    }

    public final /* bridge */ /* synthetic */ Integer Ahl(Object obj) {
        1Xj A0l = C51968G9o.A0l((C267324bN) obj);
        if (A0l != null) {
            return A0l.A2J();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ String BJS(Object obj) {
        C267324bN r2 = (C267324bN) obj;
        0qQ.A0B(r2, 0);
        return r2.getId();
    }

    public final /* bridge */ /* synthetic */ List BUO(Object obj) {
        C376489Ie r7 = (C376489Ie) obj;
        0qQ.A0B(r7, 0);
        C267324bN r3 = (C267324bN) r7.A03;
        if (!r3.A0F()) {
            return 0sn.A00;
        }
        C376699Iz r0 = r3.A03().A01;
        0sn r2 = 0sn.A00;
        String str = r0.A02;
        IntentAwareAdsInfoIntf intentAwareAdsInfoIntf = (IntentAwareAdsInfoIntf) r0.A01;
        C51973G9u.A1E(str, intentAwareAdsInfoIntf, r2);
        C376699Iz r5 = new C376699Iz(intentAwareAdsInfoIntf, str, (List) r2);
        List<AnonymousClass3OA> A02 = C57031ILx.A02(r3);
        ArrayList A0r = AnonymousClass7TG.A0r(A02);
        for (AnonymousClass3OA A01 : A02) {
            A0r.add(new C376489Ie(C295375o3.A01(r5, A01), (C233462vl) r7.A04));
        }
        return A0r;
    }

    public final /* bridge */ /* synthetic */ boolean CVx(Object obj) {
        C267324bN r4 = (C267324bN) obj;
        0qQ.A0B(r4, 0);
        if (r4.A01 == C295365o2.NETEGO) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean CVy(Object obj) {
        C267324bN r2 = (C267324bN) obj;
        0qQ.A0B(r2, 0);
        return GDZ.A01(r2.A01);
    }

    public final /* bridge */ /* synthetic */ boolean CXm(Object obj) {
        C267324bN r0;
        C376489Ie r3 = (C376489Ie) obj;
        if (r3 == null || (r0 = (C267324bN) r3.A03) == null || !r0.A0F()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean CYA(Object obj) {
        C295365o2 r1;
        C267324bN r0;
        C376489Ie r3 = (C376489Ie) obj;
        if (r3 == null || (r0 = (C267324bN) r3.A03) == null) {
            r1 = null;
        } else {
            r1 = r0.A01;
        }
        return AnonymousClass7TF.A1W(r1, C295365o2.NETEGO);
    }

    public final /* bridge */ /* synthetic */ boolean CcL(Object obj) {
        C376489Ie r2 = (C376489Ie) obj;
        if (r2 != null) {
            return GDZ.A00(C51969G9p.A0g(r2.A03));
        }
        return false;
    }

    public final /* synthetic */ boolean ACJ(Object obj, Object obj2) {
        return false;
    }

    public final /* synthetic */ boolean ACN(Object obj, Object obj2) {
        return false;
    }

    public final /* bridge */ /* synthetic */ Integer Ahi(Object obj) {
        C267324bN A0g = C51969G9p.A0g(obj);
        if (A0g.A01 == C295365o2.MIDCARD) {
            return A0g.A01().A00;
        }
        1Xj r0 = A0g.A02;
        if (r0 != null) {
            return r0.A2I();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ String BEZ(Object obj) {
        C267324bN A0Y = C51972G9s.A0Y(obj);
        if (A0Y.A0G() || A0Y.A01 == C295365o2.BRAND_SURVEY) {
            return A0Y.getId();
        }
        return C51966G9m.A1B(A0Y);
    }

    public final /* bridge */ /* synthetic */ String BEb(Object obj) {
        return C51969G9p.A0g(obj).getId();
    }

    public final /* bridge */ /* synthetic */ boolean CVw(Object obj) {
        return C51969G9p.A0g(obj).A0F();
    }

    public final /* synthetic */ int AZD(Object obj) {
        return -1;
    }

    public final /* bridge */ /* synthetic */ Integer BUT(Object obj) {
        return null;
    }

    public final /* bridge */ /* synthetic */ 1Pi BXm(Object obj) {
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CcM(Object obj) {
        return false;
    }
}
