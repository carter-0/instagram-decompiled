package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Uha  reason: case insensitive filesystem */
public final class C15729Uha extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final W26 A02;
    public final C15335Uak A03;
    public final String A04;
    public final String A05;
    public final String A06 = "instagram_shopping_reconsideration_destination";
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C15729Uha(AnonymousClass0iw r3, UserSession userSession, W26 w26, C15335Uak uak, String str, String str2, boolean z, boolean z2, boolean z3) {
        DbW.A1O(userSession, 1, w26);
        this.A01 = userSession;
        this.A04 = str;
        this.A05 = str2;
        this.A08 = z;
        this.A02 = w26;
        this.A09 = z2;
        this.A00 = r3;
        this.A03 = uak;
        this.A07 = z3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        String str = this.A06;
        String str2 = this.A04;
        String str3 = this.A05;
        boolean z = this.A08;
        return new C60309JjA(this.A00, userSession, this.A02, this.A03, str, str2, str3, z, this.A09, this.A07);
    }
}
