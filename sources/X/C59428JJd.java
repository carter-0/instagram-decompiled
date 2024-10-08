package X;

import java.util.List;

/* renamed from: X.JJd  reason: case insensitive filesystem */
public final class C59428JJd extends 0Yg implements 0sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59428JJd(Object obj, Object obj2, String str, String str2, int i) {
        super(4);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        String str;
        Object obj5 = obj3;
        if (this.A00 != 0) {
            int A0M = AnonymousClass7TE.A0M(obj2);
            C286575Wy r8 = (C286575Wy) obj5;
            if (G9w.A1a(obj4)) {
                0fL.A01(1103124883, "com.instagram.creator.agent.settings.facts.fragment.InformationScreen.<anonymous> (InformationFragment.kt:111)");
            }
            N4G n4g = (N4G) 00k.A0O((List) this.A01, A0M);
            if (n4g == null || (str = n4g.A01) == null) {
                if (0fL.A02()) {
                    i2 = 1809468440;
                }
                return C60340gF.A00;
            }
            C56639I5u.A04(r8, str, this.A03, this.A04, (0sG) this.A02, 0);
            if (0fL.A02()) {
                i2 = 580089175;
            }
            return C60340gF.A00;
        }
        int A0M2 = AnonymousClass7TE.A0M(obj2);
        C286575Wy r82 = (C286575Wy) obj5;
        int A0M3 = AnonymousClass7TE.A0M(obj4);
        if ((A0M3 & 6) == 0) {
            i = G9t.A0O(r82, obj) | A0M3;
        } else {
            i = A0M3;
        }
        if ((A0M3 & 48) == 0) {
            i |= G9t.A06(r82, A0M2);
        }
        if ((i & 147) != 146 || !r82.Bwn()) {
            if (0fL.A02()) {
                C51965G9l.A17(614452188);
            }
            I12 i12 = (I12) C51966G9m.A19(this.A01, A0M2);
            r82.ExS(1158933282);
            C56573I2d.A02(r82, AnonymousClass5PI.A01(r82, new J7R(i12, this.A02, this.A04, 3), -2069582924), 20.0f, 432, 0qQ.A0K(i12.A04, this.A03));
            if (C51970G9q.A1Z(r82)) {
                i2 = -932376043;
            }
            return C60340gF.A00;
        }
        r82.Evl();
        return C60340gF.A00;
        0fL.A00(i2);
        return C60340gF.A00;
    }
}
