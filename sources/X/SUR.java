package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Deprecated;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated(message = "")
public abstract class SUR {
    public static final AutofillData A00(JSONObject jSONObject) {
        HashMap A1E = AnonymousClass7TE.A1E();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("raw_autofill_data");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String A18 = AnonymousClass7TE.A18(keys);
                A1E.put(A18, jSONObject2.getJSONArray(A18).getString(0));
            }
        } catch (JSONException e) {
            Log.e("AutofillSharedUtil", "Save autofill JSON wrongly formatted", e);
        }
        return new AutofillData((Map) A1E);
    }

    public static final JSONObject A09(AutofillData autofillData) {
        0qQ.A0B(autofillData, 0);
        JSONObject A11 = DbS.A11();
        Iterator A0u = AnonymousClass7TF.A0u(Pxf.A0x(autofillData.A00));
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            Object value = A1J.getValue();
            JSONArray A1E = Pxe.A1E();
            A1E.put(value);
            try {
                A11.put(A13, A1E);
            } catch (JSONException unused) {
            }
        }
        JSONObject A112 = DbS.A11();
        try {
            A112.put("raw_autofill_data", A11);
            A112.put("callbackID", "placeholder");
        } catch (JSONException unused2) {
        }
        return A112;
    }

    public static final boolean A0F(AutofillData autofillData, AutofillData autofillData2) {
        0qQ.A0B(autofillData, 0);
        HashMap A19 = Pxe.A19(Collections.unmodifiableMap(autofillData.A00));
        HashMap A192 = Pxe.A19(Collections.unmodifiableMap(autofillData2.A00));
        for (Object next : Arrays.asList(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ent_id", "usage_frequency"})) {
            A19.remove(next);
            A192.remove(next);
        }
        if (A192.size() > A19.size()) {
            return false;
        }
        Set<Object> keySet = A192.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return true;
        }
        for (Object containsKey : keySet) {
            if (!A19.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static final String A02(Set set) {
        TreeSet treeSet;
        if (set != null) {
            treeSet = new TreeSet(set);
        }
        List asList = Arrays.asList(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ent_id", "usage_frequency"});
        0qQ.A07(asList);
        treeSet.removeAll(asList);
        String join = TextUtils.join(", ", treeSet);
        0qQ.A07(join);
        return join;
    }

    public static final String A03(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = new JSONArray(jSONObject.getString("autofillFields"));
            ArrayList A1C = AnonymousClass7TE.A1C();
            int length = jSONArray.length();
            for (int i = 0; i < length; i = Pxg.A09(A1C, jSONArray, i)) {
            }
            01V.A1C(A1C);
            return TextUtils.join(", ", A1C);
        } catch (JSONException e) {
            SQO.A00("AutofillSharedUtil", "Failed to parseRequestedFields", e, e);
            return null;
        }
    }

    public static final void A0A(Bundle bundle, C270254gR r16, C11265SHz sHz) {
        ImmutableMap immutableMap;
        C11265SHz sHz2 = sHz;
        if (sHz != null) {
            C270254gR r4 = r16;
            if (r16 != null) {
                if (DbY.A1Z(0Tu.A06, r4.A04.A00, 36322860547517000L)) {
                    C11290SJq sJq = r4.A01;
                    String str = sHz2.A0I;
                    if (!00p.A0i(str, "_V2", false)) {
                        str = 002.A0R(str, "_V2");
                    }
                    String valueOf = String.valueOf(sHz2.A0H);
                    Map map = sHz2.A0L;
                    if (map != null) {
                        immutableMap = ImmutableMap.copyOf(map);
                    } else {
                        immutableMap = null;
                    }
                    boolean z = sHz2.A0P;
                    String str2 = sHz2.A09;
                    Long valueOf2 = Long.valueOf(sHz2.A02);
                    String str3 = sHz2.A0C;
                    String str4 = sHz2.A0E;
                    C11290SJq.A00(bundle, sJq, new C53388GnK(Integer.valueOf(sHz2.A00), Integer.valueOf((int) sHz2.A03), valueOf2, DbS.A0j(sHz2.A01), str2, str3, str4, (Map) immutableMap, z), str, valueOf);
                    return;
                }
            }
            SRY.A01(bundle, sHz2.A01());
        }
    }

    public static void A0D(QKK qkk, RRP rrp) {
        rrp.A0C = A02(A08(Collections.unmodifiableMap(qkk.A08.A00), Collections.unmodifiableMap(qkk.A07.A00)));
        rrp.A09 = A02(A07(Collections.unmodifiableMap(qkk.A08.A00), Collections.unmodifiableMap(qkk.A07.A00)));
    }

    public static void A0E(QKK qkk, RRP rrp, String str) {
        rrp.A0G = str;
        rrp.A06 = A02(qkk.A09.A01());
        rrp.A0F = A02(qkk.A09.A01());
    }

    public static final String A01(List list) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (list != null && !list.isEmpty()) {
            for (Object A10 : list) {
                A1A.append(A02(Pxj.A10(A10)));
                A1A.append(";");
            }
        }
        return DbT.A10(A1A);
    }

    public static final String A04(JSONObject jSONObject) {
        try {
            return jSONObject.getString("selectedAutoCompleteTag");
        } catch (JSONException e) {
            SQO.A00("AutofillSharedUtil", "Failed to get autofill tag", e, e);
            return null;
        }
    }

    public static final ArrayList A05(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    A1C.add(new AutofillData(C66580MXl.A17(AnonymousClass7TE.A18(it))));
                } catch (JSONException e) {
                    Log.e("AutofillSharedUtil", "Wrong JSON format for autofill", e);
                }
            }
        }
        return A1C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r3.remove("first_form_interaction_time") == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.HashMap A06(android.os.Bundle r4, X.C11265SHz r5) {
        /*
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            if (r5 == 0) goto L_0x0018
            X.C11265SHz.A00(r5, r3)
            java.lang.Long r0 = r5.A04
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L_0x0018
            java.lang.String r0 = "first_form_interaction_time"
            r3.put(r0, r1)
        L_0x0018:
            r1 = 1
            if (r4 == 0) goto L_0x004c
            java.lang.String r0 = "Tracking.ENABLED"
            boolean r0 = r4.getBoolean(r0, r1)
        L_0x0021:
            r0 = r0 ^ 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_messaging_thread"
            r3.put(r0, r1)
            java.lang.String r1 = "first_form_interaction_time"
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r2 = "user_interaction_time"
            if (r0 == 0) goto L_0x0040
            r3.put(r2, r0)
            java.lang.Object r0 = r3.remove(r1)
            if (r0 != 0) goto L_0x004b
        L_0x0040:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.put(r2, r0)
        L_0x004b:
            return r3
        L_0x004c:
            r0 = 1
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUR.A06(android.os.Bundle, X.SHz):java.util.HashMap");
    }

    public static final HashSet A07(Map map, Map map2) {
        String str;
        AnonymousClass7TG.A1N(map, map2);
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            String A0s = DbS.A0s(A1J);
            if (A0s != null && DbV.A12(A0s).length() > 0) {
                if (map2.get(key) != null) {
                    String A11 = DbT.A11(key, map2);
                    if (A11 != null) {
                        str = DbV.A12(A11);
                    } else {
                        str = null;
                    }
                    if (0qQ.A0K(str, DbV.A12(A0s))) {
                    }
                }
                A1F.add(key);
            }
        }
        return A1F;
    }

    public static final HashSet A08(Map map, Map map2) {
        CharSequence charSequence;
        boolean A1Z = AnonymousClass7TG.A1Z(map, map2);
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator A0u = AnonymousClass7TF.A0u(map2);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            String A0s = DbS.A0s(A1J);
            if (A0s != null) {
                int length = A0s.length() - (A1Z ? 1 : 0);
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    int i2 = length;
                    if (!z) {
                        i2 = i;
                    }
                    boolean A13 = Dbc.A13(A0s, i2);
                    if (z) {
                        if (!A13) {
                            break;
                        }
                        length--;
                    } else if (!A13) {
                        z = true;
                    } else {
                        i++;
                    }
                }
                if (!(Dba.A0c(A0s, length, i).length() == 0 || (charSequence = (CharSequence) map.get(key)) == null || charSequence.length() == 0)) {
                    A1F.add(key);
                }
            }
        }
        return A1F;
    }

    public static void A0B(C270254gR r2, C7580QKv qKv, RRP rrp) {
        A0A(qKv.A02(), r2, rrp.A00());
    }

    public static void A0C(C270254gR r2, STY sty, RRP rrp) {
        A0A(sty.A04.A02(), r2, rrp.A00());
    }
}
