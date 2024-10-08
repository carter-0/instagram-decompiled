package X;

import android.content.Context;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Map;

public abstract class SQF {
    public static final void A01(Context context, AutofillData autofillData, C10284Rpi rpi, UserSession userSession, boolean z) {
        try {
            AnonymousClass0K0 r2 = GraphQlCallInput.A02;
            Map map = autofillData.A00;
            Map A0x = Pxf.A0x(map);
            0Df A03 = C41845B3m.A03(r2, A0x.get("given-name"), "given_name");
            0Df.A00(A03, A0x.get("family-name"), "family_name");
            0Df.A00(A03, A0x.get("address-line1"), "address_line1");
            0Df.A00(A03, A0x.get("address-line2"), "address_line2");
            0Df.A00(A03, A0x.get("address-level1"), "address_level1");
            0Df.A00(A03, A0x.get("address-level2"), "address_level2");
            0Df.A00(A03, A0x.get("postal-code"), "postal_code");
            0Df.A00(A03, A0x.get("country"), "country_name");
            0Df.A00(A03, A0x.get("email"), "email");
            0Df.A00(A03, A0x.get("tel"), "tel");
            0Df A02 = r2.A02();
            A02.A0E(A03, "data");
            2IS A0D = JTQ.A0D(A02, map.get("ent_id"), "ent_id");
            DbW.A18(A02, A0D, "request");
            1OC A00 = A00(new C239113Fa(A0D, C7585QNa.class, "IABAutofillSaveDataEntries", true), userSession);
            A00.A00 = new C8763R8o(0, context, autofillData, rpi, userSession, z);
            A02(A00);
        } catch (IOException e) {
            0wb.A06("AutofillGraphQLRequest", "Error creating save autofill request", e);
            if (rpi != null) {
                SB5.A00(new THQ(rpi.A00, "Error creating save autofill request"));
            }
        }
    }

    public static final 1OC A00(1Ef r2, UserSession userSession) {
        C239123Fb r1 = new C239123Fb(userSession);
        r1.A08(r2);
        r1.A08 = AnonymousClass000.A00(65);
        return r1.A05();
    }

    public static final void A03(Map map, String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            map.put(str, str2);
        }
    }

    public static final void A02(1OC r2) {
        0nY.A00().ATE(new C8790R9r(r2));
    }
}
