package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class SKH {
    public static final AutofillData A00(C10860RzL rzL, 1yd r7) {
        C61073JwB jwB;
        Object obj;
        0qQ.A0B(rzL, 0);
        String A0w = Pxe.A0w(0Tu.A06, r7.A00, 36885810504729262L);
        C61073JwB jwB2 = null;
        if (0qQ.A0K(A0w, "recent")) {
            jwB = null;
            jwB2 = (C61073JwB) rzL.A0M.A02;
        } else if (0qQ.A0K(A0w, "recent_crossapp")) {
            C61084JwM jwM = rzL.A0M;
            jwB2 = (C61073JwB) jwM.A02;
            jwB = (C61073JwB) jwM.A00;
        } else {
            jwB = null;
        }
        Map A01 = S8L.A01(jwB2);
        Map A012 = S8L.A01(jwB);
        LinkedHashMap A03 = 0Yt.A03(S8L.A01((C61073JwB) 00k.A0O((List) rzL.A0B.A00, 0)));
        Set set = (Set) rzL.A06.A04;
        if (set != null) {
            for (Object next : set) {
                CharSequence charSequence = (CharSequence) A03.get(next);
                if (charSequence == null || charSequence.length() == 0) {
                    CharSequence charSequence2 = (CharSequence) A01.get(next);
                    if (charSequence2 == null || charSequence2.length() == 0) {
                        obj = A012.get(next);
                    } else {
                        obj = A01.get(next);
                    }
                    A03.put(next, obj);
                }
            }
        }
        return new AutofillData((Map) A03);
    }

    public static final Map A02(C10860RzL rzL, 1yd r10) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AnonymousClass7TF.A1H(rzL, r10);
        C61084JwM jwM = rzL.A0M;
        if (!(jwM.A00 == null && jwM.A02 == null)) {
            boolean z = false;
            if (!0qQ.A0K(Pxe.A0w(0Tu.A06, r10.A00, 36885810504729262L), "control")) {
                Map A01 = S8L.A01((C61073JwB) jwM.A02);
                Map A012 = S8L.A01((C61073JwB) jwM.A00);
                Map A013 = S8L.A01((C61073JwB) 00k.A0O((List) rzL.A0B.A00, 0));
                Map A0x = Pxf.A0x(A00(rzL, r10).A00);
                LinkedHashSet A0y = DbS.A0y();
                LinkedHashSet A0y2 = DbS.A0y();
                Set set = (Set) rzL.A06.A04;
                if (set != null) {
                    for (Object next : set) {
                        CharSequence charSequence3 = (CharSequence) A013.get(next);
                        if (charSequence3 == null || charSequence3.length() == 0) {
                            CharSequence charSequence4 = (CharSequence) A0x.get(next);
                            if (charSequence4 == null || charSequence4.length() == 0 || (charSequence2 = (CharSequence) A01.get(next)) == null || charSequence2.length() == 0) {
                                CharSequence charSequence5 = (CharSequence) A0x.get(next);
                                if (!(charSequence5 == null || charSequence5.length() == 0 || (charSequence = (CharSequence) A012.get(next)) == null || charSequence.length() == 0)) {
                                    A0y2.add(next);
                                }
                            } else {
                                A0y.add(next);
                            }
                            z = true;
                        }
                    }
                }
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                if (!z) {
                    return A1H;
                }
                A1H.put("supplemented_wallet_data_from_recent", RUN.A00(A0y));
                A1H.put("supplemented_wallet_data_from_crossapp", RUN.A00(A0y2));
                return A1H;
            }
        }
        return 0Yt.A0E();
    }

    public static final C61073JwB A01(S0F s0f, String str) {
        LinkedHashMap linkedHashMap;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            JSONObject A17 = C66580MXl.A17(str);
            Iterator<String> keys = A17.keys();
            0qQ.A07(keys);
            AnonymousClass2U8 A00 = 2YX.A00(keys);
            linkedHashMap = AnonymousClass7TE.A1H();
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap.put(next, A17.optString((String) next));
            }
        } catch (JSONException unused) {
            s0f.A00("Wrong JSON format stored for parsing contact data");
            linkedHashMap = 0Yt.A0E();
        }
        return S8L.A00(linkedHashMap);
    }
}
