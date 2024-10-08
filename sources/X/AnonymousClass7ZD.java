package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7ZD  reason: invalid class name */
public abstract class AnonymousClass7ZD {
    public final int A00;
    public final Map A01 = new LinkedHashMap();

    public boolean A02(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return this.A01.values().contains(str);
    }

    private final void A00(AnonymousClass7LQ r8, List list) {
        C254873tC r0;
        Long l;
        long longValue;
        C254873tC r02;
        C254703su r6 = r8.A0e;
        0qQ.A07(r6);
        String A0g = r6.A0g();
        if (A0g != null) {
            int i = this.A00;
            if (i == 98 || i == 91 || i == 179 || i == 169 || i == 184) {
                ImmutableList A0H = r6.A0H();
                if (A0H != null && (r0 = (C254873tC) 00k.A0O(A0H, 0)) != null && (l = r0.A0m) != null) {
                    longValue = l.longValue();
                } else {
                    return;
                }
            } else {
                ImmutableList A0H2 = r6.A0H();
                if (A0H2 != null && (r02 = (C254873tC) 00k.A0O(A0H2, 0)) != null) {
                    longValue = r02.A0D;
                } else {
                    return;
                }
            }
            if (longValue != 0) {
                Map map = this.A01;
                Long valueOf = Long.valueOf(longValue);
                String str = (String) map.get(valueOf);
                if (str == null) {
                    map.put(valueOf, A0g);
                } else if (!str.equals(A0g) && r6.A1o(str)) {
                    map.put(valueOf, A0g);
                    list.add(str);
                } else {
                    return;
                }
                list.add(A0g);
            }
        }
    }

    public List A01(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : list) {
                int type = ((AnonymousClass7LQ) next).getType();
                int i = this.A00;
                if (type == i || (type == 105 && i == 91)) {
                    arrayList2.add(next);
                }
            }
            List<AnonymousClass7LQ> A0Y = 00k.A0Y(arrayList2);
            if (A0Y != null) {
                for (AnonymousClass7LQ A002 : A0Y) {
                    A00(A002, arrayList);
                }
            }
        }
        if (list2 != null) {
            ArrayList<AnonymousClass7LQ> arrayList3 = new ArrayList<>();
            for (Object next2 : list2) {
                int type2 = ((AnonymousClass7LQ) next2).getType();
                int i2 = this.A00;
                if (type2 == i2 || (type2 == 105 && i2 == 91)) {
                    arrayList3.add(next2);
                }
            }
            for (AnonymousClass7LQ A003 : arrayList3) {
                A00(A003, arrayList);
            }
        }
        return 00k.A0a(arrayList);
    }

    public AnonymousClass7ZD(int i) {
        this.A00 = i;
    }
}
