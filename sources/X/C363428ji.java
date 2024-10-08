package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.8ji  reason: invalid class name and case insensitive filesystem */
public final class C363428ji implements AnonymousClass0lh {
    public Map A00;
    public Map A01;
    public String A02;
    public final UserSession A03;
    public final 1wg A04;

    public C363428ji(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = 1we.A00(userSession);
        this.A01 = 0Yt.A03(A01((List) null));
        this.A02 = "";
    }

    public final Map A00(CallerContext callerContext, String str, List list) {
        0qQ.A0B(callerContext, 1);
        0qQ.A0B(list, 2);
        if (!A07() || !A08(callerContext, str)) {
            return 0Yt.A0E();
        }
        A06(list);
        1wg r1 = this.A04;
        String str2 = callerContext.A02;
        0qQ.A07(str2);
        r1.A03(str, str2, list);
        Map map = this.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (list.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(0se.A0L(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            List<Object> list2 = ((C363448jk) entry2.getValue()).A03;
            ArrayList arrayList = new ArrayList();
            for (Object add : list2) {
                arrayList.add(add);
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }

    public final synchronized void A02() {
        0xa r4 = 1Au.A00(this.A03).A01;
        for (String str : 00k.A0X(r4.getAll().keySet())) {
            if (00p.A0k(str, "fx_cal_account_center_service", false)) {
                0xY AR4 = r4.AR4();
                AR4.ED3(str);
                AR4.apply();
            }
        }
        Map map = this.A00;
        if (map != null) {
            map.clear();
        }
    }

    public final void A03(CallerContext callerContext, C363768kJ r21, String str, List list, Map map) {
        CallerContext callerContext2 = callerContext;
        0qQ.A0B(callerContext2, 1);
        List list2 = list;
        0qQ.A0B(list2, 2);
        if (A07()) {
            ArrayList arrayList = new ArrayList();
            Map map2 = map;
            for (String str2 : map2.keySet()) {
                2IV r2 = new 2IV();
                r2.A09(str2, "key");
                r2.A09((String) map2.get(str2), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                arrayList.add(r2);
            }
            1wg r3 = this.A04;
            String str3 = callerContext2.A02;
            0qQ.A07(str3);
            String str4 = str;
            r3.A04("service_manual_fetch_attempt", str4, list2, 0Yt.A02(new 0eP[]{new 0eP("caller_class", str3)}));
            C363698kC r13 = new C363698kC(callerContext2, this, r21, str4, list2);
            UserSession userSession = this.A03;
            if (AnonymousClass3EM.A02() && "".equals(this.A02)) {
                1Uk A002 = AnonymousClass1UZ.A00(userSession.A03.A06()).A00("FX_CACHE_FDID_STORE");
                0qQ.A07(A002);
                String string = A002.getString("fdid", "");
                0qQ.A07(string);
                this.A02 = string;
            }
            ImmutableSet immutableSet = C363708kD.A00;
            ImmutableList copyOf = ImmutableList.copyOf((Collection) list2);
            0qQ.A07(copyOf);
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) arrayList);
            0qQ.A0B(userSession, 0);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = copyOf.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (C363708kD.A00.contains(next)) {
                    arrayList2.add(next);
                }
            }
            ImmutableList copyOf3 = ImmutableList.copyOf((Collection) arrayList2);
            2IS r6 = new 2IS();
            2IS r4 = new 2IS();
            r6.A05("service_names", copyOf3);
            boolean z = false;
            if (copyOf3 != null) {
                z = true;
            }
            r6.A04("caller_name", "fx_product_foundation_client_FXOnline_client_cache");
            r6.A04("client_caller_name", str4);
            r6.A05("custom_partner_params", copyOf2);
            17k.A0E(z);
            AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "FxIgConnectedServicesInfoQuery", r6.getParamsCopy(), r4.getParamsCopy(), C363728kF.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_service_cache", new ArrayList());
            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0);
            pandoGraphQLRequest.setEnsureCacheWrite(false);
            1vm.A01(userSession).ATM(new C363748kH(r13), new C363738kG(userSession, r13), pandoGraphQLRequest, new 0nX(795262476));
        }
    }

    public final synchronized void A05(String str) {
        0qQ.A0B(str, 0);
        0xY AR4 = 1Au.A00(this.A03).A01.AR4();
        AR4.ED3(002.A0R("fx_cal_account_center_service_", str));
        AR4.apply();
        Map map = this.A00;
        if (map != null) {
            map.remove(str);
        }
    }

    public final synchronized void A06(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = this.A01;
            C363448jk r0 = (C363448jk) map.get(str);
            if (r0 != null && System.currentTimeMillis() - r0.A00 > 86400000) {
                A05(str);
                arrayList.add(str);
            }
            List singletonList = Collections.singletonList(str);
            0qQ.A07(singletonList);
            Object obj = A01(singletonList).get(str);
            if (obj == null) {
                map.remove(str);
            } else {
                map.put(str, obj);
            }
        }
        if (!arrayList.isEmpty()) {
            this.A04.A04("service_cache_eviction", "ig_android_service_cache_fx_internal", arrayList, (Map) null);
        }
    }

