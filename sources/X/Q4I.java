package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class Q4I {
    public static C3034368u A01(C307896Rx r12, C246643ew r13, Map map, boolean z, boolean z2) {
        String str;
        C246643ew r1 = r13;
        C276544tV r2 = r13.A00;
        List list = r13.A0D;
        List list2 = r13.A0C;
        List list3 = r13.A0B;
        C3034268t r3 = r13.A02;
        List list4 = r13.A0A;
        List list5 = r13.A06;
        List list6 = r13.A09;
        C277054uM r0 = r13.A01;
        if (r0 != null) {
            str = r0.A00;
        } else {
            str = null;
        }
        Map map2 = r13.A0F;
        return A00(r12, r2, r3, str, list, list2, list3, list4, list5, list6, r1.A0E, map, map2, z, z2);
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.4tQ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v13, types: [X.4tQ, java.lang.Object] */
    public static C3034368u A00(C307896Rx r11, C276544tV r12, C3034268t r13, String str, List list, List list2, List list3, List list4, List list5, List list6, List list7, Map map, Map map2, boolean z, boolean z2) {
        List list8;
        C276544tV r7 = r12;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                Object obj = Q05.A00(r11).A07.get(str2);
                if (obj != null) {
                    A1C.add(obj);
                } else {
                    throw AnonymousClass7TF.A0W(002.A0g("Data Manifest for referenced internal variable id ", str2, " not found! "), "\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about.");
                }
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                Map singletonMap = Collections.singletonMap("initial", Q05.A03(r11, str3));
                ? obj2 = new Object();
                obj2.A00 = str3;
                obj2.A01 = "ls";
                obj2.A02 = singletonMap;
                A1C.add(obj2);
            }
        }
        if (map != null) {
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry entry = (Map.Entry) A0u.next();
                List list9 = r11.A0D;
                int size = list9.size();
                String A00 = C7285Q2k.A00(AnonymousClass05K.A00, (String) entry.getKey(), list9, size);
                Map singletonMap2 = Collections.singletonMap("initial", entry.getValue());
                ? obj3 = new Object();
                obj3.A00 = A00;
                obj3.A01 = "ls";
                obj3.A02 = singletonMap2;
                A1C.add(obj3);
            }
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                String str4 = (String) it3.next();
                A1E.put(str4, Q05.A01(r11, str4));
            }
        }
        if (z && r12 != null) {
            if (z2) {
                list8 = r11.A0D;
            } else {
                list8 = null;
            }
            r7 = C7288Q2n.A00((C276634te) null, new Q49(r12, list8), r12);
        }
        return C3034368u.A01((C307896Rx) null, r7, r13, str, A1C, list4, list5, list6, list7, A1E, map2);
    }
}
