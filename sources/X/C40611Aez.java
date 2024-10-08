package X;

import java.util.List;

/* renamed from: X.Aez  reason: case insensitive filesystem */
public final /* synthetic */ class C40611Aez implements G6J {
    public final /* synthetic */ C351978Be A00;
    public final /* synthetic */ C354958Oa A01;

    public /* synthetic */ C40611Aez(C351978Be r1, C354958Oa r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Dwj(List list, boolean z) {
        C351978Be r1 = this.A00;
        C354958Oa r2 = this.A01;
        if (!list.isEmpty()) {
            String str = r1.A00.A14.A01.A0F;
            0qQ.A07(str);
            r2.A00.put(str, list);
        }
    }
}
