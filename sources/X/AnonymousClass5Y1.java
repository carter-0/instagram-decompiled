package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Y1  reason: invalid class name */
public final class AnonymousClass5Y1 implements AnonymousClass5Y2 {
    public final Map A00;
    public final Map A01;
    public final 0sP A02;

    public final boolean AFI(Object obj) {
        return ((Boolean) this.A02.invoke(obj)).booleanValue();
    }

    public final Object AJV(String str) {
        Map map = this.A01;
        List list = (List) map.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            map.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    public final Map E2c() {
        ArrayList arrayList;
        LinkedHashMap A03 = 0Yt.A03(this.A01);
        for (Map.Entry entry : this.A00.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            int i = 0;
            if (list.size() == 1) {
                Object invoke = ((C62320sa) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (AFI(invoke)) {
                    arrayList = 0sr.A1L(new Object[]{invoke});
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(invoke);
                    sb.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                int size = list.size();
                arrayList = new ArrayList(size);
                while (i < size) {
                    Object invoke2 = ((C62320sa) list.get(i)).invoke();
                    if (invoke2 == null || AFI(invoke2)) {
                        arrayList.add(invoke2);
                        i++;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(invoke2);
                        sb2.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
                        throw new IllegalStateException(sb2.toString());
                    }
                }
            }
            A03.put(key, arrayList);
        }
        return A03;
    }

    public AnonymousClass5Y1(Map map, 0sP r3) {
        LinkedHashMap linkedHashMap;
        this.A02 = r3;
        if (map == null) {
            linkedHashMap = new LinkedHashMap();
        }
        this.A01 = linkedHashMap;
        this.A00 = new LinkedHashMap();
    }

    public final C305556In EC0(String str, C62320sa r5) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!11R.A01(str.charAt(i))) {
                Map map = this.A00;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    map.put(str, obj);
                }
                ((List) obj).add(r5);
                return new C305546Im(this, str, r5);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
