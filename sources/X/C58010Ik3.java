package X;

import java.util.ArrayList;
import java.util.function.Predicate;

/* renamed from: X.Ik3  reason: case insensitive filesystem */
public final class C58010Ik3 implements Predicate {
    public final int A00;
    public final Object A01;

    public C58010Ik3(int i, 0sP r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    public static void A00(ArrayList arrayList, 0sP r2, int i) {
        arrayList.removeIf(new C58010Ik3(i, r2));
    }

    public final /* synthetic */ boolean test(Object obj) {
        return C51971G9r.A1a(obj, (0sP) this.A01);
    }
}
