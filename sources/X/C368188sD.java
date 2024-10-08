package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8sD  reason: invalid class name and case insensitive filesystem */
public abstract class C368188sD {
    public String A00 = "";
    public String A01 = "2.0";

    public static void A00(C368248sJ r4, String str, String str2, String str3, String str4, Map map, C368188sD r10) {
        Enum enumR;
        Enum enumR2;
        if (r10 instanceof C368208sF) {
            0wc A02 = AnonymousClass0kN.A02(((C368208sF) r10).A00);
            1Ln r3 = new 1Ln(A02.A00(A02.A00, "fx_access_library"), 156);
            String str5 = r10.A00;
            if (str5.isEmpty()) {
                if (r3.A00.isSampled()) {
                    str5 = "";
                } else {
                    return;
                }
            }
            r3.A0M(r4, "event");
            try {
                enumR = Enum.valueOf(AnonymousClass9t5.class, "ACCOUNT_ITEM");
            } catch (IllegalArgumentException unused) {
                enumR = null;
            }
            r3.A0M((AnonymousClass9t5) enumR, "item_type");
            r3.A0M((C391439t4) C39608A1y.A00(C391439t4.class, str2), "target_credential_source");
            r3.A0M((XSB) C39608A1y.A00(XSB.class, str), "target_app_source");
            try {
                enumR2 = Enum.valueOf(C62638Kk0.class, "");
            } catch (IllegalArgumentException unused2) {
                enumR2 = null;
            }
            r3.A0M((C62638Kk0) enumR2, "target_device_item_source");
            r3.A0R(TraceFieldType.FailureReason, str3);
            r3.A0R("event_session_id", str4);
            r3.A00.A9H("debug_test_data", map);
            r3.A0R("version_id", r10.A01);
            r3.A0R("table_join_id", str5);
            r3.Cgf();
        }
    }

    public final HashMap A01(String... strArr) {
        HashMap hashMap = new HashMap();
        int length = strArr.length;
        if (length % 2 != 1) {
            for (int i = 0; i < length; i += 2) {
                String str = strArr[i];
                if (str == null) {
                    str = "";
                }
                String str2 = strArr[i + 1];
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    public final C368258sK A02() {
        if (this instanceof C368208sF) {
            return new C368258sK(02m.A0p);
        }
        return null;
    }

    public final void A03(Integer num, String str, String str2, Map map) {
        A00(C368248sJ.FETCH_FAILURE, str, str2, C369088to.A00(num), (String) null, map, this);
        if (A02() != null) {
            C368258sK A02 = A02();
            int A002 = C368258sK.A00(map);
            QuickPerformanceLogger quickPerformanceLogger = A02.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(857814189, A002, 3);
            }
        }
    }

    public final void A04(Integer num, String str, Map map) {
        QuickPerformanceLogger quickPerformanceLogger;
        A00(C368248sJ.WRITE_FAILURE, str, "ACTIVE_ACCOUNT", C369088to.A00(num), (String) null, map, this);
        if (A02() != null && (quickPerformanceLogger = A02().A00) != null) {
            quickPerformanceLogger.markerEnd(857814589, 3);
        }
    }

    public final void A08(String str, Integer num, String str2) {
        A00(C368248sJ.ACL_CHECK_FAILURE, str, str2, C369088to.A00(num), (String) null, (Map) null, this);
    }

    public final void A09(String str, Map map, String str2) {
        String str3 = str2;
        String str4 = str;
        Map map2 = map;
        A00(C368248sJ.FETCH_START, str4, str3, (String) null, (String) null, map2, this);
        if (A02() != null) {
            C368258sK A02 = A02();
            int A002 = C368258sK.A00(map2);
            QuickPerformanceLogger quickPerformanceLogger = A02.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerStart(857814189, A002);
                quickPerformanceLogger.markerAnnotate(857814189, A002, "platform", "Android");
                quickPerformanceLogger.markerAnnotate(857814189, A002, "app_id", 567067343352427L);
                if (str == null) {
                    str4 = "";
                }
                quickPerformanceLogger.markerAnnotate(857814189, A002, "app_source", str4);
                quickPerformanceLogger.markerAnnotate(857814189, A002, "item_type", "ACCOUNT_ITEM");
                if (str2 == null) {
                    str3 = "";
                }
                quickPerformanceLogger.markerAnnotate(857814189, A002, "credential_source", str3);
                quickPerformanceLogger.markerAnnotate(857814189, A002, "logging_version", "3.0");
            }
            C368258sK.A01(map2, A02, A002);
        }
    }

    public final void A05(Integer num, List list, List list2, Map map) {
        if (!list2.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    A00(C368248sJ.REPLICATED_STORAGE_TARGET_APP_FETCH_FAILURE, str, (String) it2.next(), C369088to.A00(num), (String) map.get("waterfall_id"), map, this);
                }
            }
        }
    }

    public final void A06(Integer num, List list, List list2, Map map) {
        if (!list2.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    A00(C368248sJ.REPLICATED_STORAGE_TARGET_APP_REMOVE_FAILURE, str, (String) it2.next(), C369088to.A00(num), (String) map.get("waterfall_id"), map, this);
                }
            }
        }
    }

    public final void A07(Integer num, List list, List list2, Map map) {
        if (!list2.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    A00(C368248sJ.REPLICATED_STORAGE_TARGET_APP_SAVE_FAILURE, str, (String) it2.next(), C369088to.A00(num), (String) map.get("waterfall_id"), map, this);
                }
            }
        }
    }
}
