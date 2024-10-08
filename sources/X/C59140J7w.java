package X;

/* renamed from: X.J7w  reason: case insensitive filesystem */
public final class C59140J7w extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59140J7w(Object obj, String str, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A03 = str;
        this.A02 = obj;
        this.A04 = z;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                boolean z = this.A04;
                C54869HWc.A00(A0R, (AnonymousClass3QO) this.A02, this.A03, C51966G9m.A01(this.A01), z);
                break;
            case 1:
                C56667I6w.A03(A0R, (C54649HMg) this.A02, this.A03, C51966G9m.A01(this.A01), this.A04);
                break;
            case 2:
                C56299HwC.A01(A0R, this.A03, (C62320sa) this.A02, C51966G9m.A01(this.A01), this.A04);
                break;
            case 3:
                I7V.A08(A0R, (C56532I0d) this.A02, this.A03, C51966G9m.A01(this.A01), this.A04);
                break;
            case 4:
                I7V.A09(A0R, (C56532I0d) this.A02, this.A03, C51966G9m.A01(this.A01), this.A04);
                break;
            case 5:
                I7V.A0A(A0R, (C56532I0d) this.A02, this.A03, C51966G9m.A01(this.A01), this.A04);
                break;
            case 6:
                C55108HcH.A00(A0R, this.A03, (C62320sa) this.A02, C51966G9m.A01(this.A01), this.A04);
                break;
            default:
                I62.A03(A0R, this.A03, (C62320sa) this.A02, C51966G9m.A01(this.A01), this.A04);
                break;
        }
        return C60340gF.A00;
    }
}
