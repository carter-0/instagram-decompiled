package X;

import java.util.List;

/* renamed from: X.JJr  reason: case insensitive filesystem */
public final class C59442JJr extends 0Yg implements 0sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C284945Oz A01;
    public final /* synthetic */ C284945Oz A02;
    public final /* synthetic */ C270284gU A03;
    public final /* synthetic */ C270284gU A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sL A07;
    public final /* synthetic */ 0sJ A08;
    public final /* synthetic */ YCQ A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59442JJr(C284945Oz r2, C284945Oz r3, C270284gU r4, C270284gU r5, List list, C62320sa r7, 0sL r8, 0sJ r9, YCQ ycq, float f, boolean z) {
        super(4);
        this.A05 = list;
        this.A0A = z;
        this.A00 = f;
        this.A03 = r4;
        this.A09 = ycq;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A08 = r9;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        JL6 jl6 = (JL6) obj;
        int A0M = AnonymousClass7TE.A0M(obj2);
        C286575Wy r4 = (C286575Wy) obj3;
        int A0M2 = AnonymousClass7TE.A0M(obj4);
        if ((A0M2 & 6) == 0) {
            i = A0M2 | G9t.A0O(r4, jl6);
        } else {
            i = A0M2;
        }
        if ((A0M2 & 48) == 0) {
            i |= G9t.A06(r4, A0M);
        }
        if ((i & 147) != 146 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1373340540, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
            }
            Object obj5 = this.A05.get(A0M);
            r4.ExS(1783507378);
            C267314bM r3 = AnonymousClass5YA.A07;
            C284945Oz A0M3 = C51968G9o.A0M(r4, r3);
            Object A0m = C51967G9n.A0m(r4, 1165914248);
            if (A0m == AnonymousClass5XT.A00) {
                A0m = I7C.A01(A0M3);
                r4.FLL(A0m);
            }
            C286565Wx A0G = C51965G9l.A0G(r4);
            C286705Xl A022 = r3.A02(A0m);
            boolean z = this.A0A;
            float f = this.A00;
            C270284gU r10 = this.A03;
            YCQ ycq = this.A09;
            C51971G9r.A11(r4, A022, new C59242JBu(jl6, this.A02, this.A01, r10, this.A04, obj5, this.A06, this.A07, this.A08, ycq, f, z), -1387406252);
            if (C51967G9n.A1a(A0G)) {
                0fL.A00(-1136928832);
            }
        } else {
            r4.Evl();
        }
        return C60340gF.A00;
    }
}
