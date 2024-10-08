package X;

import com.instagram.common.typedurl.ImageUrl;

public final class J8Z extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8Z(Object obj, Object obj2, String str, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A04 = str;
        this.A05 = z;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                C56253HvN.A01(A0R, (C333897aK) this.A02, this.A04, (0sL) this.A03, C51966G9m.A01(this.A01), this.A05);
                break;
            case 1:
                boolean z = this.A05;
                I2U.A02(A0R, this.A04, (C62320sa) this.A02, (0sP) this.A03, C51966G9m.A01(this.A01), z);
                break;
            default:
                C56575I2f.A01(A0R, (ImageUrl) this.A03, this.A04, (C62320sa) this.A02, C51966G9m.A01(this.A01), this.A05);
                break;
        }
        return C60340gF.A00;
    }
}
