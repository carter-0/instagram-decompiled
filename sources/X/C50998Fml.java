package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.venue.Venue;
import com.instagram.user.model.User;

/* renamed from: X.Fml  reason: case insensitive filesystem */
public final class C50998Fml implements MT4 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public C50998Fml(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        this.A00 = i;
        this.A05 = z;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
        this.A04 = str;
    }

    public final void DgT() {
        UserSession userSession;
        AnonymousClass0iw r5;
        String A002;
        String str;
        String A052;
        switch (this.A00) {
            case 0:
                userSession = (UserSession) this.A01;
                User user = (User) this.A02;
                boolean z = this.A05;
                r5 = (AnonymousClass0iw) this.A03;
                A002 = "profile_action_sheet";
                str = this.A04;
                if (182.A06(0Tu.A05, userSession, 36325768237823183L)) {
                    A052 = AnonymousClass3VO.A03(user.getId());
                    if (!z || A052 == null) {
                        return;
                    }
                } else if (z) {
                    A052 = AnonymousClass3VO.A03(user.getId());
                    break;
                } else {
                    return;
                }
            case 1:
                boolean z2 = this.A05;
                UserSession userSession2 = (UserSession) this.A01;
                AnonymousClass0iw r3 = (AnonymousClass0iw) this.A02;
                1Xj r1 = (1Xj) this.A03;
                String A003 = AnonymousClass000.A00(1350);
                String str2 = this.A04;
                if (z2) {
                    String id = r1.getId();
                    String A0x = DbT.A0x(r1);
                    DbW.A1N(id, 2, str2);
                    C22031Xty.A0K(r3, userSession2, id, A003, "download_qr_code", str2, A0x, (String) null, (String) null);
                    return;
                }
                return;
            case 2:
                boolean z3 = this.A05;
                userSession = (UserSession) this.A01;
                r5 = (AnonymousClass0iw) this.A02;
                Venue venue = (Venue) this.A03;
                A002 = AnonymousClass000.A00(3544);
                str = this.A04;
                if (z3) {
                    A052 = venue.A05();
                    break;
                } else {
                    return;
                }
            default:
                boolean z4 = this.A05;
                userSession = (UserSession) this.A01;
                r5 = (AnonymousClass0iw) this.A02;
                Hashtag hashtag = (Hashtag) this.A03;
                A002 = "hashtag_page_overflow_menu";
                str = this.A04;
                if (z4) {
                    A052 = hashtag.getId();
                    break;
                } else {
                    return;
                }
        }
        C22031Xty.A0I(r5, userSession, A052, A002, "download_qr_code", str);
    }
}
