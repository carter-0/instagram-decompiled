package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.JAl  reason: case insensitive filesystem */
public final class C59207JAl extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59207JAl(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A07 = str;
        this.A08 = z;
        this.A03 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A06 = obj4;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                boolean z = this.A08;
                C56663I6s.A07((C56151Htd) this.A04, (C56152Hte) this.A05, A0R, (Modifier) this.A06, this.A07, (0sK) this.A03, C51966G9m.A01(this.A01), this.A02, z);
                break;
            case 1:
                C286575Wy A0R2 = C51966G9m.A0R(obj, obj2);
                String str = this.A07;
                boolean z2 = this.A08;
                I68.A01((C56127HtF) this.A03, A0R2, (Modifier) this.A05, str, (C62320sa) this.A06, (0sK) this.A04, C51966G9m.A01(this.A01), this.A02, z2);
                break;
            case 2:
                String str2 = this.A07;
                HLT hlt = (HLT) this.A06;
                boolean z3 = this.A08;
                HV4.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, hlt, str2, (C62320sa) this.A04, (C62320sa) this.A05, C51966G9m.A01(this.A01), this.A02, z3);
                break;
            default:
                String str3 = this.A07;
                HLJ hlj = (HLJ) this.A06;
                AnonymousClass0iw r3 = (AnonymousClass0iw) this.A03;
                C56640I5v.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, r3, hlj, str3, (0sP) this.A05, C51966G9m.A01(this.A01), this.A02, this.A08);
                break;
        }
        return C60340gF.A00;
    }
}
