package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

public final class W3U {
    public static final W3U A00 = new Object();

    public static final ProductSource A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        C16659Uyv A01 = A01(userSession);
        int ordinal = A01.ordinal();
        String str = null;
        if (ordinal == 1) {
            String string = A02(userSession, A00).getString("shopping_brand_id", (String) null);
            if (string == null) {
                return null;
            }
            str = string;
        } else if (ordinal != 0) {
            throw new RuntimeException();
        }
        return new ProductSource(A01, str);
    }

    public static final C16659Uyv A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        String string = A02(userSession, A00).getString("last_selected_product_source_type", (String) null);
        if (string != null) {
            return C17019VEt.A00(string);
        }
        if (AnonymousClass7TF.A0Q(userSession).A1R() || AnonymousClass7TF.A0Q(userSession).A1Q()) {
            return C16659Uyv.BRAND;
        }
        return C16659Uyv.CATALOG;
    }

    public static final synchronized 0xa A02(UserSession userSession, W3U w3u) {
        0xa A04;
        synchronized (w3u) {
            A04 = 1Al.A01(userSession).A04(1An.A2s, W3U.class);
        }
        return A04;
    }

    public static final VPK A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        String string = A02(userSession, A00).getString("incentives_nux_metadata", (String) null);
        if (string != null) {
            try {
                return VHE.parseFromJson(16P.A00(string));
            } catch (IOException unused) {
                0wb.A03("ShoppingPreferences", "Could not parse json for incentive nux metadata");
            }
        }
        return null;
    }

    public static final VPL A04(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        String string = A02(userSession, A00).getString("incentives_offer_metadata", (String) null);
        if (string != null) {
            try {
                return VHF.parseFromJson(16P.A00(string));
            } catch (IOException unused) {
                0wb.A03("ShoppingPreferences", "Could not parse json for incentives offer metadata.");
            }
        }
        return null;
    }

    public static final void A06(UserSession userSession, VPK vpk) {
        0qQ.A0B(userSession, 0);
        try {
            0xY AR4 = A02(userSession, A00).AR4();
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            if (vpk.A00 != null) {
                A0K.A0q("incentives_nux_last_seen_times");
                A0K.A0c();
                Iterator A0s = AnonymousClass7TF.A0s(vpk.A00);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    if (!16P.A04(A0K, A1J)) {
                        A0K.A0h(AnonymousClass7TE.A0R(A1J.getValue()));
                    }
                }
                A0K.A0Z();
            }
            AR4.E5g("incentives_nux_metadata", AnonymousClass7TG.A0k(A0K, stringWriter));
            AR4.apply();
        } catch (IOException unused) {
            0wb.A03("ShoppingPreferences", "Could not serialize json for incentives nux metadata");
        }
    }

    public static final void A07(UserSession userSession, VPL vpl) {
        0qQ.A0B(userSession, 0);
        try {
            0xY AR4 = A02(userSession, A00).AR4();
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            if (vpl.A00 != null) {
                A0K.A0q("incentives_offers_last_seen_times");
                A0K.A0c();
                Iterator A0s = AnonymousClass7TF.A0s(vpl.A00);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    if (!16P.A04(A0K, A1J)) {
                        A0K.A0h(AnonymousClass7TE.A0R(A1J.getValue()));
                    }
                }
                A0K.A0Z();
            }
            AR4.E5g("incentives_offer_metadata", AnonymousClass7TG.A0k(A0K, stringWriter));
            AR4.apply();
        } catch (IOException unused) {
            0wb.A03("ShoppingPreferences", "Could not serialize json for incentives offer metadata.");
        }
    }

    public static final void A05(UserSession userSession, long j) {
        0xY AR4 = A02(userSession, A00).AR4();
        AR4.E5c("ig_funded_incentive_pdp_banner_last_seen_time", j);
        AR4.apply();
    }
}
