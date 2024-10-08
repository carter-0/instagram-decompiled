package X;

import androidx.compose.ui.Modifier;

public final class JA7 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JA7(Object obj, Object obj2, Object obj3, String str, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A06 = str;
        this.A07 = z;
        this.A05 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                String str = this.A06;
                boolean z = this.A07;
                HV8.A00(A0R, (Modifier) this.A03, (Long) this.A05, str, (C62320sa) this.A04, C51966G9m.A01(this.A01), this.A02, z);
                break;
            case 1:
                String str2 = this.A06;
                C53008Ggz ggz = (C53008Ggz) this.A05;
                boolean z2 = this.A07;
                C56238Hv5.A01(A0R, (Modifier) this.A03, ggz, str2, (0sP) this.A04, C51966G9m.A01(this.A01), this.A02, z2);
                break;
            default:
                String str3 = this.A06;
                HXR.A00(A0R, (Modifier) this.A03, (HLX) this.A05, str3, (C62320sa) this.A04, C51966G9m.A01(this.A01), this.A02, this.A07);
                break;
        }
        return C60340gF.A00;
    }
}
