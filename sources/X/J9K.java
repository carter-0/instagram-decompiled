package X;

import androidx.compose.ui.Modifier;

public final class J9K extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final Object A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9K(Object obj, String str, int i, int i2, int i3, int i4, long j) {
        super(2);
        this.A00 = i4;
        this.A03 = i;
        this.A06 = str;
        this.A04 = j;
        this.A05 = obj;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            HY6.A00(A0R, (Modifier) this.A05, this.A06, this.A03, C51966G9m.A01(this.A01), this.A02, this.A04);
        } else {
            int i2 = this.A03;
            C56254HvO.A00(A0R, this.A06, (C62320sa) this.A05, i2, C51966G9m.A01(this.A01), this.A02, this.A04);
        }
        return C60340gF.A00;
    }
}
