package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5oB  reason: invalid class name and case insensitive filesystem */
public final class C295455oB implements C3026264j {
    public final List A00;

    public final /* bridge */ /* synthetic */ AnonymousClass64l AX0(int i) {
        return (AnonymousClass64k) this.A00.get(i);
    }

    public C295455oB(C287725af r5, float f, float f2) {
        2HY A0C = C229632nm.A0C(0, r5.A01());
        ArrayList arrayList = new ArrayList(0Yv.A1E(A0C, 10));
        0sh it = A0C.iterator();
        while (it.hasNext()) {
            arrayList.add(new AnonymousClass64k(f, f2, r5.A00(it.A00())));
        }
        this.A00 = arrayList;
    }
}
