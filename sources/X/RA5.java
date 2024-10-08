package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public final class RA5 extends 0ng {
    public final /* synthetic */ C256293vX A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RA5(C256293vX r4) {
        super(804, 3, false, false);
        this.A00 = r4;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, java.util.Comparator] */
    public final void run() {
        C256293vX r8 = this.A00;
        11Z.A05("This operation can't be run on UI thread.");
        long currentTimeMillis = System.currentTimeMillis();
        1Uk r3 = r8.A00.A00;
        HashMap Aan = r3.Aan();
        0qQ.A0C(Aan, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0s = AnonymousClass7TF.A0s(Aan);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            if (A1J.getValue() instanceof Long) {
                Object key = A1J.getKey();
                Object value = A1J.getValue();
                0qQ.A0C(value, AnonymousClass000.A00(17));
                A1E.put(key, value);
            } else {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("found non-long value: ");
                Pxg.A1S(A1A, A1J);
                A1A.append(':');
                0wb.A03("IgCacheExpirationStore", AnonymousClass7TF.A0i(A1J.getValue(), A1A));
                1W3 AR0 = r3.AR0();
                AR0.A06(DbT.A13(A1J));
                AR0.A03();
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A0s2 = AnonymousClass7TF.A0s(A1E);
        while (A0s2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
            Object key2 = A1J2.getKey();
            long A0R = AnonymousClass7TE.A0R(A1J2.getValue());
            if (A0R > 0 && A0R < Long.MAX_VALUE && A0R < currentTimeMillis) {
                A1C.add(key2);
            }
        }
        if (DbT.A1b(A1C)) {
            29t r0 = r8.A01.A00.A06;
            if (r0 != null) {
                r0.A06(A1C);
            }
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                String A1E2 = C41847B3o.A1E(it.next());
                1W3 AR02 = r3.AR0();
                AR02.A06(A1E2);
                AR02.A03();
            }
        }
        11Z.A05("This operation can't be run on UI thread.");
        if (((long) r3.getSize()) > 1000) {
            Set entrySet = r3.Aan().entrySet();
            0qQ.A0C(entrySet, "null cannot be cast to non-null type java.util.Collection<kotlin.collections.Map.Entry<kotlin.String, kotlin.Long>>");
            PriorityQueue priorityQueue = new PriorityQueue(entrySet.size(), new Object());
            018.A16(entrySet, priorityQueue);
            1W3 AR03 = r3.AR0();
            long size = ((long) entrySet.size()) - 1000;
            for (long j = 0; j < size; j++) {
                Map.Entry entry = (Map.Entry) priorityQueue.remove();
                if (entry != null) {
                    AR03.A06(DbT.A13(entry));
                }
            }
            AR03.A03();
        }
    }
}
