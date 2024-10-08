package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2r2  reason: invalid class name */
public final class AnonymousClass2r2 {
    public final 0wc A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final AnonymousClass57K A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public static final C254463sW A00(AnonymousClass2r2 r5, Integer num) {
        AnonymousClass57K r1;
        String str = r5.A09;
        String str2 = null;
        if (str == null || (r1 = r5.A06) == null) {
            return null;
        }
        0bb r2 = new 0bb();
        r2.A06("product_collection_id", str);
        r2.A06("product_collection_type", r1.toString());
        if (num != null) {
            str2 = num.toString();
        }
        r2.A06("position", str2);
        return r2;
    }

    public static final AnonymousClass327 A01(AnonymousClass2r2 r3) {
        0bb r2 = new 0bb();
        r2.A06("prior_module", r3.A07);
        r2.A06("prior_submodule", r3.A08);
        r2.A06("shopping_session_id", r3.A03);
        r2.A06("nav_chain", AnonymousClass1QI.A00.A02.A00);
        return r2;
    }

    public AnonymousClass2r2(UserSession userSession, AnonymousClass4DU r3, AnonymousClass57K r4, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = userSession;
        this.A05 = r3;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = str3;
        this.A01 = str4;
        this.A02 = str5;
        this.A09 = str6;
        this.A06 = r4;
        this.A00 = AnonymousClass0kN.A01(r3, userSession);
    }
}
