package X;

import androidx.compose.ui.Modifier;

public final class JBH extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JBH(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A07 = obj;
        this.A09 = z;
        this.A06 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A08 = str;
        this.A03 = obj5;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                boolean z = this.A09;
                C56663I6s.A06((C56151Htd) this.A04, (C56152Hte) this.A05, (AnonymousClass6FY) this.A07, A0R, (Modifier) this.A06, this.A08, (0sK) this.A03, C51966G9m.A01(this.A01), this.A02, z);
                break;
            case 1:
                C286575Wy A0R2 = C51966G9m.A0R(obj, obj2);
                boolean z2 = this.A09;
                C56663I6s.A05((C56151Htd) this.A04, (C56152Hte) this.A05, (C304686Eu) this.A07, A0R2, (Modifier) this.A06, this.A08, (0sK) this.A03, C51966G9m.A01(this.A01), this.A02, z2);
                break;
            default:
                boolean z3 = this.A09;
                C62320sa r4 = (C62320sa) this.A05;
                C62320sa r5 = (C62320sa) this.A07;
                0sP r6 = (0sP) this.A06;
                I2N.A02(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, this.A08, r4, r5, r6, (AnonymousClass62P) this.A03, C51966G9m.A01(this.A01), this.A02, z3);
                break;
        }
        return C60340gF.A00;
    }
}
