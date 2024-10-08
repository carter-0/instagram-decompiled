package X;

import java.util.HashSet;
import java.util.List;

/* renamed from: X.KZt  reason: case insensitive filesystem */
public final class C62089KZt extends 1Pk {
    public static final C62089KZt A02 = new C62089KZt();
    public final Integer A00 = AnonymousClass05K.A01;
    public final HashSet A01 = AnonymousClass7TE.A1F();

    public final int A03(1Pi r2, List list, int i) {
        0qQ.A0B(list, 0);
        HashSet hashSet = this.A01;
        AnonymousClass7TF.A1M(hashSet, i);
        return hashSet.size();
    }

    public final boolean A06(1Pi r2, Integer num, List list, int i) {
        0qQ.A0B(num, 3);
        return AnonymousClass7TF.A1W(this.A00, num);
    }

    public final void A02() {
        this.A01.clear();
    }

    public final int A05(List list) {
        return this.A01.size();
    }
}
