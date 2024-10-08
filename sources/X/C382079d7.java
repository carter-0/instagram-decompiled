package X;

import java.util.Map;

/* renamed from: X.9d7  reason: invalid class name and case insensitive filesystem */
public final class C382079d7 extends C251343mx {
    public final C251263mp A00;
    public final 0eP[] A01;
    public final 0eP[] A02;

    public C382079d7(C251263mp r2, 0eP[] r3, 0eP[] r4) {
        0qQ.A0B(r2, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r10) {
        0qQ.A0B(r10, 0);
        0eP[] r5 = this.A01;
        if (r5 != null) {
            for (0eP r0 : r5) {
                Class cls = (Class) r0.A00;
                Object obj = r0.A01;
                2V1 r1 = r10.A05;
                if (!r1.A0B) {
                    r1.A07 = AnonymousClass3XP.A00(r1.A07);
                    r1.A0B = true;
                }
                2VJ r02 = r1.A07;
                if (r02 != null) {
                    0qQ.A0B(cls, 0);
                    C378029Of r12 = new C378029Of(cls);
                    Map map = r02.A00;
                    0qQ.A06(map);
                    map.put(r12, obj);
                }
            }
        }
        0eP[] r52 = this.A02;
        if (r52 != null) {
            for (0eP r03 : r52) {
                AnonymousClass3XT r3 = (AnonymousClass3XT) r03.A00;
                Object obj2 = r03.A01;
                2V1 r13 = r10.A05;
                if (!r13.A0B) {
                    r13.A07 = AnonymousClass3XP.A00(r13.A07);
                    r13.A0B = true;
                }
                2VJ r04 = r13.A07;
                if (r04 != null) {
                    r04.A01(r3, obj2);
                }
            }
        }
        return this.A00;
    }
}
