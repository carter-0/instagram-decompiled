package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ASR implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(ASR.class);
    public static final String __redex_internal_original_name = "BKBloksFxActionUpdateClientServiceCacheImpl";

    /* JADX WARNING: type inference failed for: r12v4, types: [java.lang.Object, X.8jk] */
    /* JADX WARNING: type inference failed for: r0v47, types: [X.8jm, java.lang.Object] */
    public static final Object A00(C307896Rx r18, AnonymousClass6Tm r19) {
        IllegalStateException illegalStateException;
        Object obj;
        AnonymousClass6Tm r3 = r19;
        Object A03 = r3.A03(0);
        0qQ.A0C(A03, Pxd.A00(94));
        List<Map> list = (List) A03;
        C277014uI A002 = C280064zw.A00(r3.A00.get(1));
        C307896Rx r4 = r18;
        UserSession A0B = C308206Td.A0B(r4);
        try {
            0qQ.A0B(list, 0);
            int A0L = 0se.A0L(0Yv.A1E(list, 10));
            if (A0L < 16) {
                A0L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
            for (Map map : list) {
                Object obj2 = map.get("service_name");
                if (!(obj2 instanceof String) || !(!00l.A0W((CharSequence) obj2))) {
                    illegalStateException = AnonymousClass7TE.A0z("Check failed.");
                } else {
                    Set keySet = map.keySet();
                    Set singleton = Collections.singleton("service_name");
                    0qQ.A07(singleton);
                    if (0qQ.A0K(keySet, singleton)) {
                        obj = null;
                    } else {
                        Object obj3 = map.get("service_status");
                        boolean z = true;
                        if (!(obj3 instanceof String) || !(!00l.A0W((CharSequence) obj3))) {
                            z = false;
                        }
                        if (z) {
                            Object obj4 = map.get("identity_mapping_with_obid");
                            if (obj4 instanceof Map) {
                                Object obj5 = map.get("extra_client_cache_data");
                                if (obj5 instanceof Map) {
                                    String str = (String) obj3;
                                    Map map2 = (Map) obj4;
                                    ArrayList arrayList = new ArrayList(map2.size());
                                    Iterator A0u = AnonymousClass7TF.A0u(map2);
                                    while (A0u.hasNext()) {
                                        Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                                        Object key = A1J.getKey();
                                        Object value = A1J.getValue();
                                        if (!(key instanceof Long)) {
                                            illegalStateException = AnonymousClass7TE.A0z("Check failed.");
                                        } else if (value instanceof Map) {
                                            String valueOf = String.valueOf(AnonymousClass7TE.A0R(key));
                                            Map map3 = (Map) value;
                                            ArrayList arrayList2 = new ArrayList(map3.size());
                                            Iterator A0u2 = AnonymousClass7TF.A0u(map3);
                                            while (A0u2.hasNext()) {
                                                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
                                                Object value2 = A1J2.getValue();
                                                0qQ.A0C(value2, Pxd.A00(95));
                                                Map map4 = (Map) value2;
                                                String valueOf2 = String.valueOf(A1J2.getKey());
                                                Object obj6 = map4.get("identity_type");
                                                0qQ.A0C(obj6, "null cannot be cast to non-null type kotlin.String");
                                                Object obj7 = map4.get("obfuscated_identity_id");
                                                0qQ.A0C(obj7, "null cannot be cast to non-null type kotlin.String");
                                                arrayList2.add(new C363488jo(valueOf2, (String) obj6, (String) obj7, 0sn.A00));
                                            }
                                            0qQ.A0B(valueOf, 1);
                                            ? obj8 = new Object();
                                            obj8.A00 = valueOf;
                                            obj8.A01 = arrayList2;
                                            arrayList.add(obj8);
                                        } else {
                                            illegalStateException = AnonymousClass7TE.A0z("Check failed.");
                                        }
                                    }
                                    HashMap A1E = AnonymousClass7TE.A1E();
                                    Iterator A0u3 = AnonymousClass7TF.A0u((Map) obj5);
                                    while (A0u3.hasNext()) {
                                        Map.Entry A1J3 = AnonymousClass7TE.A1J(A0u3);
                                        Object key2 = A1J3.getKey();
                                        0qQ.A0C(key2, "null cannot be cast to non-null type kotlin.String");
                                        Object value3 = A1J3.getValue();
                                        0qQ.A0C(value3, "null cannot be cast to non-null type kotlin.String");
                                        A1E.put(key2, value3);
                                    }
                                    long currentTimeMillis = System.currentTimeMillis();
                                    0qQ.A0B(str, 1);
                                    0qQ.A0B(A1E, 3);
                                    ? obj9 = new Object();
                                    obj9.A01 = str;
                                    obj9.A03 = arrayList;
                                    obj9.A02 = A1E;
                                    obj9.A00 = currentTimeMillis;
                                    obj = obj9;
                                } else {
                                    illegalStateException = AnonymousClass7TE.A0z("Check failed.");
                                }
                            } else {
                                illegalStateException = AnonymousClass7TE.A0z("Check failed.");
                            }
                        } else {
                            illegalStateException = AnonymousClass7TE.A0z("Check failed.");
                        }
                    }
                    linkedHashMap.put(obj2, obj);
                }
                throw illegalStateException;
            }
            C363428ji A003 = C363418jh.A00(A0B);
            A003.A02();
            A003.A04(A00, "ig_android_fx_bloks", linkedHashMap);
        } catch (IllegalStateException e) {
            1Kn.A03(C273654mx.A00(576), e);
        }
        C308206Td.A0E(r4, A002, AnonymousClass6Tm.A01);
        return null;
    }
}
