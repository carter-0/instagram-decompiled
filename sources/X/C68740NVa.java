package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.NVa  reason: case insensitive filesystem */
public final class C68740NVa extends P1Z {
    public String A00;
    public final 1a8 A01 = C66581MXm.A0P();
    public final O6T A02;
    public final OJX A03;
    public final String A04;
    public final List A05;
    public final UserSession A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68740NVa(UserSession userSession, O6T o6t, OJX ojx, String str, String str2, String str3, List list) {
        super(o6t);
        C51974G9v.A1P(userSession, str, str2, str3);
        this.A06 = userSession;
        this.A00 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A05 = list;
        this.A02 = o6t;
        this.A03 = ojx;
    }

    public final void CgL() {
        super.CgL();
        C66594MYg A022 = C66594MYg.A03.A02(this.A06, AnonymousClass61K.FTS_MESSAGES_SEARCH_IN_CONVERSATION);
        1a8 r2 = this.A01;
        MYb mYb = A022.A01;
        String str = this.A00;
        long parseLong = Long.parseLong(this.A07);
        long j = this.A01;
        PU8.A00(C66581MXm.A0M(new C72029Ov4(str, parseLong, j), mYb.A06), r2, this, 16);
    }
}
