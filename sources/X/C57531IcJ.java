package X;

import java.util.List;

/* renamed from: X.IcJ  reason: case insensitive filesystem */
public final class C57531IcJ implements C59560JOg {
    public final /* synthetic */ C55972Hqd A00;

    public C57531IcJ(C55972Hqd hqd) {
        this.A00 = hqd;
    }

    public final /* bridge */ /* synthetic */ void Dzd(Object obj, Object obj2, String str, List list) {
        C254253sB r6 = (C254253sB) obj2;
        List<C61042Jvg> list2 = list;
        0qQ.A0B(list2, 3);
        int i = 0;
        int i2 = 0;
        for (C61042Jvg jvg : list2) {
            if (jvg.A01) {
                i++;
            }
            if (jvg.A00) {
                i2++;
            }
        }
        int size = list2.size();
        float f = 0.0f;
        if (size != 0) {
            f = ((float) i2) / ((float) size);
        }
        if (i == 0 && i2 > 0) {
            C55972Hqd hqd = this.A00;
            hqd.A00.A01(new C53304Glq(r6, AnonymousClass05K.A01, "EXPLORE_GRID", str, "Vista", (String) null, f, AnonymousClass7TE.A0R(hqd.A03.invoke())));
        }
    }
}
