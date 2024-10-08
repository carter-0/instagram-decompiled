package X;

import com.instagram.common.session.UserSession;
import java.util.Currency;

/* renamed from: X.Jil  reason: case insensitive filesystem */
public final class C60289Jil extends 2YL {
    public static final C61000Juw A0D = new C61000Juw((Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, 0, false);
    public C62666KkS A00 = C62666KkS.BIO_IG_POST;
    public final 2Fk A01;
    public final UserSession A02;
    public final C63616L0e A03;
    public final C63617L0f A04;
    public final C249513ju A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final 05G A0A;
    public final AnonymousClass0r6 A0B;
    public final 05G A0C;

    public C60289Jil(UserSession userSession, C63616L0e l0e, C63617L0f l0f) {
        0qQ.A0B(userSession, 3);
        this.A04 = l0f;
        this.A03 = l0e;
        this.A02 = userSession;
        02z A10 = DbS.A10("");
        this.A09 = A10;
        02z A102 = DbS.A10("");
        this.A07 = A102;
        02z A012 = 106.A01((Object) null);
        this.A0A = A012;
        String str = "USD";
        02z A103 = DbS.A10(str);
        this.A06 = A103;
        02z A013 = 106.A01((Object) null);
        this.A0C = A013;
        02z A104 = C51970G9q.A10(false);
        this.A08 = A104;
        MCA A002 = MCA.A00(this, JTS.A1b(new 05G[]{A10, A102, A103, A012, A013, A104}), 35);
        19B r5 = 19B.A00;
        this.A01 = C226292g8.A00(r5, A002);
        1HR A0w = G9w.A0w();
        this.A05 = A0w;
        this.A0B = 0u9.A04(A0w);
        1Av A003 = 1Au.A00(this.A02);
        Object CDM = A003.A7e.CDM(A003, 1Av.A8a[413]);
        if (CDM == null) {
            try {
                str = Currency.getInstance(AnonymousClass1Q2.A02()).getCurrencyCode();
            } catch (IllegalArgumentException | NullPointerException unused) {
            }
            CDM = str;
        }
        A103.Epw(CDM);
        1Eo.A05(r5, new MG6(this, (AnonymousClass4D7) null, 17), C318116oQ.A00(this));
    }

    public final void A01(String str, String str2, String str3, String str4, boolean z) {
        String str5 = str;
        boolean A1Z = AnonymousClass7TG.A1Z(str, str2);
        this.A09.Epw(str);
        this.A07.Epw(str2);
        this.A0A.Epw(str3);
        05G r0 = this.A06;
        Object obj = str4;
        if (str4 == null) {
            obj = r0.getValue();
        }
        r0.Epw(obj);
        AnonymousClass7TE.A1Z(new JV9(this, str5, (AnonymousClass4D7) null, A1Z ? 1 : 0, z), JTP.A0K(this, C62555Khl.SELL_PRODUCT, this.A0C));
    }

    public final void A00() {
        this.A09.Epw("");
        this.A07.Epw("");
        this.A0A.Epw((Object) null);
        AnonymousClass7TE.A1Z(new MG0(this, (AnonymousClass4D7) null, 31), JTP.A0K(this, (Object) null, this.A0C));
    }
}
