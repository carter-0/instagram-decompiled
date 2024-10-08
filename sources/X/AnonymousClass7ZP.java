package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7ZP  reason: invalid class name */
public final class AnonymousClass7ZP implements AnonymousClass0lh {
    public final Map A00 = new HashMap();
    public final Set A01 = new LinkedHashSet();

    public final List A00(List list) {
        long j;
        C254873tC r0;
        Long l;
        long j2;
        C254873tC r02;
        Long l2;
        if (list != null) {
            ArrayList<AnonymousClass7LQ> arrayList = new ArrayList<>();
            for (Object next : list) {
                AnonymousClass7LQ r1 = (AnonymousClass7LQ) next;
                if (r1.getType() == 91 && r1.A0e.A1U()) {
                    arrayList.add(next);
                }
            }
            for (AnonymousClass7LQ r03 : arrayList) {
                C254703su r4 = r03.A0e;
                0qQ.A07(r4);
                ImmutableList A0H = r4.A0H();
                if (A0H == null || (r02 = (C254873tC) 00k.A0O(A0H, 0)) == null || (l2 = r02.A0m) == null) {
                    j2 = -1;
                } else {
                    j2 = l2.longValue();
                }
                if (!(r4.A0g() == null || j2 == -1)) {
                    this.A01.add(Long.valueOf(j2));
                }
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list == null) {
            return null;
        }
        ArrayList<AnonymousClass7LQ> arrayList2 = new ArrayList<>();
        for (Object next2 : list) {
            if (((AnonymousClass7LQ) next2).getType() == 91) {
                arrayList2.add(next2);
            }
        }
        for (AnonymousClass7LQ r04 : arrayList2) {
            C254703su r6 = r04.A0e;
            0qQ.A07(r6);
            String A0g = r6.A0g();
            ImmutableList A0H2 = r6.A0H();
            if (A0H2 == null || (r0 = (C254873tC) 00k.A0O(A0H2, 0)) == null || (l = r0.A0m) == null) {
                j = -1;
            } else {
                j = l.longValue();
            }
            if (!(A0g == null || j == -1)) {
                Set set = this.A01;
                Long valueOf = Long.valueOf(j);
                if (set.contains(valueOf)) {
                    if (r6.A0N != null) {
                        Map map = this.A00;
                        String str = (String) map.get(valueOf);
                        if (str == null) {
                            map.put(valueOf, A0g);
                        } else if (r6.A1o(str)) {
                            map.put(valueOf, A0g);
                            linkedHashSet.add(str);
                        }
                    }
                    linkedHashSet.add(A0g);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : list) {
            if (!00k.A0u(linkedHashSet, ((AnonymousClass7LQ) next3).A0e.A0g())) {
                arrayList3.add(next3);
            }
        }
        return arrayList3;
    }

    public final void onSessionWillEnd() {
        this.A01.clear();
        this.A00.clear();
    }
}
