package X;

import java.util.List;

/* renamed from: X.JAf  reason: case insensitive filesystem */
public final class C59201JAf extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59201JAf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A00 = i2;
        this.A06 = obj;
        this.A03 = obj2;
        this.A05 = obj3;
        this.A04 = obj4;
        this.A07 = z;
        this.A02 = obj5;
        this.A08 = z2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        Object obj3 = this.A06;
        if (i != 0) {
            C55091Hc0.A00(A0R, (EGP) this.A02, (List) obj3, (0sP) this.A04, (0sP) this.A05, (0sP) this.A03, C51966G9m.A01(this.A01), this.A08, this.A07);
        } else {
            C53368Gms gms = (C53368Gms) this.A03;
            boolean z = this.A07;
            C54920HYc.A00(A0R, gms, (C53390GnN) obj3, (C55891HpC) this.A02, (C62320sa) this.A05, (0sP) this.A04, C51966G9m.A01(this.A01), z, this.A08);
        }
        return C60340gF.A00;
    }
}
