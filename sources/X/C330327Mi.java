package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7Mi  reason: invalid class name and case insensitive filesystem */
public final class C330327Mi extends C252233om {
    public final AnonymousClass7UC A00;
    public final C333457Za A01;
    public final C62320sa A02;
    public final C74339PtF A03 = new C330337Mj(this);
    public final C2596742q A04;

    public C330327Mi(UserSession userSession, AnonymousClass7UC r3, C333457Za r4, C62320sa r5) {
        0qQ.A0B(r3, 3);
        0qQ.A0B(r5, 4);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A04 = MYQ.A00(userSession);
    }

    public static final void A00(C330327Mi r7, C67292MlR mlR) {
        User CCg;
        2Et r6 = (2Et) r7.A02.invoke();
        if (r6 != null) {
            ArrayList arrayList = new ArrayList();
            C2596942s r1 = mlR.A02;
            C73550Peh peh = r1.A00;
            if (peh == null) {
                peh = new C73550Peh(r1);
                r1.A00 = peh;
            }
            Iterator it = peh.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                0qQ.A0A(entry);
                C299305uu r2 = (C299305uu) entry.getKey();
                Number number = (Number) entry.getValue();
                if (C67579MqD.A00.contains(number) && (CCg = r6.CCg(r2.A01, r2.A00)) != null) {
                    0qQ.A0A(number);
                    arrayList.add(new AnonymousClass9IM(CCg, number.intValue()));
                }
            }
            AnonymousClass7UC r22 = r7.A00;
            boolean A012 = r22.A01();
            r7.A01.Ctg(arrayList);
            if (A012 && !r22.A02.A00) {
                r22.A00(false);
            }
        }
    }

    public final void A01() {
        2Eq r0 = (2Eq) this.A02.invoke();
        if (r0 != null) {
            C2596742q r3 = this.A04;
            String C6C = r0.C6C();
            String C6k = r0.C6k();
            if (C6C != null || C6k != null) {
                C67292MlR mlR = (C67292MlR) r3.A01.A00(new C299305uu(C6C, C6k));
                if (mlR != null) {
                    A00(this, mlR);
                }
            }
        }
    }

    public final void onPause() {
        C2596742q r2 = this.A04;
        C74339PtF ptF = this.A03;
        0qQ.A0B(ptF, 0);
        r2.A04.remove(ptF);
    }

    public final void onResume() {
        C2596742q r2 = this.A04;
        C74339PtF ptF = this.A03;
        0qQ.A0B(ptF, 0);
        r2.A04.add(ptF);
        A01();
    }
}
