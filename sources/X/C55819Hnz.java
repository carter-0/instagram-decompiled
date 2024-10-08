package X;

import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Hnz  reason: case insensitive filesystem */
public final class C55819Hnz {
    public final UserAccountInfo A00;
    public final UserAccountInfo A01;
    public final FoaUserSession A02;
    public final String A03;
    public final String A04;

    public C55819Hnz(UserAccountInfo userAccountInfo, UserAccountInfo userAccountInfo2, FoaUserSession foaUserSession, String str, String str2) {
        C51974G9v.A1P(foaUserSession, str, str2, userAccountInfo);
        0qQ.A0B(userAccountInfo2, 5);
        this.A02 = foaUserSession;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = userAccountInfo;
        this.A01 = userAccountInfo2;
    }
}
