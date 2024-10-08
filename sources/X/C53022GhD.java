package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.GhD  reason: case insensitive filesystem */
public final class C53022GhD extends 2YL {
    public final C62031KWh A00;
    public final String A01;
    public final String A02;
    public final Set A03;
    public final Set A04;
    public final C249513ju A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;

    public static final C53567Gqi A00(MQ0 mq0) {
        List list;
        if (!C59678JTj.A01(1, mq0) || (list = ((C53363Gmn) ((C59678JTj) mq0).A01).A06) == null) {
            list = 0sn.A00;
        }
        return new C53567Gqi(AnonymousClass62Q.A00(list), (AnonymousClass62P) AnonymousClass62Q.A04(HJQ.A00, HJR.A00));
    }

    public C53022GhD(C62031KWh kWh, String str, String str2, Set set, Set set2) {
        C54640HLx hLx;
        C51974G9v.A1P(str, str2, set, set2);
        this.A02 = str;
        this.A01 = str2;
        this.A04 = set;
        this.A03 = set2;
        this.A00 = kWh;
        if (!set.isEmpty()) {
            hLx = C54640HLx.REEL_SUGGESTED_FOR_USERS_LIST;
        } else {
            hLx = C54640HLx.MENU;
        }
        02z A10 = DbS.A10(hLx);
        this.A06 = A10;
        C61820pm A032 = AnonymousClass10H.A03(new C66192MHi((Object) this, (AnonymousClass4D7) null, 19), A10, kWh.A04);
        this.A07 = 10b.A02(A00((MQ0) this.A00.A04.getValue()), C318116oQ.A00(this), A032, AnonymousClass10A.A01);
        this.A05 = G9w.A0w();
    }
}
