package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.GhH  reason: case insensitive filesystem */
public final class C53026GhH extends 2YL {
    public C56512Hzj A00;
    public Long A01;
    public final UserSession A02;
    public final String A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A02, new C58672Ivh(this, 21));
    public final AnonymousClass0r6 A05;
    public final 05G A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;
    public final C56027HrZ A09;

    public static final void A00(C53026GhH ghH, boolean z) {
        05G r4 = ghH.A07;
        C61068Jw6 jw6 = (C61068Jw6) r4.getValue();
        r4.FIA(C61068Jw6.A01((C54650HMh) jw6.A04, (Boolean) jw6.A03, (AnonymousClass62P) jw6.A05, z, jw6.A00));
        if (182.A06(0Tu.A05, ghH.A02, 36328349513825556L)) {
            ghH.A06.FIA(new C53529Gpz(z, 2));
        }
        ghH.A09.A00(z);
    }

    public final void A01() {
        05G r10 = this.A07;
        C61068Jw6 jw6 = (C61068Jw6) r10.getValue();
        boolean z = !((C61068Jw6) r10.getValue()).A00;
        boolean z2 = jw6.A01;
        Boolean bool = (Boolean) jw6.A03;
        C54650HMh hMh = (C54650HMh) jw6.A04;
        Collection collection = (Collection) jw6.A05;
        0qQ.A0B(collection, 3);
        ArrayList A1D = AnonymousClass7TE.A1D(collection);
        ArrayList A0r = AnonymousClass7TG.A0r(A1D);
        Iterator it = A1D.iterator();
        while (it.hasNext()) {
            C46539Dgg dgg = (C46539Dgg) it.next();
            String str = dgg.A01;
            String str2 = dgg.A02;
            AnonymousClass7TF.A1H(str, str2);
            A0r.add(new C46539Dgg(str, str2, 2, false));
        }
        r10.FIA(C61068Jw6.A01(hMh, bool, AnonymousClass62Q.A00(A0r), z2, z));
    }

    public C53026GhH(UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
        C56027HrZ A002 = HYV.A00(userSession);
        this.A09 = A002;
        02z A10 = DbS.A10(new C61068Jw6(!A002.A01()));
        this.A07 = A10;
        this.A08 = 10b.A03(A10);
        02z A012 = 106.A01(IQQ.A00);
        this.A06 = A012;
        this.A05 = 10b.A03(A012);
    }
}
