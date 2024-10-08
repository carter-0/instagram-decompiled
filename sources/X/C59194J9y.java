package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.J9y  reason: case insensitive filesystem */
public final class C59194J9y extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59194J9y(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A06 = obj2;
        this.A07 = z;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                boolean z = this.A07;
                int i = this.A02;
                C322946wf r4 = (C322946wf) this.A03;
                I2K.A00(A0R, (Modifier) this.A04, (Modifier) this.A06, r4, (C62320sa) this.A05, i, C51966G9m.A01(this.A01), z);
                break;
            case 1:
                C286575Wy A0R2 = C51966G9m.A0R(obj, obj2);
                boolean z2 = this.A07;
                C322946wf r3 = (C322946wf) this.A03;
                0sP r42 = (0sP) this.A05;
                I2K.A02(A0R2, (Modifier) this.A04, r3, r42, (AnonymousClass62P) this.A06, C51966G9m.A01(this.A01), this.A02, z2);
                break;
            case 2:
                boolean z3 = this.A07;
                I2M.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (C62320sa) this.A04, (C62320sa) this.A05, (C62320sa) this.A06, C51966G9m.A01(this.A01), this.A02, z3);
                break;
            case 3:
                C56613I4o.A03(C51966G9m.A0R(obj, obj2), (C55799Hnf) this.A06, (0sP) this.A04, (0sP) this.A05, (0sK) this.A03, C51966G9m.A01(this.A01), this.A02, this.A07);
                break;
            case 4:
                boolean z4 = this.A07;
                I2N.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (C278014w6) this.A03, (C62320sa) this.A06, (0sP) this.A05, C51966G9m.A01(this.A01), this.A02, z4);
                break;
            default:
                boolean z5 = this.A07;
                C56650I6f.A00((C287605aT) this.A03, C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (JPI) this.A06, (0sP) this.A05, C51966G9m.A01(this.A01), this.A02, z5);
                break;
        }
        return C60340gF.A00;
    }
}
