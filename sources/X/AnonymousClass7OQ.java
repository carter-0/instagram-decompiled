package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7OQ  reason: invalid class name */
public abstract class AnonymousClass7OQ {
    public static final void A02(UserSession userSession, DirectThreadKey directThreadKey, String str, List list) {
        List list2 = list;
        UserSession userSession2 = userSession;
        if ((A06(list) && 182.A06(0Tu.A05, userSession, 36318892000221865L)) || (!A06(list) && 182.A06(0Tu.A05, userSession, 36318831866681837L))) {
            A01(userSession2, 2HM.A00(userSession), directThreadKey, str, list2, true, true);
        }
    }

    public static final void A03(UserSession userSession, String str, List list) {
        0qQ.A0B(list, 1);
        if (182.A06(0Tu.A05, userSession, 36327103972587692L)) {
            0nY.A00().ATE(new C386869lI(userSession, str, list));
        } else {
            A04(userSession, str, list);
        }
    }

    public static final void A04(UserSession userSession, String str, List list) {
        List list2 = list;
        if (A06(list)) {
            String str2 = str;
            if (str != null) {
                A01(userSession, 2HM.A00(userSession), C327647Bq.A00(new C254763t0(str)), str2, list2, false, true);
            }
        }
    }

    public static final boolean A06(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C254703su) it.next()).A1S()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3FZ, X.N1l] */
    public static final C68123N1l A00(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C55912HpZ) it.next()).A00);
            }
            jSONObject.put("args", jSONArray);
        } catch (JSONException unused) {
        }
        return new AnonymousClass3FZ(jSONObject);
    }

    public static final void A01(UserSession userSession, AnonymousClass2HN r15, DirectThreadKey directThreadKey, String str, List list, boolean z, boolean z2) {
        String str2;
        String str3;
        ImmutableList A01;
        C254873tC r0;
        String str4 = str;
        List<C254703su> list2 = list;
        if (z2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C254703su r5 : list2) {
                C254933tI A0P = r5.A0P();
                String str5 = null;
                if (A0P != null) {
                    str3 = A0P.A0R;
                } else {
                    str3 = null;
                }
                boolean A0K = 0qQ.A0K(str3, "0");
                C254933tI A0P2 = r5.A0P();
                if (A0K) {
                    if (A0P2 != null) {
                        str5 = A0P2.A0T;
                    }
                } else if (A0P2 != null) {
                    str5 = A0P2.A0R;
                }
                if (r5.A1S() && str5 != null) {
                    if (A0P2 == null || (A01 = A0P2.A01()) == null || (r0 = (C254873tC) A01.get(0)) == null || r0.A0X == null) {
                        List list3 = (List) linkedHashMap.getOrDefault(str5, new ArrayList());
                        list3.add(r5);
                        linkedHashMap.put(str5, list3);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (!linkedHashMap.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(0Yv.A1E(list2, 10));
                for (C254703su r2 : list2) {
                    arrayList2.add(new 0eP(r2.A0f(), r2));
                }
                Map A08 = 0Yt.A08(arrayList2);
                for (Object next : linkedHashMap.keySet()) {
                    if (!A08.containsKey(next)) {
                        arrayList.add(next);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                0nY.A00().ATE(new NSW(userSession, r15, directThreadKey, str, arrayList, linkedHashMap, z));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        long A012 = 182.A01(0Tu.A06, userSession, 36600306843258708L);
        0qQ.A0B(str4, 3);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (C254703su r9 : list2) {
            String str6 = r9.A1o;
            if (!(str6 == null || str6.length() == 0)) {
                ImmutableList A0H = r9.A0H();
                if (A0H != null && !A0H.isEmpty() && !((C254873tC) A0H.get(0)).A1i) {
                    boolean A1S = r9.A1S();
                    Object obj = A0H.get(0);
                    0qQ.A07(obj);
                    C254873tC r7 = (C254873tC) obj;
                    List list4 = r9.A2B;
                    if (!A1S ? !(list4 == null || list4.isEmpty()) : r7.A1e) {
                        if (!((C254873tC) A0H.get(0)).A1f) {
                        }
                    }
                }
                if (r9.A1S()) {
                    C370748x0.A00();
                    if (((C72199OyL) userSession.A01(C72199OyL.class, new C73661Pha(userSession, 49))).A03(r9, str4)) {
                        A05(r9, arrayList5, arrayList4, arrayList3, (int) A012);
                    }
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            arrayList3.add(new 0eP(A00(arrayList4), arrayList5));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (C254703su r22 : list2) {
            C254933tI A0P3 = r22.A0P();
            if (A0P3 != null) {
                str2 = A0P3.A0T;
            } else {
                str2 = null;
            }
            if (r22.A1S() && str2 != null) {
                List list5 = (List) linkedHashMap2.getOrDefault(str2, new ArrayList());
                list5.add(r22);
                linkedHashMap2.put(str2, list5);
            }
        }
        C370748x0.A00();
        ((C72199OyL) userSession.A01(C72199OyL.class, new C73661Pha(userSession, 49))).A02(str4, arrayList3, linkedHashMap2, 4);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:2|3|4|5|6|7|8|9|10|11|(1:13)|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        X.0KC.A0F("ReceiverFetchRequestHelper", "json exception when parsing receiverFetchParams", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[Catch:{ JSONException -> 0x0047 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C254703su r3, java.util.List r4, java.util.List r5, java.util.List r6, int r7) {
        /*
            java.lang.String r1 = r3.A0g()
            if (r1 == 0) goto L_0x004f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0047 }
            r2.<init>()     // Catch:{ JSONException -> 0x0047 }
            java.lang.String r0 = "message_id"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0010 }
        L_0x0010:
            java.lang.String r0 = r3.A1o     // Catch:{ JSONException -> 0x0047 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0047 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0047 }
            java.lang.String r0 = "server_content_ref"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x001c }
        L_0x001c:
            X.Gkp r0 = new X.Gkp     // Catch:{ JSONException -> 0x0047 }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x0047 }
            r5.add(r0)     // Catch:{ JSONException -> 0x0047 }
            r4.add(r3)     // Catch:{ JSONException -> 0x0047 }
            int r0 = r5.size()     // Catch:{ JSONException -> 0x0047 }
            if (r0 != r7) goto L_0x0043
            X.N1l r2 = A00(r5)     // Catch:{ JSONException -> 0x0047 }
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r4)     // Catch:{ JSONException -> 0x0047 }
            X.0eP r0 = new X.0eP     // Catch:{ JSONException -> 0x0047 }
            r0.<init>(r2, r1)     // Catch:{ JSONException -> 0x0047 }
            r6.add(r0)     // Catch:{ JSONException -> 0x0047 }
            r5.clear()     // Catch:{ JSONException -> 0x0047 }
            r4.clear()     // Catch:{ JSONException -> 0x0047 }
        L_0x0043:
            r0 = 1
            r3.A2K = r0     // Catch:{ JSONException -> 0x0047 }
            return
        L_0x0047:
            r2 = move-exception
            java.lang.String r1 = "ReceiverFetchRequestHelper"
            java.lang.String r0 = "json exception when parsing receiverFetchParams"
            X.0KC.A0F(r1, r0, r2)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7OQ.A05(X.3su, java.util.List, java.util.List, java.util.List, int):void");
    }
}
