package X;

import com.instagram.common.session.UserSession;

public final class N8P extends AnonymousClass0T0 implements C74245PrZ {
    public final C61084JwM A00;
    public final OFH A01;
    public final Integer A02;
    public final UserSession A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8P) {
                N8P n8p = (N8P) obj;
                if (this.A02 != n8p.A02 || !0qQ.A0K(this.A01, n8p.A01) || !0qQ.A0K(this.A03, n8p.A03) || !0qQ.A0K(this.A00, n8p.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A02;
        return AnonymousClass7TF.A07(this.A03, C51975G9x.A05(this.A01, C51971G9r.A0D(num, C70091Nx7.A00(num)) * 31) * 31) + AnonymousClass7TG.A0C(this.A00);
    }

    public N8P(C61084JwM jwM, UserSession userSession, OFH ofh, Integer num) {
        this.A02 = num;
        this.A01 = ofh;
        this.A03 = userSession;
        this.A00 = jwM;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LoadMessagesAction(loadType=");
        Integer num = this.A02;
        if (num != null) {
            str = C70091Nx7.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", viewModelGenerators=");
        A1A.append(this.A01);
        C51975G9x.A1G(A1A, ", fetchNullStateHeaderOnly=");
        A1A.append(", userSession=");
        A1A.append(this.A03);
        A1A.append(", messageHighlightModel=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
