package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Fg  reason: invalid class name and case insensitive filesystem */
public final class C304796Fg {
    public static final C52924Gey A00(List list, long j, long j2) {
        return new C52924Gey(list, (List) null, 0, j, j2);
    }

    public static final C52924Gey A01(0eP[] r9, int i, long j, long j2) {
        ArrayList arrayList = new ArrayList(r5);
        for (0eP r0 : r9) {
            arrayList.add(new AnonymousClass5RW(((AnonymousClass5RW) r0.A01).A00));
        }
        ArrayList arrayList2 = new ArrayList(r5);
        for (0eP r02 : r9) {
            arrayList2.add(Float.valueOf(((Number) r02.A00).floatValue()));
        }
        return new C52924Gey(arrayList, arrayList2, i, j, j2);
    }

    public static final C52923Gex A02(0eP[] r7) {
        ArrayList arrayList = new ArrayList(r6);
        for (0eP r0 : r7) {
            arrayList.add(new AnonymousClass5RW(((AnonymousClass5RW) r0.A01).A00));
        }
        ArrayList arrayList2 = new ArrayList(r6);
        for (0eP r02 : r7) {
            arrayList2.add(Float.valueOf(((Number) r02.A00).floatValue()));
        }
        return new C52923Gex(arrayList, arrayList2);
    }

    public final C52924Gey A03(List list) {
        return A00(list, C289325dP.A00(0.0f, 0.0f), C289325dP.A00(0.0f, Float.POSITIVE_INFINITY));
    }
}
