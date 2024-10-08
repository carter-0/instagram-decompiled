package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.H6t  reason: case insensitive filesystem */
public final class C54302H6t extends C228042kh {
    public final int A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public C54302H6t(UserSession userSession, String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A07 = z;
        this.A00 = i;
        this.A05 = str4;
        this.A06 = z2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A02;
        boolean z = this.A07;
        return new C52993Ggk(userSession, str, str2, str3, this.A05, this.A00, z, this.A06);
    }
}
