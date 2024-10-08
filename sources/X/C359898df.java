package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.8df  reason: invalid class name and case insensitive filesystem */
public final class C359898df {
    public Set A00;
    public final C359848da A01;
    public final C359888de A02;

    public static void A00(C359918dh r1, C359898df r2) {
        1Kg.A02("Emitter_addSubscriber");
        try {
            Set set = r2.A00;
            if (set == null) {
                set = new LinkedHashSet();
                r2.A00 = set;
            }
            set.add(r1);
            r2.A00.size();
        } finally {
            1Kg.A01();
        }
    }

    public static void A01(C359918dh r1, C359898df r2) {
        1Kg.A02("Emitter_unsubscribe");
        try {
            Set set = r2.A00;
            if (set != null && !set.isEmpty()) {
                r2.A00.remove(r1);
                r2.A00.isEmpty();
            }
        } finally {
            1Kg.A01();
        }
    }

    public static void A02(C359898df r5, Object obj) {
        1Kg.A02("Emitter_emitToSubscribers");
        try {
            Set set = r5.A00;
            if (set != null && !set.isEmpty()) {
                for (C359918dh r0 : r5.A00) {
                    C359908dg r4 = r0.A00;
                    int incrementAndGet = r4.A03.incrementAndGet();
                    C359888de r2 = r4.A02;
                    if (r2.CYP()) {
                        C359908dg.A02(r4, obj, incrementAndGet);
                    } else {
                        r2.E3G(new C41119Aof(r4, obj, incrementAndGet), "DataSynchronizer_sendNewResult");
                    }
                }
            }
        } finally {
            1Kg.A01();
        }
    }

    public final void A03(int i) {
        if (i == 0 || i == 1 || i == 3) {
            String A0O = 002.A0O("Emitter_delegateFetch_", i);
            1Kg.A02(A0O);
            try {
                C359888de r1 = this.A02;
                if (r1.CYP()) {
                    this.A01.A00(i);
                } else {
                    r1.E3G(new C359958dl(this, i), A0O);
                }
            } finally {
                1Kg.A01();
            }
        } else {
            throw new IllegalArgumentException(002.A0c("FetchType ", " is not supported in Emitter", i));
        }
    }

    public C359898df(C359848da r1, C359888de r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
