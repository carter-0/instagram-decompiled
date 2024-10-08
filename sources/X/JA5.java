package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;

public final class JA5 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JA5(Object obj, Object obj2, String str, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A00 = i3;
        this.A05 = str;
        this.A04 = obj;
        this.A07 = z;
        this.A03 = obj2;
        this.A06 = z2;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                String str = this.A05;
                boolean z = this.A07;
                HV1.A00(A0R, (Modifier) this.A03, (LineType) this.A04, str, C51966G9m.A01(this.A01), this.A02, z, this.A06);
                break;
            case 1:
                boolean z2 = this.A06;
                String str2 = this.A05;
                C56635I5q.A02(A0R, (HM2) this.A03, str2, (C62320sa) this.A04, C51966G9m.A01(this.A01), this.A02, z2, this.A07);
                break;
            default:
                boolean z3 = this.A06;
                boolean z4 = this.A07;
                C56635I5q.A04(A0R, this.A05, (C62320sa) this.A04, (C262224Cq) this.A03, C51966G9m.A01(this.A01), this.A02, z3, z4);
                break;
        }
        return C60340gF.A00;
    }
}
