package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4O6  reason: invalid class name */
public final class AnonymousClass4O6 {
    public final 0wc A00;
    public final UserSession A01;

    public AnonymousClass4O6(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r2, 2);
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A01(Long l, String str, List list, List list2, Map map) {
        String str2;
        String str3;
        Map map2 = map;
        0qQ.A0B(map2, 5);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            AnonymousClass4O9 r2 = (AnonymousClass4O9) pair.first;
            Object obj = pair.second;
            0qQ.A06(obj);
            AnonymousClass4OA r1 = (AnonymousClass4OA) obj;
            if (r2 != null) {
                int ordinal = r2.ordinal();
                if (ordinal == 3) {
                    str2 = "android.permission.CAMERA";
                } else if (ordinal == 5) {
                    str2 = "android.permission.RECORD_AUDIO";
                }
                C346927vz r0 = (C346927vz) map2.get(str2);
                if (r0 != null) {
                    if (r0.ordinal() == 0) {
                        str3 = "app_permission_grant";
                    } else {
                        str3 = "app_permission_deny";
                    }
                    A00(new AnonymousClass9JF(r2, r1), l, str3, str, (String) null, list2);
                }
            }
        }
    }

    public final void A00(AnonymousClass9JF r6, Long l, String str, String str2, String str3, List list) {
        LinkedHashMap linkedHashMap;
        0qQ.A0B(str2, 3);
        if (182.A06(0Tu.A05, this.A01, 36318041592960803L)) {
            if (str3 == null) {
                str3 = AnonymousClass0HM.A00().toString();
                0qQ.A07(str3);
            }
            0wc r2 = this.A00;
            0Aj A002 = r2.A00(r2.A00, "device_permissions_external");
            if (A002.isSampled()) {
                A002.AAJ("external_event_type", str);
                A002.AAJ("surface", "instagram_android");
                A002.AAe("permission_access_purposes", list);
                A002.AAJ("experience_id", str3);
                A002.AAJ("source", str2);
                if (r6 != null) {
                    linkedHashMap = new LinkedHashMap();
                    AnonymousClass4O9 r0 = (AnonymousClass4O9) r6.A02;
                    if (r0 != null) {
                        linkedHashMap.put("data_type", r0.A00);
                    }
                    AnonymousClass4OA r02 = (AnonymousClass4OA) r6.A00;
                    if (r02 != null) {
                        linkedHashMap.put("access_level", r02.A00);
                    }
                    AnonymousClass4OB r03 = (AnonymousClass4OB) r6.A01;
                    if (r03 != null) {
                        linkedHashMap.put("auth_status", r03.A00);
                    }
                    String str4 = r6.A04;
                    if (str4 != null) {
                        linkedHashMap.put(DevServerEntity.COLUMN_DESCRIPTION, str4);
                    }
                    String str5 = r6.A05;
                    if (str5 != null) {
                        linkedHashMap.put("network_status", str5);
                    }
                    Object obj = r6.A03;
                    if (obj != null) {
                        linkedHashMap.put("in_preprompt_experiment", String.valueOf(obj));
                    }
                } else {
                    linkedHashMap = null;
                }
                A002.A9H("event_data", linkedHashMap);
                A002.A9F("user_fbid", l);
                A002.Cgf();
            }
        }
    }

    public AnonymousClass4O6() {
    }
}
