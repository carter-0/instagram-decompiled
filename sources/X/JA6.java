package X;

import androidx.compose.ui.Modifier;

public final class JA6 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JA6(Object obj, Object obj2, Object obj3, String str, int i, int i2, int i3, int i4) {
        super(2);
        this.A00 = i4;
        this.A06 = obj;
        this.A05 = obj2;
        this.A07 = str;
        this.A03 = i;
        this.A04 = obj3;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        Object obj3 = this.A06;
        if (i != 0) {
            C56359HxA.A01(A0R, (Modifier) this.A05, (C55956HqK) obj3, this.A07, (0sL) this.A04, this.A03, C51966G9m.A01(this.A01), this.A02);
        } else {
            C56235Hv2.A01(A0R, (Modifier) this.A05, (AnonymousClass6D8) obj3, this.A07, (0sL) this.A04, this.A03, C51966G9m.A01(this.A01), this.A02);
        }
        return C60340gF.A00;
    }
}
