package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Sx  reason: invalid class name and case insensitive filesystem */
public abstract class C242173Sx extends C242183Sy {
    public static final List A07(AnonymousClass2U7 r3) {
        0qQ.A0B(r3, 0);
        Iterator it = r3.iterator();
        if (!it.hasNext()) {
            return 0sn.A00;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            List singletonList = Collections.singletonList(next);
            0qQ.A07(singletonList);
            return singletonList;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }

    public static final List A08(AnonymousClass2U7 r3) {
        0qQ.A0B(r3, 0);
        ArrayList arrayList = new ArrayList();
        for (Object add : r3) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static final AnonymousClass3T1 A09(0sP r2, AnonymousClass2U7 r3) {
        return new AnonymousClass3T1(r2, r3, true);
    }

    public static final AnonymousClass3T1 A0A(AnonymousClass2U7 r4) {
        AnonymousClass3T0 r2 = AnonymousClass3T0.A00;
        0qQ.A0B(r2, 1);
        AnonymousClass3T1 r1 = new AnonymousClass3T1(r2, r4, false);
        0qQ.A0C(r1, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return r1;
    }

    public static final AnonymousClass2U7 A0B(0sP r1, AnonymousClass2U7 r2) {
        0qQ.A0B(r2, 0);
        return A0A(new C242193Sz(r1, r2));
    }

    public static final AnonymousClass2U7 A0C(AnonymousClass2U7 r1, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(002.A0c(AnonymousClass000.A00(2480), AnonymousClass000.A00(1985), i));
        } else if (i == 0) {
            return C66104MBm.A00;
        } else {
            if (r1 instanceof C66577MXi) {
                return ((C66577MXi) r1).EzV(i);
            }
            return new C20423Wr8(r1, i);
        }
    }

    public static final C66927MfL A0D(AnonymousClass2U7 r1) {
        return new C66927MfL(r1);
    }

    public static final C242193Sz A0E(0sP r1, AnonymousClass2U7 r2) {
        return new C242193Sz(r1, r2);
    }

    public static final int A05(AnonymousClass2U7 r2) {
        Iterator it = r2.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                0sr.A1S();
                throw AnonymousClass00P.createAndThrow();
            }
        }
        return i;
    }

    public static final Object A06(AnonymousClass2U7 r1) {
        Iterator it = r1.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }
}
