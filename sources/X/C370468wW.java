package X;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8wW  reason: invalid class name and case insensitive filesystem */
public final class C370468wW {
    public final C370478wX A00(List list) {
        if (!((Boolean) C63130yM.A00(18312744117745853L).A00()).booleanValue()) {
            return null;
        }
        0bb r3 = new 0bb();
        r3.A05("count", Long.valueOf((long) list.size()));
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
            String groupKey = statusBarNotification.getGroupKey();
            0qQ.A0A(groupKey);
            if (hashMap.containsKey(groupKey)) {
                List list2 = (List) hashMap.get(groupKey);
                if (list2 != null) {
                    list2.add(statusBarNotification);
                }
            } else {
                hashMap.put(groupKey, 0sr.A1M(new StatusBarNotification[]{statusBarNotification}));
            }
        }
        ArrayList arrayList = new ArrayList();
        Set entrySet = hashMap.entrySet();
        0qQ.A07(entrySet);
        List<Map.Entry> A0g = 00k.A0g(entrySet, new C370488wY());
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        for (Map.Entry value : A0g) {
            Object value2 = value.getValue();
            0qQ.A07(value2);
            List<StatusBarNotification> list3 = (List) value2;
            if (list3.size() > 1) {
                01V.A1D(list3, new C41277ArI());
            }
            for (StatusBarNotification statusBarNotification2 : list3) {
                0bb r4 = new 0bb();
                Bundle bundle = statusBarNotification2.getNotification().extras;
                String string = bundle.getString(C66579MXk.A00(725));
                String string2 = bundle.getString(C66579MXk.A00(726));
                if (!hashMap2.containsKey(string2)) {
                    hashMap2.put(string2, Long.valueOf(j));
                    j++;
                }
                r4.A05("user_local_id", Long.valueOf(j));
                String groupKey2 = statusBarNotification2.getGroupKey();
                0qQ.A0A(groupKey2);
                if (!hashMap3.containsKey(groupKey2)) {
                    Long valueOf = Long.valueOf(j2);
                    String groupKey3 = statusBarNotification2.getGroupKey();
                    0qQ.A0A(groupKey3);
                    hashMap3.put(groupKey3, valueOf);
                    j2++;
                }
                String groupKey4 = statusBarNotification2.getGroupKey();
                0qQ.A0A(groupKey4);
                r4.A05("group_local_id", (Long) hashMap3.get(groupKey4));
                r4.A03("is_group_summary", Boolean.valueOf(0qQ.A0K(statusBarNotification2.getGroupKey(), statusBarNotification2.getTag())));
                r4.A03("is_grouped", Boolean.valueOf(statusBarNotification2.isGroup()));
                r4.A05("user_local_id", (Long) hashMap2.get(string2));
                r4.A06(AnonymousClass000.A00(1624), string);
                r4.A05("displayed_timestamp", Long.valueOf(statusBarNotification2.getPostTime()));
                r4.A05(AnonymousClass000.A00(810), Long.valueOf(j3));
                arrayList.add(r4);
                j3++;
            }
        }
        r3.A05("group_count", Long.valueOf((long) hashMap.keySet().size()));
        r3.A07("tray_context", arrayList);
        return r3;
    }
}
