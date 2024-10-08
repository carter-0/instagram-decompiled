package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.SSz  reason: case insensitive filesystem */
public final class C11423SSz {
    public List A00;
    public Map A01;
    public final UserSession A02;
    public final 0xa A03;

    public static final void A01(C11423SSz sSz) {
        List A18;
        if (sSz.A00 == null) {
            0xa r5 = sSz.A03;
            String string = r5.getString("browser_link_history_optin_nux_exposure_list", (String) null);
            if (string == null || (A18 = DbV.A18(string, ",")) == null) {
                int i = r5.getInt("browser_link_history_optin_nux_count", 0);
                ArrayList A0v = DbS.A0v(i);
                for (int i2 = 0; i2 < i; i2++) {
                    AnonymousClass7TE.A1Y(A0v, DbW.A06(r5, "browser_link_history_optin_nux_last_seen"));
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = A0v.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (AnonymousClass7TE.A0R(next) > 0) {
                        A1C.add(next);
                    }
                }
                sSz.A00 = 00k.A0U(A1C);
                A03(sSz);
                return;
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it2 = A18.iterator();
            while (it2.hasNext()) {
                String A182 = AnonymousClass7TE.A18(it2);
                0qQ.A0B(A182, 0);
                C51973G9u.A1F(A182, A1C2);
            }
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            for (Object next2 : A1C2) {
                if (AnonymousClass7TE.A0R(next2) > 0) {
                    A1C3.add(next2);
                }
            }
            sSz.A00 = 00k.A0U(A1C3);
        }
    }

    public static final void A02(C11423SSz sSz) {
        LinkedHashMap A1H;
        if (sSz.A01 == null) {
            String string = sSz.A03.getString("browser_link_history_opt_in_nux_landing_domain_history_for_delivery_targeting", (String) null);
            if (string == null) {
                A1H = AnonymousClass7TE.A1H();
            } else {
                try {
                    A1H = 0Yt.A03((Map) C250863mB.A03.A00(string, new C258613zM(C258663zR.A00, C255453u9.A01)));
                } catch (IllegalArgumentException e) {
                    0KC.A0K("LinkHistoryLocalStorage", "Failed to decode landing domain history", e);
                    A1H = AnonymousClass7TE.A1H();
                }
            }
            sSz.A01 = A1H;
        }
    }

    public static final void A03(C11423SSz sSz) {
        String str;
        0xY AR4 = sSz.A03.AR4();
        List list = sSz.A00;
        if (list != null) {
            str = C66581MXm.A0w(",", list);
        } else {
            str = null;
        }
        AR4.E5g("browser_link_history_optin_nux_exposure_list", str);
        AR4.apply();
    }

    public static final void A04(C11423SSz sSz) {
        if (sSz.A01 != null) {
            0xY AR4 = sSz.A03.AR4();
            AR4.E5g("browser_link_history_opt_in_nux_landing_domain_history_for_delivery_targeting", C250863mB.A03.A02(sSz.A01, C360578eo.A00(new C258613zM(C258663zR.A00, C255453u9.A01))));
            AR4.commit();
        }
    }

    public final Boolean A05() {
        int i;
        0xa r4 = this.A03;
        if (!r4.contains("browser_link_history_opt_in_key") || (i = r4.getInt("browser_link_history_opt_in_key", -1)) == -1) {
            return null;
        }
        return Boolean.valueOf(AnonymousClass7TF.A1P(i));
    }

    public final void A06(Boolean bool) {
        int i;
        0xY AR4 = this.A03.AR4();
        if (bool != null) {
            i = bool.booleanValue();
        } else {
            i = -1;
        }
        AR4.E5Z("browser_link_history_opt_in_key", i);
        AR4.apply();
    }

    public C11423SSz(UserSession userSession) {
        this.A02 = userSession;
        this.A03 = 1Al.A01(userSession).A03(1An.A1o);
    }

    public static void A00(UserSession userSession) {
        C11423SSz A002 = Ri1.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR4 = A002.A03.AR4();
        AR4.E5c("browser_last_clear_link_history_date_key", currentTimeMillis);
        AR4.apply();
    }
}
