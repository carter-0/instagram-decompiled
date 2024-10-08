package X;

import java.io.IOException;

public abstract class LPa {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Lux, java.lang.Object] */
    public static C65534Lux parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                A01(r3, obj, AnonymousClass7TE.A17(r3));
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C65534Lux lux, boolean z) {
        if (z) {
            r2.A0c();
        }
        r2.A0P("sub_share_id", lux.A00);
        r2.A0S("is_configured_in_server", lux.A0B);
        r2.A0S("igtv_share_preview_to_feed", lux.A0F);
        if (lux.A01 != null) {
            r2.A0q("feed_preview_crop");
            1qm.A01(r2, lux.A01);
        }
        if (lux.A02 != null) {
            r2.A0q("square_crop");
            1qm.A01(r2, lux.A02);
        }
        String str = lux.A09;
        if (str != null) {
            r2.A0R("igtv_series_id", str);
        }
        String str2 = lux.A06;
        if (str2 != null) {
            r2.A0R("igtv_composer_session_id", str2);
        }
        r2.A0S("igtv_ads_toggled_on", lux.A0A);
        r2.A0S("is_funded_deal", lux.A0C);
        r2.A0S(AnonymousClass000.A00(82), lux.A0D);
        if (lux.A03 != null) {
            r2.A0q("igtv_shopping_metadata");
            LJ8.A00(r2, lux.A03);
        }
        if (lux.A05 != null) {
            r2.A0q("new_fundraiser_info");
            C64130LPe.A01(r2, lux.A05);
        }
        String str3 = lux.A07;
        if (str3 != null) {
            r2.A0R("fundraiser_id", str3);
        }
        r2.A0S("keep_shoppable_products", lux.A0E);
        if (lux.A04 != null) {
            r2.A0q("creator_geo_gating_info");
            LJG.A00(r2, lux.A04);
        }
        String str4 = lux.A08;
        if (str4 != null) {
            r2.A0R(AnonymousClass000.A00(621), str4);
        }
        if (z) {
            r2.A0Z();
        }
    }

    public static void A01(16F r1, C65534Lux lux, String str) {
        if ("sub_share_id".equals(str)) {
            lux.A00 = r1.A1D();
        } else if ("is_configured_in_server".equals(str)) {
            lux.A0B = r1.A0d();
        } else if ("igtv_share_preview_to_feed".equals(str)) {
            lux.A0F = r1.A0d();
        } else if ("feed_preview_crop".equals(str)) {
            lux.A01 = 1qm.parseFromJson(r1);
        } else if ("square_crop".equals(str)) {
            lux.A02 = 1qm.parseFromJson(r1);
        } else if ("igtv_series_id".equals(str)) {
            lux.A09 = AnonymousClass7TG.A0l(r1);
        } else if ("igtv_composer_session_id".equals(str)) {
            lux.A06 = AnonymousClass7TG.A0l(r1);
        } else if ("igtv_ads_toggled_on".equals(str)) {
            lux.A0A = r1.A0d();
        } else if ("is_funded_deal".equals(str)) {
            lux.A0C = r1.A0d();
        } else if (AnonymousClass000.A00(82).equals(str)) {
            lux.A0D = r1.A0d();
        } else if ("igtv_shopping_metadata".equals(str)) {
            lux.A03 = LJ8.parseFromJson(r1);
        } else if ("new_fundraiser_info".equals(str)) {
            lux.A05 = C64130LPe.parseFromJson(r1);
        } else if ("fundraiser_id".equals(str)) {
            lux.A07 = AnonymousClass7TG.A0l(r1);
        } else if ("keep_shoppable_products".equals(str)) {
            lux.A0E = r1.A0d();
        } else if ("creator_geo_gating_info".equals(str)) {
            lux.A04 = LJG.parseFromJson(r1);
        } else if (AnonymousClass000.A00(621).equals(str)) {
            lux.A08 = AnonymousClass7TG.A0l(r1);
        }
    }
}
