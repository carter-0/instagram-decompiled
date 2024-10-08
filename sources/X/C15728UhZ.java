package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.UhZ  reason: case insensitive filesystem */
public final class C15728UhZ extends C228042kh {
    public final UserSession A00;
    public final C55868Hop A01;
    public final L71 A02;
    public final C18611Vv4 A03;
    public final C71108Ocm A04;
    public final C70656OFd A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09 = true;

    public C15728UhZ(UserSession userSession, C55868Hop hop, L71 l71, C18611Vv4 vv4, C71108Ocm ocm, C70656OFd oFd, String str, String str2, String str3) {
        C51972G9s.A1C(str2, ocm);
        C51972G9s.A1E(l71, userSession);
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A04 = ocm;
        this.A05 = oFd;
        this.A02 = l71;
        this.A00 = userSession;
        this.A03 = vv4;
        this.A01 = hop;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        String str = this.A08;
        String str2 = this.A07;
        String str3 = this.A06;
        C71108Ocm ocm = this.A04;
        C70656OFd oFd = this.A05;
        L71 l71 = this.A02;
        return new C67757MuC(this.A00, this.A01, l71, this.A03, ocm, oFd, str, str2, str3, this.A09);
    }
}
