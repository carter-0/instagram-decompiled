package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.FlA  reason: case insensitive filesystem */
public final class C50921FlA implements 0Js {
    public final /* bridge */ /* synthetic */ void ATN(UserSession userSession, 0Jv r11, Object obj) {
        C49579Eyo eyo = (C49579Eyo) obj;
        eyo.getClass();
        0K1 r5 = new 0K1(eyo.A02, r11);
        try {
            Context context = eyo.A00;
            AnonymousClass07i r3 = eyo.A01;
            List list = eyo.A03;
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                JSONObject A11 = DbS.A11();
                A11.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, Long.parseLong(A18));
                jSONArray.put(A11);
            }
            1NY A0N = DbU.A0N(userSession);
            A0N.A0A("multiple_accounts/set_child_accounts/");
            A0N.A0R(1XP.class, 1XY.class);
            A0N.A9m("child_account_ids", jSONArray.toString());
            A0N.A0N = true;
            1OC A0M = A0N.A0M();
            A0M.A00 = r5;
            1ES.A00(context, r3, A0M);
        } catch (JSONException unused) {
            r11.AId((Object) null);
        }
    }
}
