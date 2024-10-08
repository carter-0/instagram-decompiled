package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

public final class SPC {
    public static final SPC A00 = new Object();

    public static final String A00(Set set) {
        String str;
        0qQ.A0B(set, 0);
        String str2 = "";
        if (set.contains(REH.MEMORY)) {
            str = "mem_cached";
        } else {
            str = str2;
        }
        if (set.contains(REH.DISK)) {
            str2 = "disk_cached";
        }
        String A12 = DbV.A12(C66580MXl.A10(str, str2));
        if (A12.length() == 0) {
            return "not_cached";
        }
        return A12;
    }

    public final void A01(C270254gR r10, S0G s0g) {
        UserSession userSession = r10.A03.A00;
        String string = AnonymousClass7TE.A0q(userSession).getString("autofill_bloks_contact_save_cache_key", (String) null);
        UserSession userSession2 = r10.A04.A00;
        0Tu r3 = 0Tu.A06;
        if (!00p.A0j(string, 182.A04(r3, userSession2, 36885810503025321L), false)) {
            new QK9(r10, s0g).A03();
            DbX.A1U(AnonymousClass7TE.A0q(userSession), "autofill_bloks_contact_save_cache_key", 182.A04(r3, userSession2, 36885810503025321L));
        }
        new QK9(r10, s0g).A04();
    }

    public final void A02(C270254gR r10, S0G s0g) {
        UserSession userSession = r10.A03.A00;
        String string = AnonymousClass7TE.A0q(userSession).getString("autofill_bloks_contact_usage_cache_key", (String) null);
        UserSession userSession2 = r10.A04.A00;
        0Tu r3 = 0Tu.A06;
        if (!00p.A0j(string, 182.A04(r3, userSession2, 36885810503090858L), false)) {
            new QKA(r10, s0g).A03();
            DbX.A1U(AnonymousClass7TE.A0q(userSession), "autofill_bloks_contact_usage_cache_key", 182.A04(r3, userSession2, 36885810503090858L));
        }
        new QKA(r10, s0g).A04();
    }

    public final void A03(C270254gR r10, S0G s0g) {
        UserSession userSession = r10.A03.A00;
        String string = AnonymousClass7TE.A0q(userSession).getString("autofill_bloks_payment_save_cache_key", (String) null);
        UserSession userSession2 = r10.A04.A00;
        0Tu r3 = 0Tu.A06;
        if (!00p.A0j(string, 182.A04(r3, userSession2, 36885810503221932L), false)) {
            new QK7(r10, s0g).A03();
            DbX.A1U(AnonymousClass7TE.A0q(userSession), "autofill_bloks_payment_save_cache_key", 182.A04(r3, userSession2, 36885810503221932L));
        }
        new QK7(r10, s0g).A04();
    }

    public final void A04(C270254gR r10, S0G s0g) {
        UserSession userSession = r10.A03.A00;
        String string = AnonymousClass7TE.A0q(userSession).getString("autofill_bloks_payment_usage_cache_key", (String) null);
        UserSession userSession2 = r10.A04.A00;
        0Tu r3 = 0Tu.A06;
        if (!00p.A0j(string, 182.A04(r3, userSession2, 36885810503287469L), false)) {
            new QK8(r10, s0g).A03();
            DbX.A1U(AnonymousClass7TE.A0q(userSession), "autofill_bloks_payment_usage_cache_key", 182.A04(r3, userSession2, 36885810503287469L));
        }
        new QK8(r10, s0g).A04();
    }
}
