package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2qo  reason: invalid class name and case insensitive filesystem */
public final class C231062qo {
    public final int A00;
    public final 0wc A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final UserSession A08;
    public final AnonymousClass4DU A09;

    public final void A00(C268374dH r5, String str, int i) {
        User BRo;
        0qQ.A0B(r5, 0);
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, AnonymousClass000.A00(3380));
        if (A002.isSampled()) {
            0bb r3 = new 0bb();
            r3.A06("submodule", str);
            r3.A06("prior_module", this.A05);
            r3.A06("prior_submodule", this.A06);
            r3.A06("shopping_session_id", this.A07);
            r3.A06("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.AAK(r3, "navigation_info");
            0bb r32 = new 0bb();
            r32.A05("chaining_position", Long.valueOf((long) i));
            r32.A06("chaining_session_id", this.A02);
            r32.A06("m_pk", r5.Bxn());
            r32.A06("parent_m_pk", this.A04);
            r32.A05("m_t", Long.valueOf((long) this.A00));
            r32.A06("source_media_type", r5.Bxr());
            A002.AAK(r32, "pivots_logging_info");
            X9B Aif = r5.Aif();
            String str2 = null;
            if (!(Aif == null || Aif.BRo() == null)) {
                X9B Aif2 = r5.Aif();
                if (!(Aif2 == null || (BRo = Aif2.BRo()) == null)) {
                    str2 = AnonymousClass3ZA.A00(BRo);
                }
                A002.AAE(C263944Ny.A00(str2), "merchant_id");
            }
            A002.Cgf();
        }
    }

    public C231062qo(UserSession userSession, AnonymousClass4DU r3, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A09 = r3;
        this.A08 = userSession;
        this.A07 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A02 = str5;
        this.A04 = str6;
        this.A00 = i;
        this.A01 = AnonymousClass0kN.A01(r3, userSession);
    }
}
