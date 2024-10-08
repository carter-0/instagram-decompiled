package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4nU  reason: invalid class name and case insensitive filesystem */
public final class C273974nU implements AnonymousClass0SS, AnonymousClass0SV {
    public static final C273974nU A00 = new Object();
    public static final List A01;

    public final boolean AFQ(0SG r6, int i, int i2) {
        List<C273984nV> list = A01;
        if (!list.isEmpty()) {
            for (C273984nV r1 : list) {
                C257443xP r2 = (C257443xP) r1.A00.get();
                Object BXj = r6.BXj(r1.A01, 1);
                if (BXj != null) {
                    if (!BXj.equals(r2)) {
                        return true;
                    }
                } else if (r2.A06()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void AV4(0hE r1, int i, int i2) {
    }

    public final boolean EsE(int i, int i2) {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4nU, java.lang.Object] */
    static {
        ArrayList arrayList = new ArrayList(1);
        C273984nV r1 = C273984nV.A02;
        0qQ.A07(r1);
        r1.A01 = 196608;
        arrayList.add(r1);
        A01 = arrayList;
    }

    public final void AV5(0hE r5, 0SG r6, int i, int i2) {
        for (C273984nV r2 : A01) {
            C257443xP A002 = r2.A00(r6);
            if (A002.A06()) {
                0hE.A00(r5, A002, r2.A01);
            }
        }
    }

    public final Integer C9K() {
        if (!(!A01.isEmpty())) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A01;
    }

    public final boolean EsF(0SG r2, int i, int i2) {
        return !A01.isEmpty();
    }
}
