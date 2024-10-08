package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6oB  reason: invalid class name and case insensitive filesystem */
public final class C317996oB {
    public final UserSession A00;

    public C317996oB(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A02(AnonymousClass2Ep r6) {
        UserSession userSession = this.A00;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 2342161901208738417L)) {
            List A002 = A00(r6);
            if (!A002.isEmpty() && 182.A06(r3, userSession, 36320824730657666L)) {
                OXH.A02(new C74193PqZ(A002, 10), userSession);
            }
        }
    }

    private final List A00(AnonymousClass2Ep r7) {
        C242373Tu AiM;
        01N A1H = 0jo.A1H();
        if (!(r7 == null || (AiM = r7.AiM()) == null)) {
            UserSession userSession = this.A00;
            if (AiM.A01() || AiM.A03(userSession)) {
                List<String> BRX = r7.BRX();
                ArrayList arrayList = new ArrayList();
                for (String str : BRX) {
                    0qQ.A0A(str);
                    0qQ.A0B(str, 0);
                    Long A0n = 00y.A0n(10, str);
                    if (A0n != null) {
                        arrayList.add(A0n);
                    }
                }
                A1H.addAll(arrayList);
            }
        }
        Long BST = AnonymousClass0t1.A01.A01(this.A00).BST();
        if (BST != null) {
            A1H.add(BST);
        }
        return 0jo.A1I(A1H);
    }

    public final void A01(AnonymousClass2Ep r6) {
        C242373Tu AiM = r6.AiM();
        if (AiM != null) {
            UserSession userSession = this.A00;
            if (AiM.A01() || AiM.A03(userSession)) {
                List A002 = A00(r6);
                if (!A002.isEmpty()) {
                    0Tu r2 = 0Tu.A05;
                    if (182.A06(r2, userSession, 36320824730657666L)) {
                        OXH.A02(new C74193PqZ(A002, 10), userSession);
                    }
                    if (182.A06(r2, userSession, 36320824730723203L)) {
                        OXH.A02(new C74191PqX(21, (Object) A002, (Object) null), userSession);
                    }
                }
            }
        }
    }
}
