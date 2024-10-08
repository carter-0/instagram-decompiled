package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.user.model.Product;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class W2s {
    public static final void A04(AnonymousClass0iw r6, UserSession userSession, 1Xj r8, ShoppingGuideLoggingInfo shoppingGuideLoggingInfo, W0O w0o, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        long parseLong;
        Long l;
        0bb r3;
        AnonymousClass7TF.A1B(userSession, 1, str);
        String str11 = str6;
        AnonymousClass7TF.A1F(str11, 7, w0o);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A00(r6, 0kJ.A05, userSession), "instagram_shopping_bag_add_item_success");
        String A04 = w0o.A04();
        0qQ.A07(A04);
        C13991Tnr.A17(A0e, A04);
        if (str3 == null) {
            str3 = "";
        }
        C13988Tno.A1A(A0e, str3);
        W0O.A01(A0e, w0o);
        A0e.A7p("is_initial_add", Boolean.valueOf(AnonymousClass7TF.A1S(w0o.A02(), 1)));
        if (str2 == null) {
            str2 = "";
        }
        C13988Tno.A1C(A0e, str2);
        if (str4 == null) {
            str4 = "";
        }
        A0e.AAJ("checkout_session_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        C13988Tno.A1D(A0e, str5);
        String str12 = null;
        A0e.A9F("global_bag_id", 00y.A0n(10, str7));
        Long A0n = 00y.A0n(10, str8);
        if (A0n != null) {
            parseLong = A0n.longValue();
        } else {
            parseLong = Long.parseLong("");
        }
        A0e.A9F("merchant_bag_id", Long.valueOf(parseLong));
        A0e.AAJ("from", str11);
        DbS.A1N(A0e, str);
        C51965G9l.A1I(A0e, C51969G9p.A0u(r8));
        String str13 = str9;
        if (str9 != null) {
            l = 00y.A0n(10, str13);
        } else {
            l = null;
        }
        A0e.A9F(TraceFieldType.BroadcastId, l);
        if (shoppingGuideLoggingInfo != null) {
            r3 = new 0bb();
            r3.A05("guide_id", Long.valueOf(shoppingGuideLoggingInfo.A00));
        } else {
            r3 = null;
        }
        A0e.AAK(r3, "guide_logging_info");
        A0e.A7p("is_checkout_enabled", Boolean.valueOf(z));
        if (r8 != null && r8.CcK()) {
            str12 = r8.C9L();
        }
        C51965G9l.A1L(A0e, str12);
        String str14 = str10;
        if (!(str10 == null || str14.length() == 0)) {
            A0e.A9F("collection_page_id", 00y.A0n(10, str14));
        }
        A0e.Cgf();
    }

    public static final String A00(C19875Wh3 wh3) {
        BigDecimal bigDecimal = wh3.A02;
        0qQ.A07(bigDecimal);
        int i = wh3.A00;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(AnonymousClass1Q2.A02());
        0qQ.A0A(numberInstance);
        double d = (double) i;
        double longValue = ((double) bigDecimal.longValue()) / d;
        int log10 = (int) Math.log10(d);
        numberInstance.setMinimumFractionDigits(log10);
        numberInstance.setMaximumFractionDigits(log10);
        numberInstance.setRoundingMode(RoundingMode.HALF_UP);
        String format = numberInstance.format(longValue);
        0qQ.A07(format);
        return format;
    }

    public static final HashMap A01(C18622VvF vvF, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator A0h = JTQ.A0h(vvF.A06);
        while (A0h.hasNext()) {
            String A04 = ((W0O) A0h.next()).A04();
            0qQ.A07(A04);
            C66582MXn.A1N(A04, arrayList);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(DbV.A0q(str), arrayList);
        return hashMap;
    }

    public static final HashMap A02(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            W0O w0o = (W0O) it.next();
            String A04 = w0o.A04();
            0qQ.A07(A04);
            Pxe.A1X(DbV.A0q(A04), hashMap, (long) w0o.A02());
        }
        return hashMap;
    }

    public static void A03(0Aj r2, C18622VvF vvF, String str) {
        r2.A9H("product_merchant_ids", A01(vvF, str));
        List list = vvF.A09;
        0qQ.A07(list);
        r2.A9H("subtotal_quantities", A02(list));
        r2.A9F("subtotal_item_count", Long.valueOf((long) vvF.A01));
        C19875Wh3 wh3 = vvF.A02;
        0qQ.A07(wh3);
        r2.AAJ("subtotal_amount", A00(wh3));
    }

    public static final void A05(AnonymousClass0iw r3, UserSession userSession, 1Xj r5, ShoppingGuideLoggingInfo shoppingGuideLoggingInfo, Product product, String str, String str2, String str3, String str4, String str5) {
        0bb r2;
        AnonymousClass7TG.A1O(userSession, str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "instagram_shopping_bag_add_item_failure");
        C13991Tnr.A17(A0e, product.A0H);
        if (str3 == null) {
            str3 = "";
        }
        C13988Tno.A1A(A0e, str3);
        if (str2 == null) {
            str2 = "";
        }
        C13988Tno.A1C(A0e, str2);
        if (str4 == null) {
            str4 = "";
        }
        A0e.AAJ("checkout_session_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        C13988Tno.A1D(A0e, str5);
        DbS.A1N(A0e, str);
        String str6 = null;
        C51965G9l.A1I(A0e, C51969G9p.A0u(r5));
        if (shoppingGuideLoggingInfo != null) {
            r2 = new 0bb();
            r2.A05("guide_id", Long.valueOf(shoppingGuideLoggingInfo.A00));
        } else {
            r2 = null;
        }
        A0e.AAK(r2, "guide_logging_info");
        if (r5 != null && r5.CcK()) {
            str6 = r5.C9L();
        }
        C51965G9l.A1L(A0e, str6);
        A0e.Cgf();
    }

    public static final void A06(AnonymousClass0iw r3, UserSession userSession, 1Xj r5, ShoppingGuideLoggingInfo shoppingGuideLoggingInfo, Product product, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        0bb r32;
        AnonymousClass7TG.A1O(userSession, str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "instagram_shopping_bag_add_item_attempt");
        C13991Tnr.A17(A0e, product.A0H);
        C13988Tno.A1A(A0e, str4);
        if (str2 == null) {
            str2 = "";
        }
        C13988Tno.A1C(A0e, str2);
        A0e.AAJ("prior_submodule", str);
        if (str5 == null) {
            str5 = "";
        }
        A0e.AAJ("checkout_session_id", str5);
        if (str6 == null) {
            str6 = "";
        }
        C13988Tno.A1D(A0e, str6);
        A0e.AAJ("submodule", str3);
        DbS.A1N(A0e, str);
        String str8 = null;
        C51965G9l.A1I(A0e, C51969G9p.A0u(r5));
        if (shoppingGuideLoggingInfo != null) {
            r32 = new 0bb();
            r32.A05("guide_id", Long.valueOf(shoppingGuideLoggingInfo.A00));
        } else {
            r32 = null;
        }
        A0e.AAK(r32, "guide_logging_info");
        C13989Tnp.A1H(A0e, product);
        if (r5 != null && r5.CcK()) {
            str8 = r5.C9L();
        }
        C51965G9l.A1L(A0e, str8);
        if (!(str7 == null || str7.length() == 0)) {
            A0e.A9F("collection_page_id", AnonymousClass7TE.A10(str7));
        }
        A0e.Cgf();
    }
}
