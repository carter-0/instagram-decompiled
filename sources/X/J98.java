package X;

import androidx.compose.ui.Modifier;

public final class J98 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J98(Object obj, Object obj2, int i, int i2, int i3, int i4, int i5) {
        super(2);
        this.A00 = i5;
        this.A03 = i;
        this.A04 = i2;
        this.A05 = obj;
        this.A06 = obj2;
        this.A01 = i3;
        this.A02 = i4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        int i2 = this.A03;
        switch (i) {
            case 0:
                int i3 = this.A04;
                C54834HUq.A00(A0R, (Modifier) this.A05, (C62320sa) this.A06, i2, i3, C51966G9m.A01(this.A01), this.A02);
                break;
            case 1:
                I2O.A00(A0R, (Modifier) this.A05, (C55704Hm1) this.A06, i2, this.A04, C51966G9m.A01(this.A01), this.A02);
                break;
            default:
                HZL.A00(A0R, (Modifier) this.A05, (C62320sa) this.A06, i2, this.A04, C51966G9m.A01(this.A01), this.A02);
                break;
        }
        return C60340gF.A00;
    }
}
