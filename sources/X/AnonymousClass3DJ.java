package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* renamed from: X.3DJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DJ implements 1MD {
    public final Object apply(Object obj) {
        C255323tw r6;
        S5P s5p;
        long j;
        List<C11030S6i> list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (C11030S6i s6i : list) {
            List list2 = s6i.A0F;
            if (!list2.isEmpty()) {
                r6 = (C255323tw) list2.get(0);
            } else {
                r6 = C255323tw.A01;
            }
            UUID fromString = UUID.fromString(s6i.A0E);
            0qQ.A07(fromString);
            C2379139t r9 = s6i.A0D;
            HashSet hashSet = new HashSet(s6i.A0G);
            C255323tw r24 = s6i.A0C;
            0qQ.A09(r6);
            int i = s6i.A05;
            int i2 = s6i.A04;
            C255343ty r22 = s6i.A0B;
            long j2 = s6i.A08;
            long j3 = s6i.A09;
            if (j3 != 0) {
                s5p = new S5P(j3, s6i.A07);
            } else {
                s5p = null;
            }
            if (r9 == C2379139t.ENQUEUED) {
                boolean z = false;
                if (i > 0) {
                    z = true;
                }
                Integer num = s6i.A03;
                long j4 = s6i.A01;
                long j5 = s6i.A02;
                int i3 = s6i.A00;
                boolean z2 = false;
                if (j3 != 0) {
                    z2 = true;
                }
                j = C255393u3.A00(num, i, i3, j4, j5, j2, s6i.A07, j3, s6i.A0A, z, z2);
            } else {
                j = Long.MAX_VALUE;
            }
            long j6 = j2;
            arrayList.add(new C11028S6g(r22, r24, r6, s5p, r9, hashSet, fromString, i, i2, s6i.A06, j6, j));
        }
        return arrayList;
    }
}
