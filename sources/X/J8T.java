package X;

import androidx.compose.ui.Modifier;

public final class J8T extends 0Yg implements 0sL {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8T(Object obj, Object obj2, Object obj3, float f, int i, int i2) {
        super(2);
        this.A01 = i2;
        this.A04 = obj;
        this.A03 = obj2;
        this.A00 = f;
        this.A05 = obj3;
        this.A02 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A01;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                I2V.A00(A0R, (C53259Gl7) this.A03, (C62320sa) this.A04, (0sP) this.A05, this.A00, C51966G9m.A01(this.A02));
                break;
            case 1:
                float f = this.A00;
                I2V.A01(A0R, (C53259Gl7) this.A03, (C62320sa) this.A04, (0sP) this.A05, f, C51966G9m.A01(this.A02));
                break;
            default:
                C54956HZm.A00(A0R, (Modifier) this.A04, (C331547Rk) this.A03, (0sP) this.A05, this.A00, C51966G9m.A01(this.A02));
                break;
        }
        return C60340gF.A00;
    }
}
