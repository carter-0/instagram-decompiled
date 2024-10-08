package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.HaM  reason: case insensitive filesystem */
public abstract class C54989HaM {
    public static final void A00(0wc r6, C254523sc r7, GQ0 gq0, String str) {
        Long l;
        ArrayList arrayList;
        ArrayList arrayList2;
        Double d;
        Double d2;
        Long l2;
        0Aj A0e = AnonymousClass7TE.A0e(r6, "instagram_ad_media_tap");
        0jB A01 = r7.A01();
        if (A0e.isSampled()) {
            String A1C = C51966G9m.A1C(C271774jZ.A5I, A01);
            String str2 = "";
            if (A1C == null) {
                A1C = str2;
            }
            C51965G9l.A1I(A0e, A1C);
            A0e.A9F("m_t", Long.valueOf(DbY.A04((Number) A01.A01(C271774jZ.A5a))));
            String A1C2 = C51966G9m.A1C(C271774jZ.A9L, A01);
            if (A1C2 != null) {
                str2 = A1C2;
            }
            C51965G9l.A1L(A0e, str2);
            A0e.A9F("m_ix", C51966G9m.A13(C271774jZ.A3m, A01));
            C51965G9l.A1D(A0e, C51966G9m.A13(C271774jZ.A0C, A01));
            A0e.A7p("is_ad", true);
            DbS.A1J(A0e, C51966G9m.A1C(C271774jZ.A00, A01));
            String A1C3 = C51966G9m.A1C(C271774jZ.A5e, A01);
            Long l3 = null;
            if (A1C3 != null) {
                l = C263944Ny.A00(A1C3).A00;
            } else {
                l = null;
            }
            A0e.A9F("merchant_id", l);
            AbstractCollection abstractCollection = (AbstractCollection) A01.A01(C271774jZ.A6j);
            if (abstractCollection != null) {
                ArrayList A1C4 = AnonymousClass7TE.A1C();
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    C51973G9u.A1F(C41847B3o.A1E(it.next()), A1C4);
                }
                arrayList = 00k.A0U(A1C4);
            } else {
                arrayList = null;
            }
            A0e.AAe("product_ids", arrayList);
            A0e.A9H("product_merchant_ids", (Map) A01.A01(new 0j9(AnonymousClass05K.A0j, "product_merchant_ids")));
            AbstractCollection abstractCollection2 = (AbstractCollection) A01.A01(C271774jZ.A8j);
            if (abstractCollection2 != null) {
                arrayList2 = AnonymousClass7TG.A0r(abstractCollection2);
                Iterator it2 = abstractCollection2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(C263944Ny.A00(AnonymousClass7TE.A18(it2)).A00);
                }
            } else {
                arrayList2 = null;
            }
            A0e.AAe(C273654mx.A00(983), arrayList2);
            A0e.A7p("is_checkout_enabled", (Boolean) A01.A01(C271774jZ.A41));
            if (gq0 != null) {
                d = Double.valueOf((double) gq0.A04);
            } else {
                d = null;
            }
            A0e.A8D("tap_x_position", d);
            if (gq0 != null) {
                d2 = Double.valueOf((double) gq0.A05);
            } else {
                d2 = null;
            }
            A0e.A8D("tap_y_position", d2);
            if (gq0 != null) {
                l2 = DbS.A0j(gq0.A06);
            } else {
                l2 = null;
            }
            A0e.A9F(AnonymousClass000.A00(703), l2);
            if (gq0 != null) {
                l3 = DbS.A0j(gq0.A07);
            }
            A0e.A9F("media_height", l3);
            if (str != null) {
                A0e.AAJ("destination", str);
            }
            Boolean bool = (Boolean) A01.A01(C271774jZ.A4t);
            if (bool != null) {
                A0e.A7p("tap_to_reels_chain_enabled", bool);
            }
            A0e.AAJ("interactivity_type", "single_tap");
            A0e.Cgf();
        }
    }
}
