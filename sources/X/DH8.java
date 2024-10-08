package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final /* synthetic */ class DH8 implements B1V {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C48097EVp A01;
    public final /* synthetic */ AnonymousClass7Z6 A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ DH8(C48097EVp eVp, AnonymousClass7Z6 r2, Long l, String str, String str2, long j, boolean z) {
        this.A02 = r2;
        this.A06 = z;
        this.A04 = str;
        this.A00 = j;
        this.A03 = l;
        this.A05 = str2;
        this.A01 = eVp;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        String str;
        AnonymousClass7Z6 r5 = this.A02;
        boolean z = this.A06;
        String str2 = this.A04;
        long j = this.A00;
        Long l2 = this.A03;
        String str3 = this.A05;
        C48097EVp eVp = this.A01;
        UserSession userSession = r5.A00;
        C66665MaY A062 = C66669Mac.A06(userSession, oDs, C66411mr.class, str2, z, false);
        if (eVp != null) {
            str = eVp.A00;
        } else {
            str = null;
        }
        long A0H = AnonymousClass7TG.A0H();
        0qQ.A0B(directThreadKey, 2);
        0qQ.A0B(userSession, 9);
        1bp r7 = new 1bp(A062, directThreadKey, l, A0H);
        r7.A02 = directThreadKey;
        r7.A01 = userSession;
        r7.A00 = j;
        r7.A03 = l2;
        r7.A04 = str3;
        r7.A05 = str;
        return r7;
    }
}
