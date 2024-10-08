package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;

public final class LDF {
    public final AnonymousClass2gB A00;
    public final C63734L4s A01;
    public final C63866L9v A02;

    public final void A00(LFH lfh, String str) {
        String str2;
        String str3 = str;
        0qQ.A0B(str3, 1);
        C63866L9v l9v = this.A02;
        UserSession userSession = l9v.A02;
        LFH lfh2 = lfh;
        String str4 = lfh2.A01;
        boolean z = lfh2.A03;
        boolean z2 = lfh2.A04;
        boolean z3 = lfh2.A02;
        if (z3) {
            str2 = null;
        } else {
            str2 = l9v.A03.A03.A07;
        }
        MusicProduct musicProduct = l9v.A01;
        String str5 = l9v.A05;
        0qQ.A0B(str4, 1);
        1NY A002 = LSH.A00(musicProduct, userSession, str4, str2, str5, str3, z, z2);
        if (str2 != null) {
            A002.A9m("cursor", str2);
        }
        1OC A0M = A002.A0M();
        A0M.A01 = new LeW(l9v, str4, A0M.hashCode());
        L22 l22 = l9v.A04;
        A0M.hashCode();
        29H A0K = JTS.A0K(l22.A00.A0A);
        String str6 = A0K.A05;
        if (str6 == null || !str6.equals(str4)) {
            A0K.A0E.A0D(C66579MXk.A00(364), A0K.A03, (String) null, (String) null, (String) null, (String) null);
        }
        C61918KRn kRn = new C61918KRn(lfh2, l9v, A0M.hashCode());
        if (z3) {
            1NY A003 = LSH.A00(musicProduct, userSession, str4, (String) null, str5, str3, z, z2);
            A003.A07(AnonymousClass05K.A0C);
            1OC A0M2 = A003.A0M();
            C324356z9 r0 = l9v.A03;
            C324366zA r3 = r0.A03;
            AnonymousClass4D6 r2 = r0.A02;
            C54252H4v h4v = new C54252H4v(r0.A00, r2, kRn, r3);
            A0M2.A00 = h4v;
            r2.schedule(A0M2);
            A0M.A00 = new C319936rT(A0M, h4v, kRn, r3);
            r2.schedule(A0M);
            return;
        }
        l9v.A03.A03(A0M, kRn);
    }

    public LDF(C63734L4s l4s, C63866L9v l9v) {
        this.A02 = l9v;
        this.A01 = l4s;
        AnonymousClass2gB r4 = new AnonymousClass2gB();
        this.A00 = r4;
        r4.A0E(l4s.A00, new C64318LZs(31, JTO.A1C(r4, 68)));
        MP7.A00(l9v.A00, r4, this, 46, 31);
    }
}
