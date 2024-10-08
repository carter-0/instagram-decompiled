package X;

import androidx.compose.ui.Modifier;

public final class J9G extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9G(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        super(2);
        this.A00 = i2;
        this.A05 = obj;
        this.A02 = obj2;
        this.A06 = z;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                boolean z = this.A06;
                C56648I6d.A02(C51966G9m.A0R(obj, obj2), (C59964JcX) this.A05, (LRW) this.A02, (C62320sa) this.A03, (0sK) this.A04, C51966G9m.A01(this.A01), z);
                break;
            case 1:
                C56270Hve.A00((C304686Eu) this.A05, C51966G9m.A0R(obj, obj2), (C54649HMg) this.A02, (C62320sa) this.A03, (0sP) this.A04, C51966G9m.A01(this.A01), this.A06);
                break;
            case 2:
                boolean z2 = this.A06;
                C56578I2i.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A02, (0sL) this.A04, (0sL) this.A03, (AnonymousClass62P) this.A05, C51966G9m.A01(this.A01), z2);
                break;
            default:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                boolean z3 = this.A06;
                I7V.A0D(A0R, (C53397GnU) this.A05, (C62320sa) this.A02, (C62320sa) this.A04, (0sP) this.A03, C51966G9m.A01(this.A01), z3);
                break;
        }
        return C60340gF.A00;
    }
}
