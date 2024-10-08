package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Vwr  reason: case insensitive filesystem */
public abstract class C18693Vwr {
    public static final LinkedHashMap A01(Bundle bundle, HashMap hashMap, String[] strArr) {
        Object A0R;
        List A1P = 0sr.A1P(new String[]{"analytics_referral_component", "analytics_referral_experience", "analytics_referral_module", "analytics_referral_page", AnonymousClass000.A00(316)});
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(0se.A0L(hashMap.size()));
        Iterator A0s = AnonymousClass7TF.A0s(hashMap);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            if (A1P.contains(A1J.getKey())) {
                A0R = A1J.getKey();
            } else {
                A0R = 002.A0R("prop_", DbT.A13(A1J));
            }
            linkedHashMap2.put(A0R, A1J.getValue());
        }
        builder.putAll(linkedHashMap2);
        ImmutableMap build = builder.build();
        0qQ.A0A(build);
        linkedHashMap.putAll(build);
        String str = strArr[0];
        if (bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj == null) {
                obj = "";
            }
            linkedHashMap.put(str, obj);
        }
        return linkedHashMap;
    }

    public static final void A02(HashMap hashMap) {
        if (!hashMap.containsKey("shopping_session_id")) {
            hashMap.put("shopping_session_id", C228022kf.A00((Bundle) null));
        }
        if (!hashMap.containsKey("checkout_session_id")) {
            hashMap.put("checkout_session_id", C2818159r.A01());
        }
    }

    public static final HashMap A00(Bundle bundle, String[] strArr) {
        Set<String> keySet = bundle.keySet();
        ArrayList A15 = DbV.A15(keySet);
        for (String next : keySet) {
            String str = next;
            if (bundle.get(str) != null && !03t.A0O(str, strArr)) {
                A15.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A15);
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            AnonymousClass7TF.A1I(A18, Pxi.A0d(bundle, A18), A0r);
        }
        HashMap hashMap = new HashMap();
        0Yt.A0F(A0r, hashMap);
        return hashMap;
    }
}
