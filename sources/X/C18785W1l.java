package X;

import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.W1l  reason: case insensitive filesystem */
public final class C18785W1l {
    public String A00;
    public final AnonymousClass0iw A01;
    public final 0wc A02;
    public final 0wc A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final UserSession A09;
    public final Boolean A0A;
    public final String A0B;

    public C18785W1l(AnonymousClass0iw r2, UserSession userSession, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        0qQ.A0B(userSession, 2);
        this.A01 = r2;
        this.A09 = userSession;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = str3;
        this.A04 = str4;
        this.A07 = str2 == null ? str4 : str2;
        this.A08 = str5;
        this.A0B = str6;
        this.A0A = bool;
        this.A03 = AnonymousClass0kN.A00(r2, 0kJ.A05, userSession);
        this.A02 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A06(String str, String str2, String str3, List list) {
        ArrayList arrayList;
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_shopping_ig_funded_incentive_button_tap");
        A0e.AAe("ig_funded_discount_ids", C66582MXn.A10(Long.parseLong(str)));
        0bb r2 = new 0bb();
        r2.A06("prior_module", this.A07);
        r2.A06("prior_submodule", this.A05);
        C13989Tnp.A1E(A0e, r2, this.A08);
        C263944Ny r3 = null;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                JTS.A1V(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        A0e.AAK(A00(this, str3, arrayList), "bag_logging_info");
        if (str2 != null) {
            r3 = C263944Ny.A00(str2);
        }
        A0e.AAE(r3, "merchant_id");
        A0e.Cgf();
    }

    public static final C14928UFp A00(C18785W1l w1l, String str, List list) {
        0bb r2 = new 0bb();
        r2.A06("checkout_session_id", str);
        r2.A06("global_bag_entry_point", w1l.A00);
        r2.A06("global_bag_prior_module", w1l.A04);
        r2.A06("merchant_bag_entry_point", w1l.A05);
        r2.A06("merchant_bag_prior_module", w1l.A06);
        r2.A07("merchant_bag_ids", list);
        return r2;
    }

    public static void A02(0Aj r2, C18785W1l w1l, String str, String str2) {
        r2.AAJ("shopping_session_id", str);
        r2.AAJ("global_bag_entry_point", w1l.A00);
        r2.AAJ("global_bag_prior_module", w1l.A04);
        if (str2 != null) {
            r2.A9F("global_bag_id", 00y.A0n(10, str2));
        }
    }

    public final void A03() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "instagram_shopping_bag_index_entry");
        String str = this.A00;
        if (str != null) {
            A0e.AAJ("global_bag_entry_point", str);
            String str2 = this.A04;
            if (str2 != null) {
                A0e.AAJ("global_bag_prior_module", str2);
                String str3 = this.A08;
                if (str3 == null) {
                    str3 = "";
                }
                C13988Tno.A1D(A0e, str3);
                A0e.A7p("is_bloks", this.A0A);
                C51965G9l.A1I(A0e, this.A0B);
                A0e.Cgf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static String A01(0Aj r1, C18785W1l w1l, String str, String str2, String str3) {
        r1.AAJ(str, str2);
        r1.AAJ("checkout_session_id", str3);
        String str4 = w1l.A08;
        if (str4 == null) {
            return "";
        }
        return str4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (r4.A01(r7.A02) > 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C18622VvF r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r6 = this;
            X.AnonymousClass7TG.A1Q(r10, r11)
            X.0wc r1 = r6.A02
            java.lang.String r0 = "instagram_shopping_bag_checkout_button_tap"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            X.VPJ r0 = r7.A04
            com.instagram.model.payments.CurrencyAmountInfoImpl r0 = r0.A00
            r2 = 0
            if (r0 != 0) goto L_0x00af
            r4 = r2
        L_0x0013:
            java.lang.String r0 = r6.A08
            java.lang.String r5 = ""
            if (r0 != 0) goto L_0x001a
            r0 = r5
        L_0x001a:
            X.C13988Tno.A1D(r3, r0)
            java.lang.String r0 = "merchant_id"
            r3.AAJ(r0, r10)
            java.lang.String r1 = r6.A05
            if (r1 != 0) goto L_0x0027
            r1 = r5
        L_0x0027:
            java.lang.String r0 = "merchant_bag_entry_point"
            r3.AAJ(r0, r1)
            java.lang.String r0 = r6.A06
            if (r0 == 0) goto L_0x0031
            r5 = r0
        L_0x0031:
            java.lang.String r0 = "merchant_bag_prior_module"
            r3.AAJ(r0, r5)
            java.lang.String r0 = "checkout_session_id"
            r3.AAJ(r0, r11)
            java.lang.Long r1 = X.DbV.A0q(r12)
            java.lang.String r0 = "global_bag_id"
            r3.A9F(r0, r1)
            java.lang.Long r1 = X.DbV.A0q(r13)
            java.lang.String r0 = "merchant_bag_id"
            r3.A9F(r0, r1)
            long r0 = (long) r14
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "total_item_count"
            r3.A9F(r0, r1)
            int r0 = r7.A00
            X.C13991Tnr.A11(r3, r0)
            X.W2s.A03(r3, r7, r10)
            if (r4 == 0) goto L_0x006a
            X.Wh3 r0 = r7.A02
            int r1 = r4.compareTo(r0)
            r0 = 1
            if (r1 <= 0) goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_free_shipping_reached"
            r3.A7p(r0, r1)
            X.Wh3 r0 = r7.A02
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "currency"
            r3.AAJ(r0, r1)
            X.Wh3 r0 = r7.A02
            java.lang.String r1 = r0.A01
            r0 = 1255(0x4e7, float:1.759E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A00
            java.lang.String r0 = "global_bag_entry_point"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r6.A04
            java.lang.String r0 = "global_bag_prior_module"
            r3.AAJ(r0, r1)
            if (r4 == 0) goto L_0x009e
            java.lang.String r2 = X.W2s.A00(r4)
        L_0x009e:
            java.lang.String r0 = "free_shipping_order_value"
            r3.AAJ(r0, r2)
            java.lang.String r0 = "logging_token"
            r3.AAJ(r0, r8)
            X.C51965G9l.A1L(r3, r9)
            r3.Cgf()
            return
        L_0x00af:
            X.Wh3 r4 = X.C19875Wh3.A00(r0)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18785W1l.A04(X.VvF, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public final void A05(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass7TG.A1N(str, str2);
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "instagram_shopping_merchant_bag_entry");
        C13988Tno.A1A(A0e, str);
        String str6 = this.A05;
        if (str6 != null) {
            C13988Tno.A1D(A0e, A01(A0e, this, "merchant_bag_entry_point", str6, str2));
            String str7 = this.A06;
            if (str7 != null) {
                A0e.AAJ("merchant_bag_prior_module", str7);
                A0e.AAJ("global_bag_entry_point", this.A00);
                A0e.AAJ("tooltip_text", str5);
                A0e.AAJ("global_bag_prior_module", this.A04);
                A0e.A7p("is_bloks", this.A0A);
                DbY.A1C(A0e);
                if (str3 != null) {
                    A0e.A9F("global_bag_id", AnonymousClass7TE.A10(str3));
                }
                C13991Tnr.A16(A0e, str4);
                String str8 = this.A0B;
                if (str8 != null) {
                    0bb r1 = new 0bb();
                    r1.A06("m_pk", str8);
                    A0e.AAK(r1, "feed_item_info");
                }
                A0e.Cgf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A07(String str, String str2, Set set, boolean z) {
        AnonymousClass7TG.A1T(set, str, str2);
        ArrayList A0r = AnonymousClass7TG.A0r(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C66582MXn.A1N(((ProductDiscountInformationDict) it.next()).getId(), A0r);
        }
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "shops_promotions_more_tap");
        C51969G9p.A1A(A0e, this.A01);
        0bb r3 = new 0bb();
        r3.A06("prior_module", this.A07);
        r3.A06("prior_submodule", this.A05);
        C13989Tnp.A1E(A0e, r3, this.A08);
        A0e.AAe("discount_ids", A0r);
        C13988Tno.A1B(A0e, str);
        A0e.AAK(A00(this, str2, (List) null), "bag_logging_info");
        A0e.A7p("is_megaphone_banner", JTP.A0g(A0e, "checkout_session_id", str2, z));
        A0e.Cgf();
    }
}
