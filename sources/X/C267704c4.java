package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4c4  reason: invalid class name and case insensitive filesystem */
public final class C267704c4 {
    public Map A00 = null;
    public Map A01 = null;
    public Map A02 = null;
    public final List A03;

    public final AnonymousClass5I0 A00(String str, String str2) {
        Number number;
        if (!(str == null || str2 == null || (number = (Number) A02().get(str)) == null)) {
            for (AnonymousClass5I0 r1 : A01(number.intValue())) {
                if (str2.equals(r1.A01)) {
                    return r1;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.XTq, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.XTq, java.lang.Object] */
    public final List A01(int i) {
        List list;
        Map map;
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = new HashMap();
                List<AnonymousClass5I0> list2 = this.A03;
                int i2 = -1;
                int i3 = -1;
                int i4 = -1;
                for (AnonymousClass5I0 r0 : list2) {
                    i3++;
                    int i5 = r0.A02;
                    if (i5 != i2) {
                        if (i2 >= 0) {
                            Map map2 = this.A00;
                            Integer valueOf = Integer.valueOf(i2);
                            ? obj = new Object();
                            obj.A00 = i4;
                            obj.A01 = i3;
                            map2.put(valueOf, obj);
                        }
                        i2 = i5;
                        i4 = i3;
                    }
                }
                if (i2 >= 0) {
                    Map map3 = this.A00;
                    Integer valueOf2 = Integer.valueOf(i2);
                    int size = list2.size();
                    ? obj2 = new Object();
                    obj2.A00 = i4;
                    obj2.A01 = size;
                    map3.put(valueOf2, obj2);
                }
            }
            list = this.A03;
            list.size();
            this.A00.size();
            map = this.A00;
        }
        C21296XTq xTq = (C21296XTq) map.get(Integer.valueOf(i));
        if (xTq != null) {
            return list.subList(xTq.A00, xTq.A01);
        }
        return Collections.emptyList();
    }

    public final synchronized Map A02() {
        if (this.A02 == null) {
            this.A02 = new HashMap();
            for (AnonymousClass5I0 r0 : this.A03) {
                this.A02.put(r0.A00, Integer.valueOf(r0.A02));
            }
        }
        return this.A02;
    }

    public C267704c4(List list) {
        this.A03 = Collections.unmodifiableList(new ArrayList(list));
    }
}
