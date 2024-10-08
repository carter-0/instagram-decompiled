package X;

import java.util.Map;

/* renamed from: X.GhB  reason: case insensitive filesystem */
public final class C53020GhB extends 2YL {
    public final AnonymousClass4JK A00;
    public final String A01;
    public final AnonymousClass0Ud A02;
    public final C61046Jvk A03;
    public final AnonymousClass4JM A04;

    public static final C61046Jvk A00(C53020GhB ghB, Map map) {
        C2809254t r0;
        String str;
        AnonymousClass9IP r1 = (AnonymousClass9IP) map.get(ghB.A01);
        if (r1 == null || (r0 = (C2809254t) r1.A01) == null || (str = r0.A07) == null) {
            return ghB.A03;
        }
        return new C61046Jvk(str, r1.A02, 3);
    }

    public C53020GhB(AnonymousClass4JK r6, AnonymousClass4JM r7, String str, String str2) {
        this.A01 = str;
        this.A00 = r6;
        this.A04 = r7;
        this.A03 = new C61046Jvk(str2, r7.A01(str2), 3);
        AnonymousClass0Ud r4 = r7.A01;
        C58028IkL ikL = new C58028IkL(5, this, r4);
        this.A02 = 10b.A02(A00(this, (Map) r4.getValue()), C318116oQ.A00(this), ikL, AnonymousClass10A.A01);
    }
}
