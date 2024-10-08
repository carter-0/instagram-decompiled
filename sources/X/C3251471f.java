package X;

import java.util.Set;

/* renamed from: X.71f  reason: invalid class name and case insensitive filesystem */
public final class C3251471f extends AnonymousClass369 {
    public final int A00 = 3;
    public final C3251171c A01;
    public final Set A02;
    public final AnonymousClass71P A03;

    public C3251471f(C3251171c r2, AnonymousClass71P r3, Set set) {
        this.A03 = r3;
        this.A01 = r2;
        this.A02 = set;
    }

    public final Class C9I() {
        return 1Xj.class;
    }

    public final /* bridge */ /* synthetic */ void Cs1(Object obj, int i) {
        1Xj r4 = (1Xj) obj;
        String id = r4.getId();
        Set set = this.A02;
        if (!set.contains(id)) {
            set.add(id);
            this.A01.DM4(r4, i, i % this.A00);
        }
    }

    public final void FN9(AnonymousClass345 r3, int i) {
        1Xj r1 = (1Xj) this.A03.getItem(i);
        r3.FNB(r1.getId(), r1, i);
    }
}
