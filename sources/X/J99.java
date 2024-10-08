package X;

import androidx.compose.ui.Modifier;

public final class J99 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J99(Object obj, Object obj2, int i, int i2, int i3, long j, boolean z) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A06 = z;
        this.A05 = obj2;
        this.A03 = j;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            boolean z = this.A06;
            HY0.A00(A0R, (C62320sa) this.A04, (0sP) this.A05, C51966G9m.A01(this.A01), this.A02, this.A03, z);
        } else {
            boolean z2 = this.A06;
            C56616I4r.A01(A0R, (Modifier) this.A04, (C53356Gmg) this.A05, C51966G9m.A01(this.A01), this.A02, this.A03, z2);
        }
        return C60340gF.A00;
    }
}
