package X;

import com.instagram.common.typedurl.SimpleImageUrl;

public final class P2C implements C74392Pu8 {
    public final Object AWj(OU2 ou2) {
        String A02;
        0qQ.A0B(ou2, 0);
        OG9 og9 = (OG9) ou2.A03.getValue();
        Number A0r = C66580MXl.A0r(ou2.A04);
        if (A0r == null) {
            return null;
        }
        long longValue = A0r.longValue();
        if (og9 != null) {
            A02 = og9.A03;
            if (A02 == null) {
                A02 = "";
            }
        } else {
            A02 = OXF.A02(DbS.A0t(ou2.A02), (String) null, longValue);
            0qQ.A0A(A02);
        }
        SimpleImageUrl simpleImageUrl = new SimpleImageUrl(A02, AnonymousClass7TG.A0A(C66580MXl.A0r(ou2.A0C)), C51967G9n.A04(C66580MXl.A0r(ou2.A0B), 0));
        C317966o8 r1 = new C317966o8();
        r1.A0H = simpleImageUrl;
        String str = r1.A0a;
        0qQ.A07(str);
        r1.A0S = r1.A0a;
        return new C317876nz((C318046oG) null, str, AnonymousClass7TE.A1I(r1));
    }

    public final 2FW BZu(OU2 ou2) {
        return 2FW.A1b;
    }
}
