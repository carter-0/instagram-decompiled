package X;

import androidx.compose.ui.Modifier;

public final class J9M extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9M(Object obj, Object obj2, String str, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A00 = i2;
        this.A04 = str;
        this.A03 = obj;
        this.A02 = obj2;
        this.A05 = z;
        this.A06 = z2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                String str = this.A04;
                I7P.A08(A0R, (Modifier) this.A02, (C59485JLj) this.A03, str, C51966G9m.A01(this.A01), this.A05, this.A06);
                break;
            case 1:
                String str2 = this.A04;
                boolean z = this.A06;
                boolean z2 = this.A05;
                C56287Hvv.A01(A0R, str2, (C62320sa) this.A03, (0sP) this.A02, C51966G9m.A01(this.A01), z, z2);
                break;
            default:
                C56345Hww.A01(A0R, this.A04, (0sP) this.A03, (AnonymousClass62P) this.A02, C51966G9m.A01(this.A01), this.A05, this.A06);
                break;
        }
        return C60340gF.A00;
    }
}
