package X;

import com.instagram.common.session.UserSession;

public final class PIW implements AnonymousClass2Zd {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass3Q2 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0r1 A03;
    public final /* synthetic */ 0rm A04;

    public final void DFp(AnonymousClass3Q2 r15) {
        String str;
        String str2;
        0qQ.A0B(r15, 0);
        if (2PP.A00(r15.A3t, this.A01.A3t)) {
            AnonymousClass3QD r3 = r15.A1f;
            AnonymousClass3QD r2 = r15.A6J;
            0r1 r1 = this.A03;
            boolean z = r1.A00;
            if (r3 == r2) {
                if (!z) {
                    UserSession userSession = this.A00;
                    C70883OQa.A01((C69451Nlv) this.A04.A00, OYS.A00, userSession, this.A02, (String) null, true);
                } else {
                    return;
                }
            } else if (!z) {
                UserSession userSession2 = this.A00;
                C71854Orv orv = OYS.A00;
                String str3 = this.A02;
                C69451Nlv nlv = (C69451Nlv) this.A04.A00;
                AnonymousClass55U r0 = r15.A6I;
                if (r0 != null) {
                    str = r0.A07;
                } else {
                    str = null;
                }
                AnonymousClass55U r02 = r15.A6I;
                if (r02 != null) {
                    str2 = r02.A02;
                } else {
                    str2 = null;
                }
                C70883OQa.A01(nlv, orv, userSession2, str3, 002.A0T(str, str2, ' '), false);
            } else {
                return;
            }
            r1.A00 = true;
        }
    }

    public final /* synthetic */ void DQx(AnonymousClass3Q2 r1) {
    }

    public PIW(UserSession userSession, AnonymousClass3Q2 r2, String str, 0r1 r4, 0rm r5) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = userSession;
        this.A02 = str;
        this.A04 = r5;
    }
}
