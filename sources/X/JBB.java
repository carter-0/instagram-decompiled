package X;

import androidx.compose.ui.Modifier;

public final class JBB extends 0Yg implements 0sL {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final Object A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JBB(Modifier modifier, float f, float f2, float f3, int i, int i2, int i3, long j, long j2, boolean z) {
        super(2);
        this.A03 = i3;
        this.A01 = f;
        this.A08 = modifier;
        this.A06 = j;
        this.A09 = z;
        this.A07 = j2;
        this.A02 = f2;
        this.A00 = f3;
        this.A04 = i;
        this.A05 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A03 != 0) {
            C286575Wy A0R = C51966G9m.A0R(obj, obj2);
            float f = this.A01;
            long j = this.A06;
            boolean z = this.A09;
            C52378GQd.A00(A0R, (Modifier) this.A08, f, this.A02, this.A00, C51966G9m.A01(this.A04), this.A05, j, this.A07, z);
        } else {
            C286575Wy A0R2 = C51966G9m.A0R(obj, obj2);
            float f2 = this.A01;
            long j2 = this.A06;
            boolean z2 = this.A09;
            C52390GQp.A01(A0R2, (Modifier) this.A08, f2, this.A02, this.A00, C51966G9m.A01(this.A04), this.A05, j2, this.A07, z2);
        }
        return C60340gF.A00;
    }
}
