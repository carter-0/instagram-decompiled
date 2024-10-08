package X;

import java.util.Set;

/* renamed from: X.71e  reason: invalid class name and case insensitive filesystem */
public final class C3251371e extends AnonymousClass369 {
    public final C3251171c A00;
    public final Set A01;
    public final AnonymousClass71P A02;

    public final Class C9I() {
        return C3251571g.class;
    }

    public final /* bridge */ /* synthetic */ void Cs1(Object obj, int i) {
        C3251571g r6 = (C3251571g) obj;
        for (int i2 = 0; i2 < r6.A01(); i2++) {
            Object A022 = r6.A02(i2);
            if (A022 instanceof 1Xj) {
                1Xj r3 = (1Xj) A022;
                String id = r3.getId();
                Set set = this.A01;
                if (!set.contains(id)) {
                    set.add(id);
                    this.A00.DM4(r3, i, i2);
                }
            }
        }
    }

    public final void FN9(AnonymousClass345 r5, int i) {
        AnonymousClass71P r1 = this.A02;
        Object item = r1.getItem(i);
        r5.FNB(String.valueOf(item.hashCode()), item, r1.BQA(String.valueOf(item.hashCode())).A00);
    }

    public C3251371e(C3251171c r1, AnonymousClass71P r2, Set set) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = set;
    }
}
