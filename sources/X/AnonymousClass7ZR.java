package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.7ZR  reason: invalid class name */
public final class AnonymousClass7ZR implements AnonymousClass0lh {
    public final HashMap A00 = new HashMap();
    public final Set A01 = new LinkedHashSet();

    public final List A00(List list) {
        long j;
        C254873tC r0;
        Long l;
        C254873tC r02;
        if (list == null) {
            return null;
        }
        ArrayList<AnonymousClass7LQ> arrayList = new ArrayList<>();
        for (Object next : list) {
            AnonymousClass7LQ r2 = (AnonymousClass7LQ) next;
            if (r2.getType() == 91) {
                C254703su r22 = r2.A0e;
                0qQ.A07(r22);
                ImmutableList A0H = r22.A0H();
                if (!(A0H == null || (r02 = (C254873tC) 00k.A0O(A0H, 0)) == null || r02.A0n == null || r22.A1U())) {
                    arrayList.add(next);
                }
            }
        }
        for (AnonymousClass7LQ r03 : arrayList) {
            C254703su r7 = r03.A0e;
            0qQ.A07(r7);
            ImmutableList A0H2 = r7.A0H();
            if (A0H2 == null || (r0 = (C254873tC) 00k.A0O(A0H2, 0)) == null || (l = r0.A0m) == null) {
                j = -1;
            } else {
                j = l.longValue();
            }
            String A0g = r7.A0g();
            if (!(j == -1 || A0g == null)) {
                HashMap hashMap = this.A00;
                Long valueOf = Long.valueOf(j);
                String str = (String) hashMap.get(valueOf);
                if (str == null) {
                    hashMap.put(valueOf, A0g);
                } else if (r7.A1o(str)) {
                    hashMap.put(valueOf, A0g);
                    Set set = this.A01;
                    set.add(str);
                    set.remove(A0g);
                } else if (!0qQ.A0K(hashMap.get(valueOf), A0g)) {
                    this.A01.add(A0g);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : list) {
            if (!00k.A0u(this.A01, ((AnonymousClass7LQ) next2).A0e.A0g())) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.clear();
    }
}
