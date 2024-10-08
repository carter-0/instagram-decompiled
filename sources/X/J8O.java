package X;

import androidx.compose.ui.Modifier;

public final class J8O extends 0Yg implements 0sL {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8O(Modifier modifier, float f, int i, int i2, int i3, long j) {
        super(2);
        this.A01 = i3;
        this.A05 = modifier;
        this.A04 = j;
        this.A00 = f;
        this.A02 = i;
        this.A03 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A01) {
            case 0:
                C56618I4t.A02(C51966G9m.A0R(obj, obj2), (Modifier) this.A05, this.A00, C51966G9m.A01(this.A02), this.A03, this.A04);
                break;
            case 1:
                C52390GQp.A02(C51966G9m.A0R(obj, obj2), (Modifier) this.A05, this.A00, C51966G9m.A01(this.A02), this.A03, this.A04);
                break;
            default:
                C52378GQd.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A05, this.A00, C51966G9m.A01(this.A02), this.A03, this.A04);
                break;
        }
        return C60340gF.A00;
    }
}