    public final boolean A08(CallerContext callerContext, String str) {
        0Tu r2 = 0Tu.A06;
        String str2 = str;
        if (1AW.A06(r2, 18298961568139168L)) {
            if (1AW.A06(r2, 18298961568270241L)) {
                String str3 = callerContext.A02;
                return C250563lf.A0r(new C299885wA(this.A03), AnonymousClass05K.A0C, str, str3);
            }
            String A042 = 1AW.A04(r2, 18861911521624162L);
            String str4 = callerContext.A02;
            0qQ.A07(str4);
            return C299895wB.A00(new C299885wA(this.A03), AnonymousClass05K.A0C, A042, str4, str2, false);
        } else if (!1AW.A06(r2, 18298961567745950L)) {
            return true;
        } else {
            try {
                JSONArray jSONArray = new JSONArray(1AW.A04(r2, 18861911521427552L));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (str.equals(jSONArray.getString(i))) {
                        return true;
                    }
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        }
    }

    public final Map A01(List list) {
        Set set;
        try {
            1Av A002 = 1Au.A00(this.A03);
            if (list != null) {
                set = 00k.A0k(list);
            } else {
                set = null;
            }
            HashMap hashMap = new HashMap();
            0xa r5 = A002.A01;
            for (String str : 00k.A0X(r5.getAll().keySet())) {
                if (00p.A0k(str, "fx_cal_account_center_service", false)) {
                    String substring = str.substring(30);
                    0qQ.A07(substring);
                    if (set == null || set.contains(substring)) {
                        hashMap.put(substring, r5.getString(str, ""));
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(0se.A0L(hashMap.size()));
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                C363448jk parseFromJson = C363438jj.parseFromJson(16P.A00((String) entry.getValue()));
                if (parseFromJson != null) {
                    linkedHashMap.put(key, parseFromJson);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return linkedHashMap;
        } catch (IOException | IllegalStateException unused) {
            return 0Yt.A0E();
        }
    }

    public final boolean A07() {
        return 182.A06(0Tu.A05, this.A03, 36311788119327500L);
    }

    public final void A04(CallerContext callerContext, String str, Map map) {
        if (A07()) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                C363448jk r6 = (C363448jk) entry.getValue();
                if (r6 == null) {
                    A05(str2);
                } else {
                    synchronized (this) {
                        0qQ.A0B(str2, 0);
                        StringWriter stringWriter = new StringWriter();
                        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                        A0A.A0c();
                        A0A.A0R(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, r6.A01);
                        16P.A03(A0A, "identity_mapping");
                        for (C363468jm r2 : r6.A03) {
                            if (r2 != null) {
                                A0A.A0c();
                                String str3 = r2.A00;
                                if (str3 != null) {
                                    A0A.A0R("source_identity_id", str3);
                                }
                                if (r2.A01 != null) {
                                    16P.A03(A0A, "destination_identities");
                                    for (C363488jo r22 : r2.A01) {
                                        if (r22 != null) {
                                            A0A.A0c();
                                            A0A.A0R("identity_id", r22.A00);
                                            A0A.A0R("identity_type", r22.A01);
                                            A0A.A0R("obfuscated_identity_id", r22.A02);
                                            16P.A03(A0A, "surface_to_xpost_eligibilities");
                                            for (AnonymousClass805 r23 : r22.A03) {
                                                if (r23 != null) {
                                                    A0A.A0c();
                                                    String str4 = r23.A01;
                                                    if (str4 != null) {
                                                        A0A.A0R("surface", str4);
                                                    }
                                                    A0A.A0S("is_eligible", r23.A02);
                                                    String str5 = r23.A00;
                                                    if (str5 != null) {
                                                        A0A.A0R("ineligible_reason", str5);
                                                    }
                                                    A0A.A0Z();
                                                }
                                            }
                                            A0A.A0Y();
                                            A0A.A0Z();
                                        }
                                    }
                                    A0A.A0Y();
                                }
                                A0A.A0Z();
                            }
                        }
                        A0A.A0Y();
                        A0A.A0q("custom_data");
                        A0A.A0c();
                        for (Map.Entry entry2 : r6.A02.entrySet()) {
                            if (!16P.A04(A0A, entry2)) {
                                A0A.A0t((String) entry2.getValue());
                            }
                        }
                        A0A.A0Z();
                        A0A.A0Q("last_update_time_ms", r6.A00);
                        A0A.A0Z();
                        A0A.close();
                        String obj = stringWriter.toString();
                        0xY AR4 = 1Au.A00(this.A03).A01.AR4();
                        AR4.E5g(002.A0R("fx_cal_account_center_service_", str2), obj);
                        AR4.apply();
                    }
                }
                List singletonList = Collections.singletonList(str2);
                0qQ.A07(singletonList);
                Object obj2 = A01(singletonList).get(str2);
                Map map2 = this.A01;
                if (obj2 == null) {
                    map2.remove(str2);
                } else {
                    map2.put(str2, obj2);
                }
            }
            1wg r4 = this.A04;
            String str6 = callerContext.A02;
            0qQ.A07(str6);
            r4.A04("service_cache_write", str, 00k.A0a(map.keySet()), 0Yt.A02(new 0eP[]{new 0eP("caller_class", str6)}));
        }
    }

    public final void onSessionWillEnd() {
        A02();
        this.A01.clear();
        this.A03.A03(C363428ji.class);
    }

    public C363428ji() {
    }
}
