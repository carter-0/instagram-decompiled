package X;

import androidx.compose.ui.Modifier;

public final class JA9 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JA9(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A06 = str;
        this.A07 = z;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                boolean z = this.A07;
                String str = this.A06;
                C52751Gc3.A01((C287605aT) this.A03, A0R, (AnonymousClass2DO) this.A05, str, (C62320sa) this.A04, (0sL) this.A02, C51966G9m.A01(this.A01), z);
                break;
            case 1:
                String str2 = this.A06;
                boolean z2 = this.A07;
                HLJ hlj = (HLJ) this.A05;
                AnonymousClass0iw r3 = (AnonymousClass0iw) this.A02;
                I7S.A05(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, r3, hlj, str2, (0sP) this.A04, C51966G9m.A01(this.A01), z2);
                break;
            case 2:
                String str3 = this.A06;
                C56642I5x.A02(C51966G9m.A0R(obj, obj2), (HM6) this.A02, str3, (C62320sa) this.A05, (C62320sa) this.A03, (0sP) this.A04, C51966G9m.A01(this.A01), this.A07);
                break;
            default:
                C286575Wy A0R2 = C51966G9m.A0R(obj, obj2);
                String str4 = this.A06;
                boolean z3 = this.A07;
                C56371HxP.A01(A0R2, (JRL) this.A05, str4, (C62320sa) this.A02, (C62320sa) this.A03, (0sP) this.A04, C51966G9m.A01(this.A01), z3);
                break;
        }
        return C60340gF.A00;
    }
}
