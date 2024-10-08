package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7ZT  reason: invalid class name */
public final class AnonymousClass7ZT implements 0lm {
    public final Map A00 = new HashMap();
    public final Set A01 = new LinkedHashSet();

    public final List A00(List list) {
        long j;
        Collection collection;
        C254873tC r0;
        Long l;
        long j2;
        C254873tC r02;
        Long l2;
        C254873tC r03;
        if (list == null) {
            return null;
        }
        ArrayList<AnonymousClass7LQ> arrayList = new ArrayList<>();
        for (Object next : list) {
            AnonymousClass7LQ r2 = (AnonymousClass7LQ) next;
            if (r2.getType() == 91 || r2.getType() == 105) {
                C254703su r04 = r2.A0e;
                0qQ.A07(r04);
                ImmutableList A0H = r04.A0H();
                if (!(A0H == null || (r03 = (C254873tC) 00k.A0O(A0H, 0)) == null || r03.A02 != 10)) {
                    arrayList.add(next);
                }
            }
        }
        for (AnonymousClass7LQ r05 : arrayList) {
            C254703su r1 = r05.A0e;
            0qQ.A07(r1);
            ImmutableList A0H2 = r1.A0H();
            if (A0H2 == null || (r02 = (C254873tC) 00k.A0J(A0H2)) == null || (l2 = r02.A0m) == null) {
                j2 = -1;
            } else {
                j2 = l2.longValue();
            }
            String A0g = r1.A0g();
            if (!(A0g == null || j2 == -1)) {
                Long valueOf = Long.valueOf(j2);
                Map map = this.A00;
                if (map.containsKey(valueOf)) {
                    Set set = (Set) map.get(valueOf);
                    if (set != null) {
                        set.add(A0g);
                    }
                } else {
                    map.put(valueOf, 0sc.A06(new String[]{A0g}));
                }
            }
        }
        ArrayList<AnonymousClass7LQ> arrayList2 = new ArrayList<>();
        for (Object next2 : list) {
            AnonymousClass7LQ r22 = (AnonymousClass7LQ) next2;
            if (r22.getType() == 91 && r22.A0e.A1U()) {
                arrayList2.add(next2);
            }
        }
        for (AnonymousClass7LQ r06 : arrayList2) {
            C254703su r12 = r06.A0e;
            0qQ.A07(r12);
            ImmutableList A0H3 = r12.A0H();
            if (A0H3 == null || (r0 = (C254873tC) 00k.A0J(A0H3)) == null || (l = r0.A0m) == null) {
                j = -1;
            } else {
                j = l.longValue();
            }
            if (!(r12.A0g() == null || j == -1 || (collection = (Collection) this.A00.get(Long.valueOf(j))) == null)) {
                this.A01.addAll(collection);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : list) {
            if (!00k.A0u(this.A01, ((AnonymousClass7LQ) next3).A0e.A0g())) {
                arrayList3.add(next3);
            }
        }
        return arrayList3;
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A00.clear();
        this.A01.clear();
    }
}
