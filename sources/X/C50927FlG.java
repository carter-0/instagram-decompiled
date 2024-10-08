package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.model.UserBirthDate;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.FlG  reason: case insensitive filesystem */
public final class C50927FlG implements 0Js {
    public final /* bridge */ /* synthetic */ void ATN(UserSession userSession, 0Jv r13, Object obj) {
        C49600EzJ ezJ = (C49600EzJ) obj;
        AnonymousClass7TG.A1T(userSession, ezJ, r13);
        String str = AnonymousClass1CT.A00(userSession).A04;
        0K1 r3 = new 0K1(ezJ.A01, r13);
        AnonymousClass4DH r4 = ezJ.A00;
        AnonymousClass0aP r8 = ezJ.A02;
        Context context = r4.getContext();
        RegFlowExtras regFlowExtras = ezJ.A03;
        boolean z = false;
        1NY A0a = AnonymousClass7TG.A0a(r8);
        A0a.A0A("multiple_accounts/create_secondary_account/");
        DbW.A19(19f.A2I, A0a, DbT.A0P(r8));
        A0a.A9m("main_user_id", regFlowExtras.A0J);
        A0a.A9m("main_user_authorization_token", str);
        A0a.A9m("should_copy_consent_and_birthday_from_main", "true");
        A0a.A0H("should_link_to_main", regFlowExtras.A0z);
        DbW.A1F(A0a);
        String string = DbV.A0d().getString("google_ad_id", (String) null);
        Pattern pattern = 0mp.A01;
        if (string == null) {
            string = "";
        }
        A0a.A9m("adid", string);
        if (regFlowExtras.A0t && regFlowExtras.A0y) {
            z = true;
        }
        A0a.A0H("should_cal_link_to_main", z);
        A0a.A0O(0aS.A00, DwQ.class, F7K.class, false);
        RegFlowExtras.A00(context, A0a, r8, regFlowExtras, false);
        UserBirthDate userBirthDate = regFlowExtras.A03;
        if (userBirthDate != null) {
            A0a.A9m("year", String.valueOf(userBirthDate.A02));
            A0a.A9m("month", String.valueOf(userBirthDate.A01));
            A0a.A9m("day", String.valueOf(userBirthDate.A00));
        }
        if (!(regFlowExtras.A0T == null || regFlowExtras.A0U == null)) {
            JSONObject A11 = DbS.A11();
            try {
                A11.put("intent", regFlowExtras.A0T);
                A11.put("surface", regFlowExtras.A0U);
                A0a.A9m("secondary_account_intent", A11.toString());
            } catch (JSONException e) {
                0wb.A03("SecondaryAccountApi", AnonymousClass7TF.A0m("Error adding secondary account creation intent JSON object: ", e));
            }
        }
        1OC A0M = A0a.A0M();
        A0M.A00 = r3;
        r4.schedule(A0M);
    }
}
