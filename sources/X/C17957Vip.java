package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vip  reason: case insensitive filesystem */
public abstract class C17957Vip {
    public final Map A00 = new LinkedHashMap();

    public final C17625VbH A00(String str) {
        Map map = this.A00;
        Object obj = map.get(str);
        if (obj == null) {
            if (this instanceof C15934Ul1) {
                obj = new C17625VbH();
            } else if (this instanceof C15935Ul2) {
                obj = new C17625VbH();
            } else {
                obj = new C17625VbH();
            }
            map.put(str, obj);
        }
        return (C17625VbH) obj;
    }

    public final void A01(Object obj, String str, String str2, String str3, List list, boolean z) {
        C17625VbH A002 = A00(str);
        A002.A04 = true;
        A002.A00 = str2;
        A002.A01 = str3;
        A002.A03 = list;
        if (z) {
            A002.A06.clear();
            A002.A05.clear();
        }
        List list2 = A002.A06;
        list2.add(obj);
        List list3 = A002.A05;
        list3.add(Boolean.valueOf(z));
        if (list2.size() != list3.size()) {
            throw DbT.A0m();
        }
    }
}
