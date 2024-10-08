package X;

import androidx.compose.ui.Modifier;

public final class J9C extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9C(Object obj, Object obj2, Object obj3, int i, int i2, int i3, long j) {
        super(2);
        this.A00 = i3;
        this.A03 = j;
        this.A05 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (2 - i != 0) {
            long j = this.A03;
            I7M.A05(A0R, (C55843HoQ) this.A04, (CharSequence) this.A06, (0sP) this.A05, C51966G9m.A01(this.A01), this.A02, j);
        } else {
            long j2 = this.A03;
            C56262HvW.A01(A0R, (Modifier) this.A04, (0sP) this.A05, (0sL) this.A06, C51966G9m.A01(this.A01), this.A02, j2);
        }
        return C60340gF.A00;
    }
}
