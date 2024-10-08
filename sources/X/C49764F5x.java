package X;

import android.content.Context;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.F5x  reason: case insensitive filesystem */
public abstract class C49764F5x {
    public static 1OC A00(Context context, 1NY r4, 0lg r5, Integer num, Integer num2, String str) {
        Integer num3 = AnonymousClass05K.A01;
        r4.A08(num3);
        r4.A0R(Dw7.class, C49763F5w.class);
        if (num2 == num3) {
            r4.A0A("consent/existing_user_flow/");
        } else if (num2 == AnonymousClass05K.A00) {
            r4.A0A("consent/new_user_flow/");
            Dbb.A0j(context, r4);
            0qv r0 = 0qv.A02;
            context.getClass();
            DbW.A1A(19f.A1h, r4, DbW.A0I(r4, r5, "guid", r0.A05(context)));
            r4.A9m("gdpr_s", str);
        }
        if (num != null) {
            r4.A9m("current_screen_key", C48935EmZ.A00(num));
        }
        return DbW.A0K(r4);
    }

    public static String A01(List list, List list2) {
        String str;
        if (list.size() != list2.size()) {
            return "";
        }
        JSONObject A11 = DbS.A11();
        for (int i = 0; i < list.size(); i++) {
            F3L f3l = (F3L) list.get(i);
            EW2 ew2 = (EW2) list2.get(i);
            if (!(f3l == null || (str = f3l.A00) == null)) {
                try {
                    A11.put(str, Integer.toString(ew2.A00));
                } catch (JSONException e) {
                    0wb.A03("Failed to append consent update param", 0mp.A06("{ 'error' : '%s' }", new Object[]{e.getMessage()}));
                }
            }
        }
        return A11.toString();
    }
}
