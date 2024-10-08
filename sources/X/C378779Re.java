package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9Re  reason: invalid class name and case insensitive filesystem */
public final class C378779Re implements MUD {
    public final /* synthetic */ C363528js A00;
    public final /* synthetic */ String A01;

    public C378779Re(C363528js r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void DED() {
        C363528js.A02(this.A00, AnonymousClass05K.A00, this.A01);
    }

    public final void DoW(AnonymousClass9R1 r14) {
        C363528js r2 = this.A00;
        String str = this.A01;
        Integer num = AnonymousClass05K.A00;
        C363528js.A03(r2, num, str);
        r2.A02.A02(num, str, C363528js.A05(C295905p6.FEED, r14));
        boolean A05 = C363528js.A05(C295905p6.STORY, r14);
        C363018iu r1 = C363008it.A05;
        UserSession userSession = r2.A01;
        r1.A01(userSession, num, str, A05, false);
        boolean A052 = C363528js.A05(C295905p6.REELS, r14);
        UserSession userSession2 = userSession;
        String str2 = str;
        AnonymousClass9Q7.A03(userSession2, str2, "server_setting_fetch_success_not_null", String.valueOf(A052), C378169Ot.A01(num), C367288qV.A06(userSession));
        C367288qV.A0A(userSession, str, A052, false);
    }
}
