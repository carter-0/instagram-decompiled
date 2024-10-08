package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.Collection;

public abstract class SRr {
    public static void A04(UserSession userSession, C13757TgT tgT, String str, boolean z, boolean z2) {
        String str2;
        boolean z3 = z;
        boolean z4 = z2;
        if (!z2) {
            str2 = "DISABLE";
        } else if (z) {
            str2 = "RESET_AND_GRANT_CONSENT";
        } else {
            str2 = "RESET";
        }
        A01(new C14651Tzx(userSession, tgT, str, 0, z3, z4), userSession, (Integer) null, str, str2);
    }

    public static void A01(1P0 r5, UserSession userSession, Integer num, String str, String str2) {
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, str, "autofill_type");
        0Df.A00(A03, str2, "update_settings_operator");
        if (num != null) {
            0Df.A00(A03, num, "consecutive_neg_interaction");
        }
        2IS A04 = C41845B3m.A04();
        DbW.A18(A03, A04, "request");
        C239113Fa r1 = new C239113Fa(A04, C7592QNi.class, "IGIABAutofillUpdateSettingsMutation", true);
        C239123Fb A01 = C46479Dfi.A01(userSession);
        A01.A08(r1);
        1OC A05 = A01.A05();
        A05.A00 = r5;
        1ES.A05(A05, 517, 2, false, false);
    }

    public static void A00(1P0 r5, UserSession userSession) {
        2IS A04 = C41845B3m.A04();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) Arrays.asList(new String[]{String.valueOf(8)}));
        A04.A05("qrt_experiment_ids", copyOf);
        17k.A0E(AnonymousClass7TF.A1V(copyOf));
        C239113Fa r1 = new C239113Fa(A04, C7604QNu.class, "IGIABAutofillSettings", false);
        C239123Fb A01 = C46479Dfi.A01(userSession);
        A01.A08(r1);
        1OC A05 = A01.A05();
        A05.A00 = r5;
        1ES.A05(A05, 517, 2, false, false);
    }

    public static void A02(UserSession userSession, long j) {
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        0xY AR4 = A0q.AR4();
        AR4.E5c("contact_autofill_automatic_autofill_expiry_timestamp", j);
        AR4.apply();
        0xY AR42 = A0q.AR4();
        AR42.E5T("contact_autofill_eligible_for_automatic_autofill", true);
        AR42.apply();
        A01(new CH5(4), userSession, (Integer) null, "CONTACT_AUTOFILL", "AUTO_AUTOFILL_OPT_IN");
    }

    public static void A03(UserSession userSession, C13757TgT tgT) {
        1Av A00 = 1Au.A00(userSession);
        if (AnonymousClass7TG.A1a(A00, A00.A0N, 1Av.A8a, 164)) {
            A00(new C8766R8r(5, tgT, A00), userSession);
            return;
        }
        A01(new C8766R8r(6, tgT, A00), userSession, Integer.valueOf(A00.A01.getInt("browser_consecutive_decline_autofill", 0)), "CONTACT_AUTOFILL", "SYNC");
    }
}
