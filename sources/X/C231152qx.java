package X;

import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;

/* renamed from: X.2qx  reason: invalid class name and case insensitive filesystem */
public final class C231152qx {
    public final RankingInfo A00;
    public final 0wc A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public static final C14928UFp A00(C15047ULa uLa) {
        0bb r2 = new 0bb();
        r2.A06("checkout_session_id", uLa.A02);
        r2.A06(AnonymousClass000.A00(3197), uLa.A03);
        r2.A06(AnonymousClass000.A00(3198), uLa.A05);
        r2.A06(AnonymousClass000.A00(5042), uLa.A06);
        r2.A06(AnonymousClass000.A00(5043), uLa.A08);
        String str = uLa.A04;
        if (str != null) {
            r2.A05(AnonymousClass000.A00(4802), 00y.A0n(10, str));
        }
        String str2 = uLa.A07;
        if (str2 != null) {
            r2.A05(AnonymousClass000.A00(3590), 00y.A0n(10, str2));
        }
        return r2;
    }

    public static final C254463sW A01(C61079JwH jwH) {
        0bb r2 = new 0bb();
        r2.A06("product_collection_id", jwH.A02);
        r2.A06("product_collection_type", String.valueOf(jwH.A01));
        Long l = (Long) jwH.A00;
        if (l != null) {
            r2.A05("collection_page_id", l);
        }
        return r2;
    }

    public static final AnonymousClass327 A02(C231152qx r3, String str) {
        0bb r2 = new 0bb();
        r2.A06("prior_module", r3.A03);
        r2.A06("prior_submodule", r3.A04);
        r2.A06("shopping_session_id", r3.A05);
        r2.A06("nav_chain", AnonymousClass1QI.A00.A02.A00);
        r2.A06("submodule", str);
        return r2;
    }

    public static final C14931UFu A03(AnonymousClass9JL r4) {
        Long l;
        0bb r2 = new 0bb();
        r2.A06("parent_m_pk", r4.A04);
        Number number = (Number) r4.A02;
        Long l2 = null;
        if (number != null) {
            l = Long.valueOf((long) number.intValue());
        } else {
            l = null;
        }
        r2.A05("m_t", l);
        r2.A06("m_pk", r4.A05);
        r2.A06("source_media_type", r4.A06);
        Number number2 = (Number) r4.A01;
        if (number2 != null) {
            l2 = Long.valueOf((long) number2.intValue());
        }
        r2.A05("chaining_position", l2);
        r2.A06("chaining_session_id", r4.A03);
        return r2;
    }

    public C231152qx(RankingInfo rankingInfo, UserSession userSession, AnonymousClass4DU r4, String str, String str2, String str3) {
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = rankingInfo;
        this.A01 = AnonymousClass0kN.A01(r4, userSession);
    }
}
