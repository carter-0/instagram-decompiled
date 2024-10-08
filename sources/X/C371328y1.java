package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.8y1  reason: invalid class name and case insensitive filesystem */
public abstract class C371328y1 {
    public static String A00(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(";");
        }
        return sb.toString();
    }

    public static void A01(C344037rD r18, String str, List list, long j) {
        String str2;
        List list2;
        List list3;
        Object obj;
        Object obj2;
        String str3;
        C344037rD r5 = r18;
        if (r18 != null) {
            boolean BgI = r5.BgI();
            LinkedList linkedList = new LinkedList();
            LinkedList<String> linkedList2 = new LinkedList<>();
            LinkedList linkedList3 = new LinkedList();
            LinkedList linkedList4 = new LinkedList();
            LinkedList linkedList5 = new LinkedList();
            Iterator it = list.iterator();
            while (true) {
                str2 = "0";
                if (!it.hasNext()) {
                    break;
                }
                String str4 = NetInfoModule.CONNECTION_TYPE_NONE;
                Map map = ((C368898tV) it.next()).A00;
                if (map != null) {
                    if (map.containsKey("effect_id")) {
                        str3 = (String) map.get("effect_id");
                    } else {
                        str3 = str2;
                    }
                    if (map.containsKey("filter_type")) {
                        str4 = (String) map.get("filter_type");
                    }
                    if (map.containsKey("effect_instance_id")) {
                        obj = map.get("effect_instance_id");
                    } else {
                        obj = str2;
                    }
                    if (map.containsKey("effect_session_id")) {
                        obj2 = map.get("effect_session_id");
                    } else {
                        obj2 = str2;
                    }
                    if (str4.equals("msqrd") && !str3.equals(str2)) {
                        linkedList2.add(str3);
                    }
                    str2 = str3;
                } else {
                    obj = str2;
                    obj2 = str2;
                }
                linkedList.add(str2);
                linkedList3.add(str4);
                linkedList4.add(obj);
                linkedList5.add(obj2);
            }
            C344107rK Ajt = r5.Ajt();
            if (BgI) {
                list2 = Collections.emptyList();
                list3 = Collections.emptyList();
            } else {
                list2 = linkedList;
                list3 = linkedList4;
            }
            List AbX = Ajt.AbX(list2, list3, linkedList5);
            List AbY = Ajt.AbY(linkedList3);
            if (!linkedList.equals(AbX)) {
                C361898h0 r6 = null;
                if (!linkedList2.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (String str5 : linkedList2) {
                        if (!AbX.contains(str5)) {
                            sb.append(str5);
                            sb.append(";");
                        }
                    }
                    if (sb.length() > 0) {
                        if (!BgI) {
                            str2 = sb.substring(0, sb.length() - 1);
                        }
                        r6 = r5.Bbd().ARA(str2);
                    }
                } else if (AbY.contains("msqrd")) {
                    r6 = r5.Bbd().AR9();
                }
                HashMap hashMap = new HashMap();
                if (!BgI) {
                    if (AbX.size() < linkedList.size()) {
                        ArrayList arrayList = new ArrayList(linkedList);
                        arrayList.removeAll(AbX);
                        hashMap.put("effects_added", A00(arrayList));
                    } else {
                        if (AbX.size() <= linkedList.size()) {
                            ArrayList arrayList2 = new ArrayList(linkedList);
                            arrayList2.removeAll(AbX);
                            hashMap.put("effects_added", A00(arrayList2));
                        }
                        ArrayList arrayList3 = new ArrayList(AbX);
                        arrayList3.removeAll(linkedList);
                        hashMap.put("effects_removed", A00(arrayList3));
                    }
                }
                Map CNM = r5.CNM(r6, hashMap);
                r5.CjJ(j, "media_pipeline_update_effects_list", str, CNM);
            }
        }
    }
}
