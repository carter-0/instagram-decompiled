package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class LED {
    public int A00;
    public int A01;
    public int A02;
    public C306576Mr A03;
    public Integer A04;
    public Integer A05;
    public List A06;
    public List A07;
    public final String A08;
    public final HashMap A09;

    public LED(C306576Mr r2, Integer num, Integer num2, String str, HashMap hashMap, List list, List list2, int i, int i2, int i3) {
        0qQ.A0B(r2, 4);
        C51973G9u.A0s(5, list, list2, hashMap);
        0qQ.A0B(str, 10);
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = r2;
        this.A06 = list;
        this.A04 = num;
        this.A07 = list2;
        this.A09 = hashMap;
        this.A05 = num2;
        this.A08 = str;
    }

    public final Map A00() {
        HashMap hashMap = this.A09;
        ArrayList A0v = DbS.A0v(hashMap.size());
        Iterator A0s = AnonymousClass7TF.A0s(hashMap);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Object key = A1J.getKey();
            Object value = A1J.getValue();
            Iterator it = this.A07.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (0qQ.A0K(((C15092UOk) it.next()).A05, key)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            int intValue = Integer.valueOf(i).intValue();
            if (intValue == -1) {
                intValue = Integer.MAX_VALUE;
            }
            AnonymousClass7TF.A1I(Integer.valueOf(intValue), value, A0v);
        }
        return 0Yt.A08(A0v);
    }
}
